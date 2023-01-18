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

public val RemixIcons.Restaurant2Fill: ImageVector
    get() {
        if (_restaurant2Fill != null) {
            return _restaurant2Fill!!
        }
        _restaurant2Fill = Builder(name = "Restaurant2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.222f, 3.808f)
                lineToRelative(6.717f, 6.717f)
                lineToRelative(-2.828f, 2.829f)
                lineToRelative(-3.89f, -3.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.656f)
                close()
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
            }
        }
        .build()
        return _restaurant2Fill!!
    }

private var _restaurant2Fill: ImageVector? = null
