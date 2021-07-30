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

public val LineAwesomeIcons.VimeoSquare: ImageVector
    get() {
        if (_vimeoSquare != null) {
            return _vimeoSquare!!
        }
        _vimeoSquare = Builder(name = "VimeoSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(20.8789f, 10.0f)
                curveTo(18.9709f, 10.0f, 17.676f, 10.8279f, 17.0f, 13.0449f)
                curveTo(17.844f, 12.6829f, 19.0913f, 12.588f, 18.9453f, 14.0f)
                curveTo(18.9063f, 14.478f, 18.4832f, 15.3585f, 17.9063f, 16.2715f)
                curveTo(16.3043f, 18.7985f, 15.9143f, 17.954f, 15.0313f, 12.375f)
                curveTo(14.7813f, 10.804f, 14.1228f, 10.0728f, 13.0508f, 10.1758f)
                curveTo(12.1038f, 10.2618f, 10.588f, 11.7691f, 9.0f, 13.1641f)
                lineTo(9.6465f, 14.0f)
                curveTo(10.2625f, 13.565f, 10.6226f, 13.3906f, 10.7266f, 13.3906f)
                curveTo(11.6226f, 13.3906f, 12.083f, 15.7194f, 13.168f, 19.6934f)
                curveTo(13.723f, 21.1744f, 14.3981f, 21.9141f, 15.2031f, 21.9141f)
                curveTo(16.4991f, 21.9141f, 18.084f, 20.6967f, 19.957f, 18.2637f)
                curveTo(21.769f, 15.9347f, 22.8111f, 14.0968f, 22.8711f, 12.7578f)
                curveTo(22.9221f, 11.0478f, 22.1929f, 10.0f, 20.8789f, 10.0f)
                close()
            }
        }
        .build()
        return _vimeoSquare!!
    }

private var _vimeoSquare: ImageVector? = null
