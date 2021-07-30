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

public val LineAwesomeIcons.FortAwesome: ImageVector
    get() {
        if (_fortAwesome != null) {
            return _fortAwesome!!
        }
        _fortAwesome = Builder(name = "FortAwesome", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 4.0f)
                curveTo(15.225f, 4.0f, 15.0f, 4.225f, 15.0f, 4.5f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 11.5f)
                lineTo(15.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                lineTo(13.0f, 10.0f)
                lineTo(11.0f, 10.0f)
                lineTo(11.0f, 12.0f)
                lineTo(8.9941f, 12.0f)
                lineTo(8.9941f, 10.0f)
                lineTo(7.0f, 10.0f)
                lineTo(7.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 17.0f)
                lineTo(3.0f, 17.0f)
                lineTo(3.0f, 27.0f)
                lineTo(13.0f, 27.0f)
                lineTo(13.0f, 24.0f)
                curveTo(13.0f, 22.343f, 14.343f, 21.0f, 16.0f, 21.0f)
                curveTo(17.657f, 21.0f, 19.0f, 22.343f, 19.0f, 24.0f)
                lineTo(19.0f, 27.0f)
                lineTo(29.0f, 27.0f)
                lineTo(29.0f, 17.0f)
                lineTo(27.0f, 17.0f)
                lineTo(27.0f, 19.0f)
                lineTo(25.0f, 19.0f)
                lineTo(25.0f, 10.0f)
                lineTo(22.9941f, 10.0f)
                lineTo(22.9941f, 12.0f)
                lineTo(21.0f, 12.0f)
                lineTo(21.0f, 10.0f)
                lineTo(19.0f, 10.0f)
                lineTo(19.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                lineTo(17.0f, 10.0f)
                lineTo(16.0f, 10.0f)
                lineTo(16.0f, 7.9063f)
                curveTo(16.275f, 7.8063f, 16.7254f, 7.678f, 17.2754f, 7.668f)
                curveTo(18.0374f, 7.658f, 18.4116f, 7.867f, 19.2246f, 7.957f)
                curveTo(19.5716f, 8.0f, 20.0692f, 8.0292f, 20.6992f, 7.9512f)
                curveTo(20.8692f, 7.9302f, 21.0f, 7.7784f, 21.0f, 7.6074f)
                lineTo(21.0f, 4.4316f)
                curveTo(21.0f, 4.3316f, 20.8867f, 4.2613f, 20.7617f, 4.2813f)
                curveTo(20.0997f, 4.3612f, 19.5866f, 4.331f, 19.2246f, 4.291f)
                curveTo(18.4116f, 4.201f, 18.0374f, 3.982f, 17.2754f, 4.002f)
                curveTo(16.7254f, 4.012f, 16.275f, 4.1402f, 16.0f, 4.2402f)
                lineTo(16.0f, 4.5f)
                curveTo(16.0f, 4.225f, 15.775f, 4.0f, 15.5f, 4.0f)
                close()
                moveTo(11.0f, 14.0f)
                lineTo(13.0f, 14.0f)
                lineTo(13.0f, 18.0f)
                lineTo(11.0f, 18.0f)
                lineTo(11.0f, 14.0f)
                close()
                moveTo(19.0f, 14.0f)
                lineTo(21.0f, 14.0f)
                lineTo(21.0f, 18.0f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 14.0f)
                close()
            }
        }
        .build()
        return _fortAwesome!!
    }

private var _fortAwesome: ImageVector? = null
