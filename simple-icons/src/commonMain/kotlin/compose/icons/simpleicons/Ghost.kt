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

public val SimpleIcons.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.256f, 2.313f)
                curveToRelative(2.47f, 0.005f, 5.116f, 2.008f, 5.898f, 2.962f)
                lineToRelative(0.244f, 0.3f)
                curveToRelative(1.64f, 1.994f, 3.569f, 4.34f, 3.569f, 6.966f)
                curveToRelative(0.0f, 3.719f, -2.98f, 5.808f, -6.158f, 7.508f)
                curveToRelative(-1.433f, 0.766f, -2.98f, 1.508f, -4.748f, 1.508f)
                curveToRelative(-4.543f, 0.0f, -8.366f, -3.569f, -8.366f, -8.112f)
                curveToRelative(0.0f, -0.706f, 0.17f, -1.425f, 0.342f, -2.15f)
                curveToRelative(0.122f, -0.515f, 0.244f, -1.033f, 0.307f, -1.549f)
                curveToRelative(0.548f, -4.539f, 2.967f, -6.795f, 8.422f, -7.408f)
                arcToRelative(4.29f, 4.29f, 0.0f, false, true, 0.49f, -0.026f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
