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

public val RegularGroup.CalendarEdit: ImageVector
    get() {
        if (_calendarEdit != null) {
            return _calendarEdit!!
        }
        _calendarEdit = Builder(name = "CalendarEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9984f, 6.2497f)
                curveTo(20.9984f, 4.4549f, 19.5435f, 3.0f, 17.7487f, 3.0f)
                horizontalLineTo(6.2497f)
                curveTo(4.4549f, 3.0f, 3.0f, 4.4549f, 3.0f, 6.2497f)
                verticalLineTo(17.7487f)
                curveTo(3.0f, 19.5435f, 4.4549f, 20.9984f, 6.2497f, 20.9984f)
                horizontalLineTo(11.1644f)
                lineTo(11.5202f, 19.5754f)
                curveTo(11.5266f, 19.5497f, 11.5333f, 19.5241f, 11.5402f, 19.4985f)
                horizontalLineTo(6.2497f)
                curveTo(5.2833f, 19.4985f, 4.4999f, 18.7151f, 4.4999f, 17.7487f)
                verticalLineTo(8.4995f)
                horizontalLineTo(19.4985f)
                verticalLineTo(11.2317f)
                curveTo(19.9774f, 11.0412f, 20.492f, 10.9678f, 20.9984f, 11.0115f)
                verticalLineTo(6.2497f)
                close()
                moveTo(6.2497f, 4.4999f)
                horizontalLineTo(17.7487f)
                curveTo(18.7151f, 4.4999f, 19.4985f, 5.2833f, 19.4985f, 6.2497f)
                verticalLineTo(6.9997f)
                horizontalLineTo(4.4999f)
                verticalLineTo(6.2497f)
                curveTo(4.4999f, 5.2833f, 5.2833f, 4.4999f, 6.2497f, 4.4999f)
                close()
                moveTo(19.0984f, 12.6686f)
                lineTo(13.1965f, 18.5705f)
                curveTo(12.8524f, 18.9146f, 12.6083f, 19.3458f, 12.4903f, 19.8179f)
                lineTo(12.0327f, 21.6484f)
                curveTo(11.8336f, 22.4445f, 12.5547f, 23.1656f, 13.3508f, 22.9666f)
                lineTo(15.1813f, 22.5089f)
                curveTo(15.6534f, 22.3909f, 16.0846f, 22.1468f, 16.4287f, 21.8027f)
                lineTo(22.3306f, 15.9008f)
                curveTo(23.2231f, 15.0082f, 23.2231f, 13.5611f, 22.3306f, 12.6686f)
                curveTo(21.4381f, 11.7761f, 19.991f, 11.7761f, 19.0984f, 12.6686f)
                close()
            }
        }
        .build()
        return _calendarEdit!!
    }

private var _calendarEdit: ImageVector? = null
