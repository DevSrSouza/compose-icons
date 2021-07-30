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

public val LineAwesomeIcons.GooglePlusSquare: ImageVector
    get() {
        if (_googlePlusSquare != null) {
            return _googlePlusSquare!!
        }
        _googlePlusSquare = Builder(name = "GooglePlusSquare", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(13.5938f, 11.0f)
                curveTo(11.0557f, 11.0f, 9.0f, 13.056f, 9.0f, 15.584f)
                curveTo(9.0f, 18.122f, 11.0557f, 20.1777f, 13.5938f, 20.1777f)
                curveTo(16.2377f, 20.1777f, 18.0f, 18.3212f, 18.0f, 15.6992f)
                curveTo(18.0f, 15.4062f, 17.969f, 15.231f, 17.916f, 15.0f)
                lineTo(13.5938f, 15.0f)
                lineTo(13.5938f, 16.5176f)
                lineTo(16.1953f, 16.5176f)
                curveTo(16.0913f, 17.1886f, 15.4087f, 18.4902f, 13.5938f, 18.4902f)
                curveTo(12.0308f, 18.4902f, 10.752f, 17.2007f, 10.752f, 15.5957f)
                curveTo(10.752f, 13.9907f, 12.0308f, 12.6895f, 13.5938f, 12.6895f)
                curveTo(14.4847f, 12.6895f, 15.0839f, 13.0773f, 15.4199f, 13.4023f)
                lineTo(16.668f, 12.2051f)
                curveTo(15.861f, 11.4501f, 14.8317f, 11.0f, 13.5938f, 11.0f)
                close()
                moveTo(20.3301f, 14.0f)
                lineTo(20.3301f, 15.3301f)
                lineTo(19.0f, 15.3301f)
                lineTo(19.0f, 16.6699f)
                lineTo(20.3301f, 16.6699f)
                lineTo(20.3301f, 18.0f)
                lineTo(21.6699f, 18.0f)
                lineTo(21.6699f, 16.6699f)
                lineTo(23.0f, 16.6699f)
                lineTo(23.0f, 15.3301f)
                lineTo(21.6699f, 15.3301f)
                lineTo(21.6699f, 14.0f)
                lineTo(20.3301f, 14.0f)
                close()
            }
        }
        .build()
        return _googlePlusSquare!!
    }

private var _googlePlusSquare: ImageVector? = null
