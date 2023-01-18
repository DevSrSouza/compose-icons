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

public val ThinGroup.Keyboard: ImageVector
    get() {
        if (_keyboard != null) {
            return _keyboard!!
        }
        _keyboard = Builder(name = "Keyboard", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.5f, 52.0f)
                lineTo(32.5f, 52.0f)
                arcTo(12.5f, 12.5f, 0.0f, false, false, 20.0f, 64.5f)
                verticalLineToRelative(127.0f)
                arcTo(12.5f, 12.5f, 0.0f, false, false, 32.5f, 204.0f)
                horizontalLineToRelative(191.0f)
                arcTo(12.5f, 12.5f, 0.0f, false, false, 236.0f, 191.5f)
                lineTo(236.0f, 64.5f)
                arcTo(12.5f, 12.5f, 0.0f, false, false, 223.5f, 52.0f)
                close()
                moveTo(228.0f, 191.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, 4.5f)
                lineTo(32.5f, 196.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.5f, -4.5f)
                lineTo(28.0f, 64.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 32.5f, 60.0f)
                horizontalLineToRelative(191.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.5f, 4.5f)
                close()
                moveTo(204.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(200.0f, 124.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 128.0f)
                close()
                moveTo(204.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(200.0f, 92.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 96.0f)
                close()
                moveTo(68.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 68.0f, 160.0f)
                close()
                moveTo(164.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 160.0f)
                close()
                moveTo(204.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 160.0f)
                close()
            }
        }
        .build()
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
