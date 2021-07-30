package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CornerDoubleDownLeft: ImageVector
    get() {
        if (_cornerDoubleDownLeft != null) {
            return _cornerDoubleDownLeft!!
        }
        _cornerDoubleDownLeft = Builder(name = "CornerDoubleDownLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2952f, 7.6943f)
                lineTo(16.1357f, 2.6377f)
                lineTo(21.1924f, 7.4782f)
                lineTo(19.8094f, 8.923f)
                lineTo(17.3474f, 6.5662f)
                lineTo(17.5094f, 12.6f)
                curveTo(17.5805f, 15.25f, 15.49f, 17.456f, 12.8399f, 17.5271f)
                lineTo(6.9137f, 17.6863f)
                lineTo(9.2077f, 19.9335f)
                lineTo(7.8081f, 21.3622f)
                lineTo(2.8077f, 16.4636f)
                lineTo(7.7063f, 11.4632f)
                lineTo(9.1349f, 12.8628f)
                lineTo(6.7576f, 15.2896f)
                lineTo(12.7755f, 15.128f)
                curveTo(14.1005f, 15.0924f, 15.1458f, 13.9895f, 15.1102f, 12.6645f)
                lineTo(14.9519f, 6.7667f)
                lineTo(12.74f, 9.0773f)
                lineTo(11.2952f, 7.6943f)
                close()
            }
        }
        .build()
        return _cornerDoubleDownLeft!!
    }

private var _cornerDoubleDownLeft: ImageVector? = null
