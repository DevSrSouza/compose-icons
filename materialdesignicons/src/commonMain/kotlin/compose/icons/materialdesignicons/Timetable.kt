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

public val MaterialDesignIcons.Timetable: ImageVector
    get() {
        if (_timetable != null) {
            return _timetable!!
        }
        _timetable = Builder(name = "Timetable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(14.82f)
                lineTo(17.94f, 16.23f)
                lineTo(17.19f, 17.53f)
                lineTo(14.0f, 15.69f)
                verticalLineTo(12.0f)
                moveTo(4.0f, 2.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 4.0f)
                verticalLineTo(10.1f)
                curveTo(21.24f, 11.36f, 22.0f, 13.09f, 22.0f, 15.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 15.0f, 22.0f)
                curveTo(13.09f, 22.0f, 11.36f, 21.24f, 10.1f, 20.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 18.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 2.0f)
                moveTo(4.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.67f)
                curveTo(8.24f, 17.09f, 8.0f, 16.07f, 8.0f, 15.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                moveTo(18.0f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                moveTo(4.0f, 13.0f)
                horizontalLineTo(8.29f)
                curveTo(8.63f, 11.85f, 9.26f, 10.82f, 10.1f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                moveTo(15.0f, 10.15f)
                arcTo(4.85f, 4.85f, 0.0f, false, false, 10.15f, 15.0f)
                curveTo(10.15f, 17.68f, 12.32f, 19.85f, 15.0f, 19.85f)
                arcTo(4.85f, 4.85f, 0.0f, false, false, 19.85f, 15.0f)
                curveTo(19.85f, 12.32f, 17.68f, 10.15f, 15.0f, 10.15f)
                close()
            }
        }
        .build()
        return _timetable!!
    }

private var _timetable: ImageVector? = null
