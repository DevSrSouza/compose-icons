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

public val LineAwesomeIcons.VialSolid: ImageVector
    get() {
        if (_vialSolid != null) {
            return _vialSolid!!
        }
        _vialSolid = Builder(name = "VialSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.688f, 3.273f)
                lineTo(17.271f, 4.688f)
                lineTo(18.592f, 6.008f)
                lineTo(5.5f, 19.1f)
                curveTo(3.5f, 21.1f, 3.5f, 24.5f, 5.5f, 26.5f)
                curveTo(6.5f, 27.5f, 7.899f, 28.0f, 9.199f, 28.0f)
                curveTo(10.599f, 28.0f, 11.9f, 27.5f, 12.9f, 26.5f)
                lineTo(25.992f, 13.408f)
                lineTo(27.242f, 14.656f)
                lineTo(28.656f, 13.242f)
                lineTo(18.688f, 3.273f)
                close()
                moveTo(19.992f, 7.408f)
                lineTo(24.592f, 12.008f)
                lineTo(20.6f, 16.0f)
                lineTo(11.4f, 16.0f)
                lineTo(19.992f, 7.408f)
                close()
                moveTo(9.4f, 18.0f)
                lineTo(18.6f, 18.0f)
                lineTo(11.5f, 25.1f)
                curveTo(10.2f, 26.4f, 8.2f, 26.4f, 6.9f, 25.1f)
                curveTo(5.6f, 23.8f, 5.6f, 21.8f, 6.9f, 20.5f)
                lineTo(9.4f, 18.0f)
                close()
            }
        }
        .build()
        return _vialSolid!!
    }

private var _vialSolid: ImageVector? = null
