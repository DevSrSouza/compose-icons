package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.PersonArrowRight: ImageVector
    get() {
        if (_personArrowRight != null) {
            return _personArrowRight!!
        }
        _personArrowRight = Builder(name = "PersonArrowRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9999f, 17.5002f)
                curveTo(10.9999f, 16.2116f, 11.3749f, 15.0105f, 12.0217f, 14.0002f)
                horizontalLineTo(4.2523f)
                curveTo(3.0103f, 14.0002f, 2.0034f, 15.007f, 2.0034f, 16.2491f)
                verticalLineTo(17.169f)
                curveTo(2.0034f, 17.7411f, 2.1818f, 18.2989f, 2.5138f, 18.7648f)
                curveTo(4.056f, 20.9292f, 6.5789f, 22.0013f, 9.9999f, 22.0013f)
                curveTo(10.931f, 22.0013f, 11.7957f, 21.9219f, 12.5924f, 21.7626f)
                curveTo(11.6004f, 20.6215f, 10.9999f, 19.131f, 10.9999f, 17.5002f)
                close()
                moveTo(9.9999f, 2.0049f)
                curveTo(12.7613f, 2.0049f, 14.9999f, 4.2435f, 14.9999f, 7.0049f)
                curveTo(14.9999f, 9.7663f, 12.7613f, 12.0049f, 9.9999f, 12.0049f)
                curveTo(7.2385f, 12.0049f, 4.9999f, 9.7663f, 4.9999f, 7.0049f)
                curveTo(4.9999f, 4.2435f, 7.2385f, 2.0049f, 9.9999f, 2.0049f)
                close()
                moveTo(22.9999f, 17.5002f)
                curveTo(22.9999f, 20.5378f, 20.5374f, 23.0002f, 17.4999f, 23.0002f)
                curveTo(14.4623f, 23.0002f, 11.9999f, 20.5378f, 11.9999f, 17.5002f)
                curveTo(11.9999f, 14.4627f, 14.4623f, 12.0002f, 17.4999f, 12.0002f)
                curveTo(20.5374f, 12.0002f, 22.9999f, 14.4627f, 22.9999f, 17.5002f)
                close()
                moveTo(18.3534f, 14.6467f)
                curveTo(18.1582f, 14.4515f, 17.8416f, 14.4515f, 17.6463f, 14.6467f)
                curveTo(17.4511f, 14.842f, 17.4511f, 15.1586f, 17.6463f, 15.3538f)
                lineTo(19.2927f, 17.0002f)
                horizontalLineTo(14.9999f)
                curveTo(14.7237f, 17.0002f, 14.4999f, 17.2241f, 14.4999f, 17.5002f)
                curveTo(14.4999f, 17.7764f, 14.7237f, 18.0002f, 14.9999f, 18.0002f)
                horizontalLineTo(19.2928f)
                lineTo(17.6463f, 19.6467f)
                curveTo(17.4511f, 19.842f, 17.4511f, 20.1586f, 17.6463f, 20.3538f)
                curveTo(17.8416f, 20.5491f, 18.1582f, 20.5491f, 18.3534f, 20.3538f)
                lineTo(20.8534f, 17.8538f)
                curveTo(20.9066f, 17.8007f, 20.9453f, 17.7385f, 20.9695f, 17.6723f)
                curveTo(20.9881f, 17.6214f, 20.9988f, 17.5666f, 20.9998f, 17.5095f)
                lineTo(20.9999f, 17.5002f)
                curveTo(20.9999f, 17.4231f, 20.9824f, 17.35f, 20.9512f, 17.2848f)
                curveTo(20.9359f, 17.2527f, 20.917f, 17.2219f, 20.8944f, 17.1931f)
                curveTo(20.8805f, 17.1753f, 20.8655f, 17.1584f, 20.8493f, 17.1426f)
                lineTo(18.3534f, 14.6467f)
                close()
            }
        }
        .build()
        return _personArrowRight!!
    }

private var _personArrowRight: ImageVector? = null
