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

public val RegularGroup.CalendarCancel: ImageVector
    get() {
        if (_calendarCancel != null) {
            return _calendarCancel!!
        }
        _calendarCancel = Builder(name = "CalendarCancel", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(15.0238f, 15.0241f)
                curveTo(14.8285f, 15.2194f, 14.8285f, 15.536f, 15.0238f, 15.7312f)
                lineTo(16.793f, 17.501f)
                lineTo(15.0264f, 19.2675f)
                curveTo(14.8311f, 19.4628f, 14.8311f, 19.7793f, 15.0264f, 19.9746f)
                curveTo(15.2217f, 20.1699f, 15.5382f, 20.1699f, 15.7335f, 19.9746f)
                lineTo(17.5f, 18.208f)
                lineTo(19.2694f, 19.9768f)
                curveTo(19.4647f, 20.1721f, 19.7812f, 20.1721f, 19.9765f, 19.9768f)
                curveTo(20.1718f, 19.7816f, 20.1718f, 19.465f, 19.9765f, 19.2697f)
                lineTo(18.208f, 17.501f)
                lineTo(19.9793f, 15.7313f)
                curveTo(20.1745f, 15.536f, 20.1745f, 15.2194f, 19.9793f, 15.0242f)
                curveTo(19.784f, 14.8289f, 19.4674f, 14.8289f, 19.2722f, 15.0242f)
                lineTo(17.501f, 16.794f)
                lineTo(15.7309f, 15.0241f)
                curveTo(15.5356f, 14.8289f, 15.2191f, 14.8289f, 15.0238f, 15.0241f)
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
        return _calendarCancel!!
    }

private var _calendarCancel: ImageVector? = null
