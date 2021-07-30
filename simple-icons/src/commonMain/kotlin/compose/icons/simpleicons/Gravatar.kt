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

public val SimpleIcons.Gravatar: ImageVector
    get() {
        if (_gravatar != null) {
            return _gravatar!!
        }
        _gravatar = Builder(name = "Gravatar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-1.326f, 0.0f, -2.4f, 1.074f, -2.4f, 2.4f)
                verticalLineToRelative(8.4f)
                curveToRelative(0.0f, 1.324f, 1.074f, 2.398f, 2.4f, 2.398f)
                reflectiveCurveToRelative(2.4f, -1.074f, 2.4f, -2.398f)
                verticalLineTo(5.21f)
                curveToRelative(2.795f, 0.99f, 4.799f, 3.654f, 4.799f, 6.789f)
                curveToRelative(0.0f, 3.975f, -3.225f, 7.199f, -7.199f, 7.199f)
                reflectiveCurveTo(4.801f, 15.975f, 4.801f, 12.0f)
                curveToRelative(0.0f, -1.989f, 0.805f, -3.789f, 2.108f, -5.091f)
                curveToRelative(0.938f, -0.938f, 0.938f, -2.458f, 0.0f, -3.396f)
                reflectiveCurveToRelative(-2.458f, -0.938f, -3.396f, 0.0f)
                curveTo(1.344f, 5.686f, 0.0f, 8.686f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
            }
        }
        .build()
        return _gravatar!!
    }

private var _gravatar: ImageVector? = null
