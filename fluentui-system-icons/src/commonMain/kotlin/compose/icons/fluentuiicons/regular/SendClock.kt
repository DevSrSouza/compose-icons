package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.SendClock: ImageVector
    get() {
        if (_sendClock != null) {
            return _sendClock!!
        }
        _sendClock = Builder(name = "SendClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6936f, 11.9997f)
                lineTo(2.2993f, 3.2715f)
                curveTo(2.0631f, 2.664f, 2.6554f, 2.0831f, 3.2414f, 2.2896f)
                lineTo(3.3338f, 2.3289f)
                lineTo(21.3337f, 11.3288f)
                curveTo(21.7769f, 11.5504f, 21.8648f, 12.1013f, 21.5975f, 12.4535f)
                curveTo(20.4793f, 11.5445f, 19.0533f, 10.9997f, 17.5f, 10.9997f)
                curveTo(17.4418f, 10.9997f, 17.3837f, 11.0004f, 17.3259f, 11.002f)
                lineTo(4.4021f, 4.5401f)
                lineTo(7.0111f, 11.2491f)
                lineTo(13.6387f, 11.2497f)
                curveTo(13.9856f, 11.2497f, 14.2776f, 11.4853f, 14.3632f, 11.8053f)
                curveTo(13.8908f, 12.0661f, 13.4543f, 12.3839f, 13.063f, 12.7496f)
                lineTo(7.0111f, 12.7491f)
                lineTo(4.4021f, 19.4593f)
                lineTo(11.1549f, 16.0829f)
                curveTo(11.0535f, 16.539f, 11.0f, 17.0131f, 11.0f, 17.4997f)
                curveTo(11.0f, 17.6115f, 11.0028f, 17.7227f, 11.0084f, 17.8332f)
                lineTo(3.3338f, 21.6705f)
                curveTo(2.7508f, 21.962f, 2.1175f, 21.426f, 2.2688f, 20.8234f)
                lineTo(2.2993f, 20.7278f)
                lineTo(5.6936f, 11.9997f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 17.4997f)
                curveTo(23.0f, 14.4621f, 20.5376f, 11.9997f, 17.5f, 11.9997f)
                curveTo(14.4624f, 11.9997f, 12.0f, 14.4621f, 12.0f, 17.4997f)
                curveTo(12.0f, 20.5372f, 14.4624f, 22.9997f, 17.5f, 22.9997f)
                curveTo(20.5376f, 22.9997f, 23.0f, 20.5372f, 23.0f, 17.4997f)
                close()
                moveTo(17.5f, 17.4997f)
                horizontalLineTo(19.5f)
                curveTo(19.7761f, 17.4997f, 20.0f, 17.7236f, 20.0f, 17.9997f)
                curveTo(20.0f, 18.2759f, 19.7761f, 18.4997f, 19.5f, 18.4997f)
                horizontalLineTo(17.0f)
                curveTo(16.7239f, 18.4997f, 16.5f, 18.2759f, 16.5f, 17.9997f)
                lineTo(16.5f, 17.9982f)
                lineTo(16.5f, 14.9996f)
                curveTo(16.5f, 14.7235f, 16.7239f, 14.4996f, 17.0f, 14.4996f)
                curveTo(17.2761f, 14.4996f, 17.5f, 14.7235f, 17.5f, 14.9996f)
                lineTo(17.5f, 17.4997f)
                close()
            }
        }
        .build()
        return _sendClock!!
    }

private var _sendClock: ImageVector? = null
