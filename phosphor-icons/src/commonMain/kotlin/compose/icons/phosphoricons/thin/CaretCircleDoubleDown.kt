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

public val ThinGroup.CaretCircleDoubleDown: ImageVector
    get() {
        if (_caretCircleDoubleDown != null) {
            return _caretCircleDoubleDown!!
        }
        _caretCircleDoubleDown = Builder(name = "CaretCircleDoubleDown", defaultWidth = 256.0.dp,
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
                moveTo(162.8f, 85.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineTo(128.0f, 114.3f)
                lineToRelative(29.2f, -29.1f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 162.8f, 85.2f)
                close()
                moveTo(162.8f, 141.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineTo(128.0f, 170.3f)
                lineToRelative(29.2f, -29.1f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 162.8f, 141.2f)
                close()
            }
        }
        .build()
        return _caretCircleDoubleDown!!
    }

private var _caretCircleDoubleDown: ImageVector? = null
