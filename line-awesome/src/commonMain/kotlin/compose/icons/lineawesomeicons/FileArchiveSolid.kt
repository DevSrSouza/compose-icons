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

public val LineAwesomeIcons.FileArchiveSolid: ImageVector
    get() {
        if (_fileArchiveSolid != null) {
            return _fileArchiveSolid!!
        }
        _fileArchiveSolid = Builder(name = "FileArchiveSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(15.0f, 5.0f)
                lineTo(15.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 5.0f)
                lineTo(24.0f, 5.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 9.0f)
                lineTo(17.0f, 9.0f)
                lineTo(17.0f, 7.0f)
                close()
                moveTo(15.0f, 10.0f)
                lineTo(15.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                lineTo(17.0f, 10.0f)
                close()
                moveTo(15.0f, 13.0f)
                lineTo(15.0f, 15.188f)
                curveTo(13.844f, 15.605f, 13.0f, 16.707f, 13.0f, 18.0f)
                curveTo(13.0f, 19.645f, 14.355f, 21.0f, 16.0f, 21.0f)
                curveTo(17.645f, 21.0f, 19.0f, 19.645f, 19.0f, 18.0f)
                curveTo(19.0f, 16.707f, 18.156f, 15.605f, 17.0f, 15.188f)
                lineTo(17.0f, 13.0f)
                close()
                moveTo(16.0f, 17.0f)
                curveTo(16.563f, 17.0f, 17.0f, 17.438f, 17.0f, 18.0f)
                curveTo(17.0f, 18.563f, 16.563f, 19.0f, 16.0f, 19.0f)
                curveTo(15.438f, 19.0f, 15.0f, 18.563f, 15.0f, 18.0f)
                curveTo(15.0f, 17.438f, 15.438f, 17.0f, 16.0f, 17.0f)
                close()
            }
        }
        .build()
        return _fileArchiveSolid!!
    }

private var _fileArchiveSolid: ImageVector? = null
