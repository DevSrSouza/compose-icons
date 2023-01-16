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

public val MaterialDesignIcons.SortBoolAscending: ImageVector
    get() {
        if (_sortBoolAscending != null) {
            return _sortBoolAscending!!
        }
        _sortBoolAscending = Builder(name = "SortBoolAscending", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                verticalLineTo(17.0f)
                moveTo(7.0f, 3.0f)
                curveTo(4.79f, 3.0f, 3.0f, 4.79f, 3.0f, 7.0f)
                reflectiveCurveTo(4.79f, 11.0f, 7.0f, 11.0f)
                reflectiveCurveTo(11.0f, 9.21f, 11.0f, 7.0f)
                reflectiveCurveTo(9.21f, 3.0f, 7.0f, 3.0f)
                moveTo(7.0f, 9.0f)
                curveTo(5.9f, 9.0f, 5.0f, 8.1f, 5.0f, 7.0f)
                reflectiveCurveTo(5.9f, 5.0f, 7.0f, 5.0f)
                reflectiveCurveTo(9.0f, 5.9f, 9.0f, 7.0f)
                reflectiveCurveTo(8.1f, 9.0f, 7.0f, 9.0f)
                moveTo(7.0f, 13.0f)
                curveTo(4.79f, 13.0f, 3.0f, 14.79f, 3.0f, 17.0f)
                reflectiveCurveTo(4.79f, 21.0f, 7.0f, 21.0f)
                reflectiveCurveTo(11.0f, 19.21f, 11.0f, 17.0f)
                reflectiveCurveTo(9.21f, 13.0f, 7.0f, 13.0f)
                close()
            }
        }
        .build()
        return _sortBoolAscending!!
    }

private var _sortBoolAscending: ImageVector? = null
