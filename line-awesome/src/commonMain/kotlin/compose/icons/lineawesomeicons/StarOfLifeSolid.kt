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

public val LineAwesomeIcons.StarOfLifeSolid: ImageVector
    get() {
        if (_starOfLifeSolid != null) {
            return _starOfLifeSolid!!
        }
        _starOfLifeSolid = Builder(name = "StarOfLifeSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                lineTo(13.0f, 10.8047f)
                lineTo(7.1074f, 7.4023f)
                lineTo(4.1074f, 12.5996f)
                lineTo(10.0f, 16.0f)
                lineTo(4.1074f, 19.4004f)
                lineTo(7.1074f, 24.5977f)
                lineTo(13.0f, 21.1953f)
                lineTo(13.0f, 28.0f)
                lineTo(19.0f, 28.0f)
                lineTo(19.0f, 21.1953f)
                lineTo(24.8926f, 24.5977f)
                lineTo(27.8926f, 19.4004f)
                lineTo(22.0f, 16.0f)
                lineTo(27.8926f, 12.5996f)
                lineTo(24.8926f, 7.4023f)
                lineTo(19.0f, 10.8047f)
                lineTo(19.0f, 4.0f)
                lineTo(13.0f, 4.0f)
                close()
                moveTo(15.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 14.2695f)
                lineTo(24.1602f, 10.1348f)
                lineTo(25.1602f, 11.8652f)
                lineTo(18.0f, 16.0f)
                lineTo(25.1602f, 20.1348f)
                lineTo(24.1602f, 21.8652f)
                lineTo(17.0f, 17.7305f)
                lineTo(17.0f, 26.0f)
                lineTo(15.0f, 26.0f)
                lineTo(15.0f, 17.7305f)
                lineTo(7.8398f, 21.8652f)
                lineTo(6.8398f, 20.1348f)
                lineTo(14.0f, 16.0f)
                lineTo(6.8398f, 11.8652f)
                lineTo(7.8398f, 10.1348f)
                lineTo(15.0f, 14.2695f)
                lineTo(15.0f, 6.0f)
                close()
            }
        }
        .build()
        return _starOfLifeSolid!!
    }

private var _starOfLifeSolid: ImageVector? = null
