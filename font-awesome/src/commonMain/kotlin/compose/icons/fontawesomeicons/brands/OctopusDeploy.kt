package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.OctopusDeploy: ImageVector
    get() {
        if (_octopusDeploy != null) {
            return _octopusDeploy!!
        }
        _octopusDeploy = Builder(name = "OctopusDeploy", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(455.6f, 349.2f)
                curveToRelative(-45.891f, -39.09f, -36.67f, -77.877f, -16.095f, -128.11f)
                curveTo(475.16f, 134.04f, 415.967f, 34.14f, 329.93f, 8.3f)
                curveTo(237.04f, -19.6f, 134.252f, 24.341f, 99.677f, 117.147f)
                arcToRelative(180.862f, 180.862f, 0.0f, false, false, -10.988f, 73.544f)
                curveToRelative(1.733f, 29.543f, 14.717f, 52.97f, 24.09f, 80.3f)
                curveToRelative(17.2f, 50.161f, -28.1f, 92.743f, -66.662f, 117.582f)
                curveToRelative(-46.806f, 30.2f, -36.319f, 39.857f, -8.428f, 41.858f)
                curveToRelative(23.378f, 1.68f, 44.478f, -4.548f, 65.265f, -15.045f)
                curveToRelative(9.2f, -4.647f, 40.687f, -18.931f, 45.13f, -28.588f)
                curveTo(135.9f, 413.388f, 111.122f, 459.5f, 126.621f, 488.9f)
                curveToRelative(19.1f, 36.229f, 67.112f, -31.77f, 76.709f, -45.812f)
                curveToRelative(8.591f, -12.572f, 42.963f, -81.279f, 63.627f, -46.926f)
                curveToRelative(18.865f, 31.361f, 8.6f, 76.391f, 35.738f, 104.622f)
                curveToRelative(32.854f, 34.2f, 51.155f, -18.312f, 51.412f, -44.221f)
                curveToRelative(0.163f, -16.411f, -6.1f, -95.852f, 29.9f, -59.944f)
                curveTo(405.428f, 418.0f, 436.912f, 467.8f, 472.568f, 463.642f)
                curveToRelative(38.736f, -4.516f, -22.123f, -67.967f, -28.262f, -78.695f)
                curveToRelative(5.393f, 4.279f, 53.665f, 34.128f, 53.818f, 9.52f)
                curveTo(498.234f, 375.678f, 468.039f, 359.8f, 455.6f, 349.2f)
                close()
            }
        }
        .build()
        return _octopusDeploy!!
    }

private var _octopusDeploy: ImageVector? = null
