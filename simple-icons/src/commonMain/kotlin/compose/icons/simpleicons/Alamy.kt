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

public val SimpleIcons.Alamy: ImageVector
    get() {
        if (_alamy != null) {
            return _alamy!!
        }
        _alamy = Builder(name = "Alamy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(12.058f, 5.467f)
                curveToRelative(2.515f, 0.0f, 3.482f, 1.404f, 3.482f, 3.959f)
                verticalLineToRelative(7.04f)
                curveToRelative(0.0f, 0.78f, 0.0f, 1.21f, 0.193f, 1.872f)
                lineTo(13.47f, 18.338f)
                curveToRelative(-0.406f, -0.331f, -0.503f, -1.072f, -0.503f, -1.423f)
                curveToRelative(-0.464f, 1.111f, -1.102f, 1.618f, -2.224f, 1.618f)
                curveToRelative(-1.354f, 0.0f, -2.476f, -1.014f, -2.476f, -3.257f)
                curveToRelative(0.0f, -2.626f, 1.618f, -3.566f, 2.956f, -4.343f)
                curveToRelative(0.937f, -0.545f, 1.736f, -1.009f, 1.744f, -1.917f)
                curveToRelative(0.0f, -0.858f, -0.29f, -1.15f, -0.909f, -1.15f)
                curveToRelative(-0.696f, 0.0f, -0.987f, 0.468f, -0.987f, 1.56f)
                verticalLineToRelative(0.429f)
                lineTo(8.5f, 9.855f)
                verticalLineToRelative(-0.37f)
                curveToRelative(0.0f, -2.614f, 1.006f, -4.018f, 3.559f, -4.018f)
                close()
                moveTo(11.845f, 16.134f)
                curveToRelative(0.6f, 0.0f, 0.948f, -0.526f, 1.122f, -0.8f)
                verticalLineToRelative(-3.393f)
                curveToRelative(-0.209f, 0.345f, -0.544f, 0.621f, -0.887f, 0.904f)
                curveToRelative(-0.608f, 0.5f, -1.24f, 1.023f, -1.24f, 1.983f)
                curveToRelative(0.0f, 0.838f, 0.367f, 1.306f, 1.005f, 1.306f)
                close()
            }
        }
        .build()
        return _alamy!!
    }

private var _alamy: ImageVector? = null
