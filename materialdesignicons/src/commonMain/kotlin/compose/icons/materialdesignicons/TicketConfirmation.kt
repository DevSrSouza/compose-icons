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

public val MaterialDesignIcons.TicketConfirmation: ImageVector
    get() {
        if (_ticketConfirmation != null) {
            return _ticketConfirmation!!
        }
        _ticketConfirmation = Builder(name = "TicketConfirmation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 8.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.5f)
                moveTo(13.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                moveTo(13.0f, 17.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.5f)
                moveTo(22.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(3.11f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 14.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 10.0f)
                close()
            }
        }
        .build()
        return _ticketConfirmation!!
    }

private var _ticketConfirmation: ImageVector? = null
