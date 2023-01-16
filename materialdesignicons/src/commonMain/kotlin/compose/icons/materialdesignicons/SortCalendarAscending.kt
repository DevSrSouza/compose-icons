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

public val MaterialDesignIcons.SortCalendarAscending: ImageVector
    get() {
        if (_sortCalendarAscending != null) {
            return _sortCalendarAscending!!
        }
        _sortCalendarAscending = Builder(name = "SortCalendarAscending", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 17.0f)
                horizontalLineTo(24.0f)
                lineTo(20.0f, 21.0f)
                lineTo(16.0f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                moveTo(8.0f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                moveTo(13.0f, 5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                curveTo(1.89f, 5.0f, 1.0f, 5.89f, 1.0f, 7.0f)
                verticalLineTo(18.0f)
                curveTo(1.0f, 19.11f, 1.89f, 20.0f, 3.0f, 20.0f)
                horizontalLineTo(13.0f)
                curveTo(14.11f, 20.0f, 15.0f, 19.11f, 15.0f, 18.0f)
                verticalLineTo(7.0f)
                curveTo(15.0f, 5.89f, 14.11f, 5.0f, 13.0f, 5.0f)
                moveTo(3.0f, 18.0f)
                lineTo(3.0f, 11.0f)
                horizontalLineTo(13.0f)
                lineTo(13.0f, 18.0f)
                lineTo(3.0f, 18.0f)
                close()
            }
        }
        .build()
        return _sortCalendarAscending!!
    }

private var _sortCalendarAscending: ImageVector? = null
