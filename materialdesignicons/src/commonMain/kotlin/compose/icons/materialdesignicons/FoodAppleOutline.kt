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

public val MaterialDesignIcons.FoodAppleOutline: ImageVector
    get() {
        if (_foodAppleOutline != null) {
            return _foodAppleOutline!!
        }
        _foodAppleOutline = Builder(name = "FoodAppleOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                curveTo(18.58f, 7.57f, 15.5f, 6.69f, 13.0f, 8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                curveTo(8.5f, 6.69f, 5.42f, 7.57f, 4.0f, 10.0f)
                curveTo(2.0f, 13.0f, 7.0f, 22.0f, 9.0f, 22.0f)
                curveTo(11.0f, 22.0f, 11.0f, 21.0f, 12.0f, 21.0f)
                curveTo(13.0f, 21.0f, 13.0f, 22.0f, 15.0f, 22.0f)
                curveTo(17.0f, 22.0f, 22.0f, 13.0f, 20.0f, 10.0f)
                moveTo(18.25f, 13.38f)
                curveTo(17.63f, 15.85f, 16.41f, 18.12f, 14.7f, 20.0f)
                curveTo(14.5f, 20.0f, 14.27f, 19.9f, 14.1f, 19.75f)
                curveTo(12.87f, 18.76f, 11.13f, 18.76f, 9.9f, 19.75f)
                curveTo(9.73f, 19.9f, 9.5f, 20.0f, 9.3f, 20.0f)
                curveTo(7.59f, 18.13f, 6.36f, 15.85f, 5.75f, 13.39f)
                curveTo(5.5f, 12.66f, 5.45f, 11.87f, 5.66f, 11.12f)
                curveTo(6.24f, 10.09f, 7.32f, 9.43f, 8.5f, 9.4f)
                curveTo(9.06f, 9.41f, 9.61f, 9.54f, 10.11f, 9.79f)
                lineTo(11.0f, 10.24f)
                horizontalLineTo(13.0f)
                lineTo(13.89f, 9.79f)
                curveTo(14.39f, 9.54f, 14.94f, 9.41f, 15.5f, 9.4f)
                curveTo(16.68f, 9.43f, 17.76f, 10.08f, 18.34f, 11.11f)
                curveTo(18.55f, 11.86f, 18.5f, 12.65f, 18.25f, 13.38f)
                moveTo(11.0f, 5.0f)
                curveTo(5.38f, 8.07f, 4.11f, 3.78f, 4.11f, 3.78f)
                curveTo(4.11f, 3.78f, 6.77f, 0.19f, 11.0f, 5.0f)
                close()
            }
        }
        .build()
        return _foodAppleOutline!!
    }

private var _foodAppleOutline: ImageVector? = null
