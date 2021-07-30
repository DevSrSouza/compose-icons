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

public val SimpleIcons.Staffbase: ImageVector
    get() {
        if (_staffbase != null) {
            return _staffbase!!
        }
        _staffbase = Builder(name = "Staffbase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.847f, 20.095f)
                arcToRelative(7.805f, 7.805f, 0.0f, false, true, -6.286f, -3.238f)
                lineToRelative(1.714f, -1.238f)
                curveTo(8.323f, 17.048f, 10.037f, 18.0f, 11.847f, 18.0f)
                reflectiveCurveToRelative(3.523f, -0.857f, 4.571f, -2.381f)
                lineToRelative(1.714f, 1.238f)
                arcToRelative(7.805f, 7.805f, 0.0f, false, true, -6.285f, 3.238f)
                close()
                moveTo(12.037f, 2.095f)
                curveToRelative(1.62f, 0.0f, 3.238f, 0.476f, 4.762f, 1.334f)
                lineToRelative(1.048f, 0.476f)
                lineToRelative(2.857f, -0.572f)
                lineToRelative(-0.477f, 2.857f)
                curveToRelative(2.381f, 3.715f, 2.191f, 9.239f, -1.047f, 12.667f)
                arcToRelative(9.748f, 9.748f, 0.0f, false, true, -7.048f, 3.048f)
                arcToRelative(9.98f, 9.98f, 0.0f, false, true, -6.857f, -2.762f)
                curveToRelative(-3.905f, -3.81f, -4.0f, -10.0f, -0.286f, -13.905f)
                curveToRelative(1.905f, -2.095f, 4.477f, -3.143f, 7.048f, -3.143f)
                moveToRelative(0.0f, -2.095f)
                curveTo(8.799f, 0.0f, 5.751f, 1.333f, 3.466f, 3.714f)
                curveToRelative(-4.572f, 4.762f, -4.477f, 12.381f, 0.285f, 16.953f)
                arcTo(11.91f, 11.91f, 0.0f, false, false, 12.037f, 24.0f)
                curveToRelative(3.238f, 0.0f, 6.381f, -1.333f, 8.571f, -3.619f)
                curveToRelative(3.62f, -3.714f, 4.286f, -9.81f, 1.81f, -14.571f)
                lineToRelative(0.38f, -2.096f)
                lineToRelative(0.477f, -2.952f)
                lineToRelative(-2.952f, 0.571f)
                lineToRelative(-2.19f, 0.381f)
                lineToRelative(-0.382f, -0.19f)
                curveTo(15.941f, 0.476f, 14.037f, 0.0f, 12.037f, 0.0f)
                close()
            }
        }
        .build()
        return _staffbase!!
    }

private var _staffbase: ImageVector? = null
