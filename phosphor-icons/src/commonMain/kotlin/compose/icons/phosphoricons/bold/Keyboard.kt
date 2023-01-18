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

public val BoldGroup.Keyboard: ImageVector
    get() {
        if (_keyboard != null) {
            return _keyboard!!
        }
        _keyboard = Builder(name = "Keyboard", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.5f, 44.0f)
                lineTo(32.5f, 44.0f)
                arcTo(20.5f, 20.5f, 0.0f, false, false, 12.0f, 64.5f)
                verticalLineToRelative(127.0f)
                arcTo(20.5f, 20.5f, 0.0f, false, false, 32.5f, 212.0f)
                horizontalLineToRelative(191.0f)
                arcTo(20.5f, 20.5f, 0.0f, false, false, 244.0f, 191.5f)
                lineTo(244.0f, 64.5f)
                arcTo(20.5f, 20.5f, 0.0f, false, false, 223.5f, 44.0f)
                close()
                moveTo(220.0f, 188.0f)
                lineTo(36.0f, 188.0f)
                lineTo(36.0f, 68.0f)
                lineTo(220.0f, 68.0f)
                close()
                moveTo(52.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(192.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(64.0f, 140.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 52.0f, 128.0f)
                close()
                moveTo(52.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 64.0f, 80.0f)
                lineTo(192.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(64.0f, 104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 52.0f, 92.0f)
                close()
                moveTo(52.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(64.0f, 176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 52.0f, 164.0f)
                close()
                moveTo(160.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(108.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 160.0f, 164.0f)
                close()
                moveTo(204.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 164.0f)
                close()
            }
        }
        .build()
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
