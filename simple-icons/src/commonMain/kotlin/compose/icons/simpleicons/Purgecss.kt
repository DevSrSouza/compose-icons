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

public val SimpleIcons.Purgecss: ImageVector
    get() {
        if (_purgecss != null) {
            return _purgecss!!
        }
        _purgecss = Builder(name = "Purgecss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.764f, 11.791f)
                curveToRelative(0.048f, -1.003f, 0.052f, -2.55f, 0.047f, -9.967f)
                curveToRelative(0.0f, -5.484f, 0.003f, -9.995f, 0.013f, -10.023f)
                curveToRelative(0.028f, -0.08f, 2.26f, -0.042f, 2.678f, 0.047f)
                arcToRelative(4.903f, 4.903f, 0.0f, false, true, 3.078f, 2.08f)
                arcToRelative(4.834f, 4.834f, 0.0f, false, true, -0.7f, 6.164f)
                curveToRelative(-0.924f, 0.878f, -2.041f, 1.334f, -3.29f, 1.334f)
                curveToRelative(-0.225f, 0.0f, -0.29f, 0.012f, -0.305f, 0.068f)
                curveToRelative(-0.01f, 0.043f, -0.02f, 2.418f, -0.014f, 5.287f)
                verticalLineToRelative(5.196f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 24.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.309f, 4.31f)
                curveToRelative(-0.013f, 0.004f, -0.017f, 0.023f, -0.02f, 0.063f)
                curveToRelative(-0.018f, 0.245f, -0.023f, 8.358f, -0.004f, 8.39f)
                curveToRelative(0.01f, 0.02f, 0.075f, -0.014f, 0.145f, -0.07f)
                curveToRelative(2.673f, -1.952f, 3.467f, -2.792f, 3.738f, -3.939f)
                curveToRelative(0.14f, -0.746f, -0.174f, -1.466f, -1.01f, -2.3f)
                curveToRelative(-0.699f, -0.72f, -1.692f, -1.358f, -2.779f, -2.099f)
                curveToRelative(-0.038f, -0.033f, -0.058f, -0.047f, -0.07f, -0.044f)
                close()
            }
        }
        .build()
        return _purgecss!!
    }

private var _purgecss: ImageVector? = null
