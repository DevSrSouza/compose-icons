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

public val BoldGroup.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) {
            return _caretLeft!!
        }
        _caretLeft = Builder(name = "CaretLeft", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 220.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -8.5f, -3.5f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(80.0f, -80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(97.0f, 128.0f)
                lineToRelative(71.5f, 71.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 160.0f, 220.0f)
                close()
            }
        }
        .build()
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null