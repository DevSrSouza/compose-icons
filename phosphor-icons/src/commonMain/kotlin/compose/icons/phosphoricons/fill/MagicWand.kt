package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.MagicWand: ImageVector
    get() {
        if (_magicWand != null) {
            return _magicWand!!
        }
        _magicWand = Builder(name = "MagicWand", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 60.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(76.0f, 52.0f)
                lineTo(76.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(92.0f, 52.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(92.0f, 68.0f)
                lineTo(92.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(76.0f, 68.0f)
                lineTo(64.0f, 68.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 60.0f)
                close()
                moveTo(240.0f, 144.0f)
                lineTo(224.0f, 144.0f)
                lineTo(224.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(16.0f)
                lineTo(192.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(224.0f, 160.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(181.7f, 117.7f)
                lineTo(75.3f, 224.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -22.6f, 0.0f)
                lineTo(32.0f, 203.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 0.0f, -22.6f)
                lineTo(180.7f, 32.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 22.6f, 0.0f)
                lineTo(224.0f, 52.7f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 0.0f, 22.6f)
                lineToRelative(-42.3f, 42.4f)
                close()
                moveTo(176.0f, 100.7f)
                lineTo(212.7f, 64.0f)
                horizontalLineToRelative(0.0f)
                lineTo(192.0f, 43.3f)
                lineTo(155.3f, 80.0f)
                close()
                moveTo(184.0f, 192.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _magicWand!!
    }

private var _magicWand: ImageVector? = null
