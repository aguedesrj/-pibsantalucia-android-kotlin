// Generated by view binder compiler. Do not edit!
package br.com.pibsantalucia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import br.com.pibsantalucia.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EscalaChildAdapterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonAddEscalaChild;

  @NonNull
  public final CircleImageView circularImageViewPhotoAddEscalaChild;

  @NonNull
  public final ImageButton imageButtonRemoveEscalaChild;

  @NonNull
  public final TextView textViewAddEscalaChildName;

  private EscalaChildAdapterBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonAddEscalaChild,
      @NonNull CircleImageView circularImageViewPhotoAddEscalaChild,
      @NonNull ImageButton imageButtonRemoveEscalaChild,
      @NonNull TextView textViewAddEscalaChildName) {
    this.rootView = rootView;
    this.buttonAddEscalaChild = buttonAddEscalaChild;
    this.circularImageViewPhotoAddEscalaChild = circularImageViewPhotoAddEscalaChild;
    this.imageButtonRemoveEscalaChild = imageButtonRemoveEscalaChild;
    this.textViewAddEscalaChildName = textViewAddEscalaChildName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EscalaChildAdapterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EscalaChildAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.escala_child_adapter, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EscalaChildAdapterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAddEscalaChild;
      Button buttonAddEscalaChild = rootView.findViewById(id);
      if (buttonAddEscalaChild == null) {
        break missingId;
      }

      id = R.id.circularImageViewPhotoAddEscalaChild;
      CircleImageView circularImageViewPhotoAddEscalaChild = rootView.findViewById(id);
      if (circularImageViewPhotoAddEscalaChild == null) {
        break missingId;
      }

      id = R.id.imageButtonRemoveEscalaChild;
      ImageButton imageButtonRemoveEscalaChild = rootView.findViewById(id);
      if (imageButtonRemoveEscalaChild == null) {
        break missingId;
      }

      id = R.id.textViewAddEscalaChildName;
      TextView textViewAddEscalaChildName = rootView.findViewById(id);
      if (textViewAddEscalaChildName == null) {
        break missingId;
      }

      return new EscalaChildAdapterBinding((ConstraintLayout) rootView, buttonAddEscalaChild,
          circularImageViewPhotoAddEscalaChild, imageButtonRemoveEscalaChild,
          textViewAddEscalaChildName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
