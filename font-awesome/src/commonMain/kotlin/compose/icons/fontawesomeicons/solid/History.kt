package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = Builder(name = "History", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 255.531f)
                curveToRelative(0.253f, 136.64f, -111.18f, 248.372f, -247.82f, 248.468f)
                curveToRelative(-59.015f, 0.042f, -113.223f, -20.53f, -155.822f, -54.911f)
                curveToRelative(-11.077f, -8.94f, -11.905f, -25.541f, -1.839f, -35.607f)
                lineToRelative(11.267f, -11.267f)
                curveToRelative(8.609f, -8.609f, 22.353f, -9.551f, 31.891f, -1.984f)
                curveTo(173.062f, 425.135f, 212.781f, 440.0f, 256.0f, 440.0f)
                curveToRelative(101.705f, 0.0f, 184.0f, -82.311f, 184.0f, -184.0f)
                curveToRelative(0.0f, -101.705f, -82.311f, -184.0f, -184.0f, -184.0f)
                curveToRelative(-48.814f, 0.0f, -93.149f, 18.969f, -126.068f, 49.932f)
                lineToRelative(50.754f, 50.754f)
                curveToRelative(10.08f, 10.08f, 2.941f, 27.314f, -11.313f, 27.314f)
                lineTo(24.0f, 200.0f)
                curveToRelative(-8.837f, 0.0f, -16.0f, -7.163f, -16.0f, -16.0f)
                lineTo(8.0f, 38.627f)
                curveToRelative(0.0f, -14.254f, 17.234f, -21.393f, 27.314f, -11.314f)
                lineToRelative(49.372f, 49.372f)
                curveTo(129.209f, 34.136f, 189.552f, 8.0f, 256.0f, 8.0f)
                curveToRelative(136.81f, 0.0f, 247.747f, 110.78f, 248.0f, 247.531f)
                close()
                moveTo(323.088f, 334.315f)
                lineToRelative(9.823f, -12.63f)
                curveToRelative(8.138f, -10.463f, 6.253f, -25.542f, -4.21f, -33.679f)
                lineTo(288.0f, 256.349f)
                lineTo(288.0f, 152.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, 10.745f, -24.0f, 24.0f)
                verticalLineToRelative(135.651f)
                lineToRelative(65.409f, 50.874f)
                curveToRelative(10.463f, 8.137f, 25.541f, 6.253f, 33.679f, -4.21f)
                close()
            }
        }
        .build()
        return _history!!
    }

private var _history: ImageVector? = null
