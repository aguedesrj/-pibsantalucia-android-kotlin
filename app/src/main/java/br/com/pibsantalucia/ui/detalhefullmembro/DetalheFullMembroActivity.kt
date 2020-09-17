package br.com.pibsantalucia.ui.detalhefullmembro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.Person
import br.com.pibsantalucia.ui.base.BaseActivity
import br.com.pibsantalucia.ui.detalhemembro.IDetalheMembroActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detalhe_full_membro.*
import kotlinx.android.synthetic.main.activity_detalhe_membro.*
import kotlinx.android.synthetic.main.activity_detalhe_membro.circularImageViewDetalheMembro
import kotlinx.android.synthetic.main.activity_detalhe_membro.imageViewDetalheMembroBg
import kotlinx.android.synthetic.main.activity_detalhe_membro.textViewDetalheMembroNome

class DetalheFullMembroActivity: BaseActivity(), IDetalheFullMembroActivity {

    private lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_full_membro)

        var bundle: Bundle? = this.intent.extras
        person = bundle!!.getSerializable("person") as Person

        var pesNome = person.pesNome
        val parts = pesNome!!.split(" ")

        val actionbar = supportActionBar
        actionbar!!.title = parts[0] + " " + parts[parts.count()-1]
        actionbar.setDisplayHomeAsUpEnabled(true)

        textViewDetalheMembroNome.text = pesNome
        if (person.pesSexo == "M") {
            textViewDetalheMembroSexo.text = "Masculino"
        } else {
            textViewDetalheMembroSexo.text = "Feminino"
        }
        textViewDetalheFullDataNascimentoValor.text = person.pesDtNascimento
        textViewDetalheFullCpfValor.text = person.pesCpf
        textViewDetalheFullTipoSanguineoValor.text = person.pesTipoSanguineo
        textViewDetalheFullProfissaoValor.text = person.pesProfissao
        textViewDetalheFullNaturalidadeValor.text = person.pesNaturalidade
        textViewDetalheFullNacionalidadeValor.text = person.pesNacionalidade
        textViewDetalheFullMaeValor.text = person.pesNomeMae
        textViewDetalheFullPaiValor.text = person.pesNomePai
        textViewDetalheFullDataCasamentoValor.text = person.pesDtCasamento
        textViewDetalheFullDataBatismoValor.text = person.pesDtBatismo

        // Endereço
        textViewDetalheFullLogradouroValor.text = "-"
        textViewDetalheFullComplementoValor.text = "-"
        textViewDetalheFullNumeroValor.text = "-"
        textViewDetalheFullBairroValor.text = "-"
        textViewDetalheFullCidadeValor.text = "-"
        textViewDetalheFullEstadoValor.text = "-"
        textViewDetalheFullCepValor.text = "-"
        if (person.address != null) {
            textViewDetalheFullLogradouroValor.text = person.address!!.endLogradouro
            textViewDetalheFullComplementoValor.text = person.address!!.endComplemento
            textViewDetalheFullNumeroValor.text = person.address!!.endNumero
            textViewDetalheFullBairroValor.text = person.address!!.endBairro
            textViewDetalheFullCidadeValor.text = person.address!!.endCidade
            textViewDetalheFullEstadoValor.text = person.address!!.endEstado
            textViewDetalheFullCepValor.text = person.address!!.endCep
        }

        // Contatos
        textViewDetalheFullContatosValor.text = "-"
        if (person.listContact != null) {
            var contato: String = ""
            for (contat in person.listContact!!) {
                if (contato.length > 0) {
                    contato = contato + "\n"
                }

                if (contat.typeContact != null) {
                    if (contat.typeContact!!.tpcCodigo == 1) {
                        contato = contato + contat.ctoDescricaoEmail
                    } else {
                        contato = contato + "(" + contat.ctoDdd + ") " + contat.ctoNumeroTelefone
                    }
                }
            }
            textViewDetalheFullContatosValor.text = contato
        }

        imageViewDetalheMembroBg.setImageResource(R.drawable.ic_placeholder_user)
        circularImageViewDetalheMembro.setImageResource(R.drawable.ic_placeholder_user)
        if (person.pesFotoPath != null && person.pesFotoPath != "") {
            Picasso.get()
                .load(person.pesFotoPath)
                .placeholder(R.drawable.ic_placeholder_user)
                .error(R.drawable.ic_placeholder_user)
                .into(circularImageViewDetalheMembro)

            Picasso.get()
                .load(person.pesFotoPath)
                .placeholder(R.drawable.ic_placeholder_user)
                .error(R.drawable.ic_placeholder_user)
                .into(imageViewDetalheMembroBg)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}