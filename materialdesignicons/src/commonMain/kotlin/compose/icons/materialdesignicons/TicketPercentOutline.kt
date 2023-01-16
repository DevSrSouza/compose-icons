package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.TicketPercentOutline: ImageVector
    get() {
        if (_ticketPercentOutline != null) {
            return _ticketPercentOutline!!
        }
        _ticketPercentOutline = Builder(name = "TicketPercentOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8f, 8.0f)
                lineTo(16.0f, 9.2f)
                lineTo(9.2f, 16.0f)
                lineTo(8.0f, 14.8f)
                lineTo(14.8f, 8.0f)
                moveTo(4.0f, 4.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 4.0f, 22.0f, 4.89f, 22.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(20.9f, 10.0f, 20.0f, 10.9f, 20.0f, 12.0f)
                curveTo(20.0f, 13.11f, 20.9f, 14.0f, 22.0f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 19.11f, 21.11f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(14.0f)
                curveTo(3.11f, 14.0f, 4.0f, 13.11f, 4.0f, 12.0f)
                curveTo(4.0f, 10.9f, 3.11f, 10.0f, 2.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.9f, 4.0f, 4.0f, 4.0f)
                moveTo(4.0f, 6.0f)
                verticalLineTo(8.54f)
                curveTo(5.24f, 9.26f, 6.0f, 10.57f, 6.0f, 12.0f)
                curveTo(6.0f, 13.43f, 5.24f, 14.75f, 4.0f, 15.46f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.46f)
                curveTo(18.76f, 14.75f, 18.0f, 13.43f, 18.0f, 12.0f)
                curveTo(18.0f, 10.57f, 18.76f, 9.26f, 20.0f, 8.54f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                moveTo(9.5f, 8.0f)
                curveTo(10.33f, 8.0f, 11.0f, 8.67f, 11.0f, 9.5f)
                curveTo(11.0f, 10.33f, 10.33f, 11.0f, 9.5f, 11.0f)
                curveTo(8.67f, 11.0f, 8.0f, 10.33f, 8.0f, 9.5f)
                curveTo(8.0f, 8.67f, 8.67f, 8.0f, 9.5f, 8.0f)
                moveTo(14.5f, 13.0f)
                curveTo(15.33f, 13.0f, 16.0f, 13.67f, 16.0f, 14.5f)
                curveTo(16.0f, 15.33f, 15.33f, 16.0f, 14.5f, 16.0f)
                curveTo(13.67f, 16.0f, 13.0f, 15.33f, 13.0f, 14.5f)
                curveTo(13.0f, 13.67f, 13.67f, 13.0f, 14.5f, 13.0f)
                close()
            }
        }
        .build()
        return _ticketPercentOutline!!
    }

private var _ticketPercentOutline: ImageVector? = null
