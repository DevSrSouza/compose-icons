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
                moveTo(16.0f, 2.9688f)
                curveTo(8.8125f, 2.9688f, 2.9688f, 8.8125f, 2.9688f, 16.0f)
                curveTo(2.9688f, 16.9883f, 3.0703f, 17.9492f, 3.2813f, 18.875f)
                curveTo(5.9766f, 11.8594f, 11.4219f, 5.9727f, 18.7188f, 3.25f)
                curveTo(17.8359f, 3.0625f, 16.9375f, 2.9688f, 16.0f, 2.9688f)
                close()
                moveTo(23.375f, 5.2813f)
                curveTo(19.8789f, 6.293f, 9.457f, 10.3359f, 5.2813f, 23.4063f)
                curveTo(6.0078f, 24.4492f, 6.8828f, 25.3984f, 7.875f, 26.1875f)
                curveTo(12.3633f, 12.6289f, 22.6289f, 8.832f, 26.1875f, 7.9063f)
                curveTo(25.3906f, 6.9023f, 24.4297f, 6.0117f, 23.375f, 5.2813f)
                close()
                moveTo(27.9688f, 10.875f)
                curveTo(16.3828f, 14.6016f, 12.1563f, 24.3242f, 10.9375f, 27.9688f)
                curveTo(11.9805f, 28.4063f, 13.0898f, 28.7188f, 14.25f, 28.875f)
                curveTo(15.4766f, 25.7852f, 19.3867f, 18.0547f, 28.875f, 14.1875f)
                curveTo(28.7148f, 13.0273f, 28.4141f, 11.918f, 27.9688f, 10.875f)
                close()
                moveTo(28.875f, 17.8438f)
                curveTo(27.6758f, 18.4414f, 25.707f, 19.6523f, 23.0313f, 22.1563f)
                curveTo(19.9922f, 25.0039f, 18.5742f, 27.4609f, 17.9688f, 28.8438f)
                curveTo(19.707f, 28.5742f, 21.3438f, 27.9766f, 22.7813f, 27.0938f)
                lineTo(29.0f, 29.0f)
                curveTo(29.0f, 29.0f, 27.7656f, 24.4023f, 27.1563f, 22.6563f)
                curveTo(28.0234f, 21.207f, 28.625f, 19.5859f, 28.875f, 17.8438f)
                close()
            }
        }
        .build()
        return _forumbee!!
    }

private var _forumbee: ImageVector? = null
