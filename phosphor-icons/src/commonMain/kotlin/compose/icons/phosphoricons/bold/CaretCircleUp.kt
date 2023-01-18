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

public val BoldGroup.CaretCircleUp: ImageVector
    get() {
        if (_caretCircleUp != null) {
            return _caretCircleUp!!
        }
        _caretCircleUp = Builder(name = "CaretCircleUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.4f, 51.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(107.9f, 107.9f, 0.0f, true, false, 0.0f, 152.8f)
                arcTo(107.4f, 107.4f, 0.0f, false, false, 204.4f, 51.6f)
                close()
                moveTo(187.4f, 187.4f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 0.0f, -118.8f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 187.4f, 187.4f)
                close()
                moveTo(172.9f, 136.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -0.9f, 16.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -16.9f, -0.9f)
                lineTo(128.0f, 121.9f)
                lineTo(100.9f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.8f, -16.0f)
                lineToRelative(36.0f, -40.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 17.8f, 0.0f)
                close()
            }
        }
        .build()
        return _caretCircleUp!!
    }

private var _caretCircleUp: ImageVector? = null
