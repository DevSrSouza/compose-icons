package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Xilinx: ImageVector
    get() {
        if (_xilinx != null) {
            return _xilinx!!
        }
        _xilinx = Builder(name = "Xilinx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 18.0f)
                lineToRelative(5.241f, 6.0f)
                horizontalLineTo(5.586f)
                lineTo(0.345f, 18.0f)
                lineToRelative(5.241f, -6.0f)
                lineTo(0.345f, 6.0f)
                lineToRelative(5.241f, -6.0f)
                horizontalLineToRelative(7.655f)
                lineTo(8.0f, 6.0f)
                lineToRelative(5.241f, 6.0f)
                lineTo(8.0f, 18.0f)
                close()
                moveTo(23.655f, 0.0f)
                horizontalLineTo(13.241f)
                lineToRelative(5.241f, 6.0f)
                lineToRelative(5.173f, -6.0f)
                close()
                moveTo(13.241f, 24.0f)
                horizontalLineToRelative(10.414f)
                lineToRelative(-5.172f, -6.0f)
                lineToRelative(-5.242f, 6.0f)
                close()
            }
        }
        .build()
        return _xilinx!!
    }

private var _xilinx: ImageVector? = null
