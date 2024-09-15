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

public val LineAwesomeIcons.Magento: ImageVector
    get() {
        if (_magento != null) {
            return _magento!!
        }
        _magento = Builder(name = "Magento", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.227f)
                lineTo(5.0f, 10.174f)
                lineTo(5.0f, 22.441f)
                lineTo(8.0f, 24.154f)
                lineTo(8.0f, 11.826f)
                lineTo(16.0f, 6.773f)
                lineTo(24.0f, 11.826f)
                lineTo(24.0f, 24.15f)
                lineTo(27.0f, 22.438f)
                lineTo(27.0f, 10.174f)
                lineTo(16.0f, 3.227f)
                close()
                moveTo(14.0f, 11.578f)
                lineTo(11.0f, 13.465f)
                lineTo(11.0f, 25.869f)
                lineTo(16.0f, 28.729f)
                lineTo(21.0f, 25.869f)
                lineTo(21.0f, 13.484f)
                lineTo(18.0f, 11.6f)
                lineTo(18.0f, 24.131f)
                lineTo(16.0f, 25.271f)
                lineTo(14.0f, 24.131f)
                lineTo(14.0f, 11.578f)
                close()
            }
        }
        .build()
        return _magento!!
    }

private var _magento: ImageVector? = null
