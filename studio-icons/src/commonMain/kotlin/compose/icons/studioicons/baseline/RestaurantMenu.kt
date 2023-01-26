package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.RestaurantMenu: ImageVector
    get() {
        if (_restaurantMenu != null) {
            return _restaurantMenu!!
        }
        _restaurantMenu = Builder(name = "RestaurantMenu", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1f, 13.34f)
                lineToRelative(2.83f, -2.83f)
                lineTo(3.91f, 3.5f)
                curveToRelative(-1.56f, 1.56f, -1.56f, 4.09f, 0.0f, 5.66f)
                lineToRelative(4.19f, 4.18f)
                close()
                moveTo(14.88f, 11.53f)
                curveToRelative(1.53f, 0.71f, 3.68f, 0.21f, 5.27f, -1.38f)
                curveToRelative(1.91f, -1.91f, 2.28f, -4.65f, 0.81f, -6.12f)
                curveToRelative(-1.46f, -1.46f, -4.2f, -1.1f, -6.12f, 0.81f)
                curveToRelative(-1.59f, 1.59f, -2.09f, 3.74f, -1.38f, 5.27f)
                lineTo(3.7f, 19.87f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12.0f, 14.41f)
                lineToRelative(6.88f, 6.88f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.41f, 13.0f)
                lineToRelative(1.47f, -1.47f)
                close()
            }
        }
        .build()
        return _restaurantMenu!!
    }

private var _restaurantMenu: ImageVector? = null
