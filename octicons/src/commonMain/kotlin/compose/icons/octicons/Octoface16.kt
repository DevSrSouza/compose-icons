package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Octoface16: ImageVector
    get() {
        if (_octoface16 != null) {
            return _octoface16!!
        }
        _octoface16 = Builder(name = "Octoface16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.326f, 1.973f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 1.49f, -0.832f)
                curveToRelative(0.387f, 0.112f, 0.977f, 0.307f, 1.575f, 0.602f)
                curveToRelative(0.586f, 0.291f, 1.243f, 0.71f, 1.7f, 1.296f)
                curveToRelative(0.022f, 0.027f, 0.042f, 0.056f, 0.061f, 0.084f)
                arcTo(13.22f, 13.22f, 0.0f, false, true, 8.0f, 3.0f)
                curveToRelative(0.67f, 0.0f, 1.289f, 0.037f, 1.861f, 0.108f)
                lineToRelative(0.051f, -0.07f)
                curveToRelative(0.457f, -0.586f, 1.114f, -1.004f, 1.7f, -1.295f)
                arcToRelative(9.654f, 9.654f, 0.0f, false, true, 1.576f, -0.602f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 1.49f, 0.832f)
                curveToRelative(0.14f, 0.493f, 0.356f, 1.347f, 0.479f, 2.29f)
                curveToRelative(0.079f, 0.604f, 0.123f, 1.28f, 0.07f, 1.936f)
                curveToRelative(0.541f, 0.977f, 0.773f, 2.11f, 0.773f, 3.301f)
                curveTo(16.0f, 13.0f, 14.5f, 15.0f, 8.0f, 15.0f)
                reflectiveCurveToRelative(-8.0f, -2.0f, -8.0f, -5.5f)
                curveToRelative(0.0f, -1.034f, 0.238f, -2.128f, 0.795f, -3.117f)
                curveToRelative(-0.08f, -0.712f, -0.034f, -1.46f, 0.052f, -2.12f)
                curveToRelative(0.122f, -0.943f, 0.34f, -1.797f, 0.479f, -2.29f)
                close()
                moveTo(8.0f, 13.065f)
                curveToRelative(6.0f, 0.0f, 6.5f, -2.0f, 6.0f, -4.27f)
                curveTo(13.363f, 5.905f, 11.25f, 5.0f, 8.0f, 5.0f)
                reflectiveCurveToRelative(-5.363f, 0.904f, -6.0f, 3.796f)
                curveToRelative(-0.5f, 2.27f, 0.0f, 4.27f, 6.0f, 4.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(4.0f, 8.0f)
                close()
                moveTo(6.078f, 10.492f)
                curveToRelative(-0.083f, -0.264f, 0.146f, -0.492f, 0.422f, -0.492f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.505f, 0.228f, 0.422f, 0.492f)
                curveTo(9.67f, 11.304f, 8.834f, 12.0f, 8.0f, 12.0f)
                curveToRelative(-0.834f, 0.0f, -1.669f, -0.696f, -1.922f, -1.508f)
                close()
                moveTo(10.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(10.0f, 8.0f)
                close()
            }
        }
        .build()
        return _octoface16!!
    }

private var _octoface16: ImageVector? = null
