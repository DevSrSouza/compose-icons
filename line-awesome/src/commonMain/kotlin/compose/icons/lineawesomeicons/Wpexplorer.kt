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

public val LineAwesomeIcons.Wpexplorer: ImageVector
    get() {
        if (_wpexplorer != null) {
            return _wpexplorer!!
        }
        _wpexplorer = Builder(name = "Wpexplorer", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.8f, 3.0f, 3.0f, 8.8f, 3.0f, 16.0f)
                curveTo(3.0f, 23.2f, 8.8f, 29.0f, 16.0f, 29.0f)
                curveTo(23.2f, 29.0f, 29.0f, 23.2f, 29.0f, 16.0f)
                curveTo(29.0f, 8.8f, 23.2f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.1f, 5.0f, 27.0f, 9.9f, 27.0f, 16.0f)
                curveTo(27.0f, 22.1f, 22.1f, 27.0f, 16.0f, 27.0f)
                curveTo(9.9f, 27.0f, 5.0f, 22.1f, 5.0f, 16.0f)
                curveTo(5.0f, 9.9f, 9.9f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.1992f, 10.0f)
                lineTo(9.4004f, 14.3008f)
                lineTo(13.6992f, 16.0996f)
                lineTo(15.5f, 11.8008f)
                lineTo(11.1992f, 10.0f)
                close()
                moveTo(16.0f, 12.5996f)
                lineTo(14.5996f, 16.0f)
                lineTo(17.9004f, 17.4004f)
                lineTo(17.916f, 17.3652f)
                lineTo(18.0f, 17.4004f)
                lineTo(19.5f, 14.0f)
                lineTo(16.0f, 12.5996f)
                close()
                moveTo(20.0f, 14.6992f)
                lineTo(18.9004f, 17.4004f)
                lineTo(21.5996f, 18.5f)
                lineTo(22.8008f, 15.8008f)
                lineTo(20.0f, 14.6992f)
                close()
                moveTo(14.3008f, 16.5996f)
                lineTo(14.0f, 17.1992f)
                lineTo(15.0996f, 17.6992f)
                lineTo(12.5996f, 23.0f)
                lineTo(13.3008f, 23.0f)
                lineTo(15.6992f, 18.0996f)
                lineTo(18.1992f, 23.0f)
                lineTo(18.9004f, 23.0f)
                lineTo(16.5996f, 18.4004f)
                lineTo(17.4004f, 18.6992f)
                lineTo(17.6992f, 18.0f)
                lineTo(14.3008f, 16.5996f)
                close()
            }
        }
        .build()
        return _wpexplorer!!
    }

private var _wpexplorer: ImageVector? = null
