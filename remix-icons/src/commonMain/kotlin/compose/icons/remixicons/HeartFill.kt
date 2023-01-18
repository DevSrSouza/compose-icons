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

public val RemixIcons.HeartFill: ImageVector
    get() {
        if (_heartFill != null) {
            return _heartFill!!
        }
        _heartFill = Builder(name = "HeartFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 4.529f)
                curveToRelative(2.349f, -2.109f, 5.979f, -2.039f, 8.242f, 0.228f)
                curveToRelative(2.262f, 2.268f, 2.34f, 5.88f, 0.236f, 8.236f)
                lineToRelative(-8.48f, 8.492f)
                lineToRelative(-8.478f, -8.492f)
                curveToRelative(-2.104f, -2.356f, -2.025f, -5.974f, 0.236f, -8.236f)
                curveToRelative(2.265f, -2.264f, 5.888f, -2.34f, 8.244f, -0.228f)
                close()
            }
        }
        .build()
        return _heartFill!!
    }

private var _heartFill: ImageVector? = null
