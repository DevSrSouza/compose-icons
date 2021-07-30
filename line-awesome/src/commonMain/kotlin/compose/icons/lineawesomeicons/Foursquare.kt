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

public val LineAwesomeIcons.Foursquare: ImageVector
    get() {
        if (_foursquare != null) {
            return _foursquare!!
        }
        _foursquare = Builder(name = "Foursquare", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 5.0f)
                curveTo(8.9063f, 5.0f, 8.0f, 5.9063f, 8.0f, 7.0f)
                lineTo(8.0f, 25.7188f)
                curveTo(8.0f, 26.2266f, 8.3594f, 26.6914f, 8.7813f, 26.8438f)
                curveTo(9.1953f, 26.9922f, 9.7656f, 26.8711f, 10.0938f, 26.5f)
                lineTo(16.4063f, 19.0f)
                lineTo(19.8438f, 19.0f)
                curveTo(20.793f, 19.0f, 21.6289f, 18.3047f, 21.8125f, 17.375f)
                lineTo(23.75f, 7.375f)
                curveTo(23.9844f, 6.1602f, 23.0195f, 5.0f, 21.7813f, 5.0f)
                close()
                moveTo(10.0f, 7.0f)
                lineTo(21.7813f, 7.0f)
                lineTo(21.0f, 11.0f)
                lineTo(14.4688f, 11.0f)
                curveTo(14.2188f, 11.0f, 14.0f, 11.2188f, 14.0f, 11.4688f)
                lineTo(14.0f, 12.5313f)
                curveTo(14.0f, 12.7813f, 14.2188f, 13.0f, 14.4688f, 13.0f)
                lineTo(20.625f, 13.0f)
                lineTo(19.8438f, 17.0f)
                lineTo(15.9063f, 17.0f)
                curveTo(15.6094f, 16.9922f, 15.3203f, 17.1172f, 15.125f, 17.3438f)
                lineTo(10.0f, 23.5f)
                close()
            }
        }
        .build()
        return _foursquare!!
    }

private var _foursquare: ImageVector? = null
