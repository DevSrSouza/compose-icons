package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(name = "Send", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.4f, 20.4f)
                lineToRelative(17.45f, -7.48f)
                curveToRelative(0.81f, -0.35f, 0.81f, -1.49f, 0.0f, -1.84f)
                lineTo(3.4f, 3.6f)
                curveToRelative(-0.66f, -0.29f, -1.39f, 0.2f, -1.39f, 0.91f)
                lineTo(2.0f, 9.12f)
                curveToRelative(0.0f, 0.5f, 0.37f, 0.93f, 0.87f, 0.99f)
                lineTo(17.0f, 12.0f)
                lineTo(2.87f, 13.88f)
                curveToRelative(-0.5f, 0.07f, -0.87f, 0.5f, -0.87f, 1.0f)
                lineToRelative(0.01f, 4.61f)
                curveToRelative(0.0f, 0.71f, 0.73f, 1.2f, 1.39f, 0.91f)
                close()
            }
        }
        .build()
        return _send!!
    }

private var _send: ImageVector? = null
