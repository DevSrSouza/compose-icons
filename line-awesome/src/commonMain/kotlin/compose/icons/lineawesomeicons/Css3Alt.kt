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

public val LineAwesomeIcons.Css3Alt: ImageVector
    get() {
        if (_css3Alt != null) {
            return _css3Alt!!
        }
        _css3Alt = Builder(name = "Css3Alt", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                lineTo(8.0f, 25.0f)
                lineTo(16.0f, 28.0f)
                lineTo(24.0f, 25.0f)
                lineTo(26.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                close()
                moveTo(9.332f, 7.0f)
                lineTo(22.652f, 7.0f)
                lineTo(22.391f, 10.0f)
                lineTo(16.695f, 13.0f)
                lineTo(19.121f, 13.0f)
                lineTo(22.0f, 13.0f)
                lineTo(22.123f, 13.0f)
                lineTo(21.611f, 19.008f)
                lineTo(21.631f, 19.0f)
                lineTo(21.355f, 22.0f)
                lineTo(16.0f, 24.0f)
                lineTo(10.635f, 22.0f)
                lineTo(10.305f, 18.0f)
                lineTo(13.326f, 18.0f)
                lineTo(13.482f, 20.033f)
                lineTo(16.0f, 20.904f)
                lineTo(18.521f, 20.051f)
                lineTo(18.867f, 16.0f)
                lineTo(10.131f, 16.0f)
                lineTo(9.873f, 13.0f)
                lineTo(15.783f, 10.0f)
                lineTo(9.609f, 10.0f)
                lineTo(9.332f, 7.0f)
                close()
            }
        }
        .build()
        return _css3Alt!!
    }

private var _css3Alt: ImageVector? = null
