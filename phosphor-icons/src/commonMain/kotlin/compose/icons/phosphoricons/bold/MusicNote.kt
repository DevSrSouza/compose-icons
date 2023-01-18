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

public val BoldGroup.MusicNote: ImageVector
    get() {
        if (_musicNote != null) {
            return _musicNote!!
        }
        _musicNote = Builder(name = "MusicNote", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.4f, 52.5f)
                lineToRelative(-80.0f, -24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 40.0f)
                verticalLineTo(140.2f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 140.0f, 184.0f)
                verticalLineTo(104.1f)
                lineToRelative(64.6f, 19.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 220.0f, 112.0f)
                verticalLineTo(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 211.4f, 52.5f)
                close()
                moveTo(88.0f, 212.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 88.0f, 212.0f)
                close()
                moveTo(196.0f, 95.9f)
                lineTo(140.0f, 79.1f)
                verticalLineToRelative(-23.0f)
                lineToRelative(56.0f, 16.8f)
                close()
            }
        }
        .build()
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
