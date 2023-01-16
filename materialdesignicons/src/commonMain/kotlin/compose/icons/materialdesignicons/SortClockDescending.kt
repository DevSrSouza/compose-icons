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

public val MaterialDesignIcons.SortClockDescending: ImageVector
    get() {
        if (_sortClockDescending != null) {
            return _sortClockDescending!!
        }
        _sortClockDescending = Builder(name = "SortClockDescending", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                horizontalLineTo(15.0f)
                lineTo(19.0f, 3.0f)
                lineTo(23.0f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                moveTo(8.0f, 5.0f)
                curveTo(4.14f, 5.0f, 1.0f, 8.13f, 1.0f, 12.0f)
                curveTo(1.0f, 15.87f, 4.13f, 19.0f, 8.0f, 19.0f)
                curveTo(11.86f, 19.0f, 15.0f, 15.87f, 15.0f, 12.0f)
                curveTo(15.0f, 8.13f, 11.87f, 5.0f, 8.0f, 5.0f)
                moveTo(10.19f, 14.53f)
                lineTo(7.0f, 12.69f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(11.82f)
                lineTo(10.94f, 13.23f)
                lineTo(10.19f, 14.53f)
                close()
            }
        }
        .build()
        return _sortClockDescending!!
    }

private var _sortClockDescending: ImageVector? = null
