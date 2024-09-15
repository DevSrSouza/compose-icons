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

public val LineAwesomeIcons.PhoneSquareAltSolid: ImageVector
    get() {
        if (_phoneSquareAltSolid != null) {
            return _phoneSquareAltSolid!!
        }
        _phoneSquareAltSolid = Builder(name = "PhoneSquareAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(20.127f, 9.0f)
                curveTo(19.615f, 9.0f, 19.134f, 9.199f, 18.773f, 9.561f)
                lineTo(17.623f, 10.711f)
                curveTo(16.9f, 11.434f, 16.9f, 12.696f, 17.623f, 13.42f)
                lineTo(19.33f, 15.127f)
                curveTo(18.803f, 15.898f, 18.197f, 16.621f, 17.521f, 17.281f)
                lineTo(17.27f, 17.531f)
                curveTo(16.616f, 18.201f, 15.893f, 18.806f, 15.123f, 19.332f)
                lineTo(13.416f, 17.625f)
                curveTo(13.055f, 17.263f, 12.573f, 17.064f, 12.063f, 17.064f)
                curveTo(11.552f, 17.064f, 11.07f, 17.263f, 10.707f, 17.625f)
                lineTo(9.557f, 18.777f)
                curveTo(8.813f, 19.522f, 8.813f, 20.736f, 9.559f, 21.484f)
                lineTo(10.512f, 22.439f)
                curveTo(11.04f, 22.965f, 11.802f, 23.14f, 12.498f, 22.893f)
                lineTo(12.629f, 22.85f)
                curveTo(13.132f, 22.685f, 14.311f, 22.298f, 16.178f, 21.037f)
                curveTo(17.086f, 20.425f, 17.935f, 19.716f, 18.693f, 18.939f)
                lineTo(18.928f, 18.705f)
                curveTo(19.712f, 17.939f, 20.419f, 17.092f, 21.033f, 16.184f)
                curveTo(22.294f, 14.315f, 22.68f, 13.136f, 22.846f, 12.633f)
                lineTo(22.889f, 12.502f)
                curveTo(22.962f, 12.293f, 22.998f, 12.076f, 22.998f, 11.863f)
                curveTo(22.998f, 11.367f, 22.803f, 10.885f, 22.434f, 10.516f)
                lineTo(21.48f, 9.561f)
                curveTo(21.117f, 9.199f, 20.638f, 9.0f, 20.127f, 9.0f)
                close()
            }
        }
        .build()
        return _phoneSquareAltSolid!!
    }

private var _phoneSquareAltSolid: ImageVector? = null
