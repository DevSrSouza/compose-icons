package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Directus: ImageVector
    get() {
        if (_directus != null) {
            return _directus!!
        }
        _directus = Builder(name = "Directus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.187f, 13.909f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, true, -0.286f, -0.092f)
                arcToRelative(0.657f, 0.657f, 0.0f, false, true, -0.203f, -0.139f)
                curveToRelative(0.056f, -0.488f, 0.0f, -0.912f, 0.047f, -1.392f)
                curveToRelative(0.184f, -1.862f, 1.355f, -1.272f, 2.406f, -1.577f)
                curveToRelative(0.655f, -0.184f, 1.31f, -0.562f, 1.475f, -1.336f)
                arcToRelative(13.528f, 13.528f, 0.0f, false, false, -2.397f, -2.204f)
                curveToRelative(-2.85f, -2.028f, -6.574f, -2.84f, -9.958f, -2.277f)
                arcToRelative(5.113f, 5.113f, 0.0f, false, false, 2.238f, 2.074f)
                reflectiveCurveToRelative(-0.917f, 0.0f, -1.703f, -0.587f)
                curveToRelative(-0.23f, 0.092f, -0.692f, 0.274f, -0.913f, 0.384f)
                arcToRelative(5.094f, 5.094f, 0.0f, false, false, 6.63f, 0.37f)
                curveToRelative(-0.01f, 0.017f, -0.185f, 0.285f, -0.397f, 1.4f)
                curveToRelative(-0.47f, 2.38f, -1.826f, 2.195f, -3.504f, 1.596f)
                curveToRelative(-3.485f, -1.264f, -5.403f, -0.093f, -7.145f, -2.49f)
                curveToRelative(-0.507f, 0.286f, -0.82f, 0.82f, -0.82f, 1.402f)
                curveToRelative(0.0f, 0.599f, 0.331f, 1.106f, 0.81f, 1.383f)
                curveToRelative(0.262f, -0.348f, 0.38f, -0.446f, 0.836f, -0.446f)
                curveToRelative(-0.706f, 0.4f, -0.79f, 0.75f, -1.094f, 1.718f)
                curveToRelative(-0.368f, 1.171f, -0.212f, 2.37f, -1.936f, 2.683f)
                curveToRelative(-0.913f, 0.046f, -0.894f, 0.664f, -1.226f, 1.586f)
                curveToRelative(-0.415f, 1.199f, -0.968f, 1.678f, -2.047f, 2.812f)
                curveToRelative(0.443f, 0.535f, 0.904f, 0.6f, 1.374f, 0.406f)
                curveToRelative(0.968f, -0.406f, 1.715f, -1.66f, 2.415f, -2.471f)
                curveToRelative(0.784f, -0.904f, 2.665f, -0.517f, 4.085f, -1.402f)
                curveToRelative(0.977f, -0.599f, 1.457f, -1.41f, 0.811f, -2.784f)
                arcToRelative(2.72f, 2.72f, 0.0f, false, true, 0.701f, 1.66f)
                curveToRelative(1.641f, -0.213f, 3.836f, 1.788f, 5.836f, 2.12f)
                arcToRelative(3.574f, 3.574f, 0.0f, false, true, -0.488f, -0.82f)
                curveToRelative(-0.23f, -0.554f, -0.304f, -1.06f, -0.258f, -1.503f)
                curveToRelative(0.184f, 1.097f, 1.29f, 2.507f, 3.07f, 2.637f)
                curveToRelative(0.452f, 0.036f, 0.95f, -0.019f, 1.466f, -0.176f)
                curveToRelative(0.618f, -0.184f, 1.19f, -0.424f, 1.872f, -0.295f)
                curveToRelative(0.507f, 0.093f, 0.977f, 0.35f, 1.272f, 0.784f)
                curveToRelative(0.443f, 0.645f, 1.41f, 0.784f, 1.844f, -0.009f)
                curveToRelative(-0.977f, -2.554f, -3.67f, -2.72f, -4.813f, -3.015f)
                close()
            }
        }
        .build()
        return _directus!!
    }

private var _directus: ImageVector? = null
