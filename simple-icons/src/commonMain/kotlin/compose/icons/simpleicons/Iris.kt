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

public val SimpleIcons.Iris: ImageVector
    get() {
        if (_iris != null) {
            return _iris!!
        }
        _iris = Builder(name = "Iris", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.691f, 11.281f)
                curveToRelative(-1.26f, -0.322f, -1.573f, -0.479f, -1.573f, -0.957f)
                verticalLineToRelative(-0.021f)
                curveToRelative(0.0f, -0.354f, 0.323f, -0.635f, 0.937f, -0.635f)
                curveToRelative(0.578f, 0.0f, 1.174f, 0.239f, 1.779f, 0.639f)
                lineToRelative(0.074f, 0.05f)
                curveToRelative(0.026f, 0.01f, 0.055f, 0.002f, 0.074f, -0.018f)
                lineToRelative(0.775f, -1.121f)
                arcToRelative(0.061f, 0.061f, 0.0f, false, false, -0.009f, -0.068f)
                curveToRelative(-0.023f, -0.015f, -0.044f, -0.034f, -0.068f, -0.05f)
                lineToRelative(-0.007f, -0.005f)
                curveToRelative(-0.716f, -0.541f, -1.584f, -0.843f, -2.592f, -0.843f)
                curveToRelative(-1.492f, 0.0f, -2.552f, 0.874f, -2.552f, 2.196f)
                verticalLineToRelative(0.021f)
                curveToRelative(0.0f, 1.448f, 0.949f, 1.854f, 2.416f, 2.228f)
                curveToRelative(1.22f, 0.313f, 1.468f, 0.521f, 1.468f, 0.927f)
                verticalLineToRelative(0.021f)
                curveToRelative(0.0f, 0.427f, -0.396f, 0.687f, -1.052f, 0.687f)
                curveToRelative(-0.797f, 0.0f, -1.461f, -0.315f, -2.092f, -0.817f)
                lineToRelative(-0.043f, -0.035f)
                arcToRelative(0.064f, 0.064f, 0.0f, false, false, -0.075f, 0.012f)
                lineToRelative(-0.881f, 1.049f)
                arcToRelative(0.069f, 0.069f, 0.0f, false, false, 0.0f, 0.073f)
                lineToRelative(0.068f, 0.059f)
                arcToRelative(4.645f, 4.645f, 0.0f, false, false, 2.986f, 1.075f)
                curveToRelative(1.572f, 0.0f, 2.676f, -0.813f, 2.676f, -2.259f)
                verticalLineToRelative(-0.018f)
                curveToRelative(0.005f, -1.273f, -0.828f, -1.805f, -2.309f, -2.19f)
                close()
                moveTo(5.765f, 8.42f)
                arcToRelative(0.069f, 0.069f, 0.0f, false, true, 0.068f, -0.065f)
                horizontalLineToRelative(1.475f)
                arcToRelative(0.068f, 0.068f, 0.0f, false, true, 0.064f, 0.068f)
                verticalLineToRelative(7.157f)
                arcToRelative(0.064f, 0.064f, 0.0f, false, true, -0.064f, 0.064f)
                lineTo(5.829f, 15.644f)
                arcToRelative(0.068f, 0.068f, 0.0f, false, true, -0.067f, -0.064f)
                lineToRelative(0.003f, -7.16f)
                close()
                moveTo(0.0f, 13.339f)
                curveToRelative(0.0f, -0.035f, 0.029f, -0.063f, 0.064f, -0.063f)
                horizontalLineToRelative(1.475f)
                arcToRelative(0.067f, 0.067f, 0.0f, false, true, 0.065f, 0.063f)
                verticalLineToRelative(2.241f)
                arcToRelative(0.068f, 0.068f, 0.0f, false, true, -0.065f, 0.064f)
                lineTo(0.064f, 15.644f)
                arcTo(0.064f, 0.064f, 0.0f, false, true, 0.0f, 15.58f)
                verticalLineToRelative(-2.241f)
                close()
                moveTo(15.836f, 8.42f)
                curveToRelative(0.0f, -0.035f, 0.029f, -0.064f, 0.064f, -0.064f)
                horizontalLineToRelative(1.476f)
                curveToRelative(0.034f, 0.0f, 0.063f, 0.029f, 0.063f, 0.064f)
                verticalLineToRelative(7.16f)
                arcToRelative(0.064f, 0.064f, 0.0f, false, true, -0.063f, 0.064f)
                lineTo(15.9f, 15.644f)
                arcToRelative(0.064f, 0.064f, 0.0f, false, true, -0.064f, -0.064f)
                lineTo(15.836f, 8.42f)
                close()
                moveTo(14.949f, 15.592f)
                lineTo(13.205f, 13.041f)
                curveToRelative(0.926f, -0.344f, 1.559f, -1.084f, 1.559f, -2.259f)
                verticalLineToRelative(-0.022f)
                curveToRelative(0.0f, -0.688f, -0.218f, -1.261f, -0.624f, -1.667f)
                curveToRelative(-0.478f, -0.477f, -1.193f, -0.737f, -2.123f, -0.737f)
                lineTo(8.749f, 8.356f)
                arcToRelative(0.064f, 0.064f, 0.0f, false, false, -0.063f, 0.064f)
                verticalLineToRelative(7.16f)
                curveToRelative(0.0f, 0.035f, 0.028f, 0.064f, 0.063f, 0.064f)
                horizontalLineToRelative(1.476f)
                arcToRelative(0.064f, 0.064f, 0.0f, false, false, 0.064f, -0.064f)
                verticalLineToRelative(-2.268f)
                horizontalLineToRelative(1.26f)
                lineToRelative(1.559f, 2.332f)
                horizontalLineToRelative(1.81f)
                curveToRelative(0.038f, 0.0f, 0.051f, -0.024f, 0.031f, -0.052f)
                close()
                moveTo(2.847f, 10.966f)
                arcToRelative(0.068f, 0.068f, 0.0f, false, true, 0.068f, -0.063f)
                horizontalLineToRelative(1.47f)
                arcToRelative(0.068f, 0.068f, 0.0f, false, true, 0.064f, 0.063f)
                verticalLineToRelative(4.61f)
                arcToRelative(0.064f, 0.064f, 0.0f, false, true, -0.064f, 0.063f)
                lineTo(2.909f, 15.639f)
                arcToRelative(0.07f, 0.07f, 0.0f, false, true, -0.068f, -0.063f)
                lineToRelative(0.006f, -4.61f)
                close()
                moveTo(10.295f, 11.896f)
                lineTo(10.303f, 9.803f)
                horizontalLineToRelative(1.578f)
                curveToRelative(0.782f, 0.0f, 1.26f, 0.354f, 1.26f, 1.041f)
                verticalLineToRelative(0.021f)
                curveToRelative(0.0f, 0.614f, -0.447f, 1.031f, -1.228f, 1.031f)
                horizontalLineToRelative(-1.618f)
                close()
            }
        }
        .build()
        return _iris!!
    }

private var _iris: ImageVector? = null
