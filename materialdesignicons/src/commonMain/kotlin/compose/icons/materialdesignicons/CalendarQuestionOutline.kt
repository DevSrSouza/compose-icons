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

public val MaterialDesignIcons.CalendarQuestionOutline: ImageVector
    get() {
        if (_calendarQuestionOutline != null) {
            return _calendarQuestionOutline!!
        }
        _calendarQuestionOutline = Builder(name = "CalendarQuestionOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.95f, 10.0f)
                curveTo(11.21f, 10.0f, 10.61f, 10.18f, 10.15f, 10.5f)
                curveTo(9.71f, 10.89f, 9.5f, 11.4f, 9.5f, 12.1f)
                lineTo(9.5f, 12.12f)
                horizontalLineTo(11.15f)
                curveTo(11.16f, 11.86f, 11.24f, 11.65f, 11.39f, 11.5f)
                curveTo(11.54f, 11.38f, 11.73f, 11.31f, 11.95f, 11.31f)
                curveTo(12.21f, 11.31f, 12.43f, 11.4f, 12.59f, 11.56f)
                curveTo(12.74f, 11.73f, 12.81f, 11.96f, 12.81f, 12.22f)
                curveTo(12.81f, 12.5f, 12.75f, 12.75f, 12.61f, 12.95f)
                curveTo(12.5f, 13.16f, 12.31f, 13.33f, 12.09f, 13.5f)
                curveTo(11.66f, 13.78f, 11.36f, 14.05f, 11.2f, 14.29f)
                curveTo(11.03f, 14.5f, 10.94f, 14.89f, 10.94f, 15.33f)
                horizontalLineTo(12.64f)
                curveTo(12.64f, 15.06f, 12.67f, 14.84f, 12.75f, 14.68f)
                curveTo(12.83f, 14.5f, 12.97f, 14.36f, 13.18f, 14.21f)
                curveTo(13.57f, 14.0f, 13.88f, 13.74f, 14.13f, 13.39f)
                curveTo(14.37f, 13.03f, 14.5f, 12.67f, 14.5f, 12.22f)
                curveTo(14.5f, 11.55f, 14.27f, 11.0f, 13.81f, 10.61f)
                curveTo(13.36f, 10.2f, 12.74f, 10.0f, 11.95f, 10.0f)
                moveTo(10.94f, 16.22f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.64f)
                verticalLineTo(16.22f)
                horizontalLineTo(10.94f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.11f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f)
                moveTo(19.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                moveTo(5.0f, 19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _calendarQuestionOutline!!
    }

private var _calendarQuestionOutline: ImageVector? = null
