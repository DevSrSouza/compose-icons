package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.CalendarHeart: ImageVector
    get() {
        if (_calendarHeart != null) {
            return _calendarHeart!!
        }
        _calendarHeart = Builder(name = "CalendarHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                moveTo(16.0f, 1.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.11f, 20.11f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(1.0f)
                moveTo(12.0f, 17.17f)
                lineTo(11.42f, 16.64f)
                curveTo(9.36f, 14.77f, 8.0f, 13.54f, 8.0f, 12.03f)
                curveTo(8.0f, 10.8f, 8.97f, 9.83f, 10.2f, 9.83f)
                curveTo(10.9f, 9.83f, 11.56f, 10.15f, 12.0f, 10.66f)
                curveTo(12.44f, 10.15f, 13.1f, 9.83f, 13.8f, 9.83f)
                curveTo(15.03f, 9.83f, 16.0f, 10.8f, 16.0f, 12.03f)
                curveTo(16.0f, 13.54f, 14.64f, 14.77f, 12.58f, 16.64f)
                lineTo(12.0f, 17.17f)
                close()
            }
        }
        .build()
        return _calendarHeart!!
    }

private var _calendarHeart: ImageVector? = null
