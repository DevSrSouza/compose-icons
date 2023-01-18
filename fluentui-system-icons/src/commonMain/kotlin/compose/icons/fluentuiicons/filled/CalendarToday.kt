package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.CalendarToday: ImageVector
    get() {
        if (_calendarToday != null) {
            return _calendarToday!!
        }
        _calendarToday = Builder(name = "CalendarToday", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 11.75f)
                curveTo(13.25f, 12.4404f, 12.6904f, 13.0f, 12.0f, 13.0f)
                curveTo(11.3096f, 13.0f, 10.75f, 12.4404f, 10.75f, 11.75f)
                curveTo(10.75f, 11.0596f, 11.3096f, 10.5f, 12.0f, 10.5f)
                curveTo(12.6904f, 10.5f, 13.25f, 11.0596f, 13.25f, 11.75f)
                close()
                moveTo(21.0f, 8.5f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(13.75f)
                curveTo(13.75f, 21.0f, 13.75f, 20.5184f, 13.75f, 20.25f)
                verticalLineTo(19.4275f)
                curveTo(14.3809f, 19.6151f, 15.0918f, 19.4371f, 15.558f, 18.9126f)
                curveTo(16.2001f, 18.1903f, 16.135f, 17.0841f, 15.4127f, 16.442f)
                lineTo(13.1627f, 14.442f)
                curveTo(12.4996f, 13.8527f, 11.5004f, 13.8527f, 10.8374f, 14.442f)
                lineTo(8.5874f, 16.442f)
                curveTo(7.865f, 17.0841f, 7.8f, 18.1903f, 8.442f, 18.9126f)
                curveTo(8.9082f, 19.4371f, 9.619f, 19.6151f, 10.25f, 19.4275f)
                verticalLineTo(20.25f)
                curveTo(10.25f, 20.5184f, 10.25f, 21.0f, 10.25f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(21.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(13.2426f, 14.0f, 14.25f, 12.9926f, 14.25f, 11.75f)
                curveTo(14.25f, 10.5074f, 13.2426f, 9.5f, 12.0f, 9.5f)
                curveTo(10.7574f, 9.5f, 9.75f, 10.5074f, 9.75f, 11.75f)
                curveTo(9.75f, 12.9926f, 10.7574f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(14.8105f, 18.2483f)
                curveTo(14.5353f, 18.5579f, 14.0613f, 18.5857f, 13.7517f, 18.3106f)
                lineTo(12.75f, 17.4201f)
                verticalLineTo(21.25f)
                curveTo(12.75f, 21.6642f, 12.4142f, 22.0f, 12.0f, 22.0f)
                curveTo(11.5857f, 22.0f, 11.25f, 21.6642f, 11.25f, 21.25f)
                verticalLineTo(17.4201f)
                lineTo(10.2482f, 18.3106f)
                curveTo(9.9386f, 18.5857f, 9.4646f, 18.5579f, 9.1894f, 18.2483f)
                curveTo(8.9142f, 17.9387f, 8.9421f, 17.4646f, 9.2517f, 17.1894f)
                lineTo(11.5017f, 15.1894f)
                curveTo(11.7858f, 14.9369f, 12.2141f, 14.9369f, 12.4982f, 15.1894f)
                lineTo(14.7482f, 17.1894f)
                curveTo(15.0578f, 17.4646f, 15.0857f, 17.9387f, 14.8105f, 18.2483f)
                close()
            }
        }
        .build()
        return _calendarToday!!
    }

private var _calendarToday: ImageVector? = null
