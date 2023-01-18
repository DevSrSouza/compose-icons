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

public val ThinGroup.MagicWand: ImageVector
    get() {
        if (_magicWand != null) {
            return _magicWand!!
        }
        _magicWand = Builder(name = "MagicWand", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(220.0f, 156.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(212.0f, 156.0f)
                lineTo(192.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(212.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 152.0f)
                close()
                moveTo(64.0f, 64.0f)
                lineTo(80.0f, 64.0f)
                lineTo(80.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(88.0f, 64.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(88.0f, 56.0f)
                lineTo(88.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(80.0f, 56.0f)
                lineTo(64.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(184.0f, 196.0f)
                lineTo(172.0f, 196.0f)
                lineTo(172.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(12.0f)
                lineTo(152.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(172.0f, 204.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(178.8f, 114.8f)
                lineTo(72.5f, 221.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(34.8f, 200.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(183.5f, 34.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(20.7f, 20.7f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-42.4f, 42.3f)
                close()
                moveTo(149.7f, 80.0f)
                lineTo(176.0f, 106.3f)
                lineToRelative(39.5f, -39.5f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineTo(194.8f, 40.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.6f, 0.0f)
                close()
                moveTo(170.3f, 112.0f)
                lineTo(144.0f, 85.7f)
                lineTo(40.5f, 189.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                lineToRelative(20.7f, 20.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                close()
            }
        }
        .build()
        return _magicWand!!
    }

private var _magicWand: ImageVector? = null
