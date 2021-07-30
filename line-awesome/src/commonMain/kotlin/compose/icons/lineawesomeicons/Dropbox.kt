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

public val LineAwesomeIcons.Dropbox: ImageVector
    get() {
        if (_dropbox != null) {
            return _dropbox!!
        }
        _dropbox = Builder(name = "Dropbox", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7813f, 4.4688f)
                lineTo(11.1563f, 4.875f)
                lineTo(4.4688f, 9.1875f)
                lineTo(3.25f, 9.9688f)
                lineTo(4.4063f, 10.8438f)
                lineTo(7.9063f, 13.5f)
                lineTo(4.4063f, 16.1563f)
                lineTo(3.1875f, 17.0625f)
                lineTo(4.5f, 17.8125f)
                lineTo(8.125f, 19.9375f)
                lineTo(8.125f, 23.2813f)
                lineTo(8.5625f, 23.5625f)
                lineTo(15.4375f, 28.0938f)
                lineTo(16.0f, 28.4688f)
                lineTo(16.5625f, 28.0938f)
                lineTo(23.4375f, 23.625f)
                lineTo(23.875f, 23.3125f)
                lineTo(23.875f, 19.9688f)
                lineTo(27.5f, 17.8125f)
                lineTo(28.7188f, 17.0938f)
                lineTo(27.6563f, 16.1875f)
                lineTo(24.3125f, 13.3438f)
                lineTo(27.625f, 10.625f)
                lineTo(28.7188f, 9.75f)
                lineTo(27.5313f, 9.0f)
                lineTo(21.0313f, 4.875f)
                lineTo(20.4063f, 4.5f)
                lineTo(19.8438f, 4.9688f)
                lineTo(16.0f, 8.125f)
                lineTo(12.3438f, 4.9688f)
                close()
                moveTo(20.5938f, 6.9375f)
                lineTo(25.3125f, 9.9688f)
                lineTo(22.6563f, 12.125f)
                lineTo(17.75f, 9.2813f)
                close()
                moveTo(11.5938f, 6.9688f)
                lineTo(14.3438f, 9.3125f)
                lineTo(9.625f, 12.3125f)
                lineTo(6.7188f, 10.0938f)
                close()
                moveTo(16.0f, 10.625f)
                lineTo(20.8125f, 13.375f)
                lineTo(16.0f, 16.375f)
                lineTo(11.4688f, 13.5313f)
                close()
                moveTo(22.6563f, 14.5625f)
                lineTo(25.2813f, 16.8125f)
                lineTo(22.4688f, 18.5f)
                curveTo(22.3789f, 18.5391f, 22.293f, 18.5938f, 22.2188f, 18.6563f)
                lineTo(20.4688f, 19.6875f)
                lineTo(17.75f, 17.625f)
                close()
                moveTo(9.625f, 14.7188f)
                lineTo(14.25f, 17.625f)
                lineTo(11.625f, 19.6875f)
                lineTo(6.7813f, 16.8438f)
                close()
                moveTo(16.0313f, 18.8125f)
                lineTo(19.7813f, 21.6875f)
                lineTo(20.3438f, 22.0938f)
                lineTo(20.9063f, 21.75f)
                lineTo(21.875f, 21.1563f)
                lineTo(21.875f, 22.2188f)
                lineTo(16.0f, 26.0625f)
                lineTo(10.125f, 22.1875f)
                lineTo(10.125f, 21.125f)
                lineTo(11.1875f, 21.75f)
                lineTo(11.7813f, 22.0938f)
                lineTo(12.3125f, 21.6875f)
                close()
            }
        }
        .build()
        return _dropbox!!
    }

private var _dropbox: ImageVector? = null
