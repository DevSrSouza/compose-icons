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

public val LineAwesomeIcons.Hackerrank: ImageVector
    get() {
        if (_hackerrank != null) {
            return _hackerrank!!
        }
        _hackerrank = Builder(name = "Hackerrank", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.998f, 3.0f)
                curveTo(14.225f, 3.0f, 5.5352f, 7.9839f, 4.6582f, 9.5039f)
                curveTo(3.7802f, 11.0249f, 3.7802f, 20.983f, 4.6582f, 22.498f)
                curveTo(5.5392f, 24.017f, 14.229f, 29.0f, 15.998f, 29.0f)
                curveTo(17.762f, 29.0f, 26.4519f, 24.02f, 27.3359f, 22.502f)
                curveTo(28.2229f, 20.98f, 28.2229f, 11.014f, 27.3359f, 9.498f)
                lineTo(27.3359f, 9.4961f)
                curveTo(26.4449f, 7.9791f, 17.756f, 3.0f, 15.998f, 3.0f)
                close()
                moveTo(15.9961f, 5.0117f)
                curveTo(17.6931f, 5.3647f, 24.4177f, 9.2168f, 25.5957f, 10.5098f)
                curveTo(26.1357f, 12.1508f, 26.1347f, 19.8443f, 25.5957f, 21.4883f)
                curveTo(24.4257f, 22.7793f, 17.6951f, 26.6363f, 15.9961f, 26.9883f)
                curveTo(14.2981f, 26.6383f, 7.5724f, 22.7832f, 6.4004f, 21.4902f)
                curveTo(5.8654f, 19.8422f, 5.8654f, 12.1558f, 6.4004f, 10.5098f)
                curveTo(7.5694f, 9.2168f, 14.2971f, 5.3617f, 15.9961f, 5.0117f)
                close()
                moveTo(13.0f, 9.0f)
                lineTo(11.0f, 11.0f)
                lineTo(12.0f, 11.0f)
                lineTo(12.0f, 21.0f)
                lineTo(14.0f, 21.0f)
                lineTo(14.0f, 17.0f)
                lineTo(18.0f, 17.0f)
                lineTo(18.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                lineTo(19.0f, 23.0f)
                lineTo(21.0f, 21.0f)
                lineTo(20.0f, 21.0f)
                lineTo(20.0f, 12.0f)
                lineTo(18.0f, 12.0f)
                lineTo(18.0f, 15.0f)
                lineTo(14.0f, 15.0f)
                lineTo(14.0f, 11.0f)
                lineTo(15.0f, 11.0f)
                lineTo(13.0f, 9.0f)
                close()
            }
        }
        .build()
        return _hackerrank!!
    }

private var _hackerrank: ImageVector? = null
