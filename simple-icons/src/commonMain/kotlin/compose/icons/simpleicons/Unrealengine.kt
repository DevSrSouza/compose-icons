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

public val SimpleIcons.Unrealengine: ImageVector
    get() {
        if (_unrealengine != null) {
            return _unrealengine!!
        }
        _unrealengine = Builder(name = "Unrealengine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 23.52f)
                arcTo(11.52f, 11.52f, 0.0f, true, true, 23.52f, 12.0f)
                arcTo(11.52f, 11.52f, 0.0f, false, true, 12.0f, 23.52f)
                close()
                moveTo(19.13f, 13.729f)
                curveToRelative(-0.206f, 0.997f, -1.126f, 3.557f, -4.06f, 4.942f)
                lineToRelative(-1.179f, -1.325f)
                lineToRelative(-1.988f, 2.0f)
                arcToRelative(7.338f, 7.338f, 0.0f, false, true, -5.804f, -2.978f)
                arcToRelative(2.859f, 2.859f, 0.0f, false, false, 0.65f, 0.123f)
                curveToRelative(0.326f, 0.006f, 0.678f, -0.114f, 0.678f, -0.66f)
                verticalLineToRelative(-5.394f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, -1.116f, -0.89f)
                curveToRelative(-0.92f, 0.212f, -1.656f, 2.509f, -1.656f, 2.509f)
                arcToRelative(7.304f, 7.304f, 0.0f, false, true, 2.528f, -5.597f)
                arcToRelative(7.408f, 7.408f, 0.0f, false, true, 3.73f, -1.721f)
                curveToRelative(-1.006f, 0.573f, -1.57f, 1.507f, -1.57f, 2.29f)
                curveToRelative(0.0f, 1.262f, 0.76f, 1.109f, 0.984f, 0.923f)
                verticalLineToRelative(7.28f)
                arcToRelative(1.157f, 1.157f, 0.0f, false, false, 0.148f, 0.256f)
                arcToRelative(1.075f, 1.075f, 0.0f, false, false, 0.88f, 0.445f)
                curveToRelative(0.76f, 0.0f, 1.747f, -0.868f, 1.747f, -0.868f)
                lineTo(13.102f, 9.172f)
                curveToRelative(0.0f, -0.6f, -0.452f, -1.324f, -0.905f, -1.572f)
                curveToRelative(0.0f, 0.0f, 0.838f, -0.149f, 1.484f, 0.346f)
                arcToRelative(5.537f, 5.537f, 0.0f, false, true, 0.387f, -0.425f)
                curveToRelative(1.508f, -1.48f, 2.929f, -1.902f, 4.112f, -2.112f)
                curveToRelative(0.0f, 0.0f, -2.151f, 1.69f, -2.151f, 3.96f)
                curveToRelative(0.0f, 1.687f, 0.043f, 5.801f, 0.043f, 5.801f)
                curveToRelative(0.799f, 0.771f, 1.986f, -0.342f, 3.059f, -1.441f)
                close()
            }
        }
        .build()
        return _unrealengine!!
    }

private var _unrealengine: ImageVector? = null
