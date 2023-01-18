package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.CaretCircleDoubleUp: ImageVector
    get() {
        if (_caretCircleDoubleUp != null) {
            return _caretCircleDoubleUp!!
        }
        _caretCircleDoubleUp = Builder(name = "CaretCircleDoubleUp", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.7f, 57.3f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 57.3f, 198.7f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 198.7f, 57.3f)
                close()
                moveTo(193.1f, 193.1f)
                arcTo(92.2f, 92.2f, 0.0f, true, true, 220.0f, 128.0f)
                arcTo(91.8f, 91.8f, 0.0f, false, true, 193.1f, 193.1f)
                close()
                moveTo(162.8f, 165.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(128.0f, 141.7f)
                lineTo(98.8f, 170.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, -5.6f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                close()
                moveTo(162.8f, 109.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(128.0f, 85.7f)
                lineTo(98.8f, 114.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, -5.6f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                close()
            }
        }
        .build()
        return _caretCircleDoubleUp!!
    }

private var _caretCircleDoubleUp: ImageVector? = null
