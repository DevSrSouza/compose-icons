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

public val SimpleIcons.Spond: ImageVector
    get() {
        if (_spond != null) {
            return _spond!!
        }
        _spond = Builder(name = "Spond", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(10.597f, 2.281f)
                arcToRelative(3.767f, 3.767f, 0.0f, false, false, -0.17f, 2.847f)
                curveToRelative(0.61f, 1.79f, 2.336f, 2.772f, 4.069f, 3.213f)
                curveToRelative(2.633f, 0.672f, 4.715f, 1.388f, 5.892f, 2.502f)
                curveToRelative(1.037f, 0.982f, 1.435f, 2.416f, 0.803f, 4.618f)
                curveToRelative(-0.17f, 0.59f, -0.486f, 1.124f, -0.802f, 1.643f)
                curveToRelative(-0.125f, -0.706f, -0.424f, -1.411f, -0.924f, -2.094f)
                curveToRelative(-3.269f, -4.462f, -10.438f, -3.57f, -13.174f, -7.307f)
                curveToRelative(-0.803f, -1.096f, -0.747f, -2.236f, 0.092f, -3.288f)
                curveToRelative(0.979f, -1.226f, 2.69f, -1.917f, 4.214f, -2.134f)
                close()
                moveTo(13.76f, 2.391f)
                curveToRelative(0.138f, -0.01f, 0.281f, 0.002f, 0.43f, 0.036f)
                arcToRelative(9.835f, 9.835f, 0.0f, false, true, 7.076f, 6.318f)
                curveToRelative(-1.514f, -1.132f, -3.655f, -1.86f, -6.233f, -2.517f)
                curveToRelative(-1.528f, -0.39f, -2.3f, -1.087f, -2.542f, -1.798f)
                curveToRelative(-0.326f, -0.956f, 0.308f, -1.98f, 1.27f, -2.04f)
                close()
                moveTo(3.611f, 6.895f)
                curveToRelative(0.125f, 0.706f, 0.424f, 1.412f, 0.924f, 2.094f)
                curveToRelative(3.269f, 4.462f, 10.438f, 3.57f, 13.174f, 7.307f)
                curveToRelative(0.803f, 1.095f, 0.747f, 2.236f, -0.092f, 3.288f)
                curveToRelative(-0.979f, 1.226f, -2.69f, 1.916f, -4.214f, 2.133f)
                curveToRelative(0.427f, -0.89f, 0.489f, -1.91f, 0.17f, -2.846f)
                curveToRelative(-0.61f, -1.79f, -2.336f, -2.772f, -4.069f, -3.213f)
                curveToRelative(-2.633f, -0.672f, -4.715f, -1.388f, -5.892f, -2.502f)
                curveToRelative(-1.037f, -0.982f, -1.435f, -2.416f, -0.803f, -4.618f)
                curveToRelative(0.17f, -0.59f, 0.486f, -1.124f, 0.802f, -1.643f)
                close()
                moveTo(2.734f, 15.255f)
                curveToRelative(1.514f, 1.13f, 3.655f, 1.858f, 6.233f, 2.516f)
                curveToRelative(1.528f, 0.39f, 2.3f, 1.087f, 2.542f, 1.798f)
                curveToRelative(0.336f, 0.985f, -0.347f, 2.042f, -1.357f, 2.042f)
                curveToRelative(-0.11f, 0.0f, -0.225f, -0.012f, -0.342f, -0.039f)
                arcToRelative(9.835f, 9.835f, 0.0f, false, true, -7.076f, -6.318f)
                close()
            }
        }
        .build()
        return _spond!!
    }

private var _spond: ImageVector? = null
