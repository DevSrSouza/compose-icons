package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.CaretCircleDoubleDown: ImageVector
    get() {
        if (_caretCircleDoubleDown != null) {
            return _caretCircleDoubleDown!!
        }
        _caretCircleDoubleDown = Builder(name = "CaretCircleDoubleDown", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.4f, 51.6f)
                arcToRelative(107.9f, 107.9f, 0.0f, true, false, 0.0f, 152.8f)
                arcTo(108.2f, 108.2f, 0.0f, false, false, 204.4f, 51.6f)
                close()
                moveTo(187.4f, 187.4f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 0.0f, -118.8f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 187.4f, 187.4f)
                close()
                moveTo(168.5f, 79.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(128.0f, 103.0f)
                lineToRelative(23.5f, -23.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.5f, 79.5f)
                close()
                moveTo(168.5f, 135.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(128.0f, 159.0f)
                lineToRelative(23.5f, -23.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.5f, 135.5f)
                close()
            }
        }
        .build()
        return _caretCircleDoubleDown!!
    }

private var _caretCircleDoubleDown: ImageVector? = null
