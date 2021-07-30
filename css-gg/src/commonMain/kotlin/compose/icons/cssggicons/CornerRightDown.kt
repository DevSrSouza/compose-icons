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

public val CssGgIcons.CornerRightDown: ImageVector
    get() {
        if (_cornerRightDown != null) {
            return _cornerRightDown!!
        }
        _cornerRightDown = Builder(name = "CornerRightDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3987f, 6.85f)
                curveTo(13.3977f, 5.7454f, 12.5014f, 4.8508f, 11.3969f, 4.8518f)
                lineTo(3.3969f, 4.8592f)
                lineTo(3.395f, 2.8592f)
                lineTo(11.395f, 2.8518f)
                curveTo(13.6042f, 2.8498f, 15.3967f, 4.639f, 15.3987f, 6.8481f)
                lineTo(15.4082f, 17.1538f)
                lineTo(19.1895f, 13.3656f)
                lineTo(20.605f, 14.7785f)
                lineTo(14.2469f, 21.1483f)
                lineTo(7.8771f, 14.7902f)
                lineTo(9.29f, 13.3747f)
                lineTo(13.4085f, 17.4856f)
                lineTo(13.3987f, 6.85f)
                close()
            }
        }
        .build()
        return _cornerRightDown!!
    }

private var _cornerRightDown: ImageVector? = null
