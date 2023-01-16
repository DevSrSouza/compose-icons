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

public val MaterialDesignIcons.Basket: ImageVector
    get() {
        if (_basket != null) {
            return _basket!!
        }
        _basket = Builder(name = "Basket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 21.0f)
                curveTo(4.72f, 21.0f, 4.04f, 20.55f, 3.71f, 19.9f)
                verticalLineTo(19.9f)
                lineTo(1.1f, 10.44f)
                lineTo(1.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 9.0f)
                horizontalLineTo(6.58f)
                lineTo(11.18f, 2.43f)
                curveTo(11.36f, 2.17f, 11.66f, 2.0f, 12.0f, 2.0f)
                curveTo(12.34f, 2.0f, 12.65f, 2.17f, 12.83f, 2.44f)
                lineTo(17.42f, 9.0f)
                horizontalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.0f, 10.0f)
                lineTo(22.96f, 10.29f)
                lineTo(20.29f, 19.9f)
                curveTo(19.96f, 20.55f, 19.28f, 21.0f, 18.5f, 21.0f)
                horizontalLineTo(5.5f)
                moveTo(12.0f, 4.74f)
                lineTo(9.0f, 9.0f)
                horizontalLineTo(15.0f)
                lineTo(12.0f, 4.74f)
                moveTo(12.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _basket!!
    }

private var _basket: ImageVector? = null
