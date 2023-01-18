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

public val ThinGroup.MusicNote: ImageVector
    get() {
        if (_musicNote != null) {
            return _musicNote!!
        }
        _musicNote = Builder(name = "MusicNote", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.1f, 60.2f)
                lineToRelative(-80.0f, -24.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, -3.5f, 0.6f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 124.0f, 40.0f)
                verticalLineTo(158.7f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 8.0f, 25.3f)
                verticalLineTo(93.4f)
                lineToRelative(74.9f, 22.4f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 3.5f, -0.6f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 212.0f, 112.0f)
                verticalLineTo(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 209.1f, 60.2f)
                close()
                moveTo(88.0f, 220.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 88.0f, 220.0f)
                close()
                moveTo(204.0f, 106.6f)
                lineTo(132.0f, 85.0f)
                verticalLineTo(45.4f)
                lineTo(204.0f, 67.0f)
                close()
            }
        }
        .build()
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
