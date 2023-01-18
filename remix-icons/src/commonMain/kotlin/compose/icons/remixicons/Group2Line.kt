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

public val RemixIcons.Group2Line: ImageVector
    get() {
        if (_group2Line != null) {
            return _group2Line!!
        }
        _group2Line = Builder(name = "Group2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.55f, 11.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 0.0f, -4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, 4.5f)
                close()
                moveTo(10.0f, 19.748f)
                lineTo(10.0f, 16.4f)
                curveToRelative(0.0f, -0.488f, 0.144f, -0.937f, 0.404f, -1.338f)
                arcToRelative(6.473f, 6.473f, 0.0f, false, false, -5.033f, 1.417f)
                arcTo(8.012f, 8.012f, 0.0f, false, false, 10.0f, 19.749f)
                close()
                moveTo(4.453f, 14.66f)
                arcTo(8.462f, 8.462f, 0.0f, false, true, 9.5f, 13.0f)
                curveToRelative(1.043f, 0.0f, 2.043f, 0.188f, 2.967f, 0.532f)
                curveToRelative(0.878f, -0.343f, 1.925f, -0.532f, 3.033f, -0.532f)
                curveToRelative(1.66f, 0.0f, 3.185f, 0.424f, 4.206f, 1.156f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.253f, 0.504f)
                close()
                moveTo(18.879f, 16.086f)
                curveTo(18.486f, 15.553f, 17.171f, 15.0f, 15.5f, 15.0f)
                curveToRelative(-2.006f, 0.0f, -3.5f, 0.797f, -3.5f, 1.4f)
                lineTo(12.0f, 20.0f)
                arcToRelative(7.996f, 7.996f, 0.0f, false, false, 6.88f, -3.914f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(15.5f, 12.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _group2Line!!
    }

private var _group2Line: ImageVector? = null
