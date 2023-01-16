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

public val MaterialDesignIcons.SortBoolAscendingVariant: ImageVector
    get() {
        if (_sortBoolAscendingVariant != null) {
            return _sortBoolAscendingVariant!!
        }
        _sortBoolAscendingVariant = Builder(name = "SortBoolAscendingVariant", defaultWidth =
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
                verticalLineTo(17.0f)
                moveTo(9.0f, 13.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 13.0f, 3.0f, 13.89f, 3.0f, 15.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.89f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(10.11f, 21.0f, 11.0f, 20.11f, 11.0f, 19.0f)
                verticalLineTo(15.0f)
                curveTo(11.0f, 13.89f, 10.11f, 13.0f, 9.0f, 13.0f)
                moveTo(6.27f, 19.5f)
                lineTo(3.74f, 16.95f)
                lineTo(4.81f, 15.9f)
                lineTo(6.28f, 17.39f)
                lineTo(9.2f, 14.5f)
                lineTo(10.26f, 15.55f)
                lineTo(6.27f, 19.5f)
                moveTo(9.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 10.11f, 3.89f, 11.0f, 5.0f, 11.0f)
                horizontalLineTo(9.0f)
                curveTo(10.11f, 11.0f, 11.0f, 10.11f, 11.0f, 9.0f)
                verticalLineTo(5.0f)
                curveTo(11.0f, 3.89f, 10.11f, 3.0f, 9.0f, 3.0f)
                moveTo(9.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _sortBoolAscendingVariant!!
    }

private var _sortBoolAscendingVariant: ImageVector? = null