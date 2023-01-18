package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.CaretCircleDoubleUp: ImageVector
    get() {
        if (_caretCircleDoubleUp != null) {
            return _caretCircleDoubleUp!!
        }
        _caretCircleDoubleUp = Builder(name = "CaretCircleDoubleUp", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.1f, 55.9f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 55.9f, 200.1f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 200.1f, 55.9f)
                close()
                moveTo(191.6f, 191.6f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 0.0f, -127.2f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 191.6f, 191.6f)
                close()
                moveTo(164.2f, 163.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, 8.4f)
                lineTo(128.0f, 144.5f)
                lineToRelative(-27.8f, 27.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 8.4f, 0.0f)
                close()
                moveTo(164.2f, 107.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, 8.4f)
                lineTo(128.0f, 88.5f)
                lineToRelative(-27.8f, 27.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 8.4f, 0.0f)
                close()
            }
        }
        .build()
        return _caretCircleDoubleUp!!
    }

private var _caretCircleDoubleUp: ImageVector? = null
