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
                curveTo(8.906f, 5.0f, 8.0f, 5.906f, 8.0f, 7.0f)
                lineTo(8.0f, 25.719f)
                curveTo(8.0f, 26.227f, 8.359f, 26.691f, 8.781f, 26.844f)
                curveTo(9.195f, 26.992f, 9.766f, 26.871f, 10.094f, 26.5f)
                lineTo(16.406f, 19.0f)
                lineTo(19.844f, 19.0f)
                curveTo(20.793f, 19.0f, 21.629f, 18.305f, 21.813f, 17.375f)
                lineTo(23.75f, 7.375f)
                curveTo(23.984f, 6.16f, 23.02f, 5.0f, 21.781f, 5.0f)
                close()
                moveTo(10.0f, 7.0f)
                lineTo(21.781f, 7.0f)
                lineTo(21.0f, 11.0f)
                lineTo(14.469f, 11.0f)
                curveTo(14.219f, 11.0f, 14.0f, 11.219f, 14.0f, 11.469f)
                lineTo(14.0f, 12.531f)
                curveTo(14.0f, 12.781f, 14.219f, 13.0f, 14.469f, 13.0f)
                lineTo(20.625f, 13.0f)
                lineTo(19.844f, 17.0f)
                lineTo(15.906f, 17.0f)
                curveTo(15.609f, 16.992f, 15.32f, 17.117f, 15.125f, 17.344f)
                lineTo(10.0f, 23.5f)
                close()
            }
        }
        .build()
        return _foursquare!!
    }

private var _foursquare: ImageVector? = null
