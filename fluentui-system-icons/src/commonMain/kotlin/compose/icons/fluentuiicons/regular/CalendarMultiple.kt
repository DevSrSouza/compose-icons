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

public val RegularGroup.CalendarMultiple: ImageVector
    get() {
        if (_calendarMultiple != null) {
            return _calendarMultiple!!
        }
        _calendarMultiple = Builder(name = "CalendarMultiple", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9935f, 5.0068f)
                lineTo(19.9983f, 5.1284f)
                lineTo(20.0f, 5.25f)
                verticalLineTo(16.35f)
                curveTo(20.0f, 18.3658f, 18.3658f, 20.0f, 16.35f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(5.1684f, 20.0f, 5.0874f, 19.9977f, 5.007f, 19.9932f)
                curveTo(5.5828f, 20.8988f, 6.5962f, 21.5f, 7.75f, 21.5f)
                horizontalLineTo(16.35f)
                curveTo(19.1943f, 21.5f, 21.5f, 19.1943f, 21.5f, 16.35f)
                verticalLineTo(7.75f)
                curveTo(21.5f, 6.5966f, 20.8992f, 5.5836f, 19.9935f, 5.0068f)
                close()
                moveTo(5.25f, 2.0f)
                curveTo(3.4551f, 2.0f, 2.0f, 3.4551f, 2.0f, 5.25f)
                verticalLineTo(15.75f)
                curveTo(2.0f, 17.5449f, 3.4551f, 19.0f, 5.25f, 19.0f)
                horizontalLineTo(15.75f)
                curveTo(17.5449f, 19.0f, 19.0f, 17.5449f, 19.0f, 15.75f)
                verticalLineTo(5.25f)
                curveTo(19.0f, 3.4551f, 17.5449f, 2.0f, 15.75f, 2.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(3.5f, 7.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(15.75f)
                curveTo(17.5f, 16.7165f, 16.7165f, 17.5f, 15.75f, 17.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 17.5f, 3.5f, 16.7165f, 3.5f, 15.75f)
                verticalLineTo(7.5f)
                close()
                moveTo(5.25f, 3.5f)
                horizontalLineTo(15.75f)
                curveTo(16.7165f, 3.5f, 17.5f, 4.2835f, 17.5f, 5.25f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(5.25f)
                curveTo(3.5f, 4.2835f, 4.2835f, 3.5f, 5.25f, 3.5f)
                close()
            }
        }
        .build()
        return _calendarMultiple!!
    }

private var _calendarMultiple: ImageVector? = null
