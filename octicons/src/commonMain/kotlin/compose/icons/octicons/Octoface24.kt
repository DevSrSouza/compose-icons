package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Octoface24: ImageVector
    get() {
        if (_octoface24 != null) {
            return _octoface24!!
        }
        _octoface24 = Builder(name = "Octoface24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 11.0f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 2.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                curveTo(9.0f, 11.56f, 8.44f, 11.0f, 7.75f, 11.0f)
                close()
                moveTo(9.02f, 15.5f)
                arcToRelative(0.469f, 0.469f, 0.0f, false, true, 0.48f, -0.5f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, true, 0.48f, 0.5f)
                curveToRelative(-0.116f, 1.316f, -0.759f, 2.5f, -2.98f, 2.5f)
                reflectiveCurveToRelative(-2.864f, -1.184f, -2.98f, -2.5f)
                close()
                moveTo(16.25f, 11.0f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 2.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.255f, 3.82f)
                arcToRelative(1.725f, 1.725f, 0.0f, false, false, -2.141f, -1.195f)
                curveToRelative(-0.557f, 0.16f, -1.406f, 0.44f, -2.264f, 0.866f)
                curveToRelative(-0.78f, 0.386f, -1.647f, 0.93f, -2.293f, 1.677f)
                arcTo(18.442f, 18.442f, 0.0f, false, false, 12.0f, 5.0f)
                curveToRelative(-0.93f, 0.0f, -1.784f, 0.059f, -2.569f, 0.17f)
                curveToRelative(-0.645f, -0.74f, -1.505f, -1.28f, -2.28f, -1.664f)
                arcToRelative(13.876f, 13.876f, 0.0f, false, false, -2.265f, -0.866f)
                arcToRelative(1.725f, 1.725f, 0.0f, false, false, -2.141f, 1.196f)
                arcToRelative(23.645f, 23.645f, 0.0f, false, false, -0.69f, 3.292f)
                curveToRelative(-0.125f, 0.97f, -0.191f, 2.07f, -0.066f, 3.112f)
                curveTo(1.254f, 11.882f, 1.0f, 13.734f, 1.0f, 15.527f)
                curveTo(1.0f, 19.915f, 3.13f, 23.0f, 12.0f, 23.0f)
                curveToRelative(8.87f, 0.0f, 11.0f, -3.053f, 11.0f, -7.473f)
                curveToRelative(0.0f, -1.794f, -0.255f, -3.647f, -0.99f, -5.29f)
                curveToRelative(0.127f, -1.046f, 0.06f, -2.15f, -0.066f, -3.125f)
                arcToRelative(23.652f, 23.652f, 0.0f, false, false, -0.689f, -3.292f)
                close()
                moveTo(20.5f, 14.0f)
                curveToRelative(0.5f, 3.5f, -1.5f, 6.5f, -8.5f, 6.5f)
                reflectiveCurveToRelative(-9.0f, -3.0f, -8.5f, -6.5f)
                curveToRelative(0.583f, -4.0f, 3.0f, -6.0f, 8.5f, -6.0f)
                reflectiveCurveToRelative(7.928f, 2.0f, 8.5f, 6.0f)
                close()
            }
        }
        .build()
        return _octoface24!!
    }

private var _octoface24: ImageVector? = null
