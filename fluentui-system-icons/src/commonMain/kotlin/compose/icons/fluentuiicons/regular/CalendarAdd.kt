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

public val RegularGroup.CalendarAdd: ImageVector
    get() {
        if (_calendarAdd != null) {
            return _calendarAdd!!
        }
        _calendarAdd = Builder(name = "CalendarAdd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                lineTo(21.0012f, 12.0226f)
                curveTo(20.5378f, 11.7258f, 20.0342f, 11.4861f, 19.5004f, 11.3136f)
                lineTo(19.5f, 8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                lineTo(11.3136f, 19.5004f)
                curveTo(11.4861f, 20.0342f, 11.7258f, 20.5378f, 12.0226f, 21.0012f)
                lineTo(6.25f, 21.0f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(17.5f, 14.0f)
                lineTo(17.4101f, 14.0081f)
                curveTo(17.206f, 14.0451f, 17.0451f, 14.206f, 17.0081f, 14.4101f)
                lineTo(17.0f, 14.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.5f)
                lineTo(14.4101f, 17.0081f)
                curveTo(14.206f, 17.0451f, 14.0451f, 17.206f, 14.0081f, 17.4101f)
                lineTo(14.0f, 17.5f)
                lineTo(14.0081f, 17.5899f)
                curveTo(14.0451f, 17.794f, 14.206f, 17.9549f, 14.4101f, 17.9919f)
                lineTo(14.5f, 18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.5f)
                lineTo(17.0081f, 20.5899f)
                curveTo(17.0451f, 20.794f, 17.206f, 20.9549f, 17.4101f, 20.9919f)
                lineTo(17.5f, 21.0f)
                lineTo(17.5899f, 20.9919f)
                curveTo(17.794f, 20.9549f, 17.9549f, 20.794f, 17.9919f, 20.5899f)
                lineTo(18.0f, 20.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.5f)
                lineTo(20.5899f, 17.9919f)
                curveTo(20.794f, 17.9549f, 20.9549f, 17.794f, 20.9919f, 17.5899f)
                lineTo(21.0f, 17.5f)
                lineTo(20.9919f, 17.4101f)
                curveTo(20.9549f, 17.206f, 20.794f, 17.0451f, 20.5899f, 17.0081f)
                lineTo(20.5f, 17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.5f)
                lineTo(17.9919f, 14.4101f)
                curveTo(17.9549f, 14.206f, 17.794f, 14.0451f, 17.5899f, 14.0081f)
                lineTo(17.5f, 14.0f)
                close()
                moveTo(17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                close()
            }
        }
        .build()
        return _calendarAdd!!
    }

private var _calendarAdd: ImageVector? = null
