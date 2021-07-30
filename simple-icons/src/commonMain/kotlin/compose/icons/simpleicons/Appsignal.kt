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

public val SimpleIcons.Appsignal: ImageVector
    get() {
        if (_appsignal != null) {
            return _appsignal!!
        }
        _appsignal = Builder(name = "Appsignal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.003f, 7.328f)
                curveToRelative(-1.781f, 0.0f, -3.055f, 1.57f, -4.368f, 3.318f)
                curveToRelative(-0.815f, -3.714f, -1.72f, -7.424f, -4.601f, -7.424f)
                curveToRelative(-2.881f, 0.0f, -3.789f, 3.71f, -4.617f, 7.427f)
                curveToRelative(-1.31f, -1.752f, -2.584f, -3.32f, -4.365f, -3.32f)
                curveTo(1.918f, 7.329f, 0.0f, 8.098f, 0.0f, 10.986f)
                verticalLineToRelative(5.24f)
                curveToRelative(0.0f, 2.832f, 1.512f, 3.527f, 2.42f, 3.766f)
                curveToRelative(1.565f, 0.406f, 5.334f, 0.786f, 9.578f, 0.786f)
                reflectiveCurveToRelative(8.013f, -0.38f, 9.579f, -0.786f)
                curveToRelative(0.907f, -0.24f, 2.423f, -0.934f, 2.423f, -3.766f)
                verticalLineToRelative(-5.24f)
                curveToRelative(0.0f, -2.888f, -1.92f, -3.658f, -3.052f, -3.658f)
                moveToRelative(-8.914f, -2.469f)
                curveToRelative(1.726f, 0.0f, 2.384f, 3.406f, 3.3f, 7.493f)
                curveToRelative(-1.004f, 1.238f, -2.072f, 2.236f, -3.3f, 2.236f)
                curveToRelative(-1.228f, 0.0f, -2.292f, -0.998f, -3.3f, -2.236f)
                curveToRelative(0.857f, -3.822f, 1.519f, -7.493f, 3.3f, -7.493f)
                moveTo(1.664f, 16.242f)
                verticalLineToRelative(-5.24f)
                curveToRelative(0.0f, -1.823f, 0.981f, -2.02f, 1.414f, -2.02f)
                curveToRelative(1.257f, 0.0f, 2.62f, 2.096f, 3.893f, 3.78f)
                curveToRelative(-0.91f, 3.818f, -1.873f, 6.143f, -4.145f, 5.664f)
                curveToRelative(-0.593f, -0.16f, -1.15f, -0.537f, -1.15f, -2.167f)
                moveToRelative(4.46f, 2.655f)
                curveToRelative(1.006f, -1.093f, 1.638f, -2.8f, 2.139f, -4.607f)
                curveToRelative(1.05f, 1.103f, 2.266f, 1.935f, 3.772f, 1.935f)
                curveToRelative(1.506f, 0.0f, 2.718f, -0.832f, 3.773f, -1.935f)
                curveToRelative(0.488f, 1.807f, 1.13f, 3.514f, 2.135f, 4.607f)
                arcToRelative(67.507f, 67.507f, 0.0f, false, true, -11.806f, 0.0f)
                moveToRelative(16.282f, -2.655f)
                curveToRelative(0.0f, 1.637f, -0.556f, 2.007f, -1.15f, 2.167f)
                curveToRelative(-2.275f, 0.482f, -3.235f, -1.846f, -4.145f, -5.665f)
                curveToRelative(1.287f, -1.683f, 2.62f, -3.779f, 3.894f, -3.779f)
                curveToRelative(0.425f, 0.0f, 1.414f, 0.197f, 1.414f, 2.02f)
                close()
            }
        }
        .build()
        return _appsignal!!
    }

private var _appsignal: ImageVector? = null
