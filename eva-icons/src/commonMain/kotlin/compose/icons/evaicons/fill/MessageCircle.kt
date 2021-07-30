package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.FillGroup

public val FillGroup.MessageCircle: ImageVector
    get() {
        if (_messageCircle != null) {
            return _messageCircle!!
        }
        _messageCircle = Builder(name = "MessageCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.07f, 4.93f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -16.28f, 11.0f)
                arcToRelative(1.06f, 1.06f, 0.0f, false, true, 0.09f, 0.64f)
                lineTo(2.0f, 20.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.27f, 0.91f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 22.0f)
                lineToRelative(0.2f, 0.0f)
                lineToRelative(4.28f, -0.86f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, true, 0.64f, 0.09f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 11.0f, -16.28f)
                close()
                moveTo(8.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 13.0f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 13.0f)
                close()
                moveTo(16.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _messageCircle!!
    }

private var _messageCircle: ImageVector? = null
