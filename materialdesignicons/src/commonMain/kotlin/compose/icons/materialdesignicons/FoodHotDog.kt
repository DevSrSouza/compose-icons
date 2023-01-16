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

public val MaterialDesignIcons.FoodHotDog: ImageVector
    get() {
        if (_foodHotDog != null) {
            return _foodHotDog!!
        }
        _foodHotDog = Builder(name = "FoodHotDog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.77f)
                curveTo(20.85f, 5.65f, 20.72f, 5.55f, 20.59f, 5.45f)
                lineTo(20.62f, 5.41f)
                curveTo(21.4f, 4.63f, 21.4f, 3.37f, 20.62f, 2.59f)
                curveTo(19.84f, 1.81f, 18.58f, 1.81f, 17.79f, 2.59f)
                lineTo(17.05f, 3.33f)
                curveTo(15.68f, 2.3f, 13.74f, 2.4f, 12.5f, 3.65f)
                lineTo(3.65f, 12.5f)
                curveTo(2.4f, 13.74f, 2.3f, 15.68f, 3.33f, 17.05f)
                lineTo(2.59f, 17.79f)
                curveTo(1.8f, 18.58f, 1.8f, 19.84f, 2.59f, 20.62f)
                curveTo(3.37f, 21.4f, 4.63f, 21.4f, 5.41f, 20.62f)
                lineTo(5.45f, 20.59f)
                curveTo(5.55f, 20.72f, 5.65f, 20.85f, 5.77f, 21.0f)
                curveTo(7.13f, 22.34f, 9.35f, 22.34f, 10.72f, 21.0f)
                lineTo(20.97f, 10.72f)
                curveTo(22.34f, 9.35f, 22.34f, 7.14f, 21.0f, 5.77f)
                moveTo(4.77f, 15.61f)
                curveTo(4.5f, 15.05f, 4.6f, 14.36f, 5.06f, 13.9f)
                lineTo(13.9f, 5.06f)
                curveTo(14.36f, 4.6f, 15.05f, 4.5f, 15.61f, 4.77f)
                lineTo(4.77f, 15.61f)
                moveTo(19.56f, 9.3f)
                lineTo(9.3f, 19.56f)
                curveTo(8.72f, 20.15f, 7.77f, 20.15f, 7.18f, 19.56f)
                curveTo(6.6f, 19.0f, 6.6f, 18.0f, 7.18f, 17.44f)
                lineTo(17.44f, 7.18f)
                curveTo(18.0f, 6.6f, 19.0f, 6.6f, 19.56f, 7.18f)
                curveTo(20.15f, 7.77f, 20.15f, 8.72f, 19.56f, 9.3f)
                close()
            }
        }
        .build()
        return _foodHotDog!!
    }

private var _foodHotDog: ImageVector? = null
