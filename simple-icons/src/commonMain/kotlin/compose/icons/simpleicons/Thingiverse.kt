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

public val SimpleIcons.Thingiverse: ImageVector
    get() {
        if (_thingiverse != null) {
            return _thingiverse!!
        }
        _thingiverse = Builder(name = "Thingiverse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.955f, 0.005f)
                curveTo(5.425f, -0.152f, -0.091f, 5.485f, 0.007f, 11.805f)
                curveToRelative(-0.235f, 6.756f, 5.537f, 12.25f, 12.052f, 12.196f)
                curveTo(18.621f, 23.9f, 23.912f, 18.595f, 24.0f, 12.03f)
                curveTo(24.031f, 5.483f, 18.505f, -0.18f, 11.955f, 0.005f)
                close()
                moveTo(11.908f, 1.706f)
                arcToRelative(10.276f, 10.276f, 0.0f, false, true, 7.36f, 17.529f)
                arcToRelative(10.275f, 10.275f, 0.0f, false, true, -17.556f, -7.287f)
                curveTo(1.71f, 6.308f, 6.268f, 1.728f, 11.907f, 1.706f)
                close()
                moveTo(6.358f, 6.487f)
                curveToRelative(-0.322f, 0.0f, -0.358f, 0.033f, -0.358f, 0.361f)
                verticalLineToRelative(2.248f)
                curveToRelative(0.0f, 0.351f, 0.04f, 0.391f, 0.398f, 0.391f)
                horizontalLineToRelative(3.823f)
                curveToRelative(0.274f, 0.0f, 0.274f, 0.004f, 0.274f, 0.265f)
                verticalLineToRelative(9.736f)
                arcToRelative(0.176f, 0.176f, 0.0f, false, false, 0.051f, 0.146f)
                curveToRelative(0.04f, 0.038f, 0.093f, 0.059f, 0.148f, 0.053f)
                horizontalLineToRelative(2.555f)
                curveToRelative(0.247f, -0.003f, 0.283f, -0.035f, 0.283f, -0.28f)
                verticalLineToRelative(-9.32f)
                curveToRelative(0.0f, -0.124f, 0.004f, -0.239f, 0.0f, -0.39f)
                reflectiveCurveToRelative(0.055f, -0.21f, 0.218f, -0.21f)
                horizontalLineToRelative(3.9f)
                curveToRelative(0.319f, 0.004f, 0.35f, -0.032f, 0.35f, -0.344f)
                lineTo(18.0f, 6.855f)
                curveToRelative(0.0f, -0.34f, -0.024f, -0.363f, -0.37f, -0.363f)
                horizontalLineToRelative(-5.626f)
                close()
            }
        }
        .build()
        return _thingiverse!!
    }

private var _thingiverse: ImageVector? = null
