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

public val MaterialDesignIcons.CalendarStarFourPoints: ImageVector
    get() {
        if (_calendarStarFourPoints != null) {
            return _calendarStarFourPoints!!
        }
        _calendarStarFourPoints = Builder(name = "CalendarStarFourPoints", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.74f, 12.25f)
                lineTo(12.0f, 9.5f)
                lineTo(13.25f, 12.25f)
                lineTo(16.0f, 13.5f)
                lineTo(13.25f, 14.76f)
                lineTo(12.0f, 17.5f)
                lineTo(10.74f, 14.76f)
                lineTo(8.0f, 13.5f)
                lineTo(10.74f, 12.25f)
                moveTo(16.0f, 3.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                curveTo(19.53f, 3.0f, 20.04f, 3.21f, 20.41f, 3.59f)
                curveTo(20.79f, 3.96f, 21.0f, 4.47f, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 19.53f, 20.79f, 20.04f, 20.41f, 20.41f)
                curveTo(20.04f, 20.79f, 19.53f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.47f, 21.0f, 3.96f, 20.79f, 3.59f, 20.41f)
                curveTo(3.21f, 20.04f, 3.0f, 19.53f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.47f, 3.21f, 3.96f, 3.59f, 3.59f)
                curveTo(3.96f, 3.21f, 4.47f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                moveTo(5.0f, 8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _calendarStarFourPoints!!
    }

private var _calendarStarFourPoints: ImageVector? = null
