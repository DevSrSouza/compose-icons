package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Chrome: ImageVector
    get() {
        if (_chrome != null) {
            return _chrome!!
        }
        _chrome = Builder(name = "Chrome", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(131.5f, 217.5f)
                lineTo(55.1f, 100.1f)
                curveToRelative(47.6f, -59.2f, 119.0f, -91.8f, 192.0f, -92.1f)
                curveToRelative(42.3f, -0.3f, 85.5f, 10.5f, 124.8f, 33.2f)
                curveToRelative(43.4f, 25.2f, 76.4f, 61.4f, 97.4f, 103.0f)
                lineTo(264.0f, 133.4f)
                curveToRelative(-58.1f, -3.4f, -113.4f, 29.3f, -132.5f, 84.1f)
                close()
                moveTo(164.4f, 256.0f)
                curveToRelative(0.0f, 46.2f, 37.4f, 83.6f, 83.6f, 83.6f)
                reflectiveCurveToRelative(83.6f, -37.4f, 83.6f, -83.6f)
                reflectiveCurveToRelative(-37.4f, -83.6f, -83.6f, -83.6f)
                reflectiveCurveToRelative(-83.6f, 37.3f, -83.6f, 83.6f)
                close()
                moveTo(479.3f, 166.8f)
                lineTo(339.6f, 174.0f)
                curveToRelative(37.9f, 44.3f, 38.5f, 108.2f, 6.6f, 157.2f)
                lineTo(234.1f, 503.6f)
                curveToRelative(46.5f, 2.5f, 94.4f, -7.7f, 137.8f, -32.9f)
                curveToRelative(107.4f, -62.0f, 150.9f, -192.0f, 107.4f, -303.9f)
                close()
                moveTo(133.7f, 303.6f)
                lineTo(40.4f, 120.1f)
                curveTo(14.9f, 159.1f, 0.0f, 205.9f, 0.0f, 256.0f)
                curveToRelative(0.0f, 124.0f, 90.8f, 226.7f, 209.5f, 244.9f)
                lineToRelative(63.7f, -124.8f)
                curveToRelative(-57.6f, 10.8f, -113.2f, -20.8f, -139.5f, -72.5f)
                close()
            }
        }
        .build()
        return _chrome!!
    }

private var _chrome: ImageVector? = null
