package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.RestaurantSharp: ImageVector
    get() {
        if (_restaurantSharp != null) {
            return _restaurantSharp!!
        }
        _restaurantSharp = Builder(name = "RestaurantSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(342.7f, 223.94f)
                horizontalLineToRelative(14.87f)
                arcToRelative(79.48f, 79.48f, 0.0f, false, false, 56.58f, -23.44f)
                lineTo(496.0f, 118.0f)
                lineTo(473.78f, 95.6f)
                lineTo(390.2f, 179.18f)
                lineToRelative(-17.37f, -17.37f)
                lineToRelative(83.58f, -83.59f)
                lineToRelative(-23.0f, -22.31f)
                lineToRelative(-83.27f, 83.26f)
                lineTo(332.82f, 121.8f)
                lineTo(416.4f, 38.21f)
                lineTo(394.0f, 16.0f)
                lineTo(311.5f, 97.85f)
                arcToRelative(79.49f, 79.49f, 0.0f, false, false, -23.44f, 56.59f)
                verticalLineTo(169.3f)
                lineToRelative(-43.13f, 43.13f)
                lineTo(48.0f, 16.0f)
                curveTo(3.72f, 70.87f, 29.87f, 171.71f, 79.72f, 221.57f)
                lineToRelative(85.5f, 85.5f)
                curveToRelative(26.55f, 26.55f, 31.82f, 28.92f, 61.94f, 16.8f)
                curveToRelative(6.49f, -2.61f, 8.85f, -2.32f, 14.9f, 3.72f)
                lineToRelative(13.0f, 12.13f)
                curveToRelative(2.93f, 3.0f, 3.0f, 3.88f, 3.0f, 9.62f)
                verticalLineToRelative(5.54f)
                curveToRelative(0.0f, 21.08f, 13.48f, 33.2f, 22.36f, 42.24f)
                lineTo(384.0f, 496.0f)
                lineToRelative(72.0f, -72.0f)
                lineTo(299.57f, 267.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.37f, 354.59f)
                curveToRelative(-29.82f, 6.11f, -48.11f, 11.74f, -83.08f, -23.23f)
                curveToRelative(-0.56f, -0.56f, -1.14f, -1.1f, -1.7f, -1.66f)
                lineToRelative(-19.5f, -19.5f)
                lineTo(16.0f, 416.0f)
                lineToRelative(80.0f, 80.0f)
                lineTo(240.0f, 352.0f)
                close()
            }
        }
        .build()
        return _restaurantSharp!!
    }

private var _restaurantSharp: ImageVector? = null
