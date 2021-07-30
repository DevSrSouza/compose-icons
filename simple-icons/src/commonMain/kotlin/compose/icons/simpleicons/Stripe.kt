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

public val SimpleIcons.Stripe: ImageVector
    get() {
        if (_stripe != null) {
            return _stripe!!
        }
        _stripe = Builder(name = "Stripe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.976f, 9.15f)
                curveToRelative(-2.172f, -0.806f, -3.356f, -1.426f, -3.356f, -2.409f)
                curveToRelative(0.0f, -0.831f, 0.683f, -1.305f, 1.901f, -1.305f)
                curveToRelative(2.227f, 0.0f, 4.515f, 0.858f, 6.09f, 1.631f)
                lineToRelative(0.89f, -5.494f)
                curveTo(18.252f, 0.975f, 15.697f, 0.0f, 12.165f, 0.0f)
                curveTo(9.667f, 0.0f, 7.589f, 0.654f, 6.104f, 1.872f)
                curveTo(4.56f, 3.147f, 3.757f, 4.992f, 3.757f, 7.218f)
                curveToRelative(0.0f, 4.039f, 2.467f, 5.76f, 6.476f, 7.219f)
                curveToRelative(2.585f, 0.92f, 3.445f, 1.574f, 3.445f, 2.583f)
                curveToRelative(0.0f, 0.98f, -0.84f, 1.545f, -2.354f, 1.545f)
                curveToRelative(-1.875f, 0.0f, -4.965f, -0.921f, -6.99f, -2.109f)
                lineToRelative(-0.9f, 5.555f)
                curveTo(5.175f, 22.99f, 8.385f, 24.0f, 11.714f, 24.0f)
                curveToRelative(2.641f, 0.0f, 4.843f, -0.624f, 6.328f, -1.813f)
                curveToRelative(1.664f, -1.305f, 2.525f, -3.236f, 2.525f, -5.732f)
                curveToRelative(0.0f, -4.128f, -2.524f, -5.851f, -6.594f, -7.305f)
                horizontalLineToRelative(0.003f)
                close()
            }
        }
        .build()
        return _stripe!!
    }

private var _stripe: ImageVector? = null
