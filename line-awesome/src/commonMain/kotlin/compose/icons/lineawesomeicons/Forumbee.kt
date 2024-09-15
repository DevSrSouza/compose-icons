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

public val LineAwesomeIcons.Forumbee: ImageVector
    get() {
        if (_forumbee != null) {
            return _forumbee!!
        }
        _forumbee = Builder(name = "Forumbee", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.969f)
                curveTo(8.813f, 2.969f, 2.969f, 8.813f, 2.969f, 16.0f)
                curveTo(2.969f, 16.988f, 3.07f, 17.949f, 3.281f, 18.875f)
                curveTo(5.977f, 11.859f, 11.422f, 5.973f, 18.719f, 3.25f)
                curveTo(17.836f, 3.063f, 16.938f, 2.969f, 16.0f, 2.969f)
                close()
                moveTo(23.375f, 5.281f)
                curveTo(19.879f, 6.293f, 9.457f, 10.336f, 5.281f, 23.406f)
                curveTo(6.008f, 24.449f, 6.883f, 25.398f, 7.875f, 26.188f)
                curveTo(12.363f, 12.629f, 22.629f, 8.832f, 26.188f, 7.906f)
                curveTo(25.391f, 6.902f, 24.43f, 6.012f, 23.375f, 5.281f)
                close()
                moveTo(27.969f, 10.875f)
                curveTo(16.383f, 14.602f, 12.156f, 24.324f, 10.938f, 27.969f)
                curveTo(11.98f, 28.406f, 13.09f, 28.719f, 14.25f, 28.875f)
                curveTo(15.477f, 25.785f, 19.387f, 18.055f, 28.875f, 14.188f)
                curveTo(28.715f, 13.027f, 28.414f, 11.918f, 27.969f, 10.875f)
                close()
                moveTo(28.875f, 17.844f)
                curveTo(27.676f, 18.441f, 25.707f, 19.652f, 23.031f, 22.156f)
                curveTo(19.992f, 25.004f, 18.574f, 27.461f, 17.969f, 28.844f)
                curveTo(19.707f, 28.574f, 21.344f, 27.977f, 22.781f, 27.094f)
                lineTo(29.0f, 29.0f)
                curveTo(29.0f, 29.0f, 27.766f, 24.402f, 27.156f, 22.656f)
                curveTo(28.023f, 21.207f, 28.625f, 19.586f, 28.875f, 17.844f)
                close()
            }
        }
        .build()
        return _forumbee!!
    }

private var _forumbee: ImageVector? = null
