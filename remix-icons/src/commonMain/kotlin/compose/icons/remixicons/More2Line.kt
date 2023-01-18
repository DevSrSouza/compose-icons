package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.More2Line: ImageVector
    get() {
        if (_more2Line != null) {
            return _more2Line!!
        }
        _more2Line = Builder(name = "More2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(-0.825f, 0.0f, -1.5f, 0.675f, -1.5f, 1.5f)
                reflectiveCurveTo(11.175f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(1.5f, -0.675f, 1.5f, -1.5f)
                reflectiveCurveTo(12.825f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-0.825f, 0.0f, -1.5f, 0.675f, -1.5f, 1.5f)
                reflectiveCurveTo(11.175f, 21.0f, 12.0f, 21.0f)
                reflectiveCurveToRelative(1.5f, -0.675f, 1.5f, -1.5f)
                reflectiveCurveTo(12.825f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(12.0f, 10.5f)
                curveToRelative(-0.825f, 0.0f, -1.5f, 0.675f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.675f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.675f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.675f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _more2Line!!
    }

private var _more2Line: ImageVector? = null
