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

public val RegularGroup.CalendarLtr: ImageVector
    get() {
        if (_calendarLtr != null) {
            return _calendarLtr!!
        }
        _calendarLtr = Builder(name = "CalendarLtr", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(19.5f, 8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 19.5f, 19.5f, 18.7165f, 19.5f, 17.75f)
                verticalLineTo(8.5f)
                close()
                moveTo(7.75f, 14.5f)
                curveTo(8.4404f, 14.5f, 9.0f, 15.0596f, 9.0f, 15.75f)
                curveTo(9.0f, 16.4404f, 8.4404f, 17.0f, 7.75f, 17.0f)
                curveTo(7.0596f, 17.0f, 6.5f, 16.4404f, 6.5f, 15.75f)
                curveTo(6.5f, 15.0596f, 7.0596f, 14.5f, 7.75f, 14.5f)
                close()
                moveTo(12.0f, 14.5f)
                curveTo(12.6904f, 14.5f, 13.25f, 15.0596f, 13.25f, 15.75f)
                curveTo(13.25f, 16.4404f, 12.6904f, 17.0f, 12.0f, 17.0f)
                curveTo(11.3096f, 17.0f, 10.75f, 16.4404f, 10.75f, 15.75f)
                curveTo(10.75f, 15.0596f, 11.3096f, 14.5f, 12.0f, 14.5f)
                close()
                moveTo(7.75f, 10.5f)
                curveTo(8.4404f, 10.5f, 9.0f, 11.0596f, 9.0f, 11.75f)
                curveTo(9.0f, 12.4404f, 8.4404f, 13.0f, 7.75f, 13.0f)
                curveTo(7.0596f, 13.0f, 6.5f, 12.4404f, 6.5f, 11.75f)
                curveTo(6.5f, 11.0596f, 7.0596f, 10.5f, 7.75f, 10.5f)
                close()
                moveTo(12.0f, 10.5f)
                curveTo(12.6904f, 10.5f, 13.25f, 11.0596f, 13.25f, 11.75f)
                curveTo(13.25f, 12.4404f, 12.6904f, 13.0f, 12.0f, 13.0f)
                curveTo(11.3096f, 13.0f, 10.75f, 12.4404f, 10.75f, 11.75f)
                curveTo(10.75f, 11.0596f, 11.3096f, 10.5f, 12.0f, 10.5f)
                close()
                moveTo(16.25f, 10.5f)
                curveTo(16.9404f, 10.5f, 17.5f, 11.0596f, 17.5f, 11.75f)
                curveTo(17.5f, 12.4404f, 16.9404f, 13.0f, 16.25f, 13.0f)
                curveTo(15.5596f, 13.0f, 15.0f, 12.4404f, 15.0f, 11.75f)
                curveTo(15.0f, 11.0596f, 15.5596f, 10.5f, 16.25f, 10.5f)
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
        return _calendarLtr!!
    }

private var _calendarLtr: ImageVector? = null
