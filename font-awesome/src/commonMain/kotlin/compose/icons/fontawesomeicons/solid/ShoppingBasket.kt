package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ShoppingBasket: ImageVector
    get() {
        if (_shoppingBasket != null) {
            return _shoppingBasket!!
        }
        _shoppingBasket = Builder(name = "ShoppingBasket", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(576.0f, 216.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 13.26f, -10.74f, 24.0f, -24.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(-26.11f, 182.79f)
                curveTo(514.51f, 462.43f, 494.26f, 480.0f, 470.37f, 480.0f)
                lineTo(105.63f, 480.0f)
                curveToRelative(-23.89f, 0.0f, -44.14f, -17.57f, -47.52f, -41.21f)
                lineTo(32.0f, 256.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, -10.74f, -24.0f, -24.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -13.26f, 10.74f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(67.34f)
                lineToRelative(106.78f, -146.82f)
                curveToRelative(10.4f, -14.29f, 30.41f, -17.45f, 44.7f, -7.06f)
                curveToRelative(14.29f, 10.4f, 17.45f, 30.41f, 7.06f, 44.7f)
                lineTo(170.48f, 192.0f)
                horizontalLineToRelative(235.05f)
                lineTo(326.12f, 82.82f)
                curveToRelative(-10.4f, -14.29f, -7.23f, -34.31f, 7.06f, -44.7f)
                curveToRelative(14.29f, -10.4f, 34.31f, -7.24f, 44.7f, 7.06f)
                lineTo(484.66f, 192.0f)
                lineTo(552.0f, 192.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, 10.74f, 24.0f, 24.0f)
                close()
                moveTo(312.0f, 392.0f)
                lineTo(312.0f, 280.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.74f, 24.0f, -24.0f)
                close()
                moveTo(424.0f, 392.0f)
                lineTo(424.0f, 280.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.74f, 24.0f, -24.0f)
                close()
                moveTo(200.0f, 392.0f)
                lineTo(200.0f, 280.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.74f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _shoppingBasket!!
    }

private var _shoppingBasket: ImageVector? = null
