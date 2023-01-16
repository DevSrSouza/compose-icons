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

public val MaterialDesignIcons.FoodHalal: ImageVector
    get() {
        if (_foodHalal != null) {
            return _foodHalal!!
        }
        _foodHalal = Builder(name = "FoodHalal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                verticalLineTo(15.0f)
                curveTo(7.0f, 16.11f, 6.11f, 17.0f, 5.0f, 17.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 17.0f, 3.0f, 16.55f, 3.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(16.0f)
                curveTo(1.0f, 17.66f, 2.34f, 19.0f, 4.0f, 19.0f)
                horizontalLineTo(5.0f)
                curveTo(7.21f, 19.0f, 9.0f, 17.21f, 9.0f, 15.0f)
                verticalLineTo(5.0f)
                moveTo(23.0f, 13.38f)
                lineTo(21.77f, 12.15f)
                curveTo(21.03f, 11.41f, 20.04f, 11.0f, 19.0f, 11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5f, 13.0f, 20.0f, 13.2f, 20.35f, 13.56f)
                lineTo(20.7f, 13.91f)
                lineTo(19.5f, 14.6f)
                curveTo(19.04f, 14.86f, 18.53f, 15.0f, 18.0f, 15.0f)
                horizontalLineTo(17.0f)
                curveTo(16.44f, 15.0f, 16.0f, 14.56f, 16.0f, 14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.81f)
                lineTo(13.38f, 9.12f)
                curveTo(12.7f, 8.37f, 11.6f, 8.0f, 10.59f, 8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.59f)
                curveTo(11.23f, 10.0f, 11.84f, 10.25f, 12.29f, 10.71f)
                lineTo(14.0f, 12.41f)
                verticalLineTo(14.0f)
                curveTo(14.0f, 15.12f, 13.12f, 16.0f, 12.0f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                curveTo(13.37f, 18.0f, 14.5f, 17.3f, 15.17f, 16.24f)
                curveTo(15.63f, 16.71f, 16.25f, 17.0f, 17.0f, 17.0f)
                horizontalLineTo(18.0f)
                curveTo(18.88f, 17.0f, 19.74f, 16.77f, 20.5f, 16.33f)
                lineTo(23.0f, 14.89f)
                close()
            }
        }
        .build()
        return _foodHalal!!
    }

private var _foodHalal: ImageVector? = null
