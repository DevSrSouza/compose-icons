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

public val LineAwesomeIcons.Html5: ImageVector
    get() {
        if (_html5 != null) {
            return _html5!!
        }
        _html5 = Builder(name = "Html5", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2188f, 4.0f)
                lineTo(5.3125f, 5.0938f)
                lineTo(7.0625f, 24.875f)
                lineTo(7.125f, 25.5625f)
                lineTo(7.7813f, 25.75f)
                lineTo(15.7188f, 27.9688f)
                lineTo(15.9688f, 28.0313f)
                lineTo(16.25f, 27.9688f)
                lineTo(24.1875f, 25.7813f)
                lineTo(24.8438f, 25.5938f)
                lineTo(24.9063f, 24.9063f)
                lineTo(26.6875f, 5.0938f)
                lineTo(26.7813f, 4.0313f)
                lineTo(25.6875f, 4.0313f)
                lineTo(6.3125f, 4.0f)
                close()
                moveTo(7.4063f, 6.0f)
                lineTo(24.5938f, 6.0313f)
                lineTo(22.9688f, 24.0313f)
                lineTo(16.0f, 25.9688f)
                lineTo(9.0f, 24.0313f)
                close()
                moveTo(9.8125f, 9.0f)
                lineTo(10.4688f, 16.4688f)
                lineTo(19.0313f, 16.4688f)
                lineTo(18.75f, 19.6875f)
                lineTo(16.0f, 20.4375f)
                lineTo(15.9688f, 20.4375f)
                lineTo(13.2188f, 19.6875f)
                lineTo(13.0625f, 17.625f)
                lineTo(10.5625f, 17.625f)
                lineTo(10.9063f, 21.5938f)
                lineTo(15.9688f, 23.0f)
                lineTo(16.0f, 23.0f)
                lineTo(21.0625f, 21.5938f)
                lineTo(21.75f, 14.0f)
                lineTo(12.7188f, 14.0f)
                lineTo(12.5f, 11.4688f)
                lineTo(21.9688f, 11.4688f)
                lineTo(22.1875f, 9.0f)
                close()
            }
        }
        .build()
        return _html5!!
    }

private var _html5: ImageVector? = null
