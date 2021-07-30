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

public val LineAwesomeIcons.ThumbtackSolid: ImageVector
    get() {
        if (_thumbtackSolid != null) {
            return _thumbtackSolid!!
        }
        _thumbtackSolid = Builder(name = "ThumbtackSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5313f, 2.5625f)
                lineTo(19.8438f, 3.5f)
                lineTo(14.9375f, 10.1875f)
                curveTo(12.3086f, 9.7305f, 9.5273f, 10.4727f, 7.5f, 12.5f)
                lineTo(6.7813f, 13.1875f)
                lineTo(12.0938f, 18.5f)
                lineTo(4.0f, 26.5938f)
                lineTo(4.0f, 28.0f)
                lineTo(5.4063f, 28.0f)
                lineTo(13.5f, 19.9063f)
                lineTo(18.8125f, 25.2188f)
                lineTo(19.5f, 24.5f)
                curveTo(21.5273f, 22.4727f, 22.2695f, 19.6914f, 21.8125f, 17.0625f)
                lineTo(28.5f, 12.1563f)
                lineTo(29.4375f, 11.4688f)
                close()
                moveTo(20.7813f, 5.625f)
                lineTo(26.375f, 11.2188f)
                lineTo(20.1563f, 15.7813f)
                lineTo(19.5938f, 16.1875f)
                lineTo(19.7813f, 16.8438f)
                curveTo(20.2617f, 18.6758f, 19.7383f, 20.5859f, 18.5938f, 22.1875f)
                lineTo(9.8125f, 13.4063f)
                curveTo(11.4141f, 12.2617f, 13.3242f, 11.7383f, 15.1563f, 12.2188f)
                lineTo(15.8125f, 12.4063f)
                lineTo(16.2188f, 11.8438f)
                close()
            }
        }
        .build()
        return _thumbtackSolid!!
    }

private var _thumbtackSolid: ImageVector? = null
