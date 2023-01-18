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

public val BoldGroup.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) {
            return _pokerChip!!
        }
        _pokerChip = Builder(name = "PokerChip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.2f, 52.6f)
                lineToRelative(-0.8f, -1.0f)
                lineToRelative(-1.0f, -0.8f)
                arcToRelative(107.7f, 107.7f, 0.0f, false, false, -150.8f, 0.0f)
                lineToRelative(-1.0f, 0.8f)
                lineToRelative(-0.8f, 1.0f)
                arcToRelative(107.7f, 107.7f, 0.0f, false, false, 0.0f, 150.8f)
                lineToRelative(0.8f, 1.0f)
                lineToRelative(1.0f, 0.8f)
                arcToRelative(107.7f, 107.7f, 0.0f, false, false, 150.8f, 0.0f)
                lineToRelative(1.0f, -0.8f)
                lineToRelative(0.8f, -1.0f)
                arcToRelative(107.7f, 107.7f, 0.0f, false, false, 0.0f, -150.8f)
                close()
                moveTo(211.1f, 116.0f)
                lineTo(186.8f, 116.0f)
                arcTo(60.6f, 60.6f, 0.0f, false, false, 178.0f, 94.9f)
                lineToRelative(17.2f, -17.2f)
                arcTo(82.7f, 82.7f, 0.0f, false, true, 211.1f, 116.0f)
                close()
                moveTo(140.0f, 44.9f)
                arcToRelative(82.7f, 82.7f, 0.0f, false, true, 38.3f, 15.9f)
                lineTo(161.1f, 78.0f)
                arcTo(60.6f, 60.6f, 0.0f, false, false, 140.0f, 69.2f)
                close()
                moveTo(116.0f, 44.9f)
                lineTo(116.0f, 69.2f)
                arcTo(60.6f, 60.6f, 0.0f, false, false, 94.9f, 78.0f)
                lineTo(77.7f, 60.8f)
                arcTo(82.7f, 82.7f, 0.0f, false, true, 116.0f, 44.9f)
                close()
                moveTo(60.8f, 77.7f)
                lineTo(78.0f, 94.9f)
                arcTo(60.6f, 60.6f, 0.0f, false, false, 69.2f, 116.0f)
                lineTo(44.9f, 116.0f)
                arcTo(82.7f, 82.7f, 0.0f, false, true, 60.8f, 77.7f)
                close()
                moveTo(44.9f, 140.0f)
                lineTo(69.2f, 140.0f)
                arcTo(60.6f, 60.6f, 0.0f, false, false, 78.0f, 161.1f)
                lineTo(60.8f, 178.3f)
                arcTo(82.7f, 82.7f, 0.0f, false, true, 44.9f, 140.0f)
                close()
                moveTo(116.0f, 211.1f)
                arcToRelative(82.7f, 82.7f, 0.0f, false, true, -38.3f, -15.9f)
                lineTo(94.9f, 178.0f)
                arcToRelative(60.6f, 60.6f, 0.0f, false, false, 21.1f, 8.8f)
                close()
                moveTo(92.0f, 128.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 128.0f)
                close()
                moveTo(140.0f, 211.1f)
                lineTo(140.0f, 186.8f)
                arcToRelative(60.6f, 60.6f, 0.0f, false, false, 21.1f, -8.8f)
                lineToRelative(17.2f, 17.2f)
                arcTo(82.7f, 82.7f, 0.0f, false, true, 140.0f, 211.1f)
                close()
                moveTo(195.2f, 178.3f)
                lineTo(178.0f, 161.1f)
                arcToRelative(60.6f, 60.6f, 0.0f, false, false, 8.8f, -21.1f)
                horizontalLineToRelative(24.3f)
                arcTo(82.7f, 82.7f, 0.0f, false, true, 195.2f, 178.3f)
                close()
            }
        }
        .build()
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
