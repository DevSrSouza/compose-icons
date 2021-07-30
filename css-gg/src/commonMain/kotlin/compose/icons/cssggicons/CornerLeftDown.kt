package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CornerLeftDown: ImageVector
    get() {
        if (_cornerLeftDown != null) {
            return _cornerLeftDown!!
        }
        _cornerLeftDown = Builder(name = "CornerLeftDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6013f, 6.85f)
                curveTo(10.6023f, 5.7454f, 11.4986f, 4.8508f, 12.6032f, 4.8518f)
                lineTo(20.6032f, 4.8592f)
                lineTo(20.605f, 2.8592f)
                lineTo(12.605f, 2.8518f)
                curveTo(10.3959f, 2.8498f, 8.6033f, 4.639f, 8.6013f, 6.8481f)
                lineTo(8.5918f, 17.1538f)
                lineTo(4.8105f, 13.3656f)
                lineTo(3.395f, 14.7785f)
                lineTo(9.7531f, 21.1483f)
                lineTo(16.1229f, 14.7902f)
                lineTo(14.71f, 13.3747f)
                lineTo(10.5915f, 17.4856f)
                lineTo(10.6013f, 6.85f)
                close()
            }
        }
        .build()
        return _cornerLeftDown!!
    }

private var _cornerLeftDown: ImageVector? = null
