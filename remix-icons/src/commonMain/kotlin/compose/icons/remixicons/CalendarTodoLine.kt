package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.CalendarTodoLine: ImageVector
    get() {
        if (_calendarTodoLine != null) {
            return _calendarTodoLine!!
        }
        _calendarTodoLine = Builder(name = "CalendarTodoLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(7.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 7.0f)
                lineTo(7.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 5.0f)
                close()
                moveTo(20.0f, 11.0f)
                lineTo(4.0f, 11.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(6.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 14.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _calendarTodoLine!!
    }

private var _calendarTodoLine: ImageVector? = null