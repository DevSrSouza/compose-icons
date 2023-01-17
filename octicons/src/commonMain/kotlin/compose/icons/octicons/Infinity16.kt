package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Infinity16: ImageVector
    get() {
        if (_infinity16 != null) {
            return _infinity16!!
        }
        _infinity16 = Builder(name = "Infinity16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 6.984f)
                curveToRelative(0.59f, -0.533f, 1.204f, -1.066f, 1.825f, -1.493f)
                curveToRelative(0.797f, -0.548f, 1.7f, -0.991f, 2.675f, -0.991f)
                curveTo(14.414f, 4.5f, 16.0f, 6.086f, 16.0f, 8.0f)
                reflectiveCurveToRelative(-1.586f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-0.975f, 0.0f, -1.878f, -0.444f, -2.675f, -0.991f)
                curveToRelative(-0.621f, -0.427f, -1.235f, -0.96f, -1.825f, -1.493f)
                curveToRelative(-0.59f, 0.533f, -1.204f, 1.066f, -1.825f, 1.493f)
                curveToRelative(-0.797f, 0.547f, -1.7f, 0.991f, -2.675f, 0.991f)
                curveTo(1.586f, 11.5f, 0.0f, 9.914f, 0.0f, 8.0f)
                reflectiveCurveToRelative(1.586f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0.975f, 0.0f, 1.878f, 0.443f, 2.675f, 0.991f)
                curveToRelative(0.621f, 0.427f, 1.235f, 0.96f, 1.825f, 1.493f)
                close()
                moveTo(9.114f, 8.0f)
                curveToRelative(0.536f, 0.483f, 1.052f, 0.922f, 1.56f, 1.273f)
                curveToRelative(0.704f, 0.483f, 1.3f, 0.727f, 1.826f, 0.727f)
                curveToRelative(1.086f, 0.0f, 2.0f, -0.914f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.086f, -0.914f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.525f, 0.0f, -1.122f, 0.244f, -1.825f, 0.727f)
                curveToRelative(-0.51f, 0.35f, -1.025f, 0.79f, -1.561f, 1.273f)
                close()
                moveTo(3.5f, 6.0f)
                curveToRelative(-1.086f, 0.0f, -2.0f, 0.914f, -2.0f, 2.0f)
                curveToRelative(0.0f, 1.086f, 0.914f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.525f, 0.0f, 1.122f, -0.244f, 1.825f, -0.727f)
                curveToRelative(0.51f, -0.35f, 1.025f, -0.79f, 1.561f, -1.273f)
                curveToRelative(-0.536f, -0.483f, -1.052f, -0.922f, -1.56f, -1.273f)
                curveTo(4.621f, 6.244f, 4.025f, 6.0f, 3.5f, 6.0f)
                close()
            }
        }
        .build()
        return _infinity16!!
    }

private var _infinity16: ImageVector? = null
