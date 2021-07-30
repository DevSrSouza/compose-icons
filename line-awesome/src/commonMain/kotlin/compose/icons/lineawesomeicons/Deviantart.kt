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

public val LineAwesomeIcons.Deviantart: ImageVector
    get() {
        if (_deviantart != null) {
            return _deviantart!!
        }
        _deviantart = Builder(name = "Deviantart", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.375f, 4.0f)
                lineTo(18.0938f, 4.3125f)
                lineTo(17.6875f, 4.6875f)
                lineTo(17.5938f, 4.8125f)
                lineTo(17.5313f, 4.9375f)
                lineTo(15.75f, 8.3125f)
                lineTo(15.5938f, 8.4063f)
                lineTo(8.1875f, 8.4063f)
                lineTo(8.1875f, 15.9063f)
                lineTo(11.7813f, 15.9063f)
                lineTo(8.3125f, 22.5313f)
                lineTo(8.1875f, 22.75f)
                lineTo(8.1875f, 28.0f)
                lineTo(13.625f, 28.0f)
                lineTo(13.9063f, 27.6875f)
                lineTo(14.3125f, 27.3125f)
                lineTo(14.4063f, 27.1875f)
                lineTo(14.4688f, 27.0625f)
                lineTo(16.25f, 23.6875f)
                lineTo(16.4063f, 23.5938f)
                lineTo(23.8125f, 23.5938f)
                lineTo(23.8125f, 16.0938f)
                lineTo(20.2188f, 16.0938f)
                lineTo(23.6875f, 9.4688f)
                lineTo(23.8125f, 9.25f)
                lineTo(23.8125f, 4.0f)
                close()
                moveTo(19.2188f, 6.0f)
                lineTo(21.8125f, 6.0f)
                lineTo(21.8125f, 8.7813f)
                lineTo(17.875f, 16.25f)
                lineTo(17.5938f, 16.8438f)
                lineTo(18.0f, 17.3438f)
                lineTo(18.3438f, 17.75f)
                lineTo(18.625f, 18.0938f)
                lineTo(21.8125f, 18.0938f)
                lineTo(21.8125f, 21.5938f)
                lineTo(15.7813f, 21.5938f)
                lineTo(15.5f, 21.7813f)
                lineTo(14.9063f, 22.1563f)
                lineTo(14.7188f, 22.3125f)
                lineTo(14.5938f, 22.5313f)
                lineTo(12.7813f, 26.0f)
                lineTo(10.1875f, 26.0f)
                lineTo(10.1875f, 23.2188f)
                lineTo(14.0938f, 15.75f)
                lineTo(14.4063f, 15.1875f)
                lineTo(14.0f, 14.6563f)
                lineTo(13.6563f, 14.25f)
                lineTo(13.375f, 13.9063f)
                lineTo(10.1875f, 13.9063f)
                lineTo(10.1875f, 10.4063f)
                lineTo(16.2188f, 10.4063f)
                lineTo(16.4688f, 10.2188f)
                lineTo(17.0625f, 9.8438f)
                lineTo(17.2813f, 9.6875f)
                lineTo(17.4063f, 9.4688f)
                close()
            }
        }
        .build()
        return _deviantart!!
    }

private var _deviantart: ImageVector? = null
