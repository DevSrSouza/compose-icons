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

public val FilledGroup.CalendarMonth: ImageVector
    get() {
        if (_calendarMonth != null) {
            return _calendarMonth!!
        }
        _calendarMonth = Builder(name = "CalendarMonth", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(7.75f, 13.5f)
                curveTo(7.0596f, 13.5f, 6.5f, 14.0596f, 6.5f, 14.75f)
                curveTo(6.5f, 15.4404f, 7.0596f, 16.0f, 7.75f, 16.0f)
                curveTo(8.4404f, 16.0f, 9.0f, 15.4404f, 9.0f, 14.75f)
                curveTo(9.0f, 14.0596f, 8.4404f, 13.5f, 7.75f, 13.5f)
                close()
                moveTo(12.0f, 13.5f)
                curveTo(11.3096f, 13.5f, 10.75f, 14.0596f, 10.75f, 14.75f)
                curveTo(10.75f, 15.4404f, 11.3096f, 16.0f, 12.0f, 16.0f)
                curveTo(12.6904f, 16.0f, 13.25f, 15.4404f, 13.25f, 14.75f)
                curveTo(13.25f, 14.0596f, 12.6904f, 13.5f, 12.0f, 13.5f)
                close()
                moveTo(7.75f, 8.5f)
                curveTo(7.0596f, 8.5f, 6.5f, 9.0596f, 6.5f, 9.75f)
                curveTo(6.5f, 10.4404f, 7.0596f, 11.0f, 7.75f, 11.0f)
                curveTo(8.4404f, 11.0f, 9.0f, 10.4404f, 9.0f, 9.75f)
                curveTo(9.0f, 9.0596f, 8.4404f, 8.5f, 7.75f, 8.5f)
                close()
                moveTo(12.0f, 8.5f)
                curveTo(11.3096f, 8.5f, 10.75f, 9.0596f, 10.75f, 9.75f)
                curveTo(10.75f, 10.4404f, 11.3096f, 11.0f, 12.0f, 11.0f)
                curveTo(12.6904f, 11.0f, 13.25f, 10.4404f, 13.25f, 9.75f)
                curveTo(13.25f, 9.0596f, 12.6904f, 8.5f, 12.0f, 8.5f)
                close()
                moveTo(16.25f, 8.5f)
                curveTo(15.5596f, 8.5f, 15.0f, 9.0596f, 15.0f, 9.75f)
                curveTo(15.0f, 10.4404f, 15.5596f, 11.0f, 16.25f, 11.0f)
                curveTo(16.9404f, 11.0f, 17.5f, 10.4404f, 17.5f, 9.75f)
                curveTo(17.5f, 9.0596f, 16.9404f, 8.5f, 16.25f, 8.5f)
                close()
            }
        }
        .build()
        return _calendarMonth!!
    }

private var _calendarMonth: ImageVector? = null
