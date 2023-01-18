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

public val RemixIcons.Group2Fill: ImageVector
    get() {
        if (_group2Fill != null) {
            return _group2Fill!!
        }
        _group2Fill = Builder(name = "Group2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 19.748f)
                lineTo(10.0f, 16.4f)
                curveToRelative(0.0f, -1.283f, 0.995f, -2.292f, 2.467f, -2.868f)
                arcTo(8.482f, 8.482f, 0.0f, false, false, 9.5f, 13.0f)
                curveToRelative(-1.89f, 0.0f, -3.636f, 0.617f, -5.047f, 1.66f)
                arcTo(8.017f, 8.017f, 0.0f, false, false, 10.0f, 19.748f)
                close()
                moveTo(18.88f, 16.086f)
                curveTo(18.485f, 15.553f, 17.17f, 15.0f, 15.5f, 15.0f)
                curveToRelative(-2.006f, 0.0f, -3.5f, 0.797f, -3.5f, 1.4f)
                lineTo(12.0f, 20.0f)
                arcToRelative(7.996f, 7.996f, 0.0f, false, false, 6.88f, -3.914f)
                close()
                moveTo(9.55f, 11.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.0f, -4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, 4.5f)
                close()
                moveTo(15.5f, 12.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _group2Fill!!
    }

private var _group2Fill: ImageVector? = null
