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

public val SimpleIcons.Radiopublic: ImageVector
    get() {
        if (_radiopublic != null) {
            return _radiopublic!!
        }
        _radiopublic = Builder(name = "Radiopublic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.793f, 4.069f)
                curveToRelative(3.012f, -0.283f, 6.024f, -1.977f, 9.037f, -0.535f)
                verticalLineToRelative(19.892f)
                curveToRelative(-4.155f, -1.989f, -8.311f, 1.989f, -12.466f, 0.0f)
                lineToRelative(-0.0f, -3.152f)
                verticalLineToRelative(-0.347f)
                curveToRelative(-3.065f, 0.271f, -6.129f, 1.988f, -9.194f, 0.539f)
                lineTo(1.17f, 0.574f)
                curveToRelative(4.208f, 1.989f, 8.415f, -1.989f, 12.623f, 0.0f)
                close()
                moveTo(16.088f, 14.868f)
                curveToRelative(0.363f, -0.085f, 0.725f, -0.174f, 1.087f, -0.258f)
                curveToRelative(1.605f, -0.379f, 2.245f, -1.403f, 2.244f, -3.015f)
                lineTo(19.419f, 8.997f)
                curveToRelative(0.0f, -1.585f, -0.414f, -2.591f, -2.365f, -2.135f)
                curveToRelative(-1.087f, 0.256f, -2.175f, 0.542f, -3.263f, 0.644f)
                verticalLineToRelative(12.971f)
                curveToRelative(0.765f, -0.072f, 1.53f, -0.235f, 2.296f, -0.414f)
                close()
                moveTo(16.088f, 12.759f)
                lineTo(16.088f, 9.097f)
                curveToRelative(0.144f, -0.034f, 0.287f, -0.068f, 0.431f, -0.102f)
                curveToRelative(0.537f, -0.128f, 0.586f, 0.157f, 0.588f, 0.627f)
                curveToRelative(-0.0f, 0.721f, -0.0f, 1.441f, 0.0f, 2.162f)
                curveToRelative(-0.0f, 0.401f, -0.051f, 0.744f, -0.588f, 0.872f)
                arcToRelative(82.082f, 82.082f, 0.0f, false, true, -0.431f, 0.102f)
                close()
                moveTo(6.94f, 17.109f)
                verticalLineToRelative(-5.544f)
                curveToRelative(0.161f, -0.037f, 0.322f, -0.075f, 0.483f, -0.113f)
                curveToRelative(0.467f, -0.11f, 0.603f, 0.015f, 0.604f, 0.625f)
                verticalLineToRelative(3.783f)
                curveToRelative(0.001f, 0.575f, 0.087f, 0.834f, 0.207f, 0.946f)
                curveToRelative(0.766f, -0.173f, 1.53f, -0.323f, 2.296f, -0.377f)
                verticalLineToRelative(-0.087f)
                curveToRelative(-0.086f, -0.151f, -0.19f, -0.385f, -0.189f, -0.943f)
                verticalLineToRelative(-4.411f)
                curveToRelative(0.001f, -0.963f, -0.622f, -1.331f, -0.984f, -1.401f)
                curveToRelative(0.43f, -0.272f, 1.019f, -0.802f, 1.018f, -1.879f)
                lineTo(10.375f, 5.633f)
                curveToRelative(0.0f, -1.391f, -0.707f, -2.125f, -2.106f, -1.805f)
                curveToRelative(-1.208f, 0.272f, -2.417f, 0.606f, -3.625f, 0.718f)
                verticalLineToRelative(12.97f)
                curveToRelative(0.766f, -0.071f, 1.531f, -0.231f, 2.296f, -0.408f)
                close()
                moveTo(6.94f, 9.421f)
                lineTo(6.94f, 6.144f)
                arcToRelative(73.198f, 73.198f, 0.0f, false, false, 0.518f, -0.122f)
                curveToRelative(0.466f, -0.11f, 0.569f, 0.041f, 0.57f, 0.599f)
                verticalLineToRelative(1.761f)
                curveToRelative(0.0f, 0.61f, -0.171f, 0.824f, -0.639f, 0.934f)
                curveToRelative(-0.15f, 0.035f, -0.299f, 0.071f, -0.449f, 0.105f)
                close()
            }
        }
        .build()
        return _radiopublic!!
    }

private var _radiopublic: ImageVector? = null
