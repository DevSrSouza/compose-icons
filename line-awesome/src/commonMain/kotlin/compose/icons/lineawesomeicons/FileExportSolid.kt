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

public val LineAwesomeIcons.FileExportSolid: ImageVector
    get() {
        if (_fileExportSolid != null) {
            return _fileExportSolid!!
        }
        _fileExportSolid = Builder(name = "FileExportSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                lineTo(6.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                lineTo(26.0f, 20.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 26.0f)
                lineTo(8.0f, 26.0f)
                lineTo(8.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineTo(24.0f, 10.0f)
                lineTo(26.0f, 12.0f)
                lineTo(26.0f, 4.0f)
                close()
                moveTo(22.4063f, 11.0f)
                lineTo(21.0f, 12.4063f)
                lineTo(23.5625f, 15.0f)
                lineTo(13.9063f, 15.0f)
                lineTo(13.9063f, 17.0f)
                lineTo(23.5625f, 17.0f)
                lineTo(21.0f, 19.5938f)
                lineTo(22.4063f, 21.0f)
                lineTo(26.7188f, 16.7188f)
                lineTo(27.4063f, 16.0f)
                lineTo(26.7188f, 15.2813f)
                close()
            }
        }
        .build()
        return _fileExportSolid!!
    }

private var _fileExportSolid: ImageVector? = null
