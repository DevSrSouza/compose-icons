package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) {
            return _pokerChip!!
        }
        _pokerChip = Builder(name = "PokerChip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 96.0f, 96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 128.0f, 32.0f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, -56.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 128.0f, 184.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.2f, 200.8f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, -145.6f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.7f, -0.7f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.7f, -0.7f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, -145.6f, 0.0f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.7f, 0.7f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.7f, 0.7f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, 145.6f)
                lineToRelative(0.7f, 0.7f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 0.7f, 0.7f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 145.6f, 0.0f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 0.7f, -0.7f)
                arcTo(2.3f, 2.3f, 0.0f, false, false, 202.2f, 200.8f)
                close()
                moveTo(40.4f, 136.0f)
                lineTo(64.5f, 136.0f)
                arcToRelative(63.6f, 63.6f, 0.0f, false, false, 13.0f, 31.2f)
                lineTo(60.4f, 184.3f)
                arcTo(87.5f, 87.5f, 0.0f, false, true, 40.4f, 136.0f)
                close()
                moveTo(60.4f, 71.7f)
                lineTo(77.5f, 88.8f)
                arcToRelative(63.6f, 63.6f, 0.0f, false, false, -13.0f, 31.2f)
                lineTo(40.4f, 120.0f)
                arcTo(87.5f, 87.5f, 0.0f, false, true, 60.4f, 71.7f)
                close()
                moveTo(215.6f, 120.0f)
                lineTo(191.5f, 120.0f)
                arcToRelative(63.6f, 63.6f, 0.0f, false, false, -13.0f, -31.2f)
                lineToRelative(17.1f, -17.1f)
                arcTo(87.5f, 87.5f, 0.0f, false, true, 215.6f, 120.0f)
                close()
                moveTo(128.0f, 176.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 128.0f, 176.0f)
                close()
                moveTo(167.2f, 77.5f)
                arcToRelative(63.6f, 63.6f, 0.0f, false, false, -31.2f, -13.0f)
                lineTo(136.0f, 40.4f)
                arcToRelative(87.5f, 87.5f, 0.0f, false, true, 48.3f, 20.0f)
                close()
                moveTo(120.0f, 64.5f)
                arcToRelative(63.6f, 63.6f, 0.0f, false, false, -31.2f, 13.0f)
                lineTo(71.7f, 60.4f)
                arcToRelative(87.5f, 87.5f, 0.0f, false, true, 48.3f, -20.0f)
                close()
                moveTo(88.8f, 178.5f)
                arcToRelative(63.6f, 63.6f, 0.0f, false, false, 31.2f, 13.0f)
                verticalLineToRelative(24.1f)
                arcToRelative(87.5f, 87.5f, 0.0f, false, true, -48.3f, -20.0f)
                close()
                moveTo(136.0f, 191.5f)
                arcToRelative(63.6f, 63.6f, 0.0f, false, false, 31.2f, -13.0f)
                lineToRelative(17.1f, 17.1f)
                arcToRelative(87.5f, 87.5f, 0.0f, false, true, -48.3f, 20.0f)
                close()
                moveTo(178.5f, 167.2f)
                arcToRelative(63.6f, 63.6f, 0.0f, false, false, 13.0f, -31.2f)
                horizontalLineToRelative(24.1f)
                arcToRelative(87.5f, 87.5f, 0.0f, false, true, -20.0f, 48.3f)
                close()
            }
        }
        .build()
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
