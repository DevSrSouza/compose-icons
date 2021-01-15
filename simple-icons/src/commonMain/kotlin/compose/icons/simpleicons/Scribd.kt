package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Scribd: ImageVector
    get() {
        if (_scribd != null) {
            return _scribd!!
        }
        _scribd = Builder(name = "Scribd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.839f, 21.059f)
                curveToRelative(0.0f, -2.123f, 1.572f, -3.939f, 3.543f, -4.307f)
                curveToRelative(-0.094f, -1.973f, -0.924f, -3.328f, -2.219f, -4.343f)
                curveToRelative(-1.305f, -1.016f, -3.121f, -1.785f, -5.088f, -2.557f)
                curveToRelative(-2.13f, -0.832f, -3.721f, -1.569f, -3.721f, -3.172f)
                curveToRelative(0.0f, -1.352f, 1.17f, -2.369f, 3.137f, -2.369f)
                curveToRelative(1.201f, 0.0f, 1.974f, 0.185f, 2.371f, 0.399f)
                curveToRelative(0.0f, 0.093f, -0.029f, 0.216f, -0.09f, 0.309f)
                curveToRelative(-0.061f, 0.123f, -0.09f, 0.276f, -0.09f, 0.493f)
                curveToRelative(0.0f, 1.354f, 0.983f, 2.555f, 2.738f, 2.555f)
                curveToRelative(1.602f, 0.0f, 2.555f, -1.201f, 2.555f, -2.957f)
                curveToRelative(0.0f, -1.477f, -0.832f, -2.77f, -2.188f, -3.663f)
                curveTo(14.409f, 0.555f, 12.487f, 0.0f, 10.312f, 0.0f)
                curveTo(8.06f, 0.155f, 6.123f, 0.985f, 4.77f, 2.217f)
                curveTo(3.415f, 3.447f, 2.615f, 5.111f, 2.615f, 7.08f)
                curveToRelative(0.0f, 2.187f, 0.77f, 3.603f, 2.031f, 4.683f)
                curveToRelative(1.262f, 1.077f, 3.078f, 1.846f, 5.265f, 2.616f)
                curveToRelative(2.372f, 0.764f, 3.757f, 1.561f, 3.757f, 3.137f)
                curveToRelative(0.0f, 1.59f, -1.385f, 2.551f, -3.572f, 2.551f)
                curveToRelative(-1.141f, 0.0f, -2.124f, -0.193f, -2.957f, -0.764f)
                curveToRelative(0.219f, -0.406f, 0.219f, -0.813f, 0.219f, -1.201f)
                curveToRelative(0.0f, -1.143f, -1.006f, -2.568f, -2.764f, -2.568f)
                curveToRelative(-1.56f, 0.0f, -2.73f, 1.201f, -2.73f, 2.957f)
                curveToRelative(0.0f, 1.471f, 0.93f, 2.867f, 2.445f, 3.844f)
                curveTo(5.794f, 23.354f, 7.88f, 24.0f, 10.132f, 24.0f)
                curveToRelative(1.982f, 0.0f, 3.768f, -0.375f, 5.148f, -1.365f)
                curveToRelative(-0.21f, -0.406f, -0.39f, -0.992f, -0.39f, -1.607f)
                lineToRelative(-0.051f, 0.031f)
                close()
                moveTo(22.138f, 21.059f)
                curveToRelative(0.0f, 1.572f, -1.275f, 2.773f, -2.777f, 2.773f)
                curveToRelative(-1.5f, 0.0f, -2.746f, -1.201f, -2.746f, -2.771f)
                curveToRelative(0.0f, -1.5f, 1.23f, -2.732f, 2.73f, -2.732f)
                curveToRelative(1.502f, 0.0f, 2.764f, 1.232f, 2.764f, 2.748f)
                lineToRelative(0.029f, -0.018f)
                close()
            }
        }
        .build()
        return _scribd!!
    }

private var _scribd: ImageVector? = null
