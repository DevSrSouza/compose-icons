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

public val FilledGroup.TicketDiagonal: ImageVector
    get() {
        if (_ticketDiagonal != null) {
            return _ticketDiagonal!!
        }
        _ticketDiagonal = Builder(name = "TicketDiagonal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5908f, 2.5301f)
                curveTo(14.7121f, 1.6514f, 13.2875f, 1.6514f, 12.4088f, 2.5301f)
                lineTo(2.5301f, 12.4088f)
                curveTo(1.6514f, 13.2875f, 1.6514f, 14.7121f, 2.5301f, 15.5908f)
                lineTo(3.7016f, 16.7623f)
                curveTo(4.2123f, 17.273f, 4.9292f, 17.1816f, 5.3624f, 16.9241f)
                curveTo(5.5484f, 16.8135f, 5.7654f, 16.7498f, 5.9996f, 16.7498f)
                curveTo(6.6899f, 16.7498f, 7.2496f, 17.3095f, 7.2496f, 17.9998f)
                curveTo(7.2496f, 18.234f, 7.1859f, 18.451f, 7.0753f, 18.6371f)
                curveTo(6.8179f, 19.0702f, 6.7264f, 19.7871f, 7.2371f, 20.2978f)
                lineTo(8.4088f, 21.4694f)
                curveTo(9.2875f, 22.3481f, 10.7121f, 22.3481f, 11.5908f, 21.4694f)
                lineTo(21.4694f, 11.5908f)
                curveTo(22.3481f, 10.7121f, 22.3481f, 9.2875f, 21.4694f, 8.4088f)
                lineTo(20.2978f, 7.2372f)
                curveTo(19.7871f, 6.7264f, 19.0701f, 6.8179f, 18.6369f, 7.0755f)
                curveTo(18.4509f, 7.1861f, 18.2338f, 7.2498f, 17.9996f, 7.2498f)
                curveTo(17.3092f, 7.2498f, 16.7496f, 6.6902f, 16.7496f, 5.9998f)
                curveTo(16.7496f, 5.7656f, 16.8133f, 5.5485f, 16.9239f, 5.3625f)
                curveTo(17.1815f, 4.9293f, 17.273f, 4.2123f, 16.7622f, 3.7016f)
                lineTo(15.5908f, 2.5301f)
                close()
            }
        }
        .build()
        return _ticketDiagonal!!
    }

private var _ticketDiagonal: ImageVector? = null
