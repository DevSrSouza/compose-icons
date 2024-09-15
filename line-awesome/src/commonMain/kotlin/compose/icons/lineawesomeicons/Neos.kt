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

public val LineAwesomeIcons.Neos: ImageVector
    get() {
        if (_neos != null) {
            return _neos!!
        }
        _neos = Builder(name = "Neos", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.287f, 5.0f)
                lineTo(6.0f, 6.701f)
                lineTo(6.0f, 26.0f)
                lineTo(6.668f, 26.0f)
                lineTo(10.662f, 26.0f)
                lineTo(14.004f, 23.557f)
                lineTo(14.002f, 19.523f)
                lineTo(18.367f, 26.0f)
                lineTo(21.787f, 26.0f)
                lineTo(25.0f, 24.0f)
                lineTo(25.0f, 5.0f)
                lineTo(20.338f, 5.0f)
                lineTo(17.0f, 7.42f)
                lineTo(17.0f, 11.35f)
                lineTo(12.768f, 5.0f)
                lineTo(8.287f, 5.0f)
                close()
                moveTo(9.389f, 6.0f)
                lineTo(12.232f, 6.0f)
                lineTo(21.0f, 19.15f)
                lineTo(21.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineTo(24.0f, 23.0f)
                lineTo(20.721f, 23.0f)
                lineTo(9.389f, 6.0f)
                close()
                moveTo(8.328f, 6.215f)
                lineTo(20.186f, 24.0f)
                lineTo(23.041f, 24.0f)
                lineTo(21.475f, 25.0f)
                lineTo(18.984f, 25.0f)
                lineTo(14.0f, 17.748f)
                lineTo(14.0f, 17.734f)
                lineTo(13.99f, 17.734f)
                lineTo(10.0f, 11.93f)
                lineTo(10.0f, 22.25f)
                lineTo(7.0f, 24.5f)
                lineTo(7.0f, 7.203f)
                lineTo(8.328f, 6.215f)
                close()
                moveTo(20.0f, 6.48f)
                lineTo(20.0f, 15.85f)
                lineTo(18.0f, 12.85f)
                lineTo(18.0f, 7.93f)
                lineTo(20.0f, 6.48f)
                close()
                moveTo(11.0f, 15.07f)
                lineTo(13.0f, 18.037f)
                lineTo(13.004f, 23.049f)
                lineTo(10.338f, 25.0f)
                lineTo(8.0f, 25.0f)
                lineTo(11.0f, 22.75f)
                lineTo(11.0f, 15.07f)
                close()
            }
        }
        .build()
        return _neos!!
    }

private var _neos: ImageVector? = null
