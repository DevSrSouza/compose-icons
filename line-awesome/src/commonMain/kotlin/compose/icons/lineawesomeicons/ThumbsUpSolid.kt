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

public val LineAwesomeIcons.ThumbsUpSolid: ImageVector
    get() {
        if (_thumbsUpSolid != null) {
            return _thumbsUpSolid!!
        }
        _thumbsUpSolid = Builder(name = "ThumbsUpSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6875f, 3.0f)
                lineTo(16.375f, 3.2813f)
                lineTo(9.5938f, 10.0f)
                lineTo(5.0f, 10.0f)
                lineTo(5.0f, 26.0f)
                lineTo(21.8438f, 26.0f)
                curveTo(23.2539f, 26.0f, 24.4844f, 25.0039f, 24.7813f, 23.625f)
                lineTo(26.9375f, 13.625f)
                curveTo(27.332f, 11.7773f, 25.8867f, 10.0f, 24.0f, 10.0f)
                lineTo(18.25f, 10.0f)
                lineTo(18.4375f, 9.25f)
                curveTo(18.6406f, 9.0938f, 18.7695f, 9.0273f, 19.0625f, 8.625f)
                curveTo(19.5313f, 7.9844f, 20.0f, 6.9922f, 20.0f, 5.6563f)
                curveTo(20.0f, 4.2305f, 18.7109f, 3.0f, 17.0938f, 3.0f)
                close()
                moveTo(17.4063f, 5.0938f)
                curveTo(17.8281f, 5.1758f, 18.0f, 5.3477f, 18.0f, 5.6563f)
                curveTo(18.0f, 6.5586f, 17.7266f, 7.1172f, 17.4688f, 7.4688f)
                curveTo(17.2109f, 7.8203f, 17.0313f, 7.9063f, 17.0313f, 7.9063f)
                lineTo(16.6875f, 8.0938f)
                lineTo(16.5625f, 8.5f)
                lineTo(15.9688f, 10.75f)
                lineTo(15.6563f, 12.0f)
                lineTo(24.0f, 12.0f)
                curveTo(24.6602f, 12.0f, 25.1055f, 12.5742f, 24.9688f, 13.2188f)
                lineTo(22.8438f, 23.2188f)
                curveTo(22.7422f, 23.6875f, 22.3203f, 24.0f, 21.8438f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 11.4063f)
                close()
                moveTo(7.0f, 12.0f)
                lineTo(9.0f, 12.0f)
                lineTo(9.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                close()
            }
        }
        .build()
        return _thumbsUpSolid!!
    }

private var _thumbsUpSolid: ImageVector? = null
