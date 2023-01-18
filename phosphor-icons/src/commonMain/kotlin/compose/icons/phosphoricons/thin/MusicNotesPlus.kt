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

public val ThinGroup.MusicNotesPlus: ImageVector
    get() {
        if (_musicNotesPlus != null) {
            return _musicNotesPlus!!
        }
        _musicNotesPlus = Builder(name = "MusicNotesPlus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(204.0f, 60.0f)
                lineTo(204.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(196.0f, 60.0f)
                lineTo(176.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(196.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(204.0f, 52.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 56.0f)
                close()
                moveTo(212.0f, 119.2f)
                lineTo(212.0f, 172.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, true, true, -8.0f, -21.1f)
                lineTo(204.0f, 119.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                close()
                moveTo(204.0f, 172.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 204.0f, 172.0f)
                close()
                moveTo(84.0f, 115.1f)
                lineTo(84.0f, 204.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, true, true, -8.0f, -21.1f)
                lineTo(76.0f, 64.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 3.0f, -3.9f)
                lineTo(135.5f, 46.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.8f, 2.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.9f, 4.9f)
                lineTo(84.0f, 67.1f)
                verticalLineToRelative(39.8f)
                lineToRelative(74.1f, -18.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.9f, 7.7f)
                close()
                moveTo(76.0f, 204.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 76.0f, 204.0f)
                close()
            }
        }
        .build()
        return _musicNotesPlus!!
    }

private var _musicNotesPlus: ImageVector? = null
