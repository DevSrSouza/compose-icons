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

public val LineAwesomeIcons.Joget: ImageVector
    get() {
        if (_joget != null) {
            return _joget!!
        }
        _joget = Builder(name = "Joget", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 16.403f, 26.976f, 16.8f, 26.934f, 17.191f)
                curveTo(24.412f, 17.189f, 17.473f, 17.233f, 14.953f, 17.168f)
                curveTo(11.872f, 17.099f, 10.419f, 16.013f, 11.711f, 14.502f)
                curveTo(12.992f, 12.979f, 14.226f, 12.229f, 15.207f, 11.641f)
                curveTo(16.199f, 11.064f, 16.684f, 9.806f, 13.869f, 10.025f)
                curveTo(8.365f, 10.399f, 6.063f, 13.44f, 5.006f, 15.867f)
                curveTo(5.078f, 9.864f, 9.98f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(21.582f, 12.0f)
                curveTo(20.589f, 12.0f, 18.917f, 13.42f, 17.475f, 14.354f)
                curveTo(15.733f, 15.496f, 13.852f, 16.096f, 13.852f, 16.096f)
                lineTo(23.256f, 16.004f)
                lineTo(25.988f, 14.664f)
                curveTo(25.988f, 14.664f, 26.185f, 14.134f, 24.928f, 13.811f)
                curveTo(23.67f, 13.476f, 21.617f, 14.469f, 19.967f, 15.357f)
                curveTo(18.317f, 16.234f, 18.248f, 15.807f, 18.248f, 15.807f)
                curveTo(18.248f, 15.807f, 20.831f, 13.87f, 21.408f, 13.512f)
                curveTo(21.997f, 13.155f, 23.185f, 12.738f, 22.158f, 12.15f)
                curveTo(21.973f, 12.046f, 21.778f, 12.0f, 21.582f, 12.0f)
                close()
                moveTo(26.092f, 20.367f)
                curveTo(24.398f, 24.265f, 20.513f, 27.0f, 16.0f, 27.0f)
                curveTo(15.299f, 27.0f, 14.614f, 26.927f, 13.949f, 26.801f)
                curveTo(13.566f, 26.169f, 13.196f, 25.507f, 13.037f, 25.141f)
                curveTo(12.703f, 24.368f, 11.469f, 22.567f, 14.838f, 21.344f)
                curveTo(17.532f, 20.369f, 23.588f, 20.392f, 26.092f, 20.367f)
                close()
            }
        }
        .build()
        return _joget!!
    }

private var _joget: ImageVector? = null
