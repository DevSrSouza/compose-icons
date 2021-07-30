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

public val BrandsGroup.Hubspot: ImageVector
    get() {
        if (_hubspot != null) {
            return _hubspot!!
        }
        _hubspot = Builder(name = "Hubspot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(267.4f, 211.6f)
                curveToRelative(-25.1f, 23.7f, -40.8f, 57.3f, -40.8f, 94.6f)
                curveToRelative(0.0f, 29.3f, 9.7f, 56.3f, 26.0f, 78.0f)
                lineTo(203.1f, 434.0f)
                curveToRelative(-4.4f, -1.6f, -9.1f, -2.5f, -14.0f, -2.5f)
                curveToRelative(-10.8f, 0.0f, -20.9f, 4.2f, -28.5f, 11.8f)
                curveToRelative(-7.6f, 7.6f, -11.8f, 17.8f, -11.8f, 28.6f)
                reflectiveCurveToRelative(4.2f, 20.9f, 11.8f, 28.5f)
                curveToRelative(7.6f, 7.6f, 17.8f, 11.6f, 28.5f, 11.6f)
                curveToRelative(10.8f, 0.0f, 20.9f, -3.9f, 28.6f, -11.6f)
                curveToRelative(7.6f, -7.6f, 11.8f, -17.8f, 11.8f, -28.5f)
                curveToRelative(0.0f, -4.2f, -0.6f, -8.2f, -1.9f, -12.1f)
                lineToRelative(50.0f, -50.2f)
                curveToRelative(22.0f, 16.9f, 49.4f, 26.9f, 79.3f, 26.9f)
                curveToRelative(71.9f, 0.0f, 130.0f, -58.3f, 130.0f, -130.2f)
                curveToRelative(0.0f, -65.2f, -47.7f, -119.2f, -110.2f, -128.7f)
                lineTo(376.7f, 116.0f)
                curveToRelative(17.5f, -7.4f, 28.2f, -23.8f, 28.2f, -42.9f)
                curveToRelative(0.0f, -26.1f, -20.9f, -47.9f, -47.0f, -47.9f)
                reflectiveCurveTo(311.2f, 47.0f, 311.2f, 73.1f)
                curveToRelative(0.0f, 19.1f, 10.7f, 35.5f, 28.2f, 42.9f)
                verticalLineToRelative(61.2f)
                curveToRelative(-15.2f, 2.1f, -29.6f, 6.7f, -42.7f, 13.6f)
                curveToRelative(-27.6f, -20.9f, -117.5f, -85.7f, -168.9f, -124.8f)
                curveToRelative(1.2f, -4.4f, 2.0f, -9.0f, 2.0f, -13.8f)
                curveTo(129.8f, 23.4f, 106.3f, 0.0f, 77.4f, 0.0f)
                curveTo(48.6f, 0.0f, 25.2f, 23.4f, 25.2f, 52.2f)
                curveToRelative(0.0f, 28.9f, 23.4f, 52.3f, 52.2f, 52.3f)
                curveToRelative(9.8f, 0.0f, 18.9f, -2.9f, 26.8f, -7.6f)
                lineToRelative(163.2f, 114.7f)
                close()
                moveTo(356.9f, 375.2f)
                curveToRelative(-38.1f, 0.0f, -69.0f, -30.9f, -69.0f, -69.0f)
                reflectiveCurveToRelative(30.9f, -69.0f, 69.0f, -69.0f)
                reflectiveCurveToRelative(69.0f, 30.9f, 69.0f, 69.0f)
                reflectiveCurveToRelative(-30.9f, 69.0f, -69.0f, 69.0f)
                close()
            }
        }
        .build()
        return _hubspot!!
    }

private var _hubspot: ImageVector? = null
