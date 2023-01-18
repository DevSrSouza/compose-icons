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

public val RegularGroup.Pulse: ImageVector
    get() {
        if (_pulse != null) {
            return _pulse!!
        }
        _pulse = Builder(name = "Pulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.4624f, 6.8091f)
                lineTo(11.746f, 20.426f)
                curveTo(11.9236f, 21.1626f, 12.957f, 21.2011f, 13.1891f, 20.4798f)
                lineTo(16.4456f, 10.3575f)
                lineTo(17.0318f, 12.4532f)
                curveTo(17.1224f, 12.7772f, 17.4176f, 13.0012f, 17.7541f, 13.0012f)
                horizontalLineTo(21.2477f)
                curveTo(21.6619f, 13.0012f, 21.9977f, 12.6654f, 21.9977f, 12.2512f)
                curveTo(21.9977f, 11.837f, 21.6619f, 11.5012f, 21.2477f, 11.5012f)
                horizontalLineTo(18.3231f)
                lineTo(17.2181f, 7.5505f)
                curveTo(17.0179f, 6.8344f, 16.0096f, 6.815f, 15.7819f, 7.5228f)
                lineTo(12.5785f, 17.4797f)
                lineTo(9.2253f, 3.5742f)
                curveTo(9.0428f, 2.8173f, 7.9704f, 2.8054f, 7.7712f, 3.5581f)
                lineTo(5.6688f, 11.5012f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 11.5012f, 2.0f, 11.837f, 2.0f, 12.2512f)
                curveTo(2.0f, 12.6654f, 2.3358f, 13.0012f, 2.75f, 13.0012f)
                horizontalLineTo(6.2461f)
                curveTo(6.5865f, 13.0012f, 6.8841f, 12.7721f, 6.9712f, 12.4431f)
                lineTo(8.4624f, 6.8091f)
                close()
            }
        }
        .build()
        return _pulse!!
    }

private var _pulse: ImageVector? = null
