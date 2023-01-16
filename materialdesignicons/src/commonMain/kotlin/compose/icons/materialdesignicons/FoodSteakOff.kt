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

public val MaterialDesignIcons.FoodSteakOff: ImageVector
    get() {
        if (_foodSteakOff != null) {
            return _foodSteakOff!!
        }
        _foodSteakOff = Builder(name = "FoodSteakOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(5.27f, 7.16f)
                curveTo(5.08f, 7.83f, 5.0f, 8.53f, 5.0f, 9.26f)
                curveTo(5.1f, 11.83f, 6.59f, 14.05f, 8.74f, 15.19f)
                curveTo(10.1f, 15.9f, 11.0f, 17.25f, 11.0f, 18.79f)
                verticalLineTo(19.0f)
                curveTo(11.0f, 20.66f, 12.34f, 22.0f, 14.0f, 22.0f)
                curveTo(15.68f, 22.0f, 16.83f, 21.11f, 17.6f, 19.5f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(14.0f, 20.0f)
                curveTo(13.45f, 20.0f, 13.0f, 19.55f, 13.0f, 19.0f)
                verticalLineTo(18.79f)
                curveTo(13.0f, 16.56f, 11.72f, 14.5f, 9.67f, 13.42f)
                curveTo(8.09f, 12.58f, 7.07f, 10.96f, 7.0f, 9.18f)
                curveTo(7.0f, 9.09f, 7.0f, 9.0f, 7.0f, 8.9f)
                lineTo(8.16f, 10.05f)
                curveTo(8.19f, 10.15f, 8.21f, 10.25f, 8.24f, 10.35f)
                lineTo(8.4f, 10.29f)
                lineTo(9.62f, 11.5f)
                lineTo(9.08f, 11.71f)
                curveTo(9.38f, 12.04f, 9.73f, 12.32f, 10.14f, 12.53f)
                curveTo(10.81f, 12.89f, 11.4f, 13.34f, 11.91f, 13.85f)
                lineTo(11.95f, 13.84f)
                lineTo(13.17f, 15.06f)
                lineTo(12.95f, 15.14f)
                curveTo(13.46f, 15.96f, 13.8f, 16.89f, 13.93f, 17.85f)
                lineTo(15.2f, 17.39f)
                curveTo(15.22f, 17.32f, 15.25f, 17.24f, 15.27f, 17.16f)
                lineTo(16.07f, 17.96f)
                curveTo(15.47f, 19.68f, 14.68f, 20.0f, 14.0f, 20.0f)
                moveTo(15.79f, 7.6f)
                lineTo(12.14f, 8.94f)
                lineTo(9.88f, 6.68f)
                lineTo(13.69f, 5.3f)
                curveTo(14.94f, 5.77f, 15.53f, 6.72f, 15.79f, 7.6f)
                moveTo(8.59f, 5.39f)
                lineTo(7.17f, 3.97f)
                curveTo(8.41f, 2.77f, 10.07f, 2.0f, 11.88f, 2.0f)
                horizontalLineTo(11.88f)
                curveTo(19.0f, 2.0f, 19.0f, 9.0f, 19.0f, 9.0f)
                curveTo(19.0f, 11.46f, 18.9f, 13.63f, 18.66f, 15.46f)
                lineTo(16.84f, 13.64f)
                curveTo(16.94f, 12.36f, 17.0f, 10.83f, 17.0f, 9.0f)
                curveTo(17.0f, 8.18f, 16.69f, 4.0f, 11.88f, 4.0f)
                horizontalLineTo(11.88f)
                curveTo(10.67f, 4.0f, 9.5f, 4.5f, 8.59f, 5.39f)
                moveTo(15.68f, 12.5f)
                lineTo(13.36f, 10.15f)
                lineTo(16.0f, 9.19f)
                curveTo(16.0f, 10.41f, 15.97f, 11.46f, 15.92f, 12.4f)
                lineTo(15.68f, 12.5f)
                close()
            }
        }
        .build()
        return _foodSteakOff!!
    }

private var _foodSteakOff: ImageVector? = null
