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

public val MaterialDesignIcons.TicketAccount: ImageVector
    get() {
        if (_ticketAccount != null) {
            return _ticketAccount!!
        }
        _ticketAccount = Builder(name = "TicketAccount", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 14.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 20.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 18.0f)
                verticalLineTo(14.0f)
                curveTo(3.11f, 14.0f, 4.0f, 13.1f, 4.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.9f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 6.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 12.0f)
                moveTo(16.5f, 16.25f)
                curveTo(16.5f, 14.75f, 13.5f, 14.0f, 12.0f, 14.0f)
                curveTo(10.5f, 14.0f, 7.5f, 14.75f, 7.5f, 16.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                moveTo(12.0f, 12.25f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 14.25f, 10.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 12.0f, 7.75f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 9.75f, 10.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 12.0f, 12.25f)
                close()
            }
        }
        .build()
        return _ticketAccount!!
    }

private var _ticketAccount: ImageVector? = null
