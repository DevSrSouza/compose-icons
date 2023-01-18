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

public val RemixIcons.Wechat2Line: ImageVector
    get() {
        if (_wechat2Line != null) {
            return _wechat2Line!!
        }
        _wechat2Line = Builder(name = "Wechat2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.667f, 11.511f)
                arcToRelative(1.276f, 1.276f, 0.0f, false, true, -1.285f, -1.285f)
                curveToRelative(0.0f, -0.718f, 0.567f, -1.286f, 1.285f, -1.286f)
                curveToRelative(0.717f, 0.0f, 1.285f, 0.568f, 1.285f, 1.286f)
                curveToRelative(0.0f, 0.717f, -0.568f, 1.285f, -1.285f, 1.285f)
                close()
                moveTo(15.333f, 11.511f)
                arcToRelative(1.276f, 1.276f, 0.0f, false, true, -1.285f, -1.285f)
                curveToRelative(0.0f, -0.718f, 0.568f, -1.286f, 1.285f, -1.286f)
                curveToRelative(0.718f, 0.0f, 1.285f, 0.568f, 1.285f, 1.286f)
                curveToRelative(0.0f, 0.717f, -0.567f, 1.285f, -1.285f, 1.285f)
                close()
                moveTo(6.823f, 19.215f)
                lineToRelative(0.715f, -0.436f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.705f, -0.536f)
                curveToRelative(0.212f, 0.033f, 0.386f, 0.059f, 0.52f, 0.076f)
                curveToRelative(0.406f, 0.054f, 0.82f, 0.081f, 1.237f, 0.081f)
                curveToRelative(4.42f, 0.0f, 7.9f, -3.022f, 7.9f, -6.6f)
                reflectiveCurveTo(16.42f, 5.2f, 12.0f, 5.2f)
                reflectiveCurveToRelative(-7.9f, 3.022f, -7.9f, 6.6f)
                curveToRelative(0.0f, 1.366f, 0.5f, 2.673f, 1.432f, 3.781f)
                curveToRelative(0.048f, 0.057f, 0.12f, 0.137f, 0.214f, 0.235f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.101f, 3.102f)
                lineToRelative(-0.025f, 0.297f)
                close()
                moveTo(6.193f, 21.942f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.527f, -0.93f)
                lineToRelative(0.188f, -2.26f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.55f, -1.551f)
                arcTo(6.993f, 6.993f, 0.0f, false, true, 4.0f, 16.868f)
                curveTo(2.806f, 15.447f, 2.1f, 13.695f, 2.1f, 11.8f)
                curveToRelative(0.0f, -4.75f, 4.432f, -8.6f, 9.9f, -8.6f)
                reflectiveCurveToRelative(9.9f, 3.85f, 9.9f, 8.6f)
                reflectiveCurveToRelative(-4.432f, 8.6f, -9.9f, 8.6f)
                curveToRelative(-0.51f, 0.0f, -1.01f, -0.033f, -1.499f, -0.098f)
                arcToRelative(23.61f, 23.61f, 0.0f, false, true, -0.569f, -0.084f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.353f, 0.268f)
                lineToRelative(-2.387f, 1.456f)
                close()
            }
        }
        .build()
        return _wechat2Line!!
    }

private var _wechat2Line: ImageVector? = null
