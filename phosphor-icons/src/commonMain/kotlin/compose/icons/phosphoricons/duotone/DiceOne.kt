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

public val DuotoneGroup.DiceOne: ImageVector
    get() {
        if (_diceOne != null) {
            return _diceOne!!
        }
        _diceOne = Builder(name = "DiceOne", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 40.0f)
                lineTo(192.0f, 40.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 216.0f, 64.0f)
                lineTo(216.0f, 192.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 192.0f, 216.0f)
                lineTo(64.0f, 216.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 40.0f, 192.0f)
                lineTo(40.0f, 64.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 64.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 32.0f)
                lineTo(64.0f, 32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 32.0f, 64.0f)
                lineTo(32.0f, 192.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 32.0f, 32.0f)
                lineTo(192.0f, 224.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(224.0f, 64.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 192.0f, 32.0f)
                close()
                moveTo(208.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(64.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(48.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 48.0f)
                lineTo(192.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
                moveTo(140.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 128.0f)
                close()
            }
        }
        .build()
        return _diceOne!!
    }

private var _diceOne: ImageVector? = null
