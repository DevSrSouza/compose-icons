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

public val RegularGroup.TicketHorizontal: ImageVector
    get() {
        if (_ticketHorizontal != null) {
            return _ticketHorizontal!!
        }
        _ticketHorizontal = Builder(name = "TicketHorizontal", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 5.0f)
                curveTo(21.2165f, 5.0f, 22.0001f, 5.7835f, 22.0001f, 6.75f)
                verticalLineTo(9.0102f)
                curveTo(22.0001f, 9.4005f, 21.7008f, 9.7256f, 21.3118f, 9.7577f)
                curveTo(20.1512f, 9.8534f, 19.25f, 10.8273f, 19.25f, 12.0f)
                curveTo(19.25f, 13.1727f, 20.1512f, 14.1466f, 21.3118f, 14.2423f)
                curveTo(21.7008f, 14.2744f, 22.0001f, 14.5995f, 22.0001f, 14.9898f)
                verticalLineTo(17.25f)
                curveTo(22.0001f, 18.2165f, 21.2165f, 19.0f, 20.25f, 19.0f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 19.0f, 2.0f, 18.2165f, 2.0f, 17.2499f)
                lineTo(2.0003f, 14.9896f)
                curveTo(2.0003f, 14.5994f, 2.2996f, 14.2744f, 2.6886f, 14.2423f)
                curveTo(3.849f, 14.1464f, 4.75f, 13.1726f, 4.75f, 12.0f)
                curveTo(4.75f, 10.8274f, 3.849f, 9.8536f, 2.6886f, 9.7577f)
                curveTo(2.2996f, 9.7256f, 2.0003f, 9.4006f, 2.0003f, 9.0104f)
                lineTo(2.0f, 6.75f)
                curveTo(2.0f, 5.7835f, 2.7835f, 5.0f, 3.75f, 5.0f)
                horizontalLineTo(20.25f)
                close()
                moveTo(20.5001f, 8.3847f)
                verticalLineTo(6.75f)
                curveTo(20.5001f, 6.6119f, 20.3881f, 6.5f, 20.25f, 6.5f)
                horizontalLineTo(3.75f)
                curveTo(3.6119f, 6.5f, 3.5f, 6.6119f, 3.5f, 6.7499f)
                lineTo(3.5002f, 8.3848f)
                curveTo(5.0931f, 8.8241f, 6.25f, 10.284f, 6.25f, 12.0f)
                curveTo(6.25f, 13.716f, 5.0931f, 15.1759f, 3.5002f, 15.6152f)
                lineTo(3.5f, 17.25f)
                curveTo(3.5f, 17.3881f, 3.6119f, 17.5f, 3.75f, 17.5f)
                horizontalLineTo(20.25f)
                curveTo(20.3881f, 17.5f, 20.5001f, 17.3881f, 20.5001f, 17.25f)
                verticalLineTo(15.6153f)
                curveTo(18.907f, 15.1761f, 17.75f, 13.7161f, 17.75f, 12.0f)
                curveTo(17.75f, 10.3525f, 18.8163f, 8.9411f, 20.3111f, 8.4423f)
                lineTo(20.5001f, 8.3847f)
                close()
            }
        }
        .build()
        return _ticketHorizontal!!
    }

private var _ticketHorizontal: ImageVector? = null
