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

public val FilledGroup.TicketHorizontal: ImageVector
    get() {
        if (_ticketHorizontal != null) {
            return _ticketHorizontal!!
        }
        _ticketHorizontal = Builder(name = "TicketHorizontal", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7503f, 5.0f)
                curveTo(21.4406f, 5.0f, 22.0003f, 5.5596f, 22.0003f, 6.25f)
                verticalLineTo(8.5088f)
                curveTo(22.0003f, 8.9025f, 21.6957f, 9.2292f, 21.303f, 9.2569f)
                curveTo(19.8697f, 9.3581f, 18.7503f, 10.5545f, 18.7503f, 12.0f)
                curveTo(18.7503f, 13.4455f, 19.8697f, 14.6419f, 21.303f, 14.7431f)
                curveTo(21.6957f, 14.7708f, 22.0003f, 15.0975f, 22.0003f, 15.4912f)
                verticalLineTo(17.75f)
                curveTo(22.0003f, 18.4404f, 21.4406f, 19.0f, 20.7503f, 19.0f)
                horizontalLineTo(3.2503f)
                curveTo(2.5599f, 19.0f, 2.0003f, 18.4404f, 2.0003f, 17.7501f)
                lineTo(2.0f, 15.4913f)
                curveTo(2.0f, 15.0975f, 2.3045f, 14.7708f, 2.6973f, 14.7431f)
                curveTo(4.1306f, 14.642f, 5.2503f, 13.4456f, 5.2503f, 12.0f)
                curveTo(5.2503f, 10.5544f, 4.1306f, 9.358f, 2.6973f, 9.2569f)
                curveTo(2.3045f, 9.2292f, 2.0f, 8.9025f, 2.0f, 8.5087f)
                lineTo(2.0003f, 6.25f)
                curveTo(2.0003f, 5.5596f, 2.5599f, 5.0f, 3.2503f, 5.0f)
                horizontalLineTo(20.7503f)
                close()
            }
        }
        .build()
        return _ticketHorizontal!!
    }

private var _ticketHorizontal: ImageVector? = null
