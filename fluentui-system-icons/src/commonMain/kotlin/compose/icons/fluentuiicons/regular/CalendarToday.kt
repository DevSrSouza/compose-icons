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

public val RegularGroup.CalendarToday: ImageVector
    get() {
        if (_calendarToday != null) {
            return _calendarToday!!
        }
        _calendarToday = Builder(name = "CalendarToday", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(10.25f)
                curveTo(10.25f, 21.0f, 10.25f, 20.5184f, 10.25f, 20.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 19.5f, 4.5f, 18.7165f, 4.5f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.7165f, 18.7165f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(13.75f)
                verticalLineTo(20.25f)
                curveTo(13.75f, 20.5184f, 13.75f, 21.0f, 13.75f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                close()
                moveTo(13.25f, 11.75f)
                curveTo(13.25f, 12.4404f, 12.6904f, 13.0f, 12.0f, 13.0f)
                curveTo(11.3096f, 13.0f, 10.75f, 12.4404f, 10.75f, 11.75f)
                curveTo(10.75f, 11.0596f, 11.3096f, 10.5f, 12.0f, 10.5f)
                curveTo(12.6904f, 10.5f, 13.25f, 11.0596f, 13.25f, 11.75f)
                close()
                moveTo(13.7517f, 18.3106f)
                curveTo(14.0613f, 18.5857f, 14.5353f, 18.5579f, 14.8105f, 18.2483f)
                curveTo(15.0857f, 17.9387f, 15.0578f, 17.4646f, 14.7482f, 17.1894f)
                lineTo(12.4982f, 15.1894f)
                curveTo(12.2141f, 14.9369f, 11.7858f, 14.9369f, 11.5017f, 15.1894f)
                lineTo(9.2517f, 17.1894f)
                curveTo(8.9421f, 17.4646f, 8.9142f, 17.9387f, 9.1894f, 18.2483f)
                curveTo(9.4646f, 18.5579f, 9.9386f, 18.5857f, 10.2482f, 18.3106f)
                lineTo(11.25f, 17.4201f)
                verticalLineTo(21.25f)
                curveTo(11.25f, 21.6642f, 11.5857f, 22.0f, 12.0f, 22.0f)
                curveTo(12.4142f, 22.0f, 12.75f, 21.6642f, 12.75f, 21.25f)
                verticalLineTo(17.4201f)
                lineTo(13.7517f, 18.3106f)
                close()
            }
        }
        .build()
        return _calendarToday!!
    }

private var _calendarToday: ImageVector? = null
