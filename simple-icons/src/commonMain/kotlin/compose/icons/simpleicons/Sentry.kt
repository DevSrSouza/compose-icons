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

public val SimpleIcons.Sentry: ImageVector
    get() {
        if (_sentry != null) {
            return _sentry!!
        }
        _sentry = Builder(name = "Sentry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.91f, 2.505f)
                curveToRelative(-0.873f, -1.448f, -2.972f, -1.448f, -3.844f, 0.0f)
                lineTo(6.904f, 7.92f)
                arcToRelative(15.478f, 15.478f, 0.0f, false, true, 8.53f, 12.811f)
                horizontalLineToRelative(-2.221f)
                arcTo(13.301f, 13.301f, 0.0f, false, false, 5.784f, 9.814f)
                lineToRelative(-2.926f, 5.06f)
                arcToRelative(7.65f, 7.65f, 0.0f, false, true, 4.435f, 5.848f)
                horizontalLineTo(2.194f)
                arcToRelative(0.365f, 0.365f, 0.0f, false, true, -0.298f, -0.534f)
                lineToRelative(1.413f, -2.402f)
                arcToRelative(5.16f, 5.16f, 0.0f, false, false, -1.614f, -0.913f)
                lineTo(0.296f, 19.275f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, false, 0.812f, 2.999f)
                arcToRelative(2.24f, 2.24f, 0.0f, false, false, 1.086f, 0.288f)
                horizontalLineToRelative(6.983f)
                arcToRelative(9.322f, 9.322f, 0.0f, false, false, -3.845f, -8.318f)
                lineToRelative(1.11f, -1.922f)
                arcToRelative(11.47f, 11.47f, 0.0f, false, true, 4.95f, 10.24f)
                horizontalLineToRelative(5.915f)
                arcToRelative(17.242f, 17.242f, 0.0f, false, false, -7.885f, -15.28f)
                lineToRelative(2.244f, -3.845f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.504f, -0.13f)
                curveToRelative(0.255f, 0.14f, 9.75f, 16.708f, 9.928f, 16.9f)
                arcToRelative(0.365f, 0.365f, 0.0f, false, true, -0.327f, 0.543f)
                horizontalLineToRelative(-2.287f)
                curveToRelative(0.029f, 0.612f, 0.029f, 1.223f, 0.0f, 1.831f)
                horizontalLineToRelative(2.297f)
                arcToRelative(2.206f, 2.206f, 0.0f, false, false, 1.922f, -3.31f)
                close()
            }
        }
        .build()
        return _sentry!!
    }

private var _sentry: ImageVector? = null
