package br.com.pibsantalucia.ui.registerpessoa.fragment

import android.Manifest
import android.graphics.Bitmap
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.utils.convertBase64
import br.com.pibsantalucia.utils.isDataMaiorQueAtual
import br.com.pibsantalucia.utils.isDataValida
import com.squareup.picasso.Picasso
import com.theartofdev.edmodo.cropper.CropImage
import kotlinx.android.synthetic.main.data_personal_fragment.*
import kotlinx.android.synthetic.main.item_list_people.view.*
import kotlinx.android.synthetic.main.more_information_fragment.*

class DataPersonalFragment: Fragment() {

    companion object {
        fun newInstance() = DataPersonalFragment()
    }

    private var photoCongregado: Bitmap? = null

    var person: Person? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.data_personal_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        init()
    }

    private fun init() {

        // verifica se está alterando.
        if (person!!.pesCodigo > 0) {
            this.assignValuesToScreen()
        }

        if (person!!.pesFotoPath != null && person!!.pesFotoPath != "") {
            Picasso.get()
                .load(person!!.pesFotoPath)
                .placeholder(R.drawable.ic_placeholder_user)
                .error(R.drawable.ic_placeholder_user)
                .into(circleImageViewCongregado)
        }

        if (photoCongregado != null) {
            circleImageViewCongregado.setImageBitmap(photoCongregado)
        }

        circleImageViewCongregado.setOnClickListener(View.OnClickListener {
            if (CropImage.isExplicitCameraPermissionRequired(requireContext())) {
                ActivityCompat.requestPermissions(requireActivity(),
                    arrayOf(Manifest.permission.CAMERA),
                    CropImage.CAMERA_CAPTURE_PERMISSIONS_REQUEST_CODE)
            } else {
                CropImage.startPickImageActivity(requireActivity())
            }
        })

//        textInputEditTextCongregadoName.requestFocus()

        radioButtonCongregadoF.setOnClickListener(View.OnClickListener {
            radioButtonCongregadoF.error = null
        })
    }

    fun validateFields(): Boolean {
        // Nome
        if (textInputEditTextCongregadoName.text?.isEmpty()!!) {
            textInputEditTextCongregadoName.error = getString(R.string.required_field)
        } else if (textInputEditTextCongregadoName.text.toString().trim().length <= 5) {
            textInputEditTextCongregadoName.error = getString(R.string.field_not_abbreviated)
        }

        // Data de nascimento
        if (editTextCongregadoDateBirth.text?.isEmpty()!!) {
            editTextCongregadoDateBirth.error = getString(R.string.required_field)
        } else if (!isDataValida(editTextCongregadoDateBirth.text.toString())) {
            editTextCongregadoDateBirth.error = getString(R.string.field_date_invalid)
        } else if (!isDataMaiorQueAtual(editTextCongregadoDateBirth.text.toString())) {
            editTextCongregadoDateBirth.error = getString(R.string.field_can_not_greater_equal_to_current_date)
        }

        // Sexo
        if (!radioButtonCongregadoF.isChecked && !radioButtonCongregadoM.isChecked) {
            radioButtonCongregadoF.error = getString(R.string.required_field)
        }

        return (textInputEditTextCongregadoName.error == null &&
                editTextCongregadoDateBirth.error == null &&
                radioButtonCongregadoF.error == null)
    }

    private fun assignValuesToScreen() {
        // Nome
        textInputEditTextCongregadoName.setText(person!!.pesNome)
        // Nome
        textInputEditTextCongregadoName.setText(person!!.pesNome)
        // Data de nascimento
        editTextCongregadoDateBirth.setText(person!!.pesDtNascimento)
        // Sexo
        radioButtonCongregadoF.isChecked = person!!.pesSexo.equals("F")
        radioButtonCongregadoM.isChecked = person!!.pesSexo.equals("M")
        // CPF
        editTextCongregadoCpf.setText(person!!.pesCpf)
        // Tipo Sanguineo
        textInputEditTextCongregadoTypeBlood.setText(person!!.pesTipoSanguineo)
        // Naturalidade
        textInputEditTextCongregadoNaturalness.setText(person!!.pesNaturalidade)
        // Nacionalidade
        textInputEditTextCongregadoNationality.setText(person!!.pesNacionalidade)
        // Profissão
        textInputEditTextCongregadoProfession.setText(person!!.pesProfissao)
        // Foto
        if (person!!.pesFotoPath != null) {
            Picasso.get()
                .load(person!!.pesFotoPath)
                .placeholder(R.drawable.ic_placeholder_user)
                .error(R.drawable.ic_placeholder_user)
                .into(circleImageViewCongregado)
        }
    }

    fun assignValuesToPerson(): Person {
        // Nome
        person!!.pesNome = textInputEditTextCongregadoName.text.toString().trim()
        // Data de nascimento
        person!!.pesDtNascimento = editTextCongregadoDateBirth.text.toString()
        // Sexo
        if (radioButtonCongregadoF.isChecked) {
            person!!.pesSexo = "F"
        } else {
            person!!.pesSexo = "M"
        }
        // Foto
        if (photoCongregado != null) {
            person!!.pesFoto = convertBase64(photoCongregado!!)
        }
        // CPF
        person!!.pesCpf = editTextCongregadoCpf.text.toString()
        // Tipo Sanguineo
        person!!.pesTipoSanguineo = textInputEditTextCongregadoTypeBlood.text.toString().trim()
        // Naturalidade
        person!!.pesNaturalidade = textInputEditTextCongregadoNaturalness.text.toString().trim()
        // Nacionalidade
        person!!.pesNacionalidade = textInputEditTextCongregadoNationality.text.toString().trim()
        // Profissão
        person!!.pesProfissao = textInputEditTextCongregadoProfession.text.toString().trim()
        return person!!
    }

    fun setPhotoCropImageView(photo: Bitmap) {
        photoCongregado = photo
        circleImageViewCongregado.setImageBitmap(photoCongregado)
    }
}
