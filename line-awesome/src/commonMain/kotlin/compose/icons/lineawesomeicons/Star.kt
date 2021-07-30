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

public val LineAwesomeIcons.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.125f)
                lineTo(15.0938f, 4.1875f)
                lineTo(11.8438f, 11.4688f)
                lineTo(3.9063f, 12.3125f)
                lineTo(1.6563f, 12.5625f)
                lineTo(3.3438f, 14.0625f)
                lineTo(9.25f, 19.4063f)
                lineTo(7.5938f, 27.2188f)
                lineTo(7.125f, 29.4063f)
                lineTo(9.0938f, 28.2813f)
                lineTo(16.0f, 24.2813f)
                lineTo(22.9063f, 28.2813f)
                lineTo(24.875f, 29.4063f)
                lineTo(24.4063f, 27.2188f)
                lineTo(22.75f, 19.4063f)
                lineTo(28.6563f, 14.0625f)
                lineTo(30.3438f, 12.5625f)
                lineTo(28.0938f, 12.3125f)
                lineTo(20.1563f, 11.4688f)
                lineTo(16.9063f, 4.1875f)
                close()
                moveTo(16.0f, 7.0313f)
                lineTo(18.5625f, 12.8125f)
                lineTo(18.8125f, 13.3438f)
                lineTo(19.375f, 13.4063f)
                lineTo(25.6563f, 14.0625f)
                lineTo(20.9688f, 18.2813f)
                lineTo(20.5313f, 18.6875f)
                lineTo(20.6563f, 19.25f)
                lineTo(21.9688f, 25.4063f)
                lineTo(16.5f, 22.2813f)
                lineTo(16.0f, 21.9688f)
                lineTo(15.5f, 22.2813f)
                lineTo(10.0313f, 25.4063f)
                lineTo(11.3438f, 19.25f)
                lineTo(11.4688f, 18.6875f)
                lineTo(11.0313f, 18.2813f)
                lineTo(6.3438f, 14.0625f)
                lineTo(12.625f, 13.4063f)
                lineTo(13.1875f, 13.3438f)
                lineTo(13.4375f, 12.8125f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
