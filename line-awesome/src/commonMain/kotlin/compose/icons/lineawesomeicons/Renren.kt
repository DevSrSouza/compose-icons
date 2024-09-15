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

public val LineAwesomeIcons.Renren: ImageVector
    get() {
        if (_renren != null) {
            return _renren!!
        }
        _renren = Builder(name = "Renren", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.563f, 7.0f)
                curveTo(3.281f, 7.719f, 0.0f, 11.449f, 0.0f, 15.938f)
                curveTo(0.0f, 18.168f, 0.82f, 20.203f, 2.156f, 21.781f)
                curveTo(5.328f, 20.246f, 7.547f, 16.793f, 7.563f, 12.75f)
                close()
                moveTo(10.563f, 7.0f)
                lineTo(10.563f, 12.688f)
                curveTo(10.563f, 16.746f, 12.789f, 20.242f, 15.969f, 21.781f)
                curveTo(14.633f, 20.203f, 13.813f, 18.168f, 13.813f, 15.938f)
                curveTo(13.813f, 13.707f, 14.629f, 11.672f, 15.969f, 10.094f)
                curveTo(14.617f, 8.496f, 12.715f, 7.359f, 10.563f, 7.0f)
                close()
                moveTo(15.969f, 10.094f)
                curveTo(17.305f, 11.672f, 18.188f, 13.707f, 18.188f, 15.938f)
                curveTo(18.188f, 18.168f, 17.305f, 20.203f, 15.969f, 21.781f)
                curveTo(19.141f, 20.246f, 21.422f, 16.789f, 21.438f, 12.75f)
                lineTo(21.438f, 7.0f)
                curveTo(19.285f, 7.363f, 17.32f, 8.496f, 15.969f, 10.094f)
                close()
                moveTo(24.438f, 7.0f)
                lineTo(24.438f, 12.688f)
                curveTo(24.438f, 16.746f, 26.664f, 20.242f, 29.844f, 21.781f)
                curveTo(31.18f, 20.203f, 32.0f, 18.168f, 32.0f, 15.938f)
                curveTo(32.0f, 11.449f, 28.719f, 7.719f, 24.438f, 7.0f)
                close()
                moveTo(9.063f, 18.219f)
                curveTo(8.5f, 20.555f, 6.82f, 22.547f, 4.719f, 23.875f)
                curveTo(6.008f, 24.582f, 7.488f, 25.0f, 9.063f, 25.0f)
                curveTo(10.637f, 25.0f, 12.117f, 24.582f, 13.406f, 23.875f)
                curveTo(11.309f, 22.547f, 9.625f, 20.555f, 9.063f, 18.219f)
                close()
                moveTo(22.938f, 18.219f)
                curveTo(22.375f, 20.555f, 20.695f, 22.547f, 18.594f, 23.875f)
                curveTo(19.883f, 24.582f, 21.363f, 25.0f, 22.938f, 25.0f)
                curveTo(24.512f, 25.0f, 25.992f, 24.582f, 27.281f, 23.875f)
                curveTo(25.184f, 22.547f, 23.5f, 20.555f, 22.938f, 18.219f)
                close()
            }
        }
        .build()
        return _renren!!
    }

private var _renren: ImageVector? = null
