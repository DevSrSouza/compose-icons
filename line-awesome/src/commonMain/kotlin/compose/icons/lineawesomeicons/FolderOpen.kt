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

public val LineAwesomeIcons.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                lineTo(5.0f, 27.813f)
                lineTo(5.781f, 27.969f)
                lineTo(17.781f, 30.469f)
                lineTo(19.0f, 30.719f)
                lineTo(19.0f, 28.0f)
                lineTo(25.0f, 28.0f)
                lineTo(25.0f, 15.438f)
                lineTo(26.719f, 13.719f)
                lineTo(27.0f, 13.406f)
                lineTo(27.0f, 3.0f)
                close()
                moveTo(14.125f, 5.0f)
                lineTo(25.0f, 5.0f)
                lineTo(25.0f, 12.563f)
                lineTo(23.281f, 14.281f)
                lineTo(23.0f, 14.594f)
                lineTo(23.0f, 26.0f)
                lineTo(19.0f, 26.0f)
                lineTo(19.0f, 17.094f)
                lineTo(18.719f, 16.781f)
                lineTo(17.0f, 15.063f)
                lineTo(17.0f, 5.719f)
                close()
                moveTo(7.0f, 5.281f)
                lineTo(15.0f, 7.281f)
                lineTo(15.0f, 15.906f)
                lineTo(15.281f, 16.219f)
                lineTo(17.0f, 17.938f)
                lineTo(17.0f, 28.281f)
                lineTo(7.0f, 26.188f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
