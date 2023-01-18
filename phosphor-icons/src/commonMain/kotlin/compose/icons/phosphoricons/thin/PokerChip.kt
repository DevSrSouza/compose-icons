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

public val ThinGroup.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) {
            return _pokerChip!!
        }
        _pokerChip = Builder(name = "PokerChip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.0f, 198.3f)
                arcToRelative(99.7f, 99.7f, 0.0f, false, false, 0.0f, -140.6f)
                lineToRelative(-0.3f, -0.4f)
                lineToRelative(-0.4f, -0.3f)
                arcTo(99.7f, 99.7f, 0.0f, false, false, 57.7f, 57.0f)
                lineToRelative(-0.4f, 0.3f)
                lineToRelative(-0.3f, 0.4f)
                arcToRelative(99.7f, 99.7f, 0.0f, false, false, 0.0f, 140.6f)
                lineToRelative(0.3f, 0.4f)
                lineToRelative(0.4f, 0.3f)
                arcToRelative(99.7f, 99.7f, 0.0f, false, false, 140.6f, 0.0f)
                lineToRelative(0.4f, -0.3f)
                close()
                moveTo(36.1f, 132.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(59.5f, 59.5f, 0.0f, false, false, 14.8f, 35.5f)
                lineTo(60.2f, 190.1f)
                arcTo(91.4f, 91.4f, 0.0f, false, true, 36.1f, 132.0f)
                close()
                moveTo(60.2f, 65.9f)
                lineTo(82.9f, 88.5f)
                arcTo(59.5f, 59.5f, 0.0f, false, false, 68.1f, 124.0f)
                horizontalLineToRelative(-32.0f)
                arcTo(91.4f, 91.4f, 0.0f, false, true, 60.2f, 65.9f)
                close()
                moveTo(219.9f, 124.0f)
                horizontalLineToRelative(-32.0f)
                arcToRelative(59.5f, 59.5f, 0.0f, false, false, -14.8f, -35.5f)
                lineToRelative(22.7f, -22.6f)
                arcTo(91.4f, 91.4f, 0.0f, false, true, 219.9f, 124.0f)
                close()
                moveTo(128.0f, 180.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, -52.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 128.0f, 180.0f)
                close()
                moveTo(167.5f, 82.9f)
                arcTo(59.5f, 59.5f, 0.0f, false, false, 132.0f, 68.1f)
                verticalLineToRelative(-32.0f)
                arcToRelative(91.4f, 91.4f, 0.0f, false, true, 58.1f, 24.1f)
                close()
                moveTo(124.0f, 68.1f)
                arcTo(59.5f, 59.5f, 0.0f, false, false, 88.5f, 82.9f)
                lineTo(65.9f, 60.2f)
                arcTo(91.4f, 91.4f, 0.0f, false, true, 124.0f, 36.1f)
                close()
                moveTo(88.5f, 173.1f)
                arcTo(59.5f, 59.5f, 0.0f, false, false, 124.0f, 187.9f)
                verticalLineToRelative(32.0f)
                arcToRelative(91.4f, 91.4f, 0.0f, false, true, -58.1f, -24.1f)
                close()
                moveTo(132.0f, 187.9f)
                arcToRelative(59.5f, 59.5f, 0.0f, false, false, 35.5f, -14.8f)
                lineToRelative(22.6f, 22.7f)
                arcTo(91.4f, 91.4f, 0.0f, false, true, 132.0f, 219.9f)
                close()
                moveTo(173.1f, 167.5f)
                arcTo(59.5f, 59.5f, 0.0f, false, false, 187.9f, 132.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(91.4f, 91.4f, 0.0f, false, true, -24.1f, 58.1f)
                close()
            }
        }
        .build()
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
