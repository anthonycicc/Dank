package me.saket.dank.widgets;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;

/**
 * Applies a color tint when disabled.
 */
public class ImageButtonWithDisabledTint extends AppCompatImageButton {

  public ImageButtonWithDisabledTint(Context context, AttributeSet attrs) {
    super(context, attrs);
    setEnabled(isEnabled());
  }

  @Override
  public void setEnabled(boolean enabled) {
    super.setEnabled(enabled);
    if (enabled) {
      setColorFilter(null);
    } else {
      setColorFilter(Color.GRAY);
    }
  }

  @Override
  public boolean performClick() {
    return super.performClick();
  }
}
