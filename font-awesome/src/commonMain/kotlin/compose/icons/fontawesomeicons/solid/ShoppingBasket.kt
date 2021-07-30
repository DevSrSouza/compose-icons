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
                curveToRelative(0.0f, 13.255f, -10.745f, 24.0f, -24.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                lineToRelative(-26.113f, 182.788f)
                curveTo(514.509f, 462.435f, 494.257f, 480.0f, 470.37f, 480.0f)
                lineTo(105.63f, 480.0f)
                curveToRelative(-23.887f, 0.0f, -44.139f, -17.565f, -47.518f, -41.212f)
                lineTo(32.0f, 256.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, -10.745f, -24.0f, -24.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -13.255f, 10.745f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(67.341f)
                lineToRelative(106.78f, -146.821f)
                curveToRelative(10.395f, -14.292f, 30.407f, -17.453f, 44.701f, -7.058f)
                curveToRelative(14.293f, 10.395f, 17.453f, 30.408f, 7.058f, 44.701f)
                lineTo(170.477f, 192.0f)
                horizontalLineToRelative(235.046f)
                lineTo(326.12f, 82.821f)
                curveToRelative(-10.395f, -14.292f, -7.234f, -34.306f, 7.059f, -44.701f)
                curveToRelative(14.291f, -10.395f, 34.306f, -7.235f, 44.701f, 7.058f)
                lineTo(484.659f, 192.0f)
                lineTo(552.0f, 192.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, 10.745f, 24.0f, 24.0f)
                close()
                moveTo(312.0f, 392.0f)
                lineTo(312.0f, 280.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.745f, -24.0f, 24.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.745f, 24.0f, -24.0f)
                close()
                moveTo(424.0f, 392.0f)
                lineTo(424.0f, 280.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.745f, -24.0f, 24.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.745f, 24.0f, -24.0f)
                close()
                moveTo(200.0f, 392.0f)
                lineTo(200.0f, 280.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.745f, -24.0f, 24.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.745f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _shoppingBasket!!
    }

private var _shoppingBasket: ImageVector? = null
