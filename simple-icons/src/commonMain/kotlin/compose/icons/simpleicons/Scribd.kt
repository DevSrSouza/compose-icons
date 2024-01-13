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
                moveTo(11.635f, 0.0f)
                curveTo(6.633f, 0.0f, 3.139f, 3.067f, 3.139f, 7.459f)
                verticalLineToRelative(0.06f)
                curveToRelative(0.008f, 0.085f, 0.004f, 0.169f, 0.004f, 0.254f)
                curveToRelative(0.0f, 1.725f, 0.438f, 3.09f, 1.253f, 4.057f)
                curveToRelative(0.815f, 0.967f, 1.885f, 1.451f, 3.21f, 1.451f)
                curveToRelative(1.108f, 0.0f, 1.98f, -0.336f, 2.617f, -1.008f)
                arcToRelative(3.384f, 3.384f, 0.0f, false, false, 0.955f, -2.412f)
                curveToRelative(0.0f, -0.96f, -0.308f, -1.715f, -0.926f, -2.263f)
                curveToRelative(-0.618f, -0.549f, -1.278f, -0.823f, -1.979f, -0.823f)
                arcToRelative(4.47f, 4.47f, 0.0f, false, false, -0.859f, 0.112f)
                curveToRelative(-0.344f, 0.086f, -0.573f, 0.129f, -0.687f, 0.129f)
                curveToRelative(-0.51f, 0.0f, -0.764f, -0.308f, -0.764f, -0.924f)
                curveToRelative(0.0f, -1.035f, 0.516f, -1.925f, 1.547f, -2.67f)
                curveToRelative(0.302f, -0.218f, 0.612f, -0.406f, 0.927f, -0.568f)
                curveToRelative(0.907f, -0.411f, 1.988f, -0.637f, 3.198f, -0.637f)
                curveToRelative(2.33f, 0.0f, 4.423f, 0.61f, 6.238f, 1.816f)
                lineToRelative(-1.004f, 1.602f)
                lineToRelative(1.893f, 1.248f)
                lineToRelative(2.205f, -3.303f)
                lineToRelative(-0.799f, -0.644f)
                curveTo(17.75f, 0.987f, 14.878f, 0.0f, 11.635f, 0.0f)
                close()
                moveTo(17.318f, 10.682f)
                curveToRelative(-1.108f, 0.0f, -1.98f, 0.336f, -2.617f, 1.007f)
                arcToRelative(3.384f, 3.384f, 0.0f, false, false, -0.955f, 2.413f)
                curveToRelative(0.0f, 0.96f, 0.31f, 1.715f, 0.928f, 2.263f)
                curveToRelative(0.617f, 0.548f, 1.276f, 0.823f, 1.976f, 0.823f)
                curveToRelative(0.217f, 0.0f, 0.503f, -0.038f, 0.86f, -0.112f)
                curveToRelative(0.344f, -0.086f, 0.572f, -0.129f, 0.687f, -0.129f)
                curveToRelative(0.51f, 0.0f, 0.764f, 0.308f, 0.764f, 0.924f)
                curveToRelative(0.0f, 0.222f, -0.025f, 0.436f, -0.072f, 0.645f)
                curveToRelative(-0.849f, 2.079f, -3.022f, 3.267f, -6.166f, 3.267f)
                curveToRelative(-2.671f, 0.0f, -5.233f, -0.848f, -7.319f, -2.408f)
                lineToRelative(1.233f, -1.52f)
                lineToRelative(-1.785f, -1.39f)
                lineTo(2.25f, 19.63f)
                lineToRelative(0.783f, 0.703f)
                curveTo(5.673f, 22.698f, 9.114f, 24.0f, 12.723f, 24.0f)
                curveToRelative(0.402f, 0.0f, 0.791f, -0.018f, 1.172f, -0.05f)
                curveToRelative(2.077f, -0.094f, 4.15f, -0.87f, 5.61f, -2.188f)
                curveToRelative(1.497f, -1.35f, 2.245f, -3.215f, 2.245f, -5.592f)
                curveToRelative(0.0f, -1.725f, -0.407f, -3.07f, -1.223f, -4.037f)
                curveToRelative(-0.814f, -0.968f, -1.884f, -1.451f, -3.209f, -1.451f)
                close()
            }
        }
        .build()
        return _scribd!!
    }

private var _scribd: ImageVector? = null
