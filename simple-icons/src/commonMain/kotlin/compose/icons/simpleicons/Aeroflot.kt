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

public val SimpleIcons.Aeroflot: ImageVector
    get() {
        if (_aeroflot != null) {
            return _aeroflot!!
        }
        _aeroflot = Builder(name = "Aeroflot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.066f, 12.725f)
                curveToRelative(-0.056f, -0.135f, -0.097f, -0.272f, -0.143f, -0.406f)
                lineToRelative(-6.675f, 0.406f)
                lineToRelative(1.35f, 0.693f)
                close()
                moveTo(9.975f, 13.972f)
                curveToRelative(-0.057f, -0.042f, -0.115f, -0.1f, -0.17f, -0.15f)
                arcToRelative(1.822f, 1.822f, 0.0f, false, true, -0.287f, -0.318f)
                lineToRelative(-3.333f, 0.67f)
                lineToRelative(1.419f, 0.509f)
                close()
                moveTo(12.615f, 13.686f)
                curveToRelative(0.16f, -0.025f, 0.4f, -0.122f, 0.588f, -0.268f)
                lineToRelative(-0.968f, -2.032f)
                lineToRelative(1.005f, -0.51f)
                lineToRelative(-0.848f, -0.782f)
                curveToRelative(-0.602f, 0.292f, -1.206f, 0.58f, -1.809f, 0.868f)
                lineToRelative(0.43f, 1.025f)
                lineToRelative(0.694f, -0.33f)
                close()
                moveTo(14.265f, 9.445f)
                curveToRelative(0.387f, 0.5f, 0.655f, 1.081f, 0.782f, 1.7f)
                horizontalLineToRelative(-0.61f)
                arcToRelative(3.884f, 3.884f, 0.0f, false, false, -0.172f, -0.57f)
                curveToRelative(-0.41f, -1.142f, -1.25f, -1.956f, -2.216f, -2.633f)
                curveToRelative(-0.127f, -0.078f, -0.241f, -0.164f, -0.37f, -0.238f)
                curveToRelative(0.129f, 0.044f, 0.243f, 0.086f, 0.37f, 0.136f)
                curveToRelative(0.88f, 0.372f, 1.662f, 0.885f, 2.216f, 1.605f)
                moveToRelative(0.185f, 6.517f)
                curveToRelative(-0.225f, 0.114f, -0.455f, 0.22f, -0.682f, 0.33f)
                lineToRelative(-0.565f, -1.193f)
                curveToRelative(-0.37f, 0.139f, -0.76f, 0.215f, -1.154f, 0.226f)
                curveToRelative(-0.424f, 0.02f, -0.847f, -0.04f, -1.249f, -0.176f)
                lineToRelative(-0.483f, 1.143f)
                curveToRelative(-0.157f, 0.014f, -0.374f, 0.0f, -0.512f, -0.106f)
                arcToRelative(0.378f, 0.378f, 0.0f, false, true, -0.169f, -0.224f)
                curveToRelative(0.204f, -0.356f, 0.389f, -0.723f, 0.579f, -1.087f)
                curveToRelative(-0.127f, -0.088f, -0.24f, -0.152f, -0.355f, -0.27f)
                lineToRelative(0.344f, -0.437f)
                curveToRelative(0.582f, 0.38f, 1.22f, 0.585f, 1.845f, 0.585f)
                curveToRelative(0.627f, 0.022f, 1.25f, -0.192f, 1.832f, -0.628f)
                curveToRelative(0.19f, 0.055f, 0.385f, 0.119f, 0.541f, 0.18f)
                curveToRelative(-0.058f, 0.046f, -0.1f, 0.087f, -0.157f, 0.136f)
                curveToRelative(-0.114f, 0.12f, -0.213f, 0.242f, -0.398f, 0.346f)
                curveToRelative(0.188f, 0.395f, 0.387f, 0.784f, 0.583f, 1.175f)
                close()
                moveTo(22.235f, 12.531f)
                lineTo(24.0f, 11.343f)
                horizontalLineToRelative(-9.55f)
                curveToRelative(0.0f, 0.422f, -0.06f, 0.784f, -0.185f, 1.1f)
                curveToRelative(-0.369f, 1.005f, -1.291f, 1.487f, -2.216f, 1.469f)
                curveToRelative(-0.908f, -0.027f, -1.834f, -0.524f, -2.244f, -1.441f)
                arcToRelative(2.745f, 2.745f, 0.0f, false, true, -0.229f, -1.128f)
                lineTo(0.0f, 11.343f)
                lineToRelative(1.75f, 1.188f)
                lineToRelative(7.316f, -0.404f)
                curveToRelative(0.138f, 0.553f, 0.397f, 1.037f, 0.74f, 1.395f)
                arcToRelative(3.065f, 3.065f, 0.0f, false, false, 2.243f, 1.01f)
                arcToRelative(2.79f, 2.79f, 0.0f, false, false, 2.216f, -0.992f)
                curveToRelative(0.312f, -0.362f, 0.554f, -0.826f, 0.694f, -1.385f)
                close()
                moveTo(21.755f, 12.725f)
                lineToRelative(-1.352f, 0.663f)
                lineTo(15.0f, 12.725f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 0.129f, -0.406f)
                close()
                moveTo(17.848f, 14.187f)
                lineToRelative(-1.48f, 0.52f)
                arcToRelative(357.77f, 357.77f, 0.0f, false, true, -2.286f, -0.735f)
                curveToRelative(0.069f, -0.06f, 0.125f, -0.117f, 0.183f, -0.196f)
                curveToRelative(0.085f, -0.074f, 0.157f, -0.176f, 0.242f, -0.254f)
                close()
                moveTo(18.559f, 14.097f)
                lineToRelative(1.177f, -0.575f)
                lineToRelative(-4.86f, -0.614f)
                curveToRelative(-0.043f, 0.164f, -0.171f, 0.298f, -0.256f, 0.432f)
                close()
                moveTo(5.443f, 14.097f)
                lineToRelative(-1.179f, -0.542f)
                lineToRelative(4.885f, -0.635f)
                curveToRelative(0.09f, 0.152f, 0.171f, 0.286f, 0.27f, 0.42f)
                close()
            }
        }
        .build()
        return _aeroflot!!
    }

private var _aeroflot: ImageVector? = null
