package br.com.pibsantalucia.ui.registerpessoa

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import br.com.pibsantalucia.R
import br.com.pibsantalucia.model.TypeContact
import br.com.pibsantalucia.ui.base.BaseActivity
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageOptions
import com.theartofdev.edmodo.cropper.CropImageView
import com.theartofdev.edmodo.cropper.CropImageView.*
import java.io.File
import java.io.IOException
import java.util.ArrayList

class PhotoActivity: BaseActivity(), OnSetImageUriCompleteListener, OnCropImageCompleteListener {

    var mOptions: CropImageOptions? = null
    private var photoBitmap: Bitmap? = null
    var cropImageUriCongregado: Uri? = null
    var cropImageViewCongregado: CropImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)

//        var bundle: Bundle? = this.intent.extras
//        cropImageUriCongregado = bundle!!.get Serializable("mCropImageUri")

        cropImageViewCongregado?.setOnSetImageUriCompleteListener(this)
        cropImageViewCongregado?.setOnCropImageCompleteListener(this)

        cropImageViewCongregado?.setImageUriAsync(cropImageUriCongregado)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_crop_photo, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.menuCropPhoto) { // foto ok
            cropImage()
        }
        return super.onOptionsItemSelected(item)
    }

    fun cropImage() {
        if (mOptions!!.noOutputImage) {
            setResult(null, null, 1)
        } else {
            val outputUri = getOutputUri()
            cropImageViewCongregado!!.saveCroppedImageAsync(
                outputUri,
                mOptions!!.outputCompressFormat,
                mOptions!!.outputCompressQuality,
                mOptions!!.outputRequestWidth,
                mOptions!!.outputRequestHeight,
                mOptions!!.outputRequestSizeOptions
            )
        }
    }

    fun getOutputUri(): Uri? {
        var outputUri = mOptions!!.outputUri
        if (outputUri == null || outputUri == Uri.EMPTY) {
            outputUri = try {
                Uri.fromFile(
                    File.createTempFile(
                        "cropped",
                        ".png",
                        cacheDir
                    )
                )
            } catch (e: IOException) {
                throw RuntimeException("Failed to create temp file for output image", e)
            }
        }
        return outputUri
    }

    fun setResult(uri: Uri?, error: java.lang.Exception?, sampleSize: Int) {
        val resultCode =
            if (error == null) RESULT_OK else CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE
        setResult(resultCode, getResultIntent(uri, error, sampleSize))
        hideLoading()
        finish()
    }

    //----------------------------------------------
    fun getResultIntent(uri: Uri?, error: java.lang.Exception?, sampleSize: Int): Intent? {
        val result = CropImage.ActivityResult(
            cropImageViewCongregado!!.imageUri,
            uri,
            error,
            cropImageViewCongregado!!.cropPoints,
            cropImageViewCongregado!!.cropRect,
            cropImageViewCongregado!!.rotatedDegrees,
            cropImageViewCongregado!!.wholeImageRect,
            sampleSize
        )
        val intent = Intent()
        intent.putExtras(getIntent())
        intent.putExtra(CropImage.CROP_IMAGE_EXTRA_RESULT, result)
        return intent
    }

    override fun onSetImageUriComplete(view: CropImageView?, uri: Uri?, error: Exception?) {
        if (error != null) {
            this.showMessage("Falha ao carregar a photo do congregado.")
        }
    }

    override fun onCropImageComplete(view: CropImageView?, result: CropImageView.CropResult?) {
        setResult(result!!.uri, result.error, result.sampleSize)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            val result = CropImage.getActivityResult(data)
            handleCropResult(result)
        }
    }

    private fun handleCropResult(result: CropResult) {
        if (result.error == null) {
            photoBitmap = result.bitmap
        } else {
            this.showMessage("Falha ao processar a foto do congregado.")
        }
    }
}
