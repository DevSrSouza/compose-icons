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

public val FilledGroup.PersonLightbulb: ImageVector
    get() {
        if (_personLightbulb != null) {
            return _personLightbulb!!
        }
        _personLightbulb = Builder(name = "PersonLightbulb", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 16.0f)
                curveTo(13.0f, 15.289f, 13.1484f, 14.6126f, 13.416f, 14.0002f)
                horizontalLineTo(6.2523f)
                curveTo(5.0103f, 14.0002f, 4.0034f, 15.007f, 4.0034f, 16.2491f)
                verticalLineTo(17.169f)
                curveTo(4.0034f, 17.7411f, 4.1818f, 18.2989f, 4.5138f, 18.7648f)
                curveTo(6.056f, 20.9292f, 8.5789f, 22.0013f, 11.9999f, 22.0013f)
                curveTo(13.1749f, 22.0013f, 14.2442f, 21.8748f, 15.2044f, 21.6211f)
                lineTo(14.8581f, 19.8897f)
                curveTo(13.7263f, 18.9743f, 13.0f, 17.5721f, 13.0f, 16.0f)
                close()
                moveTo(16.9999f, 7.0049f)
                curveTo(16.9999f, 4.2435f, 14.7613f, 2.0049f, 11.9999f, 2.0049f)
                curveTo(9.2385f, 2.0049f, 6.9999f, 4.2435f, 6.9999f, 7.0049f)
                curveTo(6.9999f, 9.7663f, 9.2385f, 12.0049f, 11.9999f, 12.0049f)
                curveTo(14.7613f, 12.0049f, 16.9999f, 9.7663f, 16.9999f, 7.0049f)
                close()
                moveTo(22.0f, 16.0f)
                curveTo(22.0f, 17.3806f, 21.3005f, 18.5979f, 20.2367f, 19.3167f)
                lineTo(20.1f, 20.0f)
                horizontalLineTo(15.9f)
                lineTo(15.7633f, 19.3167f)
                curveTo(14.6995f, 18.5979f, 14.0f, 17.3806f, 14.0f, 16.0f)
                curveTo(14.0f, 13.7909f, 15.7909f, 12.0f, 18.0f, 12.0f)
                curveTo(20.2091f, 12.0f, 22.0f, 13.7909f, 22.0f, 16.0f)
                close()
                moveTo(16.1f, 21.0f)
                lineTo(16.2588f, 21.7942f)
                curveTo(16.3991f, 22.4953f, 17.0147f, 23.0f, 17.7297f, 23.0f)
                horizontalLineTo(18.2703f)
                curveTo(18.9853f, 23.0f, 19.6009f, 22.4953f, 19.7412f, 21.7942f)
                lineTo(19.9f, 21.0f)
                horizontalLineTo(16.1f)
                close()
            }
        }
        .build()
        return _personLightbulb!!
    }

private var _personLightbulb: ImageVector? = null
