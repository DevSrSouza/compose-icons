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

public val MaterialDesignIcons.CalendarQuestion: ImageVector
    get() {
        if (_calendarQuestion != null) {
            return _calendarQuestion!!
        }
        _calendarQuestion = Builder(name = "CalendarQuestion", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(6.0f)
                moveTo(5.0f, 8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                moveTo(12.19f, 9.0f)
                curveTo(11.32f, 9.0f, 10.62f, 9.2f, 10.08f, 9.59f)
                curveTo(9.56f, 10.0f, 9.3f, 10.57f, 9.31f, 11.36f)
                lineTo(9.32f, 11.39f)
                horizontalLineTo(11.25f)
                curveTo(11.26f, 11.09f, 11.35f, 10.86f, 11.53f, 10.7f)
                curveTo(11.71f, 10.55f, 11.93f, 10.47f, 12.19f, 10.47f)
                curveTo(12.5f, 10.47f, 12.76f, 10.57f, 12.94f, 10.75f)
                curveTo(13.12f, 10.94f, 13.2f, 11.2f, 13.2f, 11.5f)
                curveTo(13.2f, 11.82f, 13.13f, 12.09f, 12.97f, 12.32f)
                curveTo(12.83f, 12.55f, 12.62f, 12.75f, 12.36f, 12.91f)
                curveTo(11.85f, 13.25f, 11.5f, 13.55f, 11.31f, 13.82f)
                curveTo(11.11f, 14.08f, 11.0f, 14.5f, 11.0f, 15.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 14.69f, 13.04f, 14.44f, 13.13f, 14.26f)
                curveTo(13.22f, 14.08f, 13.39f, 13.9f, 13.64f, 13.74f)
                curveTo(14.09f, 13.5f, 14.46f, 13.21f, 14.75f, 12.81f)
                curveTo(15.04f, 12.41f, 15.19f, 12.0f, 15.19f, 11.5f)
                curveTo(15.19f, 10.74f, 14.92f, 10.13f, 14.38f, 9.68f)
                curveTo(13.85f, 9.23f, 13.12f, 9.0f, 12.19f, 9.0f)
                moveTo(11.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _calendarQuestion!!
    }

private var _calendarQuestion: ImageVector? = null
