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

public val LineAwesomeIcons.FileAudioSolid: ImageVector
    get() {
        if (_fileAudioSolid != null) {
            return _fileAudioSolid!!
        }
        _fileAudioSolid = Builder(name = "FileAudioSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(16.0f, 9.719f)
                lineTo(16.0f, 16.188f)
                curveTo(15.684f, 16.074f, 15.352f, 16.0f, 15.0f, 16.0f)
                curveTo(13.355f, 16.0f, 12.0f, 17.355f, 12.0f, 19.0f)
                curveTo(12.0f, 20.645f, 13.355f, 22.0f, 15.0f, 22.0f)
                curveTo(16.645f, 22.0f, 18.0f, 20.645f, 18.0f, 19.0f)
                lineTo(18.0f, 12.281f)
                lineTo(20.75f, 12.969f)
                lineTo(21.25f, 11.031f)
                close()
                moveTo(15.0f, 18.0f)
                curveTo(15.563f, 18.0f, 16.0f, 18.438f, 16.0f, 19.0f)
                curveTo(16.0f, 19.563f, 15.563f, 20.0f, 15.0f, 20.0f)
                curveTo(14.438f, 20.0f, 14.0f, 19.563f, 14.0f, 19.0f)
                curveTo(14.0f, 18.438f, 14.438f, 18.0f, 15.0f, 18.0f)
                close()
            }
        }
        .build()
        return _fileAudioSolid!!
    }

private var _fileAudioSolid: ImageVector? = null
