package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Whatsapp: ImageVector
    get() {
        if (_whatsapp != null) {
            return _whatsapp!!
        }
        _whatsapp = Builder(name = "Whatsapp", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.504f, 7.504f)
                curveTo(22.246f, 5.246f, 19.246f, 4.0f, 16.051f, 4.0f)
                curveTo(9.465f, 4.0f, 4.102f, 9.359f, 4.102f, 15.945f)
                curveTo(4.098f, 18.051f, 4.648f, 20.105f, 5.695f, 21.918f)
                lineTo(4.0f, 28.109f)
                lineTo(10.336f, 26.445f)
                curveTo(12.078f, 27.398f, 14.047f, 27.898f, 16.047f, 27.902f)
                lineTo(16.051f, 27.902f)
                curveTo(22.637f, 27.902f, 27.996f, 22.543f, 28.0f, 15.953f)
                curveTo(28.0f, 12.762f, 26.758f, 9.762f, 24.504f, 7.504f)
                close()
                moveTo(16.051f, 25.883f)
                lineTo(16.047f, 25.883f)
                curveTo(14.266f, 25.883f, 12.516f, 25.402f, 10.992f, 24.5f)
                lineTo(10.629f, 24.285f)
                lineTo(6.867f, 25.27f)
                lineTo(7.871f, 21.605f)
                lineTo(7.637f, 21.23f)
                curveTo(6.641f, 19.648f, 6.117f, 17.82f, 6.117f, 15.945f)
                curveTo(6.117f, 10.473f, 10.574f, 6.02f, 16.055f, 6.02f)
                curveTo(18.707f, 6.02f, 21.199f, 7.055f, 23.074f, 8.93f)
                curveTo(24.949f, 10.809f, 25.98f, 13.301f, 25.98f, 15.953f)
                curveTo(25.98f, 21.43f, 21.523f, 25.883f, 16.051f, 25.883f)
                close()
                moveTo(21.496f, 18.445f)
                curveTo(21.199f, 18.297f, 19.73f, 17.574f, 19.457f, 17.477f)
                curveTo(19.184f, 17.375f, 18.984f, 17.328f, 18.785f, 17.625f)
                curveTo(18.586f, 17.926f, 18.016f, 18.598f, 17.84f, 18.797f)
                curveTo(17.668f, 18.992f, 17.492f, 19.02f, 17.195f, 18.871f)
                curveTo(16.895f, 18.723f, 15.934f, 18.406f, 14.793f, 17.387f)
                curveTo(13.906f, 16.598f, 13.305f, 15.617f, 13.133f, 15.32f)
                curveTo(12.957f, 15.02f, 13.113f, 14.859f, 13.262f, 14.711f)
                curveTo(13.398f, 14.578f, 13.563f, 14.363f, 13.711f, 14.188f)
                curveTo(13.859f, 14.016f, 13.91f, 13.891f, 14.012f, 13.691f)
                curveTo(14.109f, 13.492f, 14.059f, 13.316f, 13.984f, 13.168f)
                curveTo(13.91f, 13.02f, 13.313f, 11.547f, 13.063f, 10.949f)
                curveTo(12.82f, 10.367f, 12.574f, 10.449f, 12.391f, 10.438f)
                curveTo(12.219f, 10.43f, 12.02f, 10.43f, 11.82f, 10.43f)
                curveTo(11.621f, 10.43f, 11.297f, 10.504f, 11.023f, 10.805f)
                curveTo(10.75f, 11.102f, 9.98f, 11.824f, 9.98f, 13.293f)
                curveTo(9.98f, 14.762f, 11.051f, 16.184f, 11.199f, 16.383f)
                curveTo(11.348f, 16.578f, 13.305f, 19.594f, 16.301f, 20.887f)
                curveTo(17.012f, 21.195f, 17.566f, 21.379f, 18.0f, 21.516f)
                curveTo(18.715f, 21.742f, 19.367f, 21.711f, 19.883f, 21.637f)
                curveTo(20.457f, 21.551f, 21.648f, 20.914f, 21.898f, 20.215f)
                curveTo(22.145f, 19.52f, 22.145f, 18.922f, 22.07f, 18.797f)
                curveTo(21.996f, 18.672f, 21.797f, 18.598f, 21.496f, 18.445f)
                close()
            }
        }
        .build()
        return _whatsapp!!
    }

private var _whatsapp: ImageVector? = null
