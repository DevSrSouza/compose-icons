package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.ShoppingBasket: ImageVector
    get() {
        if (_shoppingBasket != null) {
            return _shoppingBasket!!
        }
        _shoppingBasket = Builder(name = "ShoppingBasket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                horizontalLineToRelative(-4.79f)
                lineToRelative(-4.38f, -6.56f)
                curveToRelative(-0.19f, -0.28f, -0.51f, -0.42f, -0.83f, -0.42f)
                reflectiveCurveToRelative(-0.64f, 0.14f, -0.83f, 0.43f)
                lineTo(6.79f, 9.0f)
                horizontalLineTo(2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.09f, 0.01f, 0.18f, 0.04f, 0.27f)
                lineToRelative(2.54f, 9.27f)
                curveToRelative(0.23f, 0.84f, 1.0f, 1.46f, 1.92f, 1.46f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.92f, 0.0f, 1.69f, -0.62f, 1.93f, -1.46f)
                lineToRelative(2.54f, -9.27f)
                lineTo(23.0f, 10.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(12.0f, 4.8f)
                lineTo(14.8f, 9.0f)
                horizontalLineTo(9.2f)
                lineTo(12.0f, 4.8f)
                close()
                moveTo(18.5f, 19.0f)
                lineToRelative(-12.99f, 0.01f)
                lineTo(3.31f, 11.0f)
                horizontalLineTo(20.7f)
                lineToRelative(-2.2f, 8.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _shoppingBasket!!
    }

private var _shoppingBasket: ImageVector? = null
