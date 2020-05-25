package com.edmodo.cropper;

import android.graphics.RectF;

import androidx.annotation.NonNull;

public interface CropRectInitCallback {

    /**
     * Initialize crop rect
     *
     * @param bitmapRect bitmapRect displayed in view
     * @param aspectX crop rect aspectX, -1 if not set
     * @param aspectY crop rect aspectX, -1 if not set
     * @return desired rect.
     */
    @NonNull
    RectF getCropRect(RectF bitmapRect, RectF defaultRect, float aspectX, float aspectY);

}
