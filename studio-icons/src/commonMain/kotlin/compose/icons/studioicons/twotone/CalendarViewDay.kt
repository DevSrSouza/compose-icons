package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.CalendarViewDay: ImageVector
    get() {
        if (_calendarViewDay != null) {
            return _calendarViewDay!!
        }
        _calendarViewDay = Builder(name = "CalendarViewDay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 19.0f)
                close()
                moveTo(19.0f, 12.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(14.0f)
                moveToRelative(2.0f, -2.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(3.0f, 6.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _calendarViewDay!!
    }

private var _calendarViewDay: ImageVector? = null
