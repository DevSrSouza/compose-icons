package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(528.12f, 301.319f)
                lineToRelative(47.273f, -208.0f)
                curveTo(578.806f, 78.301f, 567.391f, 64.0f, 551.99f, 64.0f)
                horizontalLineTo(159.208f)
                lineToRelative(-9.166f, -44.81f)
                curveTo(147.758f, 8.021f, 137.93f, 0.0f, 126.529f, 0.0f)
                horizontalLineTo(24.0f)
                curveTo(10.745f, 0.0f, 0.0f, 10.745f, 0.0f, 24.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(69.883f)
                lineToRelative(70.248f, 343.435f)
                curveTo(147.325f, 417.1f, 136.0f, 435.222f, 136.0f, 456.0f)
                curveToRelative(0.0f, 30.928f, 25.072f, 56.0f, 56.0f, 56.0f)
                reflectiveCurveToRelative(56.0f, -25.072f, 56.0f, -56.0f)
                curveToRelative(0.0f, -15.674f, -6.447f, -29.835f, -16.824f, -40.0f)
                horizontalLineToRelative(209.647f)
                curveTo(430.447f, 426.165f, 424.0f, 440.326f, 424.0f, 456.0f)
                curveToRelative(0.0f, 30.928f, 25.072f, 56.0f, 56.0f, 56.0f)
                reflectiveCurveToRelative(56.0f, -25.072f, 56.0f, -56.0f)
                curveToRelative(0.0f, -22.172f, -12.888f, -41.332f, -31.579f, -50.405f)
                lineToRelative(5.517f, -24.276f)
                curveToRelative(3.413f, -15.018f, -8.002f, -29.319f, -23.403f, -29.319f)
                horizontalLineTo(218.117f)
                lineToRelative(-6.545f, -32.0f)
                horizontalLineToRelative(293.145f)
                curveToRelative(11.206f, 0.0f, 20.92f, -7.754f, 23.403f, -18.681f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
