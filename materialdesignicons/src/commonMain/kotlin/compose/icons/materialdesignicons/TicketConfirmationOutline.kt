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

public val MaterialDesignIcons.TicketConfirmationOutline: ImageVector
    get() {
        if (_ticketConfirmationOutline != null) {
            return _ticketConfirmationOutline!!
        }
        _ticketConfirmationOutline = Builder(name = "TicketConfirmationOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(3.11f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f)
                reflectiveCurveTo(3.11f, 14.0f, 2.0f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 20.0f, 22.0f, 19.1f, 22.0f, 18.0f)
                verticalLineTo(14.0f)
                curveTo(20.9f, 14.0f, 20.0f, 13.1f, 20.0f, 12.0f)
                reflectiveCurveTo(20.9f, 10.0f, 22.0f, 10.0f)
                moveTo(20.0f, 8.54f)
                curveTo(18.81f, 9.23f, 18.0f, 10.53f, 18.0f, 12.0f)
                reflectiveCurveTo(18.81f, 14.77f, 20.0f, 15.46f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.46f)
                curveTo(5.19f, 14.77f, 6.0f, 13.47f, 6.0f, 12.0f)
                curveTo(6.0f, 10.5f, 5.2f, 9.23f, 4.0f, 8.54f)
                lineTo(4.0f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.54f)
                moveTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _ticketConfirmationOutline!!
    }

private var _ticketConfirmationOutline: ImageVector? = null
