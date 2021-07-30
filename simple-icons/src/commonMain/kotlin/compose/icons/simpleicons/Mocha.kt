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

public val SimpleIcons.Mocha: ImageVector
    get() {
        if (_mocha != null) {
            return _mocha!!
        }
        _mocha = Builder(name = "Mocha", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.325f, 0.0f)
                curveToRelative(-0.907f, 1.116f, -2.442f, 2.302f, -0.768f, 4.814f)
                curveToRelative(0.558f, 0.628f, 0.838f, 1.953f, 0.768f, 2.372f)
                curveToRelative(0.0f, 0.0f, 2.512f, -1.464f, 0.977f, -4.116f)
                curveToRelative(-0.907f, -1.395f, -1.326f, -2.582f, -0.977f, -3.07f)
                close()
                moveTo(10.535f, 2.582f)
                curveToRelative(-0.628f, 0.767f, -1.605f, 1.535f, -0.489f, 3.279f)
                curveToRelative(0.35f, 0.349f, 0.489f, 1.256f, 0.489f, 1.535f)
                curveToRelative(0.0f, 0.0f, 1.673f, -0.978f, 0.627f, -2.792f)
                curveToRelative(-0.628f, -0.907f, -0.906f, -1.743f, -0.627f, -2.022f)
                close()
                moveTo(5.441f, 8.582f)
                arcToRelative(0.699f, 0.699f, 0.0f, false, false, -0.697f, 0.698f)
                curveToRelative(0.0f, 2.372f, 0.349f, 10.535f, 3.837f, 14.512f)
                curveToRelative(0.14f, 0.139f, 0.28f, 0.208f, 0.489f, 0.208f)
                horizontalLineToRelative(5.86f)
                curveToRelative(0.21f, 0.0f, 0.35f, -0.069f, 0.489f, -0.208f)
                curveToRelative(3.488f, -3.908f, 3.837f, -12.07f, 3.837f, -14.512f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.698f, -0.699f)
                lineTo(12.0f, 8.581f)
                close()
                moveTo(7.464f, 10.745f)
                horizontalLineToRelative(9.21f)
                curveToRelative(0.349f, 0.0f, 0.697f, 0.278f, 0.697f, 0.697f)
                curveToRelative(0.0f, 1.953f, -0.348f, 7.465f, -2.72f, 10.326f)
                curveToRelative(-0.21f, 0.14f, -0.35f, 0.208f, -0.559f, 0.208f)
                lineTo(9.976f, 21.976f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, true, -0.488f, -0.208f)
                curveToRelative(-2.372f, -2.79f, -2.652f, -8.373f, -2.722f, -10.326f)
                curveToRelative(0.0f, -0.35f, 0.28f, -0.697f, 0.698f, -0.697f)
                close()
                moveTo(16.256f, 15.489f)
                reflectiveCurveToRelative(-0.071f, 0.627f, -1.745f, 1.255f)
                curveToRelative(-2.303f, 0.837f, -6.348f, 0.28f, -6.348f, 0.28f)
                curveToRelative(0.349f, 1.465f, 0.906f, 2.86f, 1.743f, 3.907f)
                curveToRelative(0.07f, 0.14f, 0.28f, 0.209f, 0.419f, 0.209f)
                horizontalLineToRelative(3.489f)
                curveToRelative(0.14f, 0.0f, 0.279f, -0.07f, 0.418f, -0.209f)
                curveToRelative(1.186f, -1.395f, 1.745f, -3.558f, 2.024f, -5.442f)
                close()
            }
        }
        .build()
        return _mocha!!
    }

private var _mocha: ImageVector? = null
