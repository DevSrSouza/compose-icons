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

public val SimpleIcons.Pinescript: ImageVector
    get() {
        if (_pinescript != null) {
            return _pinescript!!
        }
        _pinescript = Builder(name = "Pinescript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.785f, 16.14f)
                lineTo(0.124f, 21.287f)
                curveToRelative(-0.311f, 0.437f, 0.0f, 1.044f, 0.536f, 1.044f)
                horizontalLineToRelative(22.681f)
                curveToRelative(0.535f, 0.0f, 0.846f, -0.608f, 0.536f, -1.045f)
                lineToRelative(-4.2f, -5.927f)
                lineToRelative(-1.979f, 1.161f)
                curveToRelative(-0.037f, 1.063f, -0.907f, 1.913f, -1.976f, 1.913f)
                curveToRelative(-1.092f, 0.0f, -1.977f, -0.887f, -1.977f, -1.982f)
                curveToRelative(0.0f, -0.055f, 0.003f, -0.11f, 0.007f, -0.165f)
                lineToRelative(-3.173f, -2.328f)
                curveToRelative(-0.341f, 0.278f, -0.775f, 0.445f, -1.249f, 0.445f)
                curveToRelative(-0.56f, 0.0f, -1.065f, -0.234f, -1.425f, -0.609f)
                lineToRelative(-4.12f, 2.346f)
                close()
                moveTo(11.478f, 1.946f)
                lineTo(3.813f, 12.732f)
                curveToRelative(-0.222f, 0.314f, -0.132f, 0.751f, 0.197f, 0.95f)
                lineToRelative(0.691f, 0.417f)
                lineToRelative(2.66f, -1.515f)
                arcToRelative(1.747f, 1.747f, 0.0f, false, true, -0.007f, -0.163f)
                curveToRelative(0.0f, -1.095f, 0.885f, -1.982f, 1.977f, -1.982f)
                curveToRelative(1.091f, 0.0f, 1.976f, 0.887f, 1.976f, 1.982f)
                curveToRelative(0.0f, 0.138f, -0.014f, 0.273f, -0.041f, 0.403f)
                lineToRelative(3.047f, 2.237f)
                curveToRelative(0.359f, -0.366f, 0.858f, -0.592f, 1.409f, -0.592f)
                curveToRelative(0.634f, 0.0f, 1.198f, 0.299f, 1.56f, 0.764f)
                lineToRelative(2.831f, -1.66f)
                curveToRelative(0.219f, -0.222f, 0.258f, -0.581f, 0.068f, -0.849f)
                lineTo(12.553f, 1.948f)
                curveToRelative(-0.262f, -0.371f, -0.812f, -0.373f, -1.075f, -0.002f)
                close()
            }
        }
        .build()
        return _pinescript!!
    }

private var _pinescript: ImageVector? = null
