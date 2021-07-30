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

public val LineAwesomeIcons.Imdb: ImageVector
    get() {
        if (_imdb != null) {
            return _imdb!!
        }
        _imdb = Builder(name = "Imdb", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.0f)
                lineTo(0.0f, 25.0f)
                lineTo(32.0f, 25.0f)
                lineTo(32.0f, 7.0f)
                close()
                moveTo(2.0f, 9.0f)
                lineTo(30.0f, 9.0f)
                lineTo(30.0f, 23.0f)
                lineTo(2.0f, 23.0f)
                close()
                moveTo(5.0f, 11.6875f)
                lineTo(5.0f, 20.3125f)
                lineTo(7.0f, 20.3125f)
                lineTo(7.0f, 11.6875f)
                close()
                moveTo(8.0938f, 11.6875f)
                lineTo(8.0938f, 20.3125f)
                lineTo(10.0f, 20.3125f)
                lineTo(10.0f, 15.5f)
                lineTo(10.9063f, 20.3125f)
                lineTo(12.1875f, 20.3125f)
                lineTo(13.0f, 15.5f)
                lineTo(13.0f, 20.3125f)
                lineTo(14.8125f, 20.3125f)
                lineTo(14.8125f, 11.6875f)
                lineTo(12.0f, 11.6875f)
                lineTo(11.5f, 15.8125f)
                lineTo(10.8125f, 11.6875f)
                close()
                moveTo(15.9063f, 11.6875f)
                lineTo(15.9063f, 20.1875f)
                lineTo(18.3125f, 20.1875f)
                curveTo(19.6133f, 20.1875f, 20.1016f, 19.9883f, 20.5f, 19.6875f)
                curveTo(20.8984f, 19.4883f, 21.0938f, 19.0f, 21.0938f, 18.5f)
                lineTo(21.0938f, 13.3125f)
                curveTo(21.0938f, 12.7109f, 20.8984f, 12.1992f, 20.5f, 12.0f)
                curveTo(20.0f, 11.8008f, 19.8125f, 11.6875f, 18.3125f, 11.6875f)
                close()
                moveTo(22.0938f, 11.8125f)
                lineTo(22.0938f, 20.3125f)
                lineTo(23.9063f, 20.3125f)
                curveTo(23.9063f, 20.3125f, 23.9922f, 19.7109f, 24.0938f, 19.8125f)
                curveTo(24.293f, 19.8125f, 25.1016f, 20.1875f, 25.5f, 20.1875f)
                curveTo(26.0f, 20.1875f, 26.1992f, 20.1953f, 26.5f, 20.0938f)
                curveTo(26.8984f, 19.8945f, 27.0f, 19.6133f, 27.0f, 19.3125f)
                lineTo(27.0f, 14.3125f)
                curveTo(27.0f, 13.6133f, 26.2891f, 13.0938f, 25.6875f, 13.0938f)
                curveTo(25.0859f, 13.0938f, 24.5117f, 13.4883f, 24.3125f, 13.6875f)
                lineTo(24.3125f, 11.8125f)
                close()
                moveTo(18.0f, 13.0f)
                curveTo(18.3984f, 13.0f, 18.8125f, 13.0078f, 18.8125f, 13.4063f)
                lineTo(18.8125f, 18.4063f)
                curveTo(18.8125f, 18.8047f, 18.3008f, 18.8125f, 18.0f, 18.8125f)
                close()
                moveTo(24.5938f, 14.0f)
                curveTo(24.6953f, 14.0f, 24.8125f, 14.1055f, 24.8125f, 14.4063f)
                lineTo(24.8125f, 18.6875f)
                curveTo(24.8125f, 18.8867f, 24.793f, 19.0938f, 24.5938f, 19.0938f)
                curveTo(24.4922f, 19.0938f, 24.4063f, 18.9883f, 24.4063f, 18.6875f)
                lineTo(24.4063f, 14.4063f)
                curveTo(24.4063f, 14.207f, 24.3945f, 14.0f, 24.5938f, 14.0f)
                close()
            }
        }
        .build()
        return _imdb!!
    }

private var _imdb: ImageVector? = null
