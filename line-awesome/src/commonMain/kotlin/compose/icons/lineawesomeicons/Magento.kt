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
                moveTo(16.0f, 3.2266f)
                lineTo(5.0f, 10.1738f)
                lineTo(5.0f, 22.4414f)
                lineTo(8.0f, 24.1543f)
                lineTo(8.0f, 11.8262f)
                lineTo(16.0f, 6.7734f)
                lineTo(24.0f, 11.8262f)
                lineTo(24.0f, 24.1504f)
                lineTo(27.0f, 22.4375f)
                lineTo(27.0f, 10.1738f)
                lineTo(16.0f, 3.2266f)
                close()
                moveTo(14.0f, 11.5781f)
                lineTo(11.0f, 13.4648f)
                lineTo(11.0f, 25.8691f)
                lineTo(16.0f, 28.7285f)
                lineTo(21.0f, 25.8691f)
                lineTo(21.0f, 13.4844f)
                lineTo(18.0f, 11.5996f)
                lineTo(18.0f, 24.1309f)
                lineTo(16.0f, 25.2715f)
                lineTo(14.0f, 24.1309f)
                lineTo(14.0f, 11.5781f)
                close()
            }
        }
        .build()
        return _magento!!
    }

private var _magento: ImageVector? = null
