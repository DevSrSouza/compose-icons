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

public val BoldGroup.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = Builder(name = "Bank", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 108.0f)
                lineTo(44.0f, 108.0f)
                verticalLineToRelative(48.0f)
                lineTo(32.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(224.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(212.0f, 156.0f)
                lineTo(212.0f, 108.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.3f, -22.2f)
                lineToRelative(-104.0f, -64.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -12.6f, 0.0f)
                lineToRelative(-104.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 108.0f)
                close()
                moveTo(68.0f, 108.0f)
                lineTo(92.0f, 108.0f)
                verticalLineToRelative(48.0f)
                lineTo(68.0f, 156.0f)
                close()
                moveTo(140.0f, 108.0f)
                verticalLineToRelative(48.0f)
                lineTo(116.0f, 156.0f)
                lineTo(116.0f, 108.0f)
                close()
                moveTo(188.0f, 156.0f)
                lineTo(164.0f, 156.0f)
                lineTo(164.0f, 108.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(128.0f, 46.1f)
                lineTo(189.6f, 84.0f)
                lineTo(66.4f, 84.0f)
                close()
                moveTo(252.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(16.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(240.0f, 196.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 208.0f)
                close()
            }
        }
        .build()
        return _bank!!
    }

private var _bank: ImageVector? = null
