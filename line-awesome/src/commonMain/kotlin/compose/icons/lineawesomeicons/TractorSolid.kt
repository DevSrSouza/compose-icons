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

public val LineAwesomeIcons.TractorSolid: ImageVector
    get() {
        if (_tractorSolid != null) {
            return _tractorSolid!!
        }
        _tractorSolid = Builder(name = "TractorSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                lineTo(7.0f, 12.25f)
                curveTo(5.6523f, 12.5547f, 4.418f, 13.1328f, 3.375f, 13.9688f)
                lineTo(4.625f, 15.5313f)
                curveTo(5.8242f, 14.5703f, 7.3398f, 14.0f, 9.0f, 14.0f)
                curveTo(12.8789f, 14.0f, 16.0f, 17.1211f, 16.0f, 21.0f)
                lineTo(20.5625f, 21.0f)
                curveTo(20.2148f, 21.5938f, 20.0f, 22.2656f, 20.0f, 23.0f)
                curveTo(20.0f, 25.1992f, 21.8008f, 27.0f, 24.0f, 27.0f)
                curveTo(26.1992f, 27.0f, 28.0f, 25.1992f, 28.0f, 23.0f)
                curveTo(28.0f, 21.9727f, 27.582f, 21.0547f, 26.9375f, 20.3438f)
                lineTo(28.9375f, 15.375f)
                lineTo(29.0f, 15.1875f)
                lineTo(29.0f, 13.0f)
                lineTo(24.0f, 13.0f)
                lineTo(24.0f, 10.0f)
                curveTo(24.0f, 9.4336f, 24.4336f, 9.0f, 25.0f, 9.0f)
                lineTo(25.0f, 7.0f)
                curveTo(23.3555f, 7.0f, 22.0f, 8.3555f, 22.0f, 10.0f)
                lineTo(22.0f, 13.0f)
                lineTo(18.6875f, 13.0f)
                lineTo(15.9375f, 5.6563f)
                lineTo(15.6875f, 5.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(14.3125f, 7.0f)
                lineTo(17.0625f, 14.3438f)
                lineTo(17.3125f, 15.0f)
                lineTo(26.9063f, 15.0f)
                lineTo(25.3125f, 19.0f)
                lineTo(17.75f, 19.0f)
                curveTo(16.832f, 15.0039f, 13.2695f, 12.0f, 9.0f, 12.0f)
                close()
                moveTo(9.0f, 15.0f)
                curveTo(5.6992f, 15.0f, 3.0f, 17.6992f, 3.0f, 21.0f)
                curveTo(3.0f, 24.3008f, 5.6992f, 27.0f, 9.0f, 27.0f)
                curveTo(12.3008f, 27.0f, 15.0f, 24.3008f, 15.0f, 21.0f)
                curveTo(15.0f, 17.6992f, 12.3008f, 15.0f, 9.0f, 15.0f)
                close()
                moveTo(9.0f, 17.0f)
                curveTo(11.2227f, 17.0f, 13.0f, 18.7773f, 13.0f, 21.0f)
                curveTo(13.0f, 23.2227f, 11.2227f, 25.0f, 9.0f, 25.0f)
                curveTo(6.7773f, 25.0f, 5.0f, 23.2227f, 5.0f, 21.0f)
                curveTo(5.0f, 18.7773f, 6.7773f, 17.0f, 9.0f, 17.0f)
                close()
                moveTo(9.0f, 19.0f)
                curveTo(7.8945f, 19.0f, 7.0f, 19.8945f, 7.0f, 21.0f)
                curveTo(7.0f, 22.1055f, 7.8945f, 23.0f, 9.0f, 23.0f)
                curveTo(10.1055f, 23.0f, 11.0f, 22.1055f, 11.0f, 21.0f)
                curveTo(11.0f, 19.8945f, 10.1055f, 19.0f, 9.0f, 19.0f)
                close()
                moveTo(24.0f, 21.0f)
                curveTo(25.1172f, 21.0f, 26.0f, 21.8828f, 26.0f, 23.0f)
                curveTo(26.0f, 24.1172f, 25.1172f, 25.0f, 24.0f, 25.0f)
                curveTo(22.8828f, 25.0f, 22.0f, 24.1172f, 22.0f, 23.0f)
                curveTo(22.0f, 21.8828f, 22.8828f, 21.0f, 24.0f, 21.0f)
                close()
            }
        }
        .build()
        return _tractorSolid!!
    }

private var _tractorSolid: ImageVector? = null
