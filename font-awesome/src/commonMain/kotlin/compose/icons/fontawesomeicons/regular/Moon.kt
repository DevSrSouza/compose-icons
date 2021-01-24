package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(279.135f, 512.0f)
                curveToRelative(78.756f, 0.0f, 150.982f, -35.804f, 198.844f, -94.775f)
                curveToRelative(28.27f, -34.831f, -2.558f, -85.722f, -46.249f, -77.401f)
                curveToRelative(-82.348f, 15.683f, -158.272f, -47.268f, -158.272f, -130.792f)
                curveToRelative(0.0f, -48.424f, 26.06f, -92.292f, 67.434f, -115.836f)
                curveToRelative(38.745f, -22.05f, 28.999f, -80.788f, -15.022f, -88.919f)
                arcTo(257.936f, 257.936f, 0.0f, false, false, 279.135f, 0.0f)
                curveToRelative(-141.36f, 0.0f, -256.0f, 114.575f, -256.0f, 256.0f)
                curveToRelative(0.0f, 141.36f, 114.576f, 256.0f, 256.0f, 256.0f)
                close()
                moveTo(279.135f, 48.0f)
                curveToRelative(12.985f, 0.0f, 25.689f, 1.201f, 38.016f, 3.478f)
                curveToRelative(-54.76f, 31.163f, -91.693f, 90.042f, -91.693f, 157.554f)
                curveToRelative(0.0f, 113.848f, 103.641f, 199.2f, 215.252f, 177.944f)
                curveTo(402.574f, 433.964f, 344.366f, 464.0f, 279.135f, 464.0f)
                curveToRelative(-114.875f, 0.0f, -208.0f, -93.125f, -208.0f, -208.0f)
                reflectiveCurveToRelative(93.125f, -208.0f, 208.0f, -208.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
