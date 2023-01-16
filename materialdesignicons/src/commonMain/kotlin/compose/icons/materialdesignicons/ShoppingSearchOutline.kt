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

public val MaterialDesignIcons.ShoppingSearchOutline: ImageVector
    get() {
        if (_shoppingSearchOutline != null) {
            return _shoppingSearchOutline!!
        }
        _shoppingSearchOutline = Builder(name = "ShoppingSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.31f, 18.9f)
                curveTo(20.64f, 16.8f, 20.0f, 14.0f, 17.91f, 12.69f)
                reflectiveCurveTo(13.03f, 12.0f, 11.7f, 14.1f)
                reflectiveCurveTo(11.0f, 19.0f, 13.1f, 20.3f)
                curveTo(14.56f, 21.22f, 16.42f, 21.23f, 17.88f, 20.32f)
                lineTo(21.0f, 23.39f)
                lineTo(22.39f, 22.0f)
                moveTo(15.5f, 19.0f)
                curveTo(14.12f, 19.0f, 13.0f, 17.88f, 13.0f, 16.5f)
                reflectiveCurveTo(14.12f, 14.0f, 15.5f, 14.0f)
                reflectiveCurveTo(18.0f, 15.12f, 18.0f, 16.5f)
                reflectiveCurveTo(16.88f, 19.0f, 15.5f, 19.0f)
                moveTo(10.03f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.03f)
                curveTo(19.81f, 11.55f, 20.5f, 12.24f, 21.0f, 13.05f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 6.9f, 20.1f, 6.0f, 19.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 3.2f, 14.8f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(7.0f, 3.2f, 7.0f, 6.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 6.0f, 3.0f, 6.9f, 3.0f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 21.1f, 3.9f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(12.05f)
                curveTo(11.24f, 21.5f, 10.55f, 20.81f, 10.03f, 20.0f)
                moveTo(12.0f, 3.0f)
                curveTo(13.7f, 3.0f, 15.0f, 4.3f, 15.0f, 6.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 4.3f, 10.3f, 3.0f, 12.0f, 3.0f)
                moveTo(15.0f, 9.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 9.4f, 16.95f, 9.78f, 16.86f, 10.15f)
                curveTo(16.42f, 10.05f, 15.97f, 10.0f, 15.5f, 10.0f)
                curveTo(15.27f, 10.0f, 15.04f, 10.0f, 14.82f, 10.04f)
                curveTo(14.93f, 9.71f, 15.0f, 9.37f, 15.0f, 9.0f)
                moveTo(9.76f, 13.46f)
                curveTo(8.12f, 12.65f, 7.0f, 11.0f, 7.0f, 9.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 10.34f, 9.82f, 11.42f, 11.0f, 11.82f)
                curveTo(10.5f, 12.3f, 10.08f, 12.85f, 9.76f, 13.46f)
                close()
            }
        }
        .build()
        return _shoppingSearchOutline!!
    }

private var _shoppingSearchOutline: ImageVector? = null
