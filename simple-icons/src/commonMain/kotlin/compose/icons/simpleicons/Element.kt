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

public val SimpleIcons.Element: ImageVector
    get() {
        if (_element != null) {
            return _element!!
        }
        _element = Builder(name = "Element", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(10.686f, 4.715f)
                curveToRelative(3.289f, 0.0f, 5.956f, 2.66f, 5.956f, 5.943f)
                curveToRelative(0.0f, 0.484f, -0.394f, 0.877f, -0.879f, 0.877f)
                reflectiveCurveToRelative(-0.879f, -0.393f, -0.879f, -0.877f)
                curveToRelative(0.0f, -2.313f, -1.88f, -4.189f, -4.198f, -4.189f)
                curveToRelative(-0.486f, 0.0f, -0.879f, -0.393f, -0.879f, -0.877f)
                reflectiveCurveToRelative(0.392f, -0.877f, 0.879f, -0.877f)
                close()
                moveTo(5.594f, 14.219f)
                curveToRelative(-0.486f, 0.0f, -0.879f, -0.394f, -0.879f, -0.877f)
                curveToRelative(0.0f, -3.283f, 2.666f, -5.945f, 5.956f, -5.945f)
                curveToRelative(0.485f, 0.0f, 0.879f, 0.393f, 0.879f, 0.877f)
                reflectiveCurveToRelative(-0.394f, 0.876f, -0.879f, 0.876f)
                curveToRelative(-2.319f, 0.0f, -4.198f, 1.877f, -4.198f, 4.191f)
                curveToRelative(0.0f, 0.484f, -0.395f, 0.878f, -0.879f, 0.878f)
                close()
                moveTo(13.329f, 19.286f)
                curveToRelative(-3.29f, 0.0f, -5.957f, -2.662f, -5.957f, -5.944f)
                curveToRelative(0.0f, -0.484f, 0.394f, -0.878f, 0.879f, -0.878f)
                reflectiveCurveToRelative(0.879f, 0.394f, 0.879f, 0.878f)
                curveToRelative(0.0f, 2.313f, 1.88f, 4.189f, 4.199f, 4.189f)
                curveToRelative(0.485f, 0.0f, 0.879f, 0.393f, 0.879f, 0.877f)
                curveToRelative(0.0f, 0.486f, -0.394f, 0.878f, -0.879f, 0.878f)
                close()
                moveTo(13.329f, 16.603f)
                curveToRelative(-0.485f, 0.0f, -0.88f, -0.393f, -0.88f, -0.876f)
                curveToRelative(0.0f, -0.484f, 0.395f, -0.878f, 0.88f, -0.878f)
                curveToRelative(2.318f, 0.0f, 4.199f, -1.876f, 4.199f, -4.19f)
                curveToRelative(0.0f, -0.484f, 0.393f, -0.877f, 0.879f, -0.877f)
                curveToRelative(0.485f, 0.0f, 0.879f, 0.393f, 0.879f, 0.877f)
                curveToRelative(0.0f, 3.282f, -2.667f, 5.944f, -5.957f, 5.944f)
                close()
            }
        }
        .build()
        return _element!!
    }

private var _element: ImageVector? = null
