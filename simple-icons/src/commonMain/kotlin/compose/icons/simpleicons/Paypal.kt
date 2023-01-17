package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Paypal: ImageVector
    get() {
        if (_paypal != null) {
            return _paypal!!
        }
        _paypal = Builder(name = "Paypal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.076f, 21.337f)
                lineTo(2.47f, 21.337f)
                arcToRelative(0.641f, 0.641f, 0.0f, false, true, -0.633f, -0.74f)
                lineTo(4.944f, 0.901f)
                curveTo(5.026f, 0.382f, 5.474f, 0.0f, 5.998f, 0.0f)
                horizontalLineToRelative(7.46f)
                curveToRelative(2.57f, 0.0f, 4.578f, 0.543f, 5.69f, 1.81f)
                curveToRelative(1.01f, 1.15f, 1.304f, 2.42f, 1.012f, 4.287f)
                curveToRelative(-0.023f, 0.143f, -0.047f, 0.288f, -0.077f, 0.437f)
                curveToRelative(-0.983f, 5.05f, -4.349f, 6.797f, -8.647f, 6.797f)
                horizontalLineToRelative(-2.19f)
                curveToRelative(-0.524f, 0.0f, -0.968f, 0.382f, -1.05f, 0.9f)
                lineToRelative(-1.12f, 7.106f)
                close()
                moveTo(21.222f, 6.917f)
                arcToRelative(3.35f, 3.35f, 0.0f, false, false, -0.607f, -0.541f)
                curveToRelative(-0.013f, 0.076f, -0.026f, 0.175f, -0.041f, 0.254f)
                curveToRelative(-0.93f, 4.778f, -4.005f, 7.201f, -9.138f, 7.201f)
                horizontalLineToRelative(-2.19f)
                arcToRelative(0.563f, 0.563f, 0.0f, false, false, -0.556f, 0.479f)
                lineToRelative(-1.187f, 7.527f)
                horizontalLineToRelative(-0.506f)
                lineToRelative(-0.24f, 1.516f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.554f, 0.647f)
                horizontalLineToRelative(3.882f)
                curveToRelative(0.46f, 0.0f, 0.85f, -0.334f, 0.922f, -0.788f)
                curveToRelative(0.06f, -0.26f, 0.76f, -4.852f, 0.816f, -5.09f)
                arcToRelative(0.932f, 0.932f, 0.0f, false, true, 0.923f, -0.788f)
                horizontalLineToRelative(0.58f)
                curveToRelative(3.76f, 0.0f, 6.705f, -1.528f, 7.565f, -5.946f)
                curveToRelative(0.36f, -1.847f, 0.174f, -3.388f, -0.777f, -4.471f)
                close()
            }
        }
        .build()
        return _paypal!!
    }

private var _paypal: ImageVector? = null
