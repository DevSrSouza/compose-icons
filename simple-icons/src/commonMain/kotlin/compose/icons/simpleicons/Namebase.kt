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

public val SimpleIcons.Namebase: ImageVector
    get() {
        if (_namebase != null) {
            return _namebase!!
        }
        _namebase = Builder(name = "Namebase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0978f, 2.406f)
                curveToRelative(0.0f, 1.3288f, -1.0516f, 2.406f, -2.3488f, 2.406f)
                reflectiveCurveToRelative(-2.3487f, -1.0772f, -2.3487f, -2.406f)
                reflectiveCurveTo(19.4519f, 0.0f, 20.7491f, 0.0f)
                reflectiveCurveToRelative(2.3487f, 1.0772f, 2.3487f, 2.406f)
                close()
                moveTo(11.5889f, 2.9475f)
                curveTo(5.6868f, 2.9475f, 0.9022f, 7.8488f, 0.9022f, 13.8948f)
                lineTo(0.9022f, 24.0f)
                horizontalLineToRelative(6.5764f)
                lineTo(7.4786f, 13.8948f)
                curveToRelative(0.0f, -2.3254f, 1.8403f, -4.2105f, 4.1103f, -4.2105f)
                reflectiveCurveToRelative(4.1103f, 1.8851f, 4.1103f, 4.2105f)
                lineTo(15.6992f, 24.0f)
                horizontalLineToRelative(6.5764f)
                lineTo(22.2756f, 13.8948f)
                curveToRelative(0.0f, -6.046f, -4.7846f, -10.9473f, -10.6867f, -10.9473f)
                close()
            }
        }
        .build()
        return _namebase!!
    }

private var _namebase: ImageVector? = null
