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

public val FilledGroup.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7541f, 14.0002f)
                curveTo(18.9961f, 14.0002f, 20.0029f, 15.007f, 20.0029f, 16.2491f)
                verticalLineTo(17.1675f)
                curveTo(20.0029f, 17.7409f, 19.8237f, 18.2999f, 19.4903f, 18.7664f)
                curveTo(17.9445f, 20.9296f, 15.4202f, 22.0013f, 11.9999f, 22.0013f)
                curveTo(8.5789f, 22.0013f, 6.056f, 20.9292f, 4.5138f, 18.7648f)
                curveTo(4.1818f, 18.2989f, 4.0034f, 17.7411f, 4.0034f, 17.169f)
                verticalLineTo(16.2491f)
                curveTo(4.0034f, 15.007f, 5.0103f, 14.0002f, 6.2523f, 14.0002f)
                horizontalLineTo(17.7541f)
                close()
                moveTo(11.9999f, 2.0049f)
                curveTo(14.7613f, 2.0049f, 16.9999f, 4.2435f, 16.9999f, 7.0049f)
                curveTo(16.9999f, 9.7663f, 14.7613f, 12.0049f, 11.9999f, 12.0049f)
                curveTo(9.2385f, 12.0049f, 6.9999f, 9.7663f, 6.9999f, 7.0049f)
                curveTo(6.9999f, 4.2435f, 9.2385f, 2.0049f, 11.9999f, 2.0049f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
