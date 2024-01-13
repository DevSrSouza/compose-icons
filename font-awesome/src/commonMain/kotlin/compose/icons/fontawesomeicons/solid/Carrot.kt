package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = Builder(name = "Carrot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(346.7f, 6.0f)
                curveTo(337.6f, 17.0f, 320.0f, 42.3f, 320.0f, 72.0f)
                curveToRelative(0.0f, 40.0f, 15.3f, 55.3f, 40.0f, 80.0f)
                reflectiveCurveToRelative(40.0f, 40.0f, 80.0f, 40.0f)
                curveToRelative(29.7f, 0.0f, 55.0f, -17.6f, 66.0f, -26.7f)
                curveToRelative(4.0f, -3.3f, 6.0f, -8.2f, 6.0f, -13.3f)
                reflectiveCurveToRelative(-2.0f, -10.0f, -6.0f, -13.2f)
                curveToRelative(-11.4f, -9.1f, -38.3f, -26.8f, -74.0f, -26.8f)
                curveToRelative(-32.0f, 0.0f, -40.0f, 8.0f, -40.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -8.0f, 8.0f, -40.0f)
                curveToRelative(0.0f, -35.7f, -17.7f, -62.6f, -26.8f, -74.0f)
                curveTo(370.0f, 2.0f, 365.1f, 0.0f, 360.0f, 0.0f)
                reflectiveCurveToRelative(-10.0f, 2.0f, -13.3f, 6.0f)
                close()
                moveTo(244.6f, 136.0f)
                curveToRelative(-40.0f, 0.0f, -77.1f, 18.1f, -101.7f, 48.2f)
                lineToRelative(60.5f, 60.5f)
                curveToRelative(6.2f, 6.2f, 6.2f, 16.4f, 0.0f, 22.6f)
                reflectiveCurveToRelative(-16.4f, 6.2f, -22.6f, 0.0f)
                lineToRelative(-55.3f, -55.3f)
                lineToRelative(0.0f, 0.1f)
                lineTo(2.2f, 477.9f)
                curveTo(-2.0f, 487.0f, -0.1f, 497.8f, 7.0f, 505.0f)
                reflectiveCurveToRelative(17.9f, 9.0f, 27.1f, 4.8f)
                lineToRelative(134.7f, -62.4f)
                lineToRelative(-52.1f, -52.1f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(16.4f, -6.2f, 22.6f, 0.0f)
                lineTo(199.7f, 433.0f)
                lineToRelative(100.2f, -46.4f)
                curveToRelative(46.4f, -21.5f, 76.2f, -68.0f, 76.2f, -119.2f)
                curveTo(376.0f, 194.8f, 317.2f, 136.0f, 244.6f, 136.0f)
                close()
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
