package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.ShoppingCartFilled: ImageVector
    get() {
        if (_shoppingCartFilled != null) {
            return _shoppingCartFilled!!
        }
        _shoppingCartFilled = Builder(name = "ShoppingCartFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(1.068f)
                lineToRelative(13.071f, 0.935f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.929f, 1.024f)
                lineToRelative(-0.01f, 0.114f)
                lineToRelative(-1.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.877f, 0.853f)
                lineToRelative(-0.113f, 0.006f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -2.995f, 3.176f)
                lineToRelative(-0.005f, -0.176f)
                lineToRelative(0.005f, -0.176f)
                curveToRelative(0.017f, -0.288f, 0.074f, -0.564f, 0.166f, -0.824f)
                horizontalLineToRelative(-5.342f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -5.824f, 1.176f)
                lineToRelative(-0.005f, -0.176f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.002f, 3.002f, 0.0f, false, true, 1.995f, -2.654f)
                verticalLineToRelative(-12.17f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.883f, -0.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(17.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _shoppingCartFilled!!
    }

private var _shoppingCartFilled: ImageVector? = null
