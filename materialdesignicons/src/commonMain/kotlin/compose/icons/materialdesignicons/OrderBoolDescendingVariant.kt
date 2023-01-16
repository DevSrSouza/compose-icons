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

public val MaterialDesignIcons.OrderBoolDescendingVariant: ImageVector
    get() {
        if (_orderBoolDescendingVariant != null) {
            return _orderBoolDescendingVariant!!
        }
        _orderBoolDescendingVariant = Builder(name = "OrderBoolDescendingVariant", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                curveTo(2.89f, 3.0f, 2.0f, 3.89f, 2.0f, 5.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 10.11f, 2.89f, 11.0f, 4.0f, 11.0f)
                horizontalLineTo(8.0f)
                curveTo(9.11f, 11.0f, 10.0f, 10.11f, 10.0f, 9.0f)
                verticalLineTo(5.0f)
                curveTo(10.0f, 3.89f, 9.11f, 3.0f, 8.0f, 3.0f)
                moveTo(8.2f, 4.5f)
                lineTo(9.26f, 5.55f)
                lineTo(5.27f, 9.5f)
                lineTo(2.74f, 6.95f)
                lineTo(3.81f, 5.9f)
                lineTo(5.28f, 7.39f)
                moveTo(4.0f, 13.0f)
                curveTo(2.89f, 13.0f, 2.0f, 13.89f, 2.0f, 15.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.11f, 2.89f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(9.11f, 21.0f, 10.0f, 20.11f, 10.0f, 19.0f)
                verticalLineTo(15.0f)
                curveTo(10.0f, 13.89f, 9.11f, 13.0f, 8.0f, 13.0f)
                moveTo(4.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                moveTo(12.0f, 5.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                moveTo(12.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                moveTo(12.0f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _orderBoolDescendingVariant!!
    }

private var _orderBoolDescendingVariant: ImageVector? = null
