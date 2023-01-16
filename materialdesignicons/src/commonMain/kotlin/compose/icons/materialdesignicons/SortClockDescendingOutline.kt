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

public val MaterialDesignIcons.SortClockDescendingOutline: ImageVector
    get() {
        if (_sortClockDescendingOutline != null) {
            return _sortClockDescendingOutline!!
        }
        _sortClockDescendingOutline = Builder(name = "SortClockDescendingOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
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
                moveTo(8.0f, 7.15f)
                curveTo(10.67f, 7.15f, 12.85f, 9.32f, 12.85f, 12.0f)
                curveTo(12.85f, 14.68f, 10.68f, 16.85f, 8.0f, 16.85f)
                curveTo(5.32f, 16.85f, 3.15f, 14.68f, 3.15f, 12.0f)
                curveTo(3.15f, 9.32f, 5.32f, 7.15f, 8.0f, 7.15f)
                moveTo(7.0f, 9.0f)
                verticalLineTo(12.69f)
                lineTo(10.19f, 14.53f)
                lineTo(10.94f, 13.23f)
                lineTo(8.5f, 11.82f)
                verticalLineTo(9.0f)
            }
        }
        .build()
        return _sortClockDescendingOutline!!
    }

private var _sortClockDescendingOutline: ImageVector? = null
