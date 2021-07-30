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

public val LineAwesomeIcons.Buysellads: ImageVector
    get() {
        if (_buysellads != null) {
            return _buysellads!!
        }
        _buysellads = Builder(name = "Buysellads", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1875f, 6.0f)
                lineTo(10.9688f, 6.6875f)
                lineTo(5.0625f, 24.6875f)
                lineTo(4.625f, 26.0f)
                lineTo(11.9688f, 26.0f)
                lineTo(12.25f, 25.7813f)
                lineTo(18.125f, 21.0f)
                lineTo(19.2813f, 25.25f)
                lineTo(19.5f, 26.0f)
                lineTo(27.4063f, 26.0f)
                lineTo(26.9375f, 24.6875f)
                lineTo(20.875f, 6.6875f)
                lineTo(20.625f, 6.0f)
                close()
                moveTo(12.6563f, 8.0f)
                lineTo(19.1875f, 8.0f)
                lineTo(24.625f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineTo(17.0625f, 9.4688f)
                lineTo(16.875f, 8.7188f)
                lineTo(15.1563f, 8.7188f)
                lineTo(14.9375f, 9.4375f)
                lineTo(12.2813f, 18.7188f)
                lineTo(11.9063f, 20.0f)
                lineTo(16.1875f, 20.0f)
                lineTo(11.2813f, 24.0f)
                lineTo(7.375f, 24.0f)
                close()
                moveTo(15.9688f, 13.0938f)
                lineTo(17.3125f, 18.0f)
                lineTo(14.5625f, 18.0f)
                close()
            }
        }
        .build()
        return _buysellads!!
    }

private var _buysellads: ImageVector? = null
