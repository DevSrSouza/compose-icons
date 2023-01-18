package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.PulseFill: ImageVector
    get() {
        if (_pulseFill != null) {
            return _pulseFill!!
        }
        _pulseFill = Builder(name = "PulseFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.539f)
                lineTo(15.0f, 21.539f)
                lineTo(18.659f, 13.0f)
                lineTo(23.0f, 13.0f)
                lineTo(23.0f, 11.0f)
                lineTo(17.341f, 11.0f)
                lineTo(15.0f, 16.461f)
                lineTo(9.0f, 2.461f)
                lineTo(5.341f, 11.0f)
                lineTo(1.0f, 11.0f)
                lineTo(1.0f, 13.0f)
                lineTo(6.659f, 13.0f)
                close()
            }
        }
        .build()
        return _pulseFill!!
    }

private var _pulseFill: ImageVector? = null
