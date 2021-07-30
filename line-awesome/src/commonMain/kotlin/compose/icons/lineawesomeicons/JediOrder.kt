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

public val LineAwesomeIcons.JediOrder: ImageVector
    get() {
        if (_jediOrder != null) {
            return _jediOrder!!
        }
        _jediOrder = Builder(name = "JediOrder", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.4863f, 3.0f)
                curveTo(15.4863f, 3.0f, 15.1739f, 14.9495f, 15.0449f, 19.8535f)
                lineTo(13.293f, 17.293f)
                lineTo(14.4199f, 20.3887f)
                lineTo(10.9277f, 20.8965f)
                lineTo(14.4199f, 21.4043f)
                lineTo(13.0703f, 24.0488f)
                lineTo(14.9941f, 22.0293f)
                curveTo(14.8941f, 25.8673f, 14.8711f, 26.8105f, 14.8711f, 26.8105f)
                curveTo(14.8711f, 26.8105f, 6.2579f, 22.8107f, 11.0449f, 13.9727f)
                curveTo(11.0449f, 13.9727f, 5.0754f, 7.382f, 10.4824f, 3.332f)
                curveTo(10.4824f, 3.332f, 1.2494f, 8.9075f, 7.1074f, 18.4805f)
                curveTo(7.1074f, 18.4805f, 2.2639f, 13.7498f, 4.7969f, 8.9688f)
                curveTo(4.7969f, 8.9688f, 0.4068f, 15.1607f, 5.7578f, 21.9727f)
                curveTo(5.7578f, 21.9727f, 4.296f, 21.0757f, 3.002f, 17.6387f)
                curveTo(3.002f, 17.6387f, 3.9437f, 27.865f, 15.3867f, 27.998f)
                lineTo(15.6152f, 27.998f)
                curveTo(27.0512f, 27.866f, 28.0f, 17.6406f, 28.0f, 17.6406f)
                curveTo(26.683f, 21.0716f, 25.2168f, 21.9746f, 25.2168f, 21.9746f)
                curveTo(30.5668f, 15.1626f, 26.1758f, 8.9707f, 26.1758f, 8.9707f)
                curveTo(28.7088f, 13.7577f, 23.8652f, 18.4824f, 23.8652f, 18.4824f)
                curveTo(29.7232f, 8.9144f, 20.4902f, 3.3359f, 20.4902f, 3.3359f)
                curveTo(25.8962f, 7.3919f, 19.9277f, 13.9746f, 19.9277f, 13.9746f)
                curveTo(24.7147f, 22.8116f, 16.1016f, 26.8125f, 16.1016f, 26.8125f)
                curveTo(16.1016f, 26.8125f, 16.0795f, 25.8692f, 15.9785f, 22.0313f)
                curveTo(16.2185f, 22.2822f, 17.9023f, 24.0508f, 17.9023f, 24.0508f)
                lineTo(16.5527f, 21.4063f)
                lineTo(20.0469f, 20.8984f)
                lineTo(16.5527f, 20.3906f)
                lineTo(17.6797f, 17.2949f)
                lineTo(15.9277f, 19.8555f)
                curveTo(15.8037f, 14.9615f, 15.4923f, 3.1f, 15.4863f, 3.0f)
                close()
            }
        }
        .build()
        return _jediOrder!!
    }

private var _jediOrder: ImageVector? = null
