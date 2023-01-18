package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Playlist: ImageVector
    get() {
        if (_playlist != null) {
            return _playlist!!
        }
        _playlist = Builder(name = "Playlist", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(216.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(40.0f, 70.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 34.0f, 64.0f)
                close()
                moveTo(40.0f, 134.0f)
                lineTo(160.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(40.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(112.0f, 186.0f)
                lineTo(40.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(245.7f, 125.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -7.4f, 4.0f)
                lineTo(206.0f, 120.1f)
                lineTo(206.0f, 192.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, -30.0f, -30.0f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, true, 18.0f, 6.0f)
                lineTo(194.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.4f, -4.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 5.3f, -0.9f)
                lineToRelative(40.0f, 12.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 245.7f, 125.7f)
                close()
                moveTo(194.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, false, -18.0f, 18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, false, 194.0f, 192.0f)
                close()
            }
        }
        .build()
        return _playlist!!
    }

private var _playlist: ImageVector? = null
