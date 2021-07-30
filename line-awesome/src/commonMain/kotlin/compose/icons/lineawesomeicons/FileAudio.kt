package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) {
            return _fileAudio!!
        }
        _fileAudio = Builder(name = "FileAudio", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(24.0f, 5.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                close()
                moveTo(16.0f, 9.7188f)
                lineTo(16.0f, 16.1875f)
                curveTo(15.6836f, 16.0742f, 15.3516f, 16.0f, 15.0f, 16.0f)
                curveTo(13.3555f, 16.0f, 12.0f, 17.3555f, 12.0f, 19.0f)
                curveTo(12.0f, 20.6445f, 13.3555f, 22.0f, 15.0f, 22.0f)
                curveTo(16.6445f, 22.0f, 18.0f, 20.6445f, 18.0f, 19.0f)
                lineTo(18.0f, 12.2813f)
                lineTo(20.75f, 12.9688f)
                lineTo(21.25f, 11.0313f)
                close()
                moveTo(15.0f, 18.0f)
                curveTo(15.5625f, 18.0f, 16.0f, 18.4375f, 16.0f, 19.0f)
                curveTo(16.0f, 19.5625f, 15.5625f, 20.0f, 15.0f, 20.0f)
                curveTo(14.4375f, 20.0f, 14.0f, 19.5625f, 14.0f, 19.0f)
                curveTo(14.0f, 18.4375f, 14.4375f, 18.0f, 15.0f, 18.0f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
