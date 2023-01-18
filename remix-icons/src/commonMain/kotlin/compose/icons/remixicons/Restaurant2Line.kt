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

public val RemixIcons.Restaurant2Line: ImageVector
    get() {
        if (_restaurant2Line != null) {
            return _restaurant2Line!!
        }
        _restaurant2Line = Builder(name = "Restaurant2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.268f, 12.146f)
                lineToRelative(-0.854f, 0.854f)
                lineToRelative(7.071f, 7.071f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(12.0f, 14.415f)
                lineToRelative(-7.071f, 7.07f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(9.339f, -9.339f)
                curveToRelative(-0.588f, -1.457f, 0.02f, -3.555f, 1.62f, -5.157f)
                curveToRelative(1.953f, -1.952f, 4.644f, -2.427f, 6.011f, -1.06f)
                reflectiveCurveToRelative(0.892f, 4.058f, -1.06f, 6.01f)
                curveToRelative(-1.602f, 1.602f, -3.7f, 2.21f, -5.157f, 1.621f)
                close()
                moveTo(4.222f, 3.808f)
                lineToRelative(6.717f, 6.717f)
                lineToRelative(-2.828f, 2.829f)
                lineToRelative(-3.89f, -3.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.656f)
                close()
                moveTo(18.01f, 9.11f)
                curveToRelative(1.258f, -1.257f, 1.517f, -2.726f, 1.061f, -3.182f)
                curveToRelative(-0.456f, -0.456f, -1.925f, -0.197f, -3.182f, 1.06f)
                curveToRelative(-1.257f, 1.258f, -1.516f, 2.727f, -1.06f, 3.183f)
                curveToRelative(0.455f, 0.455f, 1.924f, 0.196f, 3.181f, -1.061f)
                close()
            }
        }
        .build()
        return _restaurant2Line!!
    }

private var _restaurant2Line: ImageVector? = null
