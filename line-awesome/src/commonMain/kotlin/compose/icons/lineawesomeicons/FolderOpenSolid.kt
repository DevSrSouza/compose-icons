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

public val LineAwesomeIcons.FolderOpenSolid: ImageVector
    get() {
        if (_folderOpenSolid != null) {
            return _folderOpenSolid!!
        }
        _folderOpenSolid = Builder(name = "FolderOpenSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                lineTo(5.0f, 27.8125f)
                lineTo(5.7813f, 27.9688f)
                lineTo(17.7813f, 30.4688f)
                lineTo(19.0f, 30.7188f)
                lineTo(19.0f, 28.0f)
                lineTo(25.0f, 28.0f)
                lineTo(25.0f, 15.4375f)
                lineTo(26.7188f, 13.7188f)
                lineTo(27.0f, 13.4063f)
                lineTo(27.0f, 3.0f)
                close()
                moveTo(14.125f, 5.0f)
                lineTo(25.0f, 5.0f)
                lineTo(25.0f, 12.5625f)
                lineTo(23.2813f, 14.2813f)
                lineTo(23.0f, 14.5938f)
                lineTo(23.0f, 26.0f)
                lineTo(19.0f, 26.0f)
                lineTo(19.0f, 17.0938f)
                lineTo(18.7188f, 16.7813f)
                lineTo(17.0f, 15.0625f)
                lineTo(17.0f, 5.7188f)
                close()
                moveTo(7.0f, 5.2813f)
                lineTo(15.0f, 7.2813f)
                lineTo(15.0f, 15.9063f)
                lineTo(15.2813f, 16.2188f)
                lineTo(17.0f, 17.9375f)
                lineTo(17.0f, 28.2813f)
                lineTo(7.0f, 26.1875f)
                close()
            }
        }
        .build()
        return _folderOpenSolid!!
    }

private var _folderOpenSolid: ImageVector? = null
