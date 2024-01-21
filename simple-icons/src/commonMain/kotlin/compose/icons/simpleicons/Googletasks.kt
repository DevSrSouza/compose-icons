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

public val SimpleIcons.Googletasks: ImageVector
    get() {
        if (_googletasks != null) {
            return _googletasks!!
        }
        _googletasks = Builder(name = "Googletasks", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.383f, 0.617f)
                curveTo(5.097f, 0.617f, 0.0f, 5.714f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.286f, 5.097f, 11.383f, 11.383f, 11.383f)
                curveToRelative(6.286f, 0.0f, 11.38f, -5.097f, 11.38f, -11.383f)
                arcToRelative(11.34f, 11.34f, 0.0f, false, false, -0.878f, -4.389f)
                lineToRelative(-3.203f, 3.203f)
                curveToRelative(0.062f, 0.387f, 0.1f, 0.782f, 0.1f, 1.186f)
                arcToRelative(7.398f, 7.398f, 0.0f, true, true, -7.4f, -7.398f)
                curveToRelative(1.499f, 0.0f, 2.889f, 0.448f, 4.054f, 1.214f)
                lineToRelative(2.857f, -2.857f)
                arcToRelative(11.325f, 11.325f, 0.0f, false, false, -6.91f, -2.342f)
                close()
                moveTo(21.057f, 1.373f)
                curveToRelative(-0.292f, 0.0f, -0.583f, 0.112f, -0.805f, 0.334f)
                curveToRelative(-2.97f, 2.965f, -5.934f, 5.934f, -8.9f, 8.902f)
                lineTo(9.596f, 8.854f)
                arcToRelative(1.139f, 1.139f, 0.0f, false, false, -1.61f, 0.0f)
                lineToRelative(-1.775f, 1.773f)
                arcToRelative(1.139f, 1.139f, 0.0f, false, false, 0.0f, 1.61f)
                lineToRelative(4.166f, 4.163f)
                arcToRelative(1.421f, 1.421f, 0.0f, false, false, 2.012f, 0.0f)
                lineTo(23.666f, 5.121f)
                arcToRelative(1.136f, 1.136f, 0.0f, false, false, 0.0f, -1.61f)
                lineToRelative(-1.805f, -1.804f)
                arcToRelative(1.136f, 1.136f, 0.0f, false, false, -0.804f, -0.334f)
                close()
            }
        }
        .build()
        return _googletasks!!
    }

private var _googletasks: ImageVector? = null
