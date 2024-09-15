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
                moveTo(23.098f, 2.406f)
                curveToRelative(0.0f, 1.329f, -1.052f, 2.406f, -2.349f, 2.406f)
                reflectiveCurveToRelative(-2.349f, -1.077f, -2.349f, -2.406f)
                reflectiveCurveTo(19.452f, 0.0f, 20.749f, 0.0f)
                reflectiveCurveToRelative(2.349f, 1.077f, 2.349f, 2.406f)
                close()
                moveTo(11.589f, 2.947f)
                curveTo(5.687f, 2.947f, 0.902f, 7.849f, 0.902f, 13.895f)
                lineTo(0.902f, 24.0f)
                horizontalLineToRelative(6.576f)
                lineTo(7.479f, 13.895f)
                curveToRelative(0.0f, -2.325f, 1.84f, -4.21f, 4.11f, -4.21f)
                reflectiveCurveToRelative(4.11f, 1.885f, 4.11f, 4.21f)
                lineTo(15.699f, 24.0f)
                horizontalLineToRelative(6.576f)
                lineTo(22.276f, 13.895f)
                curveToRelative(0.0f, -6.046f, -4.785f, -10.947f, -10.687f, -10.947f)
                close()
            }
        }
        .build()
        return _namebase!!
    }

private var _namebase: ImageVector? = null
