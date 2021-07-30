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

public val SimpleIcons.Oculus: ImageVector
    get() {
        if (_oculus != null) {
            return _oculus!!
        }
        _oculus = Builder(name = "Oculus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.135f, 13.949f)
                curveToRelative(-0.319f, 0.221f, -0.675f, 0.355f, -1.057f, 0.416f)
                reflectiveCurveToRelative(-0.761f, 0.049f, -1.142f, 0.049f)
                lineTo(8.063f, 14.414f)
                curveToRelative(-0.382f, 0.0f, -0.762f, 0.014f, -1.145f, -0.049f)
                curveToRelative(-0.381f, -0.063f, -0.734f, -0.195f, -1.057f, -0.416f)
                curveToRelative(-0.643f, -0.451f, -1.027f, -1.17f, -1.027f, -1.951f)
                curveToRelative(0.0f, -0.796f, 0.387f, -1.515f, 1.029f, -1.95f)
                curveToRelative(0.314f, -0.225f, 0.674f, -0.359f, 1.049f, -0.42f)
                reflectiveCurveToRelative(0.75f, -0.061f, 1.141f, -0.061f)
                horizontalLineToRelative(7.875f)
                curveToRelative(0.375f, 0.0f, 0.765f, -0.014f, 1.14f, 0.046f)
                reflectiveCurveToRelative(0.735f, 0.194f, 1.051f, 0.405f)
                curveToRelative(0.645f, 0.434f, 1.02f, 1.17f, 1.02f, 1.949f)
                curveToRelative(0.0f, 0.78f, -0.391f, 1.5f, -1.035f, 1.95f)
                lineToRelative(0.031f, 0.032f)
                close()
                moveTo(21.309f, 6.394f)
                curveToRelative(-0.845f, -0.678f, -1.812f, -1.146f, -2.865f, -1.398f)
                curveToRelative(-0.6f, -0.146f, -1.203f, -0.211f, -1.822f, -0.23f)
                curveToRelative(-0.449f, -0.015f, -0.899f, -0.01f, -1.364f, -0.01f)
                lineTo(8.76f, 4.756f)
                curveToRelative(-0.457f, 0.0f, -0.915f, -0.005f, -1.372f, 0.01f)
                curveToRelative(-0.618f, 0.021f, -1.222f, 0.083f, -1.825f, 0.23f)
                curveToRelative(-1.051f, 0.254f, -2.025f, 0.723f, -2.865f, 1.4f)
                curveTo(0.99f, 7.761f, 0.0f, 9.82f, 0.0f, 12.0f)
                curveToRelative(0.0f, 2.182f, 0.99f, 4.241f, 2.689f, 5.606f)
                curveToRelative(0.846f, 0.678f, 1.815f, 1.146f, 2.865f, 1.4f)
                curveToRelative(0.603f, 0.146f, 1.206f, 0.211f, 1.823f, 0.229f)
                curveToRelative(0.45f, 0.016f, 0.9f, 0.012f, 1.365f, 0.012f)
                horizontalLineToRelative(6.496f)
                curveToRelative(0.449f, 0.0f, 0.914f, 0.004f, 1.364f, -0.012f)
                curveToRelative(0.615f, -0.018f, 1.215f, -0.082f, 1.814f, -0.229f)
                curveToRelative(1.05f, -0.256f, 2.011f, -0.723f, 2.866f, -1.402f)
                curveTo(23.01f, 16.24f, 24.0f, 14.18f, 24.0f, 12.0f)
                curveToRelative(0.0f, -2.181f, -0.99f, -4.241f, -2.691f, -5.606f)
                close()
            }
        }
        .build()
        return _oculus!!
    }

private var _oculus: ImageVector? = null
