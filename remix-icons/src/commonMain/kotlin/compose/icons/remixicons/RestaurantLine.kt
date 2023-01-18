package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.RestaurantLine: ImageVector
    get() {
        if (_restaurantLine != null) {
            return _restaurantLine!!
        }
        _restaurantLine = Builder(name = "RestaurantLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(15.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                close()
                moveTo(19.0f, 4.53f)
                curveTo(18.17f, 5.0f, 17.0f, 6.17f, 17.0f, 8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 4.53f)
                close()
                moveTo(9.0f, 13.9f)
                lineTo(9.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-8.1f)
                arcTo(5.002f, 5.002f, 0.0f, false, true, 3.0f, 9.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, true, -4.0f, 4.9f)
                close()
            }
        }
        .build()
        return _restaurantLine!!
    }

private var _restaurantLine: ImageVector? = null
