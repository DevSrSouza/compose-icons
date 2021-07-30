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
                moveTo(298.2f, 156.6f)
                curveToRelative(-52.7f, -25.7f, -114.5f, -10.5f, -150.2f, 32.8f)
                lineToRelative(55.2f, 55.2f)
                curveToRelative(6.3f, 6.3f, 6.3f, 16.4f, 0.0f, 22.6f)
                curveToRelative(-3.1f, 3.1f, -7.2f, 4.7f, -11.3f, 4.7f)
                reflectiveCurveToRelative(-8.2f, -1.6f, -11.3f, -4.7f)
                lineTo(130.4f, 217.0f)
                lineTo(2.3f, 479.7f)
                curveToRelative(-2.9f, 6.0f, -3.1f, 13.3f, 0.0f, 19.7f)
                curveToRelative(5.4f, 11.1f, 18.9f, 15.7f, 30.0f, 10.3f)
                lineToRelative(133.6f, -65.2f)
                lineToRelative(-49.2f, -49.2f)
                curveToRelative(-6.3f, -6.2f, -6.3f, -16.4f, 0.0f, -22.6f)
                curveToRelative(6.3f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                lineToRelative(57.0f, 57.0f)
                lineToRelative(102.0f, -49.8f)
                curveToRelative(24.0f, -11.7f, 44.5f, -31.3f, 57.1f, -57.1f)
                curveToRelative(30.1f, -61.7f, 4.5f, -136.1f, -57.2f, -166.2f)
                close()
                moveTo(390.3f, 121.7f)
                curveTo(409.8f, 81.0f, 399.7f, 32.9f, 360.0f, 0.0f)
                curveToRelative(-50.3f, 41.7f, -52.5f, 107.5f, -7.9f, 151.9f)
                lineToRelative(8.0f, 8.0f)
                curveToRelative(44.4f, 44.6f, 110.3f, 42.4f, 151.9f, -7.9f)
                curveToRelative(-32.9f, -39.7f, -81.0f, -49.8f, -121.7f, -30.3f)
                close()
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
