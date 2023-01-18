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

public val FillGroup.MusicNotesPlus: ImageVector
    get() {
        if (_musicNotesPlus != null) {
            return _musicNotesPlus!!
        }
        _musicNotesPlus = Builder(name = "MusicNotesPlus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(208.0f, 64.0f)
                lineTo(208.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(192.0f, 64.0f)
                lineTo(176.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(192.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(208.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(208.0f, 111.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(22.9f)
                arcToRelative(35.3f, 35.3f, 0.0f, false, false, -20.0f, -6.1f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                lineTo(216.0f, 119.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 111.2f)
                close()
                moveTo(162.4f, 99.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.4f, -5.2f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -2.0f, -7.7f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -2.6f, -1.7f)
                arcTo(32.3f, 32.3f, 0.0f, false, true, 144.0f, 56.0f)
                arcToRelative(37.1f, 37.1f, 0.0f, false, true, 0.3f, -4.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -2.0f, -6.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -7.8f, -2.3f)
                lineTo(78.1f, 56.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 64.0f)
                lineTo(72.0f, 174.1f)
                arcTo(35.3f, 35.3f, 0.0f, false, false, 52.0f, 168.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                lineTo(88.0f, 118.2f)
                lineTo(160.8f, 100.0f)
                close()
            }
        }
        .build()
        return _musicNotesPlus!!
    }

private var _musicNotesPlus: ImageVector? = null