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

public val LineAwesomeIcons.Skyatlas: ImageVector
    get() {
        if (_skyatlas != null) {
            return _skyatlas!!
        }
        _skyatlas = Builder(name = "Skyatlas", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8047f, 6.5938f)
                curveTo(19.6602f, 6.5938f, 24.707f, 8.0547f, 24.707f, 13.4766f)
                curveTo(24.707f, 13.8047f, 24.6367f, 14.5781f, 24.6367f, 14.5781f)
                curveTo(24.6367f, 14.5781f, 25.5547f, 14.2969f, 26.5859f, 14.2969f)
                curveTo(27.9492f, 14.2969f, 32.0f, 15.3672f, 32.0f, 19.6875f)
                curveTo(32.0f, 23.7969f, 28.4648f, 25.4063f, 26.2109f, 25.4063f)
                curveTo(17.9688f, 25.4063f, 16.1367f, 12.8867f, 8.1992f, 12.8867f)
                curveTo(4.5117f, 12.8867f, 2.6328f, 15.5898f, 2.6328f, 18.0078f)
                curveTo(2.6328f, 21.625f, 5.332f, 23.5508f, 8.3398f, 23.5508f)
                curveTo(12.8477f, 23.5508f, 15.3984f, 20.5938f, 15.7578f, 20.5938f)
                curveTo(16.1836f, 20.5938f, 16.3711f, 20.832f, 16.3711f, 21.0664f)
                curveTo(16.3711f, 22.0273f, 12.2852f, 25.4063f, 7.9141f, 25.4063f)
                curveTo(3.6523f, 25.4063f, 0.0f, 22.7031f, 0.0f, 18.0078f)
                curveTo(0.0f, 13.7344f, 3.5469f, 10.6563f, 7.6563f, 10.6563f)
                curveTo(16.8789f, 10.6563f, 18.6875f, 23.0117f, 25.7422f, 23.0117f)
                curveTo(28.2539f, 23.0117f, 29.5f, 21.2266f, 29.5f, 19.6289f)
                curveTo(29.5f, 17.6328f, 28.043f, 15.9883f, 25.9766f, 15.9883f)
                curveTo(25.1289f, 15.9883f, 24.2383f, 16.5547f, 23.6289f, 16.5547f)
                curveTo(23.0156f, 16.5547f, 22.7813f, 16.1289f, 22.7813f, 15.7539f)
                curveTo(22.7813f, 15.3086f, 23.1094f, 14.5547f, 23.1094f, 13.7109f)
                curveTo(23.1094f, 12.2617f, 21.9727f, 8.1914f, 17.2383f, 8.1914f)
                curveTo(14.4688f, 8.1914f, 13.293f, 10.0703f, 12.7773f, 10.0703f)
                curveTo(12.2578f, 10.0703f, 12.2109f, 9.8125f, 12.2109f, 9.4844f)
                curveTo(12.2148f, 9.1523f, 13.9961f, 6.5938f, 17.8047f, 6.5938f)
                close()
            }
        }
        .build()
        return _skyatlas!!
    }

private var _skyatlas: ImageVector? = null
