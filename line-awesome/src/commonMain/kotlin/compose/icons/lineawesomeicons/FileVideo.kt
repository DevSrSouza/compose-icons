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

public val LineAwesomeIcons.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) {
            return _fileVideo!!
        }
        _fileVideo = Builder(name = "FileVideo", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 9.5938f)
                lineTo(25.7188f, 9.2813f)
                lineTo(19.7188f, 3.2813f)
                lineTo(19.4063f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                lineTo(18.0f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                close()
                moveTo(20.0f, 6.4375f)
                lineTo(22.5625f, 9.0f)
                lineTo(20.0f, 9.0f)
                close()
                moveTo(13.0f, 13.2188f)
                lineTo(13.0f, 22.7813f)
                lineTo(14.5f, 21.8438f)
                lineTo(19.5f, 18.8438f)
                lineTo(20.9375f, 18.0f)
                lineTo(19.5f, 17.1563f)
                lineTo(14.5f, 14.1563f)
                close()
                moveTo(15.0f, 16.75f)
                lineTo(17.0938f, 18.0f)
                lineTo(15.0f, 19.25f)
                close()
            }
        }
        .build()
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
