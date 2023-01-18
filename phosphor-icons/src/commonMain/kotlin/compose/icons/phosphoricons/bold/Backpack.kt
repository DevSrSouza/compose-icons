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

public val BoldGroup.Backpack: ImageVector
    get() {
        if (_backpack != null) {
            return _backpack!!
        }
        _backpack = Builder(name = "Backpack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 48.5f)
                lineTo(172.0f, 36.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 144.0f, 8.0f)
                lineTo(112.0f, 8.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 84.0f, 36.0f)
                lineTo(84.0f, 48.5f)
                arcTo(60.2f, 60.2f, 0.0f, false, false, 32.0f, 108.0f)
                lineTo(32.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(204.0f, 240.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(224.0f, 108.0f)
                arcTo(60.2f, 60.2f, 0.0f, false, false, 172.0f, 48.5f)
                close()
                moveTo(112.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(148.0f, 48.0f)
                lineTo(108.0f, 48.0f)
                lineTo(108.0f, 36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 112.0f, 32.0f)
                close()
                moveTo(160.0f, 160.0f)
                lineTo(96.0f, 160.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(96.0f, 184.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(32.0f)
                lineTo(96.0f, 216.0f)
                close()
                moveTo(200.0f, 216.0f)
                lineTo(184.0f, 216.0f)
                lineTo(184.0f, 152.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, -28.0f)
                lineTo(100.0f, 124.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, 28.0f)
                verticalLineToRelative(64.0f)
                lineTo(56.0f, 216.0f)
                lineTo(56.0f, 108.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 72.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                close()
                moveTo(160.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(108.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 160.0f, 100.0f)
                close()
            }
        }
        .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
