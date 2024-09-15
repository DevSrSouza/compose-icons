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
                moveTo(528.12f, 301.32f)
                lineToRelative(47.27f, -208.0f)
                curveTo(578.81f, 78.3f, 567.39f, 64.0f, 551.99f, 64.0f)
                horizontalLineTo(159.21f)
                lineToRelative(-9.17f, -44.81f)
                curveTo(147.76f, 8.02f, 137.93f, 0.0f, 126.53f, 0.0f)
                horizontalLineTo(24.0f)
                curveTo(10.74f, 0.0f, 0.0f, 10.74f, 0.0f, 24.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(69.88f)
                lineToRelative(70.25f, 343.43f)
                curveTo(147.32f, 417.1f, 136.0f, 435.22f, 136.0f, 456.0f)
                curveToRelative(0.0f, 30.93f, 25.07f, 56.0f, 56.0f, 56.0f)
                reflectiveCurveToRelative(56.0f, -25.07f, 56.0f, -56.0f)
                curveToRelative(0.0f, -15.67f, -6.45f, -29.83f, -16.82f, -40.0f)
                horizontalLineToRelative(209.65f)
                curveTo(430.45f, 426.17f, 424.0f, 440.33f, 424.0f, 456.0f)
                curveToRelative(0.0f, 30.93f, 25.07f, 56.0f, 56.0f, 56.0f)
                reflectiveCurveToRelative(56.0f, -25.07f, 56.0f, -56.0f)
                curveToRelative(0.0f, -22.17f, -12.89f, -41.33f, -31.58f, -50.4f)
                lineToRelative(5.52f, -24.28f)
                curveToRelative(3.41f, -15.02f, -8.0f, -29.32f, -23.4f, -29.32f)
                horizontalLineTo(218.12f)
                lineToRelative(-6.55f, -32.0f)
                horizontalLineToRelative(293.14f)
                curveToRelative(11.21f, 0.0f, 20.92f, -7.75f, 23.4f, -18.68f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
