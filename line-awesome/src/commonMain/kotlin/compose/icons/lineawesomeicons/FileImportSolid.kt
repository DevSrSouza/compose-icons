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

public val LineAwesomeIcons.FileImportSolid: ImageVector
    get() {
        if (_fileImportSolid != null) {
            return _fileImportSolid!!
        }
        _fileImportSolid = Builder(name = "FileImportSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                lineTo(6.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                lineTo(26.0f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 26.0f)
                lineTo(8.0f, 26.0f)
                lineTo(8.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineTo(24.0f, 13.0f)
                lineTo(26.0f, 13.0f)
                lineTo(26.0f, 4.0f)
                close()
                moveTo(17.5f, 11.0f)
                lineTo(13.188f, 15.281f)
                lineTo(12.5f, 16.0f)
                lineTo(13.188f, 16.719f)
                lineTo(17.5f, 21.0f)
                lineTo(18.906f, 19.594f)
                lineTo(16.313f, 17.0f)
                lineTo(28.0f, 17.0f)
                lineTo(28.0f, 15.0f)
                lineTo(16.313f, 15.0f)
                lineTo(18.906f, 12.406f)
                close()
            }
        }
        .build()
        return _fileImportSolid!!
    }

private var _fileImportSolid: ImageVector? = null
