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

public val SimpleIcons.Houdini: ImageVector
    get() {
        if (_houdini != null) {
            return _houdini!!
        }
        _houdini = Builder(name = "Houdini", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 19.635f)
                lineTo(0.0f, 24.0f)
                horizontalLineToRelative(3.824f)
                arcTo(8.662f, 8.662f, 0.0f, false, true, 0.0f, 19.635f)
                close()
                moveTo(16.042f, 15.08f)
                curveToRelative(0.0f, -4.037f, -3.253f, -7.92f, -8.111f, -8.089f)
                curveTo(4.483f, 6.873f, 1.801f, 8.136f, 0.0f, 10.005f)
                verticalLineToRelative(4.209f)
                curveToRelative(1.224f, -3.549f, 4.595f, -5.158f, 7.419f, -5.128f)
                curveToRelative(3.531f, 0.041f, 6.251f, 2.703f, 6.275f, 5.72f)
                curveToRelative(0.0f, 2.878f, -1.183f, 4.992f, -4.436f, 5.516f)
                curveToRelative(-1.774f, 0.296f, -4.548f, -0.754f, -4.436f, -3.434f)
                curveToRelative(0.065f, -1.381f, 1.138f, -2.162f, 2.366f, -2.106f)
                curveToRelative(-1.207f, 1.618f, 0.39f, 2.801f, 1.52f, 2.561f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, false, 1.966f, -2.502f)
                curveToRelative(0.0f, -1.017f, -0.958f, -2.662f, -3.333f, -2.6f)
                curveToRelative(-2.936f, 0.068f, -4.785f, 2.183f, -4.85f, 4.797f)
                curveToRelative(-0.071f, 3.28f, 3.007f, 5.457f, 6.174f, 5.483f)
                curveToRelative(4.633f, 0.059f, 7.395f, -2.984f, 7.377f, -7.441f)
                close()
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(6.906f)
                arcToRelative(12.855f, 12.855f, 0.0f, false, true, 7.931f, -2.609f)
                curveToRelative(6.801f, 0.0f, 11.134f, 4.762f, 11.131f, 10.765f)
                curveToRelative(0.0f, 4.17f, -1.946f, 7.308f, -4.995f, 8.938f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _houdini!!
    }

private var _houdini: ImageVector? = null
