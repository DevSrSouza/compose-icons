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

public val MaterialDesignIcons.CalendarFilterOutline: ImageVector
    get() {
        if (_calendarFilterOutline != null) {
            return _calendarFilterOutline!!
        }
        _calendarFilterOutline = Builder(name = "CalendarFilterOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.75f)
                curveTo(4.31f, 3.07f, 3.9f, 3.27f, 3.58f, 3.58f)
                curveTo(3.27f, 3.9f, 3.07f, 4.31f, 3.0f, 4.75f)
                verticalLineTo(19.25f)
                curveTo(3.07f, 19.69f, 3.27f, 20.1f, 3.58f, 20.42f)
                curveTo(3.9f, 20.73f, 4.31f, 20.93f, 4.75f, 21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.11f, 3.0f, 19.0f, 3.0f)
                moveTo(19.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                moveTo(17.0f, 21.0f)
                lineTo(18.8f, 22.77f)
                curveTo(19.3f, 23.27f, 20.0f, 22.87f, 20.0f, 22.28f)
                verticalLineTo(18.0f)
                lineTo(22.8f, 14.6f)
                curveTo(23.3f, 13.9f, 22.8f, 13.0f, 22.0f, 13.0f)
                horizontalLineTo(15.0f)
                curveTo(14.2f, 13.0f, 13.7f, 14.0f, 14.2f, 14.6f)
                lineTo(17.0f, 18.0f)
                verticalLineTo(21.0f)
            }
        }
        .build()
        return _calendarFilterOutline!!
    }

private var _calendarFilterOutline: ImageVector? = null
