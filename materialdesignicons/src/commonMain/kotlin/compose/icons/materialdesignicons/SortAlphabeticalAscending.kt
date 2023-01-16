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

public val MaterialDesignIcons.SortAlphabeticalAscending: ImageVector
    get() {
        if (_sortAlphabeticalAscending != null) {
            return _sortAlphabeticalAscending!!
        }
        _sortAlphabeticalAscending = Builder(name = "SortAlphabeticalAscending", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 17.0f)
                horizontalLineTo(22.0f)
                lineTo(18.0f, 21.0f)
                lineTo(14.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                moveTo(11.0f, 13.0f)
                verticalLineTo(15.0f)
                lineTo(7.67f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                lineTo(8.33f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                moveTo(9.0f, 3.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 3.0f, 5.0f, 3.9f, 5.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                curveTo(11.0f, 3.9f, 10.11f, 3.0f, 9.0f, 3.0f)
                moveTo(9.0f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _sortAlphabeticalAscending!!
    }

private var _sortAlphabeticalAscending: ImageVector? = null
