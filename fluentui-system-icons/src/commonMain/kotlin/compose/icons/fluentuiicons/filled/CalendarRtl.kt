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

public val FilledGroup.CalendarRtl: ImageVector
    get() {
        if (_calendarRtl != null) {
            return _calendarRtl!!
        }
        _calendarRtl = Builder(name = "CalendarRtl", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 8.5f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(3.0f)
                close()
                moveTo(16.75f, 15.0f)
                curveTo(17.4404f, 15.0f, 18.0f, 15.5596f, 18.0f, 16.25f)
                curveTo(18.0f, 16.9404f, 17.4404f, 17.5f, 16.75f, 17.5f)
                curveTo(16.0596f, 17.5f, 15.5f, 16.9404f, 15.5f, 16.25f)
                curveTo(15.5f, 15.5596f, 16.0596f, 15.0f, 16.75f, 15.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(12.6904f, 15.0f, 13.25f, 15.5596f, 13.25f, 16.25f)
                curveTo(13.25f, 16.9404f, 12.6904f, 17.5f, 12.0f, 17.5f)
                curveTo(11.3096f, 17.5f, 10.75f, 16.9404f, 10.75f, 16.25f)
                curveTo(10.75f, 15.5596f, 11.3096f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(16.75f, 10.5f)
                curveTo(17.4404f, 10.5f, 18.0f, 11.0596f, 18.0f, 11.75f)
                curveTo(18.0f, 12.4404f, 17.4404f, 13.0f, 16.75f, 13.0f)
                curveTo(16.0596f, 13.0f, 15.5f, 12.4404f, 15.5f, 11.75f)
                curveTo(15.5f, 11.0596f, 16.0596f, 10.5f, 16.75f, 10.5f)
                close()
                moveTo(12.0f, 10.5f)
                curveTo(12.6904f, 10.5f, 13.25f, 11.0596f, 13.25f, 11.75f)
                curveTo(13.25f, 12.4404f, 12.6904f, 13.0f, 12.0f, 13.0f)
                curveTo(11.3096f, 13.0f, 10.75f, 12.4404f, 10.75f, 11.75f)
                curveTo(10.75f, 11.0596f, 11.3096f, 10.5f, 12.0f, 10.5f)
                close()
                moveTo(7.25f, 10.5f)
                curveTo(7.9404f, 10.5f, 8.5f, 11.0596f, 8.5f, 11.75f)
                curveTo(8.5f, 12.4404f, 7.9404f, 13.0f, 7.25f, 13.0f)
                curveTo(6.5596f, 13.0f, 6.0f, 12.4404f, 6.0f, 11.75f)
                curveTo(6.0f, 11.0596f, 6.5596f, 10.5f, 7.25f, 10.5f)
                close()
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _calendarRtl!!
    }

private var _calendarRtl: ImageVector? = null
