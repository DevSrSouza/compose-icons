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

public val MaterialDesignIcons.TicketOutline: ImageVector
    get() {
        if (_ticketOutline != null) {
            return _ticketOutline!!
        }
        _ticketOutline = Builder(name = "TicketOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 14.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 10.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.54f)
                curveTo(18.76f, 9.25f, 18.0f, 10.57f, 18.0f, 12.0f)
                curveTo(18.0f, 13.43f, 18.76f, 14.75f, 20.0f, 15.46f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.46f)
                curveTo(5.24f, 14.75f, 6.0f, 13.43f, 6.0f, 12.0f)
                curveTo(6.0f, 10.57f, 5.24f, 9.25f, 4.0f, 8.54f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _ticketOutline!!
    }

private var _ticketOutline: ImageVector? = null
