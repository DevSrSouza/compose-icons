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

public val MaterialDesignIcons.LiquidSpot: ImageVector
    get() {
        if (_liquidSpot != null) {
            return _liquidSpot!!
        }
        _liquidSpot = Builder(name = "LiquidSpot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.14f, 16.7f)
                curveTo(17.23f, 18.21f, 16.08f, 17.73f, 15.0f, 17.09f)
                reflectiveCurveTo(12.9f, 15.68f, 12.25f, 16.59f)
                curveTo(11.54f, 17.37f, 12.09f, 18.62f, 12.37f, 19.72f)
                curveTo(12.65f, 20.83f, 12.67f, 21.79f, 10.9f, 22.0f)
                curveTo(9.5f, 21.81f, 9.58f, 20.65f, 9.81f, 19.42f)
                curveTo(10.04f, 18.19f, 10.4f, 16.89f, 9.5f, 16.43f)
                curveTo(8.78f, 15.95f, 8.28f, 16.78f, 7.65f, 17.6f)
                curveTo(7.0f, 18.41f, 6.26f, 19.2f, 5.04f, 18.62f)
                curveTo(3.94f, 17.71f, 4.36f, 17.18f, 4.94f, 16.5f)
                reflectiveCurveTo(6.27f, 14.91f, 5.84f, 13.31f)
                curveTo(5.66f, 12.66f, 4.76f, 12.81f, 3.87f, 12.79f)
                curveTo(3.0f, 12.77f, 2.12f, 12.59f, 2.03f, 11.29f)
                curveTo(1.96f, 10.5f, 2.55f, 10.18f, 3.16f, 9.93f)
                curveTo(3.78f, 9.68f, 4.41f, 9.5f, 4.42f, 8.87f)
                curveTo(4.45f, 8.26f, 4.04f, 7.83f, 3.78f, 7.38f)
                reflectiveCurveTo(3.41f, 6.46f, 4.03f, 5.76f)
                curveTo(5.08f, 4.9f, 5.92f, 5.63f, 6.76f, 6.42f)
                reflectiveCurveTo(8.43f, 8.04f, 9.46f, 7.39f)
                curveTo(10.28f, 6.85f, 9.53f, 5.9f, 8.95f, 4.97f)
                reflectiveCurveTo(7.96f, 3.15f, 9.46f, 2.74f)
                curveTo(10.76f, 2.38f, 11.26f, 3.27f, 11.71f, 4.3f)
                curveTo(12.17f, 5.33f, 12.57f, 6.5f, 13.67f, 6.71f)
                curveTo(15.24f, 7.0f, 16.38f, 5.16f, 17.47f, 3.7f)
                reflectiveCurveTo(19.63f, 1.15f, 21.0f, 2.95f)
                curveTo(22.5f, 4.84f, 21.07f, 5.72f, 19.4f, 6.5f)
                curveTo(17.73f, 7.23f, 15.81f, 7.87f, 16.27f, 9.28f)
                curveTo(16.54f, 10.1f, 17.42f, 9.65f, 18.35f, 9.34f)
                curveTo(19.27f, 9.03f, 20.26f, 8.86f, 20.74f, 10.27f)
                curveTo(21.25f, 11.76f, 20.04f, 12.1f, 18.68f, 12.24f)
                curveTo(17.32f, 12.38f, 15.8f, 12.32f, 15.7f, 13.0f)
                curveTo(15.59f, 13.71f, 16.5f, 14.0f, 17.29f, 14.42f)
                curveTo(18.08f, 14.85f, 18.75f, 15.42f, 18.14f, 16.7f)
                moveTo(20.5f, 19.0f)
                curveTo(19.55f, 19.0f, 19.06f, 18.26f, 19.06f, 17.5f)
                curveTo(19.06f, 16.74f, 19.54f, 16.0f, 20.5f, 16.0f)
                curveTo(21.5f, 16.0f, 22.0f, 16.74f, 22.0f, 17.5f)
                curveTo(22.0f, 18.26f, 21.5f, 19.0f, 20.5f, 19.0f)
                close()
            }
        }
        .build()
        return _liquidSpot!!
    }

private var _liquidSpot: ImageVector? = null
