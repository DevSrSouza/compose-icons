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

public val MaterialDesignIcons.SortBoolDescending: ImageVector
    get() {
        if (_sortBoolDescending != null) {
            return _sortBoolDescending!!
        }
        _sortBoolDescending = Builder(name = "SortBoolDescending", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                horizontalLineTo(22.0f)
                lineTo(18.0f, 3.0f)
                lineTo(14.0f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                moveTo(5.0f, 7.0f)
                curveTo(5.0f, 8.1f, 5.9f, 9.0f, 7.0f, 9.0f)
                curveTo(8.1f, 9.0f, 9.0f, 8.1f, 9.0f, 7.0f)
                curveTo(9.0f, 5.9f, 8.1f, 5.0f, 7.0f, 5.0f)
                curveTo(5.9f, 5.0f, 5.0f, 5.9f, 5.0f, 7.0f)
                moveTo(7.0f, 3.0f)
                curveTo(9.21f, 3.0f, 11.0f, 4.79f, 11.0f, 7.0f)
                curveTo(11.0f, 9.21f, 9.21f, 11.0f, 7.0f, 11.0f)
                curveTo(4.79f, 11.0f, 3.0f, 9.21f, 3.0f, 7.0f)
                curveTo(3.0f, 4.79f, 4.79f, 3.0f, 7.0f, 3.0f)
                moveTo(7.0f, 13.0f)
                curveTo(4.79f, 13.0f, 3.0f, 14.79f, 3.0f, 17.0f)
                curveTo(3.0f, 19.21f, 4.79f, 21.0f, 7.0f, 21.0f)
                curveTo(9.21f, 21.0f, 11.0f, 19.21f, 11.0f, 17.0f)
                curveTo(11.0f, 14.79f, 9.21f, 13.0f, 7.0f, 13.0f)
                close()
            }
        }
        .build()
        return _sortBoolDescending!!
    }

private var _sortBoolDescending: ImageVector? = null
