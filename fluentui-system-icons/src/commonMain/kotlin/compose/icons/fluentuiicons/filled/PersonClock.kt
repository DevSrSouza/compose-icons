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

public val FilledGroup.PersonClock: ImageVector
    get() {
        if (_personClock != null) {
            return _personClock!!
        }
        _personClock = Builder(name = "PersonClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.5002f)
                curveTo(11.0f, 16.2116f, 11.375f, 15.0105f, 12.0219f, 14.0002f)
                horizontalLineTo(4.2528f)
                curveTo(3.0108f, 14.0002f, 2.0039f, 15.007f, 2.0039f, 16.2491f)
                verticalLineTo(16.8267f)
                curveTo(2.0039f, 17.7195f, 2.3224f, 18.583f, 2.9022f, 19.2619f)
                curveTo(4.4685f, 21.0962f, 6.8545f, 22.0013f, 10.0004f, 22.0013f)
                curveTo(10.9314f, 22.0013f, 11.7961f, 21.922f, 12.5927f, 21.7629f)
                curveTo(11.6006f, 20.6217f, 11.0f, 19.1311f, 11.0f, 17.5002f)
                close()
                moveTo(10.0004f, 2.0049f)
                curveTo(12.7618f, 2.0049f, 15.0004f, 4.2435f, 15.0004f, 7.0049f)
                curveTo(15.0004f, 9.7663f, 12.7618f, 12.0049f, 10.0004f, 12.0049f)
                curveTo(7.2389f, 12.0049f, 5.0004f, 9.7663f, 5.0004f, 7.0049f)
                curveTo(5.0004f, 4.2435f, 7.2389f, 2.0049f, 10.0004f, 2.0049f)
                close()
                moveTo(17.5f, 12.0002f)
                curveTo(20.5376f, 12.0002f, 23.0f, 14.4627f, 23.0f, 17.5002f)
                curveTo(23.0f, 20.5378f, 20.5376f, 23.0002f, 17.5f, 23.0002f)
                curveTo(14.4624f, 23.0002f, 12.0f, 20.5378f, 12.0f, 17.5002f)
                curveTo(12.0f, 14.4627f, 14.4624f, 12.0002f, 17.5f, 12.0002f)
                close()
                moveTo(19.5f, 17.5003f)
                horizontalLineTo(17.5f)
                lineTo(17.5f, 15.0002f)
                curveTo(17.5f, 14.724f, 17.2761f, 14.5002f, 17.0f, 14.5002f)
                curveTo(16.7239f, 14.5002f, 16.5f, 14.724f, 16.5f, 15.0002f)
                lineTo(16.5f, 17.9988f)
                lineTo(16.5f, 18.0003f)
                curveTo(16.5f, 18.2764f, 16.7239f, 18.5003f, 17.0f, 18.5003f)
                horizontalLineTo(19.5f)
                curveTo(19.7761f, 18.5003f, 20.0f, 18.2764f, 20.0f, 18.0003f)
                curveTo(20.0f, 17.7242f, 19.7761f, 17.5003f, 19.5f, 17.5003f)
                close()
            }
        }
        .build()
        return _personClock!!
    }

private var _personClock: ImageVector? = null
