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

public val RemixIcons.HeartLine: ImageVector
    get() {
        if (_heartLine != null) {
            return _heartLine!!
        }
        _heartLine = Builder(name = "HeartLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(18.827f, 6.17f)
                curveToRelative(-1.5f, -1.502f, -3.92f, -1.563f, -5.49f, -0.153f)
                lineToRelative(-1.335f, 1.198f)
                lineToRelative(-1.336f, -1.197f)
                curveToRelative(-1.575f, -1.412f, -3.99f, -1.35f, -5.494f, 0.154f)
                curveToRelative(-1.49f, 1.49f, -1.565f, 3.875f, -0.192f, 5.451f)
                lineTo(12.0f, 18.654f)
                lineToRelative(7.02f, -7.03f)
                curveToRelative(1.374f, -1.577f, 1.299f, -3.959f, -0.193f, -5.454f)
                close()
            }
        }
        .build()
        return _heartLine!!
    }

private var _heartLine: ImageVector? = null
