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

public val MaterialDesignIcons.TicketPercent: ImageVector
    get() {
        if (_ticketPercent != null) {
            return _ticketPercent!!
        }
        _ticketPercent = Builder(name = "TicketPercent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
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
                curveTo(20.0f, 10.89f, 20.9f, 10.0f, 22.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                moveTo(15.5f, 7.0f)
                lineTo(17.0f, 8.5f)
                lineTo(8.5f, 17.0f)
                lineTo(7.0f, 15.5f)
                lineTo(15.5f, 7.0f)
                moveTo(8.81f, 7.04f)
                curveTo(9.79f, 7.04f, 10.58f, 7.83f, 10.58f, 8.81f)
                arcTo(1.77f, 1.77f, 0.0f, false, true, 8.81f, 10.58f)
                curveTo(7.83f, 10.58f, 7.04f, 9.79f, 7.04f, 8.81f)
                arcTo(1.77f, 1.77f, 0.0f, false, true, 8.81f, 7.04f)
                moveTo(15.19f, 13.42f)
                curveTo(16.17f, 13.42f, 16.96f, 14.21f, 16.96f, 15.19f)
                arcTo(1.77f, 1.77f, 0.0f, false, true, 15.19f, 16.96f)
                curveTo(14.21f, 16.96f, 13.42f, 16.17f, 13.42f, 15.19f)
                arcTo(1.77f, 1.77f, 0.0f, false, true, 15.19f, 13.42f)
                close()
            }
        }
        .build()
        return _ticketPercent!!
    }

private var _ticketPercent: ImageVector? = null
