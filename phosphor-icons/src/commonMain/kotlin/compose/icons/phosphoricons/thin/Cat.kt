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

public val ThinGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 140.0f)
                close()
                moveTo(172.0f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 172.0f, 132.0f)
                close()
                moveTo(228.0f, 51.3f)
                lineTo(228.0f, 136.0f)
                curveToRelative(0.0f, 50.7f, -44.9f, 92.0f, -100.0f, 92.0f)
                reflectiveCurveTo(28.0f, 186.7f, 28.0f, 136.0f)
                lineTo(28.0f, 51.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.5f, -8.5f)
                lineTo(68.0f, 62.4f)
                arcToRelative(105.0f, 105.0f, 0.0f, false, true, 26.2f, -13.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 1.1f, -0.3f)
                arcToRelative(107.4f, 107.4f, 0.0f, false, true, 65.4f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 1.1f, 0.3f)
                arcToRelative(105.0f, 105.0f, 0.0f, false, true, 26.2f, 13.0f)
                lineToRelative(19.5f, -19.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 51.3f)
                close()
                moveTo(220.0f, 51.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.5f, -3.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -4.3f, 0.9f)
                lineToRelative(-22.0f, 21.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.2f, 0.4f)
                arcToRelative(94.1f, 94.1f, 0.0f, false, false, -22.0f, -12.1f)
                lineTo(164.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(156.0f, 56.0f)
                arcToRelative(101.1f, 101.1f, 0.0f, false, false, -24.0f, -3.9f)
                lineTo(132.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 52.1f)
                arcTo(101.1f, 101.1f, 0.0f, false, false, 100.0f, 56.0f)
                lineTo(100.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(92.0f, 58.7f)
                arcTo(94.1f, 94.1f, 0.0f, false, false, 70.0f, 70.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.2f, -0.4f)
                lineToRelative(-22.0f, -21.9f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -2.7f, -1.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.1f, 4.0f)
                lineTo(36.0f, 136.0f)
                curveToRelative(0.0f, 45.1f, 39.1f, 82.0f, 88.0f, 83.9f)
                lineTo(124.0f, 193.7f)
                lineToRelative(-14.8f, -14.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineTo(128.0f, 186.3f)
                lineToRelative(13.2f, -13.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 5.6f)
                lineTo(132.0f, 193.7f)
                verticalLineToRelative(26.2f)
                curveToRelative(48.9f, -1.9f, 88.0f, -38.8f, 88.0f, -83.9f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
