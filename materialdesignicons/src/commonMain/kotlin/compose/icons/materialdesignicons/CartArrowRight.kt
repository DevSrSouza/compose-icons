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

public val MaterialDesignIcons.CartArrowRight: ImageVector
    get() {
        if (_cartArrowRight != null) {
            return _cartArrowRight!!
        }
        _cartArrowRight = Builder(name = "CartArrowRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 20.0f)
                moveTo(17.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 18.0f)
                moveTo(7.2f, 14.63f)
                curveTo(7.19f, 14.67f, 7.19f, 14.71f, 7.2f, 14.75f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 7.45f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 15.0f)
                curveTo(5.0f, 14.65f, 5.07f, 14.31f, 5.24f, 14.0f)
                lineTo(6.6f, 11.59f)
                lineTo(3.0f, 4.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.27f)
                lineTo(5.21f, 4.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 5.0f)
                curveTo(21.0f, 5.17f, 20.95f, 5.34f, 20.88f, 5.5f)
                lineTo(17.3f, 12.0f)
                curveTo(16.94f, 12.62f, 16.27f, 13.0f, 15.55f, 13.0f)
                horizontalLineTo(8.1f)
                lineTo(7.2f, 14.63f)
                moveTo(9.0f, 9.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.5f)
                lineTo(16.0f, 8.5f)
                lineTo(13.0f, 5.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _cartArrowRight!!
    }

private var _cartArrowRight: ImageVector? = null
