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

public val LineAwesomeIcons.InternetExplorer: ImageVector
    get() {
        if (_internetExplorer != null) {
            return _internetExplorer!!
        }
        _internetExplorer = Builder(name = "InternetExplorer", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.6992f, 8.8125f)
                curveTo(30.1445f, 2.5703f, 25.3984f, 3.0078f, 25.3984f, 3.0078f)
                curveTo(22.3516f, 3.0078f, 18.543f, 5.7383f, 18.543f, 5.7383f)
                curveTo(18.543f, 5.7383f, 14.0f, 4.5313f, 9.457f, 7.2344f)
                curveTo(4.5078f, 10.3398f, 4.6719f, 15.8555f, 4.6719f, 15.8555f)
                curveTo(8.6953f, 10.1836f, 14.3008f, 7.8789f, 14.3008f, 7.8789f)
                lineTo(14.3008f, 8.2539f)
                curveTo(6.0273f, 13.8164f, 4.0703f, 21.957f, 3.582f, 23.6172f)
                curveTo(3.0898f, 25.2773f, 3.418f, 29.0f, 6.8984f, 29.0f)
                curveTo(10.3828f, 29.0f, 13.918f, 26.2383f, 13.918f, 26.2383f)
                curveTo(13.918f, 26.2383f, 14.6797f, 26.4023f, 16.7461f, 26.4023f)
                curveTo(25.4531f, 26.4023f, 27.5195f, 18.8516f, 27.5195f, 18.8516f)
                lineTo(19.793f, 18.8516f)
                curveTo(19.793f, 18.8516f, 19.25f, 21.3164f, 16.4766f, 21.3164f)
                curveTo(12.6641f, 21.3164f, 12.8828f, 17.4063f, 12.8828f, 17.4063f)
                lineTo(27.6289f, 17.4063f)
                curveTo(28.3359f, 7.3438f, 19.4141f, 5.8984f, 19.4141f, 5.8984f)
                curveTo(19.4141f, 5.8984f, 22.5664f, 3.7031f, 25.2891f, 3.7031f)
                curveTo(29.6016f, 3.7031f, 27.5625f, 8.6758f, 27.5625f, 8.6758f)
                close()
                moveTo(13.4844f, 26.1289f)
                curveTo(13.4844f, 26.1289f, 8.1719f, 29.3008f, 5.7852f, 27.1016f)
                curveTo(4.5117f, 24.9023f, 6.5859f, 21.7891f, 6.5859f, 21.7891f)
                curveTo(6.5859f, 21.7891f, 8.3438f, 24.9961f, 13.4844f, 26.1289f)
                close()
                moveTo(19.875f, 13.9805f)
                lineTo(12.8633f, 13.9805f)
                curveTo(12.8633f, 13.9805f, 12.7734f, 10.6172f, 16.457f, 10.6172f)
                curveTo(20.0156f, 10.6172f, 19.875f, 13.9805f, 19.875f, 13.9805f)
                close()
            }
        }
        .build()
        return _internetExplorer!!
    }

private var _internetExplorer: ImageVector? = null
