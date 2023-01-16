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

public val MaterialDesignIcons.FruitPear: ImageVector
    get() {
        if (_fruitPear != null) {
            return _fruitPear!!
        }
        _fruitPear = Builder(name = "FruitPear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 16.0f)
                curveTo(18.0f, 19.31f, 15.31f, 22.0f, 12.0f, 22.0f)
                curveTo(8.69f, 22.0f, 6.0f, 19.31f, 6.0f, 16.0f)
                curveTo(6.0f, 13.0f, 8.0f, 13.0f, 8.0f, 10.0f)
                curveTo(8.0f, 8.56f, 8.75f, 7.22f, 10.0f, 6.5f)
                curveTo(10.4f, 6.27f, 10.82f, 6.12f, 11.25f, 6.04f)
                verticalLineTo(5.0f)
                curveTo(11.25f, 4.63f, 11.17f, 4.42f, 11.03f, 4.28f)
                curveTo(10.9f, 4.14f, 10.63f, 4.0f, 10.0f, 4.0f)
                verticalLineTo(2.5f)
                curveTo(10.88f, 2.5f, 11.6f, 2.73f, 12.09f, 3.22f)
                curveTo(12.58f, 3.71f, 12.75f, 4.38f, 12.75f, 5.0f)
                verticalLineTo(6.04f)
                curveTo(13.18f, 6.12f, 13.61f, 6.27f, 14.0f, 6.5f)
                curveTo(15.25f, 7.22f, 16.0f, 8.56f, 16.0f, 10.0f)
                curveTo(16.0f, 13.0f, 18.0f, 13.0f, 18.0f, 16.0f)
                close()
            }
        }
        .build()
        return _fruitPear!!
    }

private var _fruitPear: ImageVector? = null
