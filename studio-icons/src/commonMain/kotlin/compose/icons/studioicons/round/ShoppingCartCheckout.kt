package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ShoppingCartCheckout: ImageVector
    get() {
        if (_shoppingCartCheckout != null) {
            return _shoppingCartCheckout!!
        }
        _shoppingCartCheckout = Builder(name = "ShoppingCartCheckout", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(8.1f, 18.0f, 7.0f, 18.0f)
                close()
                moveTo(17.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(18.1f, 18.0f, 17.0f, 18.0f)
                close()
                moveTo(19.0f, 16.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(7.0f)
                lineToRelative(1.1f, -2.0f)
                horizontalLineToRelative(7.45f)
                curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f)
                lineToRelative(3.24f, -6.14f)
                curveToRelative(0.25f, -0.48f, 0.08f, -1.08f, -0.4f, -1.34f)
                curveToRelative(-0.49f, -0.27f, -1.1f, -0.08f, -1.36f, 0.41f)
                lineTo(15.55f, 11.0f)
                horizontalLineTo(8.53f)
                lineTo(4.54f, 2.57f)
                curveTo(4.38f, 2.22f, 4.02f, 2.0f, 3.64f, 2.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 2.0f, 1.0f, 2.45f, 1.0f, 3.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(3.6f, 7.59f)
                lineToRelative(-1.35f, 2.44f)
                curveTo(4.52f, 15.37f, 5.48f, 17.0f, 7.0f, 17.0f)
                horizontalLineToRelative(11.0f)
                curveTo(18.55f, 17.0f, 19.0f, 16.55f, 19.0f, 16.0f)
                close()
                moveTo(11.29f, 2.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(2.59f, 2.59f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(-2.59f, 2.59f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(12.17f, 7.0f)
                lineTo(9.0f, 7.0f)
                curveTo(8.45f, 7.0f, 8.0f, 6.55f, 8.0f, 6.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                lineToRelative(3.17f, 0.0f)
                lineToRelative(-0.88f, -0.88f)
                curveTo(10.9f, 3.73f, 10.9f, 3.1f, 11.29f, 2.71f)
                close()
            }
        }
        .build()
        return _shoppingCartCheckout!!
    }

private var _shoppingCartCheckout: ImageVector? = null
