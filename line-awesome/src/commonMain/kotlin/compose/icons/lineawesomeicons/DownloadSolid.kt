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

public val LineAwesomeIcons.DownloadSolid: ImageVector
    get() {
        if (_downloadSolid != null) {
            return _downloadSolid!!
        }
        _downloadSolid = Builder(name = "DownloadSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                lineTo(15.0f, 20.5625f)
                lineTo(9.7188f, 15.2813f)
                lineTo(8.2813f, 16.7188f)
                lineTo(15.2813f, 23.7188f)
                lineTo(16.0f, 24.4063f)
                lineTo(16.7188f, 23.7188f)
                lineTo(23.7188f, 16.7188f)
                lineTo(22.2813f, 15.2813f)
                lineTo(17.0f, 20.5625f)
                lineTo(17.0f, 4.0f)
                close()
                moveTo(7.0f, 26.0f)
                lineTo(7.0f, 28.0f)
                lineTo(25.0f, 28.0f)
                lineTo(25.0f, 26.0f)
                close()
            }
        }
        .build()
        return _downloadSolid!!
    }

private var _downloadSolid: ImageVector? = null
