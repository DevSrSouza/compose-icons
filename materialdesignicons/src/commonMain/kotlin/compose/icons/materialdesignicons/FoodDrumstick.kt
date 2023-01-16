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

public val MaterialDesignIcons.FoodDrumstick: ImageVector
    get() {
        if (_foodDrumstick != null) {
            return _foodDrumstick!!
        }
        _foodDrumstick = Builder(name = "FoodDrumstick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.16f, 12.73f)
                curveTo(22.93f, 9.96f, 22.57f, 5.26f, 19.09f, 3.0f)
                curveTo(17.08f, 1.67f, 14.39f, 1.66f, 12.36f, 2.97f)
                curveTo(10.6f, 4.1f, 9.63f, 5.86f, 9.46f, 7.68f)
                curveTo(9.33f, 9.0f, 8.83f, 10.23f, 7.91f, 11.15f)
                lineTo(7.88f, 11.18f)
                curveTo(6.72f, 12.34f, 6.72f, 14.11f, 7.81f, 15.19f)
                lineTo(8.8f, 16.18f)
                curveTo(9.89f, 17.27f, 11.66f, 17.27f, 12.75f, 16.18f)
                curveTo(13.72f, 15.21f, 15.0f, 14.68f, 16.39f, 14.53f)
                curveTo(17.76f, 14.38f, 19.1f, 13.78f, 20.16f, 12.73f)
                moveTo(6.26f, 19.86f)
                curveTo(6.53f, 20.42f, 6.44f, 21.1f, 5.97f, 21.56f)
                curveTo(5.39f, 22.15f, 4.44f, 22.15f, 3.85f, 21.56f)
                curveTo(3.58f, 21.29f, 3.44f, 20.94f, 3.42f, 20.58f)
                curveTo(3.06f, 20.56f, 2.71f, 20.42f, 2.44f, 20.15f)
                curveTo(1.85f, 19.56f, 1.85f, 18.61f, 2.44f, 18.03f)
                curveTo(2.9f, 17.57f, 3.59f, 17.47f, 4.14f, 17.74f)
                lineTo(6.62f, 15.31f)
                curveTo(6.76f, 15.5f, 6.92f, 15.72f, 7.1f, 15.9f)
                lineTo(8.09f, 16.89f)
                curveTo(8.3f, 17.09f, 8.5f, 17.26f, 8.76f, 17.41f)
                lineTo(6.26f, 19.86f)
                close()
            }
        }
        .build()
        return _foodDrumstick!!
    }

private var _foodDrumstick: ImageVector? = null
