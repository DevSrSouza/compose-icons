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

public val SimpleIcons.Cloudflare: ImageVector
    get() {
        if (_cloudflare != null) {
            return _cloudflare!!
        }
        _cloudflare = Builder(name = "Cloudflare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.509f, 16.845f)
                curveToRelative(0.147f, -0.507f, 0.091f, -0.971f, -0.155f, -1.315f)
                curveToRelative(-0.225f, -0.316f, -0.604f, -0.499f, -1.061f, -0.521f)
                lineToRelative(-8.659f, -0.112f)
                arcToRelative(0.156f, 0.156f, 0.0f, false, true, -0.133f, -0.071f)
                curveToRelative(-0.028f, -0.042f, -0.035f, -0.099f, -0.021f, -0.155f)
                curveToRelative(0.028f, -0.084f, 0.112f, -0.148f, 0.204f, -0.156f)
                lineToRelative(8.736f, -0.112f)
                curveToRelative(1.035f, -0.049f, 2.16f, -0.887f, 2.554f, -1.914f)
                lineToRelative(0.499f, -1.301f)
                curveToRelative(0.022f, -0.056f, 0.029f, -0.113f, 0.015f, -0.168f)
                curveToRelative(-0.563f, -2.546f, -2.835f, -4.445f, -5.55f, -4.445f)
                curveToRelative(-2.504f, 0.0f, -4.628f, 1.618f, -5.388f, 3.861f)
                curveToRelative(-0.493f, -0.366f, -1.119f, -0.563f, -1.794f, -0.499f)
                curveToRelative(-1.203f, 0.119f, -2.167f, 1.083f, -2.286f, 2.286f)
                curveToRelative(-0.028f, 0.31f, -0.007f, 0.613f, 0.064f, 0.894f)
                curveTo(1.568f, 13.171f, 0.0f, 14.775f, 0.0f, 16.752f)
                curveToRelative(0.0f, 0.175f, 0.014f, 0.352f, 0.035f, 0.527f)
                curveToRelative(0.014f, 0.083f, 0.084f, 0.147f, 0.169f, 0.147f)
                horizontalLineToRelative(15.981f)
                curveToRelative(0.091f, 0.0f, 0.176f, -0.064f, 0.203f, -0.155f)
                lineToRelative(0.12f, -0.427f)
                close()
                moveTo(19.266f, 11.281f)
                curveToRelative(-0.077f, 0.0f, -0.161f, 0.0f, -0.238f, 0.011f)
                curveToRelative(-0.057f, 0.0f, -0.105f, 0.041f, -0.127f, 0.098f)
                lineToRelative(-0.338f, 1.174f)
                curveToRelative(-0.147f, 0.507f, -0.092f, 0.971f, 0.154f, 1.316f)
                curveToRelative(0.226f, 0.316f, 0.605f, 0.498f, 1.063f, 0.52f)
                lineToRelative(1.844f, 0.113f)
                curveToRelative(0.056f, 0.0f, 0.105f, 0.026f, 0.133f, 0.07f)
                curveToRelative(0.028f, 0.043f, 0.035f, 0.107f, 0.021f, 0.156f)
                curveToRelative(-0.028f, 0.084f, -0.113f, 0.148f, -0.204f, 0.155f)
                lineToRelative(-1.921f, 0.112f)
                curveToRelative(-1.041f, 0.049f, -2.158f, 0.887f, -2.553f, 1.914f)
                lineToRelative(-0.141f, 0.359f)
                curveToRelative(-0.028f, 0.071f, 0.022f, 0.142f, 0.099f, 0.142f)
                horizontalLineToRelative(6.598f)
                curveToRelative(0.077f, 0.0f, 0.147f, -0.049f, 0.169f, -0.126f)
                curveToRelative(0.112f, -0.408f, 0.176f, -0.837f, 0.176f, -1.28f)
                curveToRelative(0.0f, -2.602f, -2.125f, -4.727f, -4.734f, -4.727f)
            }
        }
        .build()
        return _cloudflare!!
    }

private var _cloudflare: ImageVector? = null
