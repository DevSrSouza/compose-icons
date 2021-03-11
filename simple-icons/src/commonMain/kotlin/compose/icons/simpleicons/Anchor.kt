package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.214f, 8.166f)
                reflectiveCurveTo(22.209f, 7.69f, 21.164f, 8.0f)
                curveToRelative(-0.782f, 0.23f, -1.638f, 0.824f, -2.125f, 2.055f)
                curveToRelative(-0.939f, 2.363f, -0.126f, 6.484f, -0.444f, 6.484f)
                reflectiveCurveToRelative(-1.319f, -3.797f, -2.658f, -7.752f)
                curveToRelative(-1.34f, -3.954f, -2.497f, -8.061f, -4.588f, -7.73f)
                curveToRelative(-1.854f, 0.293f, -1.279f, 4.976f, -0.553f, 9.362f)
                curveToRelative(0.658f, 3.976f, 1.419f, 7.698f, 0.984f, 7.698f)
                curveToRelative(-0.777f, 0.001f, -3.326f, -10.988f, -5.939f, -10.57f)
                curveToRelative(-2.613f, 0.416f, 0.753f, 12.525f, 0.046f, 12.548f)
                curveToRelative(-0.581f, 0.019f, -2.006f, -7.37f, -4.121f, -7.031f)
                curveToRelative(-1.602f, 0.257f, -0.175f, 6.006f, -0.109f, 7.61f)
                curveToRelative(0.016f, 0.402f, 0.141f, 1.157f, -0.461f, 1.157f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(1.118f)
                horizontalLineToRelative(1.958f)
                curveToRelative(0.402f, -0.02f, 0.72f, -0.174f, 0.881f, -0.57f)
                curveToRelative(0.544f, -1.342f, -0.884f, -7.042f, -0.55f, -7.084f)
                curveToRelative(0.23f, -0.028f, 0.725f, 1.707f, 1.416f, 3.67f)
                curveToRelative(0.69f, 1.963f, 1.383f, 3.995f, 2.696f, 3.995f)
                curveToRelative(2.83f, 0.0f, -0.057f, -11.121f, 0.504f, -11.121f)
                curveToRelative(0.297f, 0.0f, 1.106f, 2.26f, 1.995f, 4.738f)
                curveToRelative(1.089f, 3.028f, 2.416f, 6.387f, 4.018f, 6.387f)
                curveToRelative(1.912f, 0.0f, 1.29f, -4.338f, 0.698f, -8.495f)
                curveToRelative(-0.513f, -3.598f, -1.114f, -6.978f, -0.793f, -6.978f)
                curveToRelative(0.721f, 0.0f, 3.447f, 15.467f, 6.72f, 15.467f)
                curveToRelative(1.64f, 0.0f, 1.658f, -3.233f, 1.658f, -6.72f)
                curveToRelative(0.0f, -2.448f, -0.204f, -4.68f, 1.331f, -5.217f)
                curveToRelative(0.73f, -0.254f, 1.468f, 0.198f, 1.468f, 0.198f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null
