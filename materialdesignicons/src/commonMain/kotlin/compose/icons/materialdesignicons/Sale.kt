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

public val MaterialDesignIcons.Sale: ImageVector
    get() {
        if (_sale != null) {
            return _sale!!
        }
        _sale = Builder(name = "Sale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.65f, 2.85f)
                lineTo(19.26f, 6.71f)
                lineTo(22.77f, 8.5f)
                lineTo(21.0f, 12.0f)
                lineTo(22.78f, 15.5f)
                lineTo(19.24f, 17.29f)
                lineTo(18.63f, 21.15f)
                lineTo(14.74f, 20.54f)
                lineTo(11.97f, 23.3f)
                lineTo(9.19f, 20.5f)
                lineTo(5.33f, 21.14f)
                lineTo(4.71f, 17.25f)
                lineTo(1.22f, 15.47f)
                lineTo(3.0f, 11.97f)
                lineTo(1.23f, 8.5f)
                lineTo(4.74f, 6.69f)
                lineTo(5.35f, 2.86f)
                lineTo(9.22f, 3.5f)
                lineTo(12.0f, 0.69f)
                lineTo(14.77f, 3.46f)
                lineTo(18.65f, 2.85f)
                moveTo(9.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 7.0f)
                moveTo(14.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 14.0f)
                moveTo(8.41f, 17.0f)
                lineTo(17.0f, 8.41f)
                lineTo(15.59f, 7.0f)
                lineTo(7.0f, 15.59f)
                lineTo(8.41f, 17.0f)
                close()
            }
        }
        .build()
        return _sale!!
    }

private var _sale: ImageVector? = null
