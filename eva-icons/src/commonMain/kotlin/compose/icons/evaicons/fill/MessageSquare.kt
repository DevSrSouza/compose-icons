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

public val FillGroup.MessageSquare: ImageVector
    get() {
        if (_messageSquare != null) {
            return _messageSquare!!
        }
        _messageSquare = Builder(name = "MessageSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 6.0f)
                lineTo(2.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.51f, 0.87f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.51f, -0.14f)
                lineTo(8.0f, 19.14f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.55f, 19.0f)
                lineTo(19.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(22.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 3.0f)
                close()
                moveTo(8.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 12.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(16.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _messageSquare!!
    }

private var _messageSquare: ImageVector? = null
