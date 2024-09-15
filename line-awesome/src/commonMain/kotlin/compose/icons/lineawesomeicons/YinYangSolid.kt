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

public val LineAwesomeIcons.YinYangSolid: ImageVector
    get() {
        if (_yinYangSolid != null) {
            return _yinYangSolid!!
        }
        _yinYangSolid = Builder(name = "YinYangSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(16.086f, 28.0f, 16.164f, 28.0f, 16.25f, 28.0f)
                curveTo(16.336f, 28.004f, 16.414f, 28.0f, 16.5f, 28.0f)
                lineTo(16.5f, 27.969f)
                curveTo(22.883f, 27.703f, 28.0f, 22.445f, 28.0f, 16.0f)
                curveTo(28.0f, 10.125f, 23.742f, 5.242f, 18.156f, 4.219f)
                curveTo(17.629f, 4.078f, 17.07f, 4.0f, 16.5f, 4.0f)
                lineTo(16.5f, 4.031f)
                curveTo(16.332f, 4.023f, 16.168f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(16.348f, 6.0f, 16.695f, 6.027f, 17.031f, 6.063f)
                curveTo(17.156f, 6.078f, 17.285f, 6.07f, 17.406f, 6.094f)
                curveTo(17.438f, 6.098f, 17.469f, 6.121f, 17.5f, 6.125f)
                curveTo(19.508f, 6.578f, 21.0f, 8.348f, 21.0f, 10.5f)
                curveTo(21.0f, 12.996f, 18.996f, 15.0f, 16.5f, 15.0f)
                curveTo(12.922f, 15.0f, 10.0f, 17.922f, 10.0f, 21.5f)
                curveTo(10.0f, 22.57f, 10.258f, 23.578f, 10.719f, 24.469f)
                curveTo(7.887f, 22.707f, 6.0f, 19.59f, 6.0f, 16.0f)
                curveTo(6.0f, 10.465f, 10.465f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(22.719f, 8.625f)
                curveTo(24.727f, 10.453f, 26.0f, 13.063f, 26.0f, 16.0f)
                curveTo(26.0f, 21.43f, 21.699f, 25.805f, 16.313f, 25.969f)
                curveTo(13.906f, 25.867f, 12.0f, 23.934f, 12.0f, 21.5f)
                curveTo(12.0f, 19.004f, 14.004f, 17.0f, 16.5f, 17.0f)
                curveTo(20.078f, 17.0f, 23.0f, 14.078f, 23.0f, 10.5f)
                curveTo(23.0f, 9.852f, 22.898f, 9.219f, 22.719f, 8.625f)
                close()
                moveTo(16.5f, 9.0f)
                curveTo(15.672f, 9.0f, 15.0f, 9.672f, 15.0f, 10.5f)
                curveTo(15.0f, 11.328f, 15.672f, 12.0f, 16.5f, 12.0f)
                curveTo(17.328f, 12.0f, 18.0f, 11.328f, 18.0f, 10.5f)
                curveTo(18.0f, 9.672f, 17.328f, 9.0f, 16.5f, 9.0f)
                close()
                moveTo(16.5f, 20.0f)
                curveTo(15.672f, 20.0f, 15.0f, 20.672f, 15.0f, 21.5f)
                curveTo(15.0f, 22.328f, 15.672f, 23.0f, 16.5f, 23.0f)
                curveTo(17.328f, 23.0f, 18.0f, 22.328f, 18.0f, 21.5f)
                curveTo(18.0f, 20.672f, 17.328f, 20.0f, 16.5f, 20.0f)
                close()
            }
        }
        .build()
        return _yinYangSolid!!
    }

private var _yinYangSolid: ImageVector? = null
