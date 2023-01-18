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

public val ThinGroup.MusicNotes: ImageVector
    get() {
        if (_musicNotes != null) {
            return _musicNotes!!
        }
        _musicNotes = Builder(name = "MusicNotes", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.5f, 28.8f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -3.5f, -0.7f)
                lineTo(79.0f, 60.1f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 76.0f, 64.0f)
                lineTo(76.0f, 182.9f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 84.0f, 204.0f)
                lineTo(84.0f, 115.1f)
                lineToRelative(120.0f, -30.0f)
                verticalLineToRelative(65.8f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 8.0f, 21.1f)
                lineTo(212.0f, 32.0f)
                arcTo(4.4f, 4.4f, 0.0f, false, false, 210.5f, 28.8f)
                close()
                moveTo(52.0f, 228.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 52.0f, 228.0f)
                close()
                moveTo(180.0f, 196.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 180.0f, 196.0f)
                close()
                moveTo(84.0f, 106.9f)
                lineTo(84.0f, 67.1f)
                lineToRelative(120.0f, -30.0f)
                lineTo(204.0f, 76.9f)
                close()
            }
        }
        .build()
        return _musicNotes!!
    }

private var _musicNotes: ImageVector? = null
