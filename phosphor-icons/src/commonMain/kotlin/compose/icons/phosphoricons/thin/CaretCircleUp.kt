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

public val ThinGroup.CaretCircleUp: ImageVector
    get() {
        if (_caretCircleUp != null) {
            return _caretCircleUp!!
        }
        _caretCircleUp = Builder(name = "CaretCircleUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.7f, 57.3f)
                horizontalLineToRelative(0.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 57.3f, 198.7f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 198.7f, 57.3f)
                close()
                moveTo(193.1f, 193.1f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 0.0f, -130.2f)
                arcTo(91.8f, 91.8f, 0.0f, false, true, 193.1f, 193.1f)
                close()
                moveTo(167.0f, 141.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -0.3f, 5.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.7f, -0.3f)
                lineTo(128.0f, 110.0f)
                lineTo(95.0f, 146.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, -5.4f)
                lineToRelative(36.0f, -40.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 6.0f, 0.0f)
                close()
            }
        }
        .build()
        return _caretCircleUp!!
    }

private var _caretCircleUp: ImageVector? = null
