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

public val LineAwesomeIcons.SignLanguageSolid: ImageVector
    get() {
        if (_signLanguageSolid != null) {
            return _signLanguageSolid!!
        }
        _signLanguageSolid = Builder(name = "SignLanguageSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2246f, 1.3672f)
                lineTo(18.6074f, 2.543f)
                lineTo(26.9824f, 14.0703f)
                curveTo(26.9379f, 14.6666f, 26.6395f, 15.2191f, 26.1445f, 15.5645f)
                lineTo(23.3398f, 17.5234f)
                curveTo(22.4528f, 18.1434f, 21.2487f, 17.9519f, 20.5977f, 17.0879f)
                lineTo(14.7988f, 9.3984f)
                lineTo(13.2012f, 10.6016f)
                lineTo(19.0f, 18.293f)
                curveTo(19.788f, 19.337f, 20.9804f, 19.8887f, 22.1914f, 19.8887f)
                curveTo(22.9834f, 19.8887f, 23.7844f, 19.6521f, 24.4844f, 19.1621f)
                lineTo(27.2891f, 17.2031f)
                curveTo(28.3601f, 16.4561f, 29.0f, 15.2298f, 29.0f, 13.9238f)
                lineTo(29.0f, 7.0f)
                lineTo(27.0f, 7.0f)
                lineTo(27.0f, 10.6895f)
                lineTo(20.2246f, 1.3672f)
                close()
                moveTo(17.2109f, 2.3223f)
                lineTo(15.5938f, 3.498f)
                lineTo(20.8398f, 10.7188f)
                lineTo(22.457f, 9.543f)
                lineTo(17.2109f, 2.3223f)
                close()
                moveTo(15.3711f, 4.8945f)
                lineTo(13.752f, 6.0703f)
                lineTo(18.3789f, 12.4375f)
                lineTo(19.9961f, 11.2617f)
                lineTo(15.3711f, 4.8945f)
                close()
                moveTo(12.5801f, 15.1855f)
                lineTo(11.4199f, 16.8125f)
                lineTo(14.4805f, 19.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 21.0f)
                lineTo(17.252f, 21.0f)
                curveTo(17.717f, 21.3773f, 18.0f, 21.941f, 18.0f, 22.5449f)
                lineTo(18.0f, 26.0f)
                curveTo(18.0f, 27.103f, 17.103f, 28.0f, 16.0f, 28.0f)
                lineTo(6.0f, 28.0f)
                lineTo(6.0f, 30.0f)
                lineTo(16.0f, 30.0f)
                curveTo(18.206f, 30.0f, 20.0f, 28.206f, 20.0f, 26.0f)
                lineTo(20.0f, 22.5449f)
                curveTo(20.0f, 21.2559f, 19.3732f, 20.0381f, 18.3242f, 19.2891f)
                lineTo(12.5801f, 15.1855f)
                close()
                moveTo(2.0f, 22.0f)
                lineTo(2.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(3.0f, 25.0f)
                lineTo(3.0f, 27.0f)
                lineTo(11.0f, 27.0f)
                lineTo(11.0f, 25.0f)
                lineTo(3.0f, 25.0f)
                close()
            }
        }
        .build()
        return _signLanguageSolid!!
    }

private var _signLanguageSolid: ImageVector? = null
