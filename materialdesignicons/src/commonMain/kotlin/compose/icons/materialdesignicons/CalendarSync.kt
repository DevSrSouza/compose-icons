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

public val MaterialDesignIcons.CalendarSync: ImageVector
    get() {
        if (_calendarSync != null) {
            return _calendarSync!!
        }
        _calendarSync = Builder(name = "CalendarSync", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 11.0f)
                verticalLineTo(12.5f)
                curveTo(21.19f, 12.5f, 23.09f, 16.05f, 21.33f, 18.71f)
                lineTo(20.24f, 17.62f)
                curveTo(21.06f, 15.96f, 19.85f, 14.0f, 18.0f, 14.0f)
                verticalLineTo(15.5f)
                lineTo(15.75f, 13.25f)
                lineTo(18.0f, 11.0f)
                moveTo(18.0f, 22.0f)
                verticalLineTo(20.5f)
                curveTo(14.81f, 20.5f, 12.91f, 16.95f, 14.67f, 14.29f)
                lineTo(15.76f, 15.38f)
                curveTo(14.94f, 17.04f, 16.15f, 19.0f, 18.0f, 19.0f)
                verticalLineTo(17.5f)
                lineTo(20.25f, 19.75f)
                lineTo(18.0f, 22.0f)
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
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(13.36f, 20.45f, 12.86f, 19.77f, 12.5f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.59f)
                curveTo(19.71f, 10.7f, 20.39f, 10.94f, 21.0f, 11.31f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                close()
            }
        }
        .build()
        return _calendarSync!!
    }

private var _calendarSync: ImageVector? = null
