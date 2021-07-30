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

public val SimpleIcons.Uplabs: ImageVector
    get() {
        if (_uplabs != null) {
            return _uplabs!!
        }
        _uplabs = Builder(name = "Uplabs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.804f, 19.205f)
                curveToRelative(-0.112f, -0.111f, -0.186f, -0.26f, -0.297f, -0.372f)
                curveToRelative(-0.889f, -0.894f, -2.259f, -1.34f, -4.11f, -1.34f)
                curveToRelative(-1.816f, 0.0f, -3.186f, 0.446f, -4.075f, 1.34f)
                curveToRelative(-0.111f, 0.112f, -0.185f, 0.223f, -0.296f, 0.372f)
                close()
                moveTo(12.684f, 19.161f)
                lineTo(12.684f, 5.164f)
                horizontalLineToRelative(2.959f)
                lineTo(15.643f, 6.9f)
                curveToRelative(0.406f, -0.702f, 0.887f, -1.219f, 1.479f, -1.588f)
                arcToRelative(4.057f, 4.057f, 0.0f, false, true, 2.034f, -0.517f)
                curveToRelative(1.516f, 0.0f, 2.7f, 0.517f, 3.55f, 1.514f)
                curveToRelative(0.85f, 0.997f, 1.294f, 2.4f, 1.294f, 4.173f)
                curveToRelative(0.0f, 1.736f, -0.444f, 3.102f, -1.294f, 4.136f)
                curveToRelative(-0.85f, 1.034f, -1.997f, 1.551f, -3.402f, 1.551f)
                curveToRelative(-0.851f, 0.0f, -1.554f, -0.147f, -2.145f, -0.48f)
                curveToRelative(-0.592f, -0.295f, -1.11f, -0.812f, -1.516f, -1.477f)
                curveToRelative(0.037f, 0.259f, 0.073f, 0.554f, 0.073f, 0.886f)
                curveToRelative(0.0f, 0.296f, 0.037f, 0.665f, 0.037f, 1.071f)
                verticalLineToRelative(2.955f)
                horizontalLineToRelative(-3.069f)
                close()
                moveTo(15.494f, 10.482f)
                curveToRelative(0.0f, 0.96f, 0.222f, 1.699f, 0.703f, 2.253f)
                curveToRelative(0.481f, 0.517f, 1.147f, 0.812f, 1.96f, 0.812f)
                curveToRelative(0.85f, 0.0f, 1.516f, -0.258f, 1.96f, -0.812f)
                curveToRelative(0.48f, -0.517f, 0.703f, -1.293f, 0.703f, -2.253f)
                curveToRelative(0.0f, -0.96f, -0.222f, -1.699f, -0.703f, -2.253f)
                curveToRelative(-0.48f, -0.554f, -1.146f, -0.812f, -1.997f, -0.812f)
                curveToRelative(-0.813f, 0.0f, -1.479f, 0.295f, -1.96f, 0.85f)
                curveToRelative(-0.444f, 0.48f, -0.665f, 1.255f, -0.665f, 2.215f)
                close()
                moveTo(7.73f, 5.201f)
                verticalLineToRelative(5.577f)
                curveToRelative(0.0f, 0.923f, -0.185f, 1.588f, -0.555f, 1.994f)
                curveToRelative(-0.37f, 0.406f, -0.961f, 0.628f, -1.775f, 0.628f)
                curveToRelative(-0.813f, 0.0f, -1.405f, -0.185f, -1.775f, -0.591f)
                curveToRelative(-0.37f, -0.407f, -0.555f, -1.071f, -0.555f, -2.031f)
                lineTo(3.07f, 5.2f)
                lineTo(0.0f, 5.2f)
                verticalLineToRelative(5.577f)
                curveToRelative(0.0f, 1.661f, 0.333f, 2.88f, 0.998f, 3.767f)
                curveToRelative(0.111f, 0.11f, 0.185f, 0.258f, 0.296f, 0.369f)
                curveToRelative(0.888f, 0.886f, 2.256f, 1.33f, 4.105f, 1.33f)
                curveToRelative(1.812f, 0.0f, 3.18f, -0.444f, 4.068f, -1.33f)
                curveToRelative(0.11f, -0.111f, 0.185f, -0.222f, 0.296f, -0.37f)
                curveToRelative(0.665f, -0.886f, 0.998f, -2.142f, 0.998f, -3.766f)
                lineTo(10.761f, 5.2f)
                close()
            }
        }
        .build()
        return _uplabs!!
    }

private var _uplabs: ImageVector? = null
