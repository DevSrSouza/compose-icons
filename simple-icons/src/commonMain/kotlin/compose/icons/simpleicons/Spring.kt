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

public val SimpleIcons.Spring: ImageVector
    get() {
        if (_spring != null) {
            return _spring!!
        }
        _spring = Builder(name = "Spring", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.854f, 1.416f)
                arcToRelative(10.45f, 10.45f, 0.0f, false, true, -1.284f, 2.247f)
                arcTo(11.967f, 11.967f, 0.0f, true, false, 3.852f, 20.776f)
                lineToRelative(0.444f, 0.395f)
                arcToRelative(11.954f, 11.954f, 0.0f, false, false, 19.632f, -8.297f)
                curveToRelative(0.346f, -3.013f, -0.568f, -6.865f, -2.074f, -11.458f)
                close()
                moveTo(5.581f, 20.875f)
                arcToRelative(1.017f, 1.017f, 0.0f, true, true, -0.148f, -1.432f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, true, 0.148f, 1.432f)
                close()
                moveTo(21.78f, 17.294f)
                curveToRelative(-2.938f, 3.926f, -9.26f, 2.593f, -13.285f, 2.79f)
                curveToRelative(0.0f, 0.0f, -0.716f, 0.049f, -1.432f, 0.148f)
                curveToRelative(0.0f, 0.0f, 0.272f, -0.123f, 0.617f, -0.247f)
                curveToRelative(2.84f, -0.988f, 4.173f, -1.185f, 5.902f, -2.074f)
                curveToRelative(3.235f, -1.655f, 6.47f, -5.284f, 7.112f, -9.038f)
                curveToRelative(-1.235f, 3.605f, -4.988f, 6.717f, -8.396f, 7.976f)
                curveToRelative(-2.346f, 0.864f, -6.569f, 1.704f, -6.569f, 1.704f)
                lineToRelative(-0.173f, -0.099f)
                curveToRelative(-2.865f, -1.408f, -2.963f, -7.63f, 2.272f, -9.631f)
                curveToRelative(2.297f, -0.889f, 4.47f, -0.395f, 6.964f, -0.988f)
                curveToRelative(2.642f, -0.617f, 5.704f, -2.593f, 6.939f, -5.186f)
                curveToRelative(1.383f, 4.173f, 3.062f, 10.643f, 0.049f, 14.643f)
                close()
            }
        }
        .build()
        return _spring!!
    }

private var _spring: ImageVector? = null
