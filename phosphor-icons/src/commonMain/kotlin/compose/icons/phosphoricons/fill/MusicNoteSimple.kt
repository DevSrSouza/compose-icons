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

public val FillGroup.MusicNoteSimple: ImageVector
    get() {
        if (_musicNoteSimple != null) {
            return _musicNoteSimple!!
        }
        _musicNoteSimple = Builder(name = "MusicNoteSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.7f, 66.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -10.0f, 5.4f)
                lineTo(136.0f, 50.8f)
                verticalLineTo(184.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -48.0f, -48.0f)
                arcToRelative(47.4f, 47.4f, 0.0f, false, true, 32.0f, 12.3f)
                verticalLineTo(40.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 3.2f, -6.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 7.1f, -1.3f)
                lineToRelative(80.0f, 24.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 215.7f, 66.3f)
                close()
            }
        }
        .build()
        return _musicNoteSimple!!
    }

private var _musicNoteSimple: ImageVector? = null
