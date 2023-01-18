package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.LineDashes: ImageVector
    get() {
        if (_lineDashes != null) {
            return _lineDashes!!
        }
        _lineDashes = Builder(name = "LineDashes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.785f, 2.2226f)
                curveTo(22.0779f, 2.5155f, 22.0779f, 2.9904f, 21.785f, 3.2833f)
                lineTo(20.7842f, 4.2841f)
                curveTo(20.4913f, 4.577f, 20.0165f, 4.577f, 19.7236f, 4.2841f)
                curveTo(19.4307f, 3.9912f, 19.4307f, 3.5163f, 19.7236f, 3.2234f)
                lineTo(20.7244f, 2.2226f)
                curveTo(21.0173f, 1.9297f, 21.4922f, 1.9297f, 21.785f, 2.2226f)
                close()
                moveTo(17.7774f, 6.2226f)
                curveTo(18.0703f, 6.5155f, 18.0703f, 6.9904f, 17.7774f, 7.2833f)
                lineTo(16.2774f, 8.7833f)
                curveTo(15.9845f, 9.0761f, 15.5096f, 9.0761f, 15.2167f, 8.7833f)
                curveTo(14.9238f, 8.4904f, 14.9238f, 8.0155f, 15.2167f, 7.7226f)
                lineTo(16.7167f, 6.2226f)
                curveTo(17.0096f, 5.9297f, 17.4845f, 5.9297f, 17.7774f, 6.2226f)
                close()
                moveTo(13.2803f, 10.7197f)
                curveTo(13.5732f, 11.0126f, 13.5732f, 11.4874f, 13.2803f, 11.7803f)
                lineTo(11.7803f, 13.2803f)
                curveTo(11.4874f, 13.5732f, 11.0126f, 13.5732f, 10.7197f, 13.2803f)
                curveTo(10.4268f, 12.9874f, 10.4268f, 12.5126f, 10.7197f, 12.2197f)
                lineTo(12.2197f, 10.7197f)
                curveTo(12.5126f, 10.4268f, 12.9874f, 10.4268f, 13.2803f, 10.7197f)
                close()
                moveTo(8.7774f, 16.2833f)
                curveTo(9.0703f, 15.9904f, 9.0703f, 15.5155f, 8.7774f, 15.2226f)
                curveTo(8.4845f, 14.9297f, 8.0096f, 14.9297f, 7.7167f, 15.2226f)
                lineTo(6.2167f, 16.7226f)
                curveTo(5.9239f, 17.0155f, 5.9239f, 17.4904f, 6.2167f, 17.7833f)
                curveTo(6.5096f, 18.0762f, 6.9845f, 18.0762f, 7.2774f, 17.7833f)
                lineTo(8.7774f, 16.2833f)
                close()
                moveTo(4.2811f, 20.7803f)
                curveTo(4.574f, 20.4874f, 4.574f, 20.0126f, 4.2811f, 19.7197f)
                curveTo(3.9883f, 19.4268f, 3.5134f, 19.4268f, 3.2205f, 19.7197f)
                lineTo(2.2197f, 20.7205f)
                curveTo(1.9268f, 21.0134f, 1.9268f, 21.4882f, 2.2197f, 21.7811f)
                curveTo(2.5126f, 22.074f, 2.9874f, 22.074f, 3.2803f, 21.7811f)
                lineTo(4.2811f, 20.7803f)
                close()
            }
        }
        .build()
        return _lineDashes!!
    }

private var _lineDashes: ImageVector? = null
