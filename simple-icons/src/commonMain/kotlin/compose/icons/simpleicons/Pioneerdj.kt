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

public val SimpleIcons.Pioneerdj: ImageVector
    get() {
        if (_pioneerdj != null) {
            return _pioneerdj!!
        }
        _pioneerdj = Builder(name = "Pioneerdj", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.46f, 5.569f)
                curveToRelative(1.474f, 1.144f, 1.715f, 2.695f, 1.107f, 4.319f)
                curveToRelative(-0.565f, 1.503f, -1.833f, 2.96f, -3.827f, 4.087f)
                curveToRelative(-2.21f, 1.227f, -4.498f, 1.554f, -6.993f, 1.554f)
                lineTo(0.0f, 15.529f)
                lineTo(4.212f, 4.308f)
                horizontalLineToRelative(5.051f)
                curveToRelative(2.548f, 0.0f, 4.7f, 0.1f, 6.197f, 1.26f)
                close()
                moveTo(12.348f, 9.804f)
                curveToRelative(0.33f, -0.884f, 0.246f, -2.202f, -0.34f, -2.906f)
                curveToRelative(-0.658f, -0.782f, -1.673f, -0.873f, -3.138f, -0.873f)
                lineToRelative(-0.716f, 0.016f)
                reflectiveCurveToRelative(-0.616f, -0.07f, -0.866f, 0.49f)
                curveToRelative(-0.153f, 0.35f, 0.064f, -0.263f, -2.412f, 6.341f)
                curveToRelative(-0.326f, 0.876f, 0.452f, 0.919f, 0.452f, 0.919f)
                reflectiveCurveToRelative(2.794f, 0.17f, 5.132f, -1.448f)
                curveToRelative(0.991f, -0.685f, 1.577f, -1.705f, 1.888f, -2.539f)
                close()
                moveTo(18.286f, 8.337f)
                lineTo(24.0f, 8.366f)
                lineToRelative(-2.892f, 7.731f)
                curveToRelative(-0.944f, 2.518f, -2.896f, 3.595f, -6.812f, 3.595f)
                lineToRelative(-3.058f, -0.04f)
                lineToRelative(0.731f, -1.746f)
                curveToRelative(4.427f, 0.21f, 5.225f, -1.76f, 5.365f, -2.139f)
                lineToRelative(1.846f, -4.966f)
                reflectiveCurveToRelative(0.317f, -0.884f, -0.402f, -0.884f)
                horizontalLineToRelative(-1.132f)
                close()
            }
        }
        .build()
        return _pioneerdj!!
    }

private var _pioneerdj: ImageVector? = null
