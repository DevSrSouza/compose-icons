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

public val BrandsGroup.Cloudscale: ImageVector
    get() {
        if (_cloudscale != null) {
            return _cloudscale!!
        }
        _cloudscale = Builder(name = "Cloudscale", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(318.1f, 154.0f)
                lineToRelative(-9.4f, 7.6f)
                curveToRelative(-22.5f, -19.3f, -51.5f, -33.6f, -83.3f, -33.6f)
                curveTo(153.8f, 128.0f, 96.0f, 188.8f, 96.0f, 260.3f)
                curveToRelative(0.0f, 6.6f, 0.4f, 13.1f, 1.4f, 19.4f)
                curveToRelative(-2.0f, -56.0f, 41.8f, -97.4f, 92.6f, -97.4f)
                curveToRelative(24.2f, 0.0f, 46.2f, 9.4f, 62.6f, 24.7f)
                lineToRelative(-25.2f, 20.4f)
                curveToRelative(-8.3f, -0.9f, -16.8f, 1.8f, -23.1f, 8.1f)
                curveToRelative(-11.1f, 11.0f, -11.1f, 28.9f, 0.0f, 40.0f)
                curveToRelative(11.1f, 11.0f, 28.9f, 11.0f, 40.0f, 0.0f)
                curveToRelative(6.3f, -6.3f, 9.0f, -14.9f, 8.1f, -23.1f)
                lineToRelative(75.2f, -88.8f)
                curveToRelative(6.3f, -6.5f, -3.3f, -15.9f, -9.5f, -9.6f)
                close()
                moveTo(234.3f, 265.5f)
                curveToRelative(-5.6f, 5.5f, -14.6f, 5.5f, -20.2f, 0.0f)
                curveToRelative(-5.6f, -5.6f, -5.6f, -14.6f, 0.0f, -20.2f)
                reflectiveCurveToRelative(14.6f, -5.6f, 20.2f, 0.0f)
                reflectiveCurveToRelative(5.6f, 14.7f, 0.0f, 20.2f)
                close()
                moveTo(224.0f, 32.0f)
                curveTo(100.5f, 32.0f, 0.0f, 132.5f, 0.0f, 256.0f)
                reflectiveCurveToRelative(100.5f, 224.0f, 224.0f, 224.0f)
                reflectiveCurveToRelative(224.0f, -100.5f, 224.0f, -224.0f)
                reflectiveCurveTo(347.5f, 32.0f, 224.0f, 32.0f)
                close()
                moveTo(224.0f, 416.0f)
                curveToRelative(-88.2f, 0.0f, -160.0f, -71.8f, -160.0f, -160.0f)
                reflectiveCurveTo(135.8f, 96.0f, 224.0f, 96.0f)
                reflectiveCurveToRelative(160.0f, 71.8f, 160.0f, 160.0f)
                reflectiveCurveToRelative(-71.8f, 160.0f, -160.0f, 160.0f)
                close()
            }
        }
        .build()
        return _cloudscale!!
    }

private var _cloudscale: ImageVector? = null
