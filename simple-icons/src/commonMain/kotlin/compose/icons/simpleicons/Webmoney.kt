package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Webmoney: ImageVector
    get() {
        if (_webmoney != null) {
            return _webmoney!!
        }
        _webmoney = Builder(name = "Webmoney", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.943f, 0.1825f)
                curveToRelative(1.8723f, 0.0f, 3.6538f, 0.429f, 5.2524f, 1.1964f)
                curveToRelative(0.2507f, 0.1131f, 0.503f, 0.2485f, 0.7529f, 0.384f)
                lineToRelative(-1.0961f, 0.971f)
                lineToRelative(-1.6433f, -1.6933f)
                lineToRelative(-2.8315f, 2.483f)
                lineTo(10.71f, 1.74f)
                lineTo(5.5032f, 6.368f)
                lineToRelative(3.3336f, 3.6347f)
                lineToRelative(-1.3014f, 1.1285f)
                lineToRelative(3.2889f, 3.6346f)
                lineToRelative(-1.3015f, 1.128f)
                lineToRelative(4.7045f, 5.1698f)
                lineToRelative(2.7844f, -2.5285f)
                lineToRelative(2.4217f, 2.7097f)
                curveToRelative(-0.48f, 0.3613f, -1.0052f, 0.7232f, -1.5754f, 1.0387f)
                arcToRelative(12.0418f, 12.0418f, 0.0f, false, true, -5.892f, 1.534f)
                curveTo(5.3657f, 23.8175f, 0.0f, 18.5135f, 0.0f, 11.9899f)
                curveTo(-0.0231f, 5.5104f, 5.3435f, 0.1825f, 11.943f, 0.1825f)
                close()
                moveTo(9.7502f, 11.267f)
                lineToRelative(2.8546f, -2.5285f)
                lineToRelative(2.5582f, 2.8218f)
                lineToRelative(-2.8552f, 2.5283f)
                close()
                moveTo(11.7832f, 16.1434f)
                lineToRelative(2.8314f, -2.551f)
                lineToRelative(2.5807f, 2.8216f)
                lineToRelative(-2.8548f, 2.5286f)
                close()
                moveTo(7.719f, 6.4587f)
                lineToRelative(2.8537f, -2.5285f)
                lineToRelative(2.5577f, 2.8217f)
                lineToRelative(-2.8548f, 2.5285f)
                close()
                moveTo(12.9474f, 5.1037f)
                lineToRelative(2.124f, -1.8961f)
                lineTo(16.99f, 5.307f)
                lineToRelative(-2.124f, 1.9186f)
                close()
                moveTo(16.7386f, 13.7951f)
                lineToRelative(2.1232f, -1.8963f)
                lineToRelative(1.9186f, 2.1215f)
                lineToRelative(-2.124f, 1.8975f)
                close()
                moveTo(18.6109f, 18.0621f)
                lineToRelative(2.124f, -1.8966f)
                lineToRelative(1.9171f, 2.0995f)
                lineToRelative(-2.1232f, 1.9183f)
                close()
                moveTo(19.4789f, 8.3094f)
                lineToRelative(1.4156f, -1.2643f)
                lineToRelative(1.2784f, 1.4002f)
                lineToRelative(-1.4155f, 1.2638f)
                close()
                moveTo(17.652f, 4.133f)
                lineToRelative(1.4158f, -1.2864f)
                lineToRelative(1.2793f, 1.422f)
                lineToRelative(-1.4168f, 1.2641f)
                close()
                moveTo(21.2828f, 12.4861f)
                lineToRelative(1.4156f, -1.2642f)
                lineTo(24.0f, 12.6216f)
                lineToRelative(-1.4381f, 1.2639f)
                close()
                moveTo(14.9117f, 9.3481f)
                lineToRelative(2.124f, -1.8963f)
                lineToRelative(1.9178f, 2.099f)
                lineToRelative(-2.1231f, 1.8967f)
                close()
            }
        }
        .build()
        return _webmoney!!
    }

private var _webmoney: ImageVector? = null
