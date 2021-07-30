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

public val CssGgIcons.CornerDoubleRightDown: ImageVector
    get() {
        if (_cornerDoubleRightDown != null) {
            return _cornerDoubleRightDown!!
        }
        _cornerDoubleRightDown = Builder(name = "CornerDoubleRightDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6944f, 12.7048f)
                lineTo(2.6378f, 7.8642f)
                lineTo(7.4783f, 2.8076f)
                lineTo(8.923f, 4.1906f)
                lineTo(6.5662f, 6.6526f)
                lineTo(12.6002f, 6.4906f)
                curveTo(15.2502f, 6.4194f, 17.4561f, 8.51f, 17.5273f, 11.16f)
                lineTo(17.6864f, 17.0862f)
                lineTo(19.9335f, 14.7924f)
                lineTo(21.3622f, 16.192f)
                lineTo(16.4636f, 21.1924f)
                lineTo(11.4632f, 16.2938f)
                lineTo(12.8628f, 14.8651f)
                lineTo(15.2897f, 17.2426f)
                lineTo(15.1281f, 11.2245f)
                curveTo(15.0926f, 9.8995f, 13.9896f, 8.8542f, 12.6646f, 8.8897f)
                lineTo(6.7667f, 9.0481f)
                lineTo(9.0774f, 11.26f)
                lineTo(7.6944f, 12.7048f)
                close()
            }
        }
        .build()
        return _cornerDoubleRightDown!!
    }

private var _cornerDoubleRightDown: ImageVector? = null
