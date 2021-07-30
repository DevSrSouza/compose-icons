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

public val LineAwesomeIcons.FolderMinusSolid: ImageVector
    get() {
        if (_folderMinusSolid != null) {
            return _folderMinusSolid!!
        }
        _folderMinusSolid = Builder(name = "FolderMinusSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 4.0f)
                lineTo(6.0f, 28.0f)
                lineTo(6.0f, 29.0f)
                lineTo(7.0f, 29.0f)
                lineTo(25.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 28.0f)
                lineTo(26.0f, 15.4375f)
                lineTo(27.7188f, 13.7188f)
                lineTo(28.0f, 13.4063f)
                lineTo(28.0f, 13.0f)
                lineTo(28.0f, 4.0f)
                lineTo(28.0f, 3.0f)
                lineTo(27.0f, 3.0f)
                lineTo(24.0f, 3.0f)
                lineTo(23.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(22.0f, 5.0f)
                lineTo(22.0f, 13.0f)
                lineTo(22.0f, 13.4063f)
                lineTo(22.2813f, 13.7188f)
                lineTo(24.0f, 15.4375f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(24.0f, 5.0f)
                lineTo(26.0f, 5.0f)
                lineTo(26.0f, 12.5625f)
                lineTo(25.0f, 13.5625f)
                lineTo(24.0f, 12.5625f)
                lineTo(24.0f, 5.0f)
                close()
                moveTo(12.0f, 15.0f)
                lineTo(12.0f, 17.0f)
                lineTo(20.0f, 17.0f)
                lineTo(20.0f, 15.0f)
                lineTo(12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _folderMinusSolid!!
    }

private var _folderMinusSolid: ImageVector? = null
