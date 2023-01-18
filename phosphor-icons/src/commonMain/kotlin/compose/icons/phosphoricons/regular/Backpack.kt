package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Backpack: ImageVector
    get() {
        if (_backpack != null) {
            return _backpack!!
        }
        _backpack = Builder(name = "Backpack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 40.6f)
                lineTo(168.0f, 32.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 144.0f, 8.0f)
                lineTo(112.0f, 8.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 88.0f, 32.0f)
                verticalLineToRelative(8.6f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 40.0f, 96.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 96.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 168.0f, 40.6f)
                close()
                moveTo(112.0f, 24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(8.0f)
                lineTo(104.0f, 40.0f)
                lineTo(104.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 24.0f)
                close()
                moveTo(168.0f, 160.0f)
                lineTo(88.0f, 160.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(88.0f, 176.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(40.0f)
                lineTo(88.0f, 216.0f)
                close()
                moveTo(200.0f, 216.0f)
                lineTo(184.0f, 216.0f)
                lineTo(184.0f, 152.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -24.0f, -24.0f)
                lineTo(96.0f, 128.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineToRelative(64.0f)
                lineTo(56.0f, 216.0f)
                lineTo(56.0f, 96.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 96.0f, 56.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(200.0f, 216.0f)
                close()
                moveTo(152.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(112.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 88.0f)
                close()
            }
        }
        .build()
        return _backpack!!
    }

private var _backpack: ImageVector? = null
