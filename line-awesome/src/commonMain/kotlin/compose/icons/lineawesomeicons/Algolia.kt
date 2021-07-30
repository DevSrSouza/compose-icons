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

public val LineAwesomeIcons.Algolia: ImageVector
    get() {
        if (_algolia != null) {
            return _algolia!!
        }
        _algolia = Builder(name = "Algolia", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(15.0f, 8.0f)
                curveTo(14.448f, 8.0f, 14.0f, 8.448f, 14.0f, 9.0f)
                lineTo(14.0f, 10.2949f)
                curveTo(14.634f, 10.1049f, 15.305f, 10.0f, 16.0f, 10.0f)
                curveTo(16.695f, 10.0f, 17.366f, 10.1049f, 18.0f, 10.2949f)
                lineTo(18.0f, 9.0f)
                curveTo(18.0f, 8.448f, 17.552f, 8.0f, 17.0f, 8.0f)
                lineTo(15.0f, 8.0f)
                close()
                moveTo(10.707f, 10.0f)
                curveTo(10.4512f, 10.0f, 10.195f, 10.0994f, 10.0f, 10.2949f)
                lineTo(9.293f, 11.0f)
                curveTo(8.902f, 11.391f, 8.902f, 12.0241f, 9.293f, 12.4141f)
                lineTo(10.1094f, 13.2324f)
                curveTo(10.6554f, 12.3814f, 11.3795f, 11.6573f, 12.2305f, 11.1113f)
                lineTo(11.4141f, 10.2949f)
                curveTo(11.2186f, 10.0994f, 10.9629f, 10.0f, 10.707f, 10.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(12.686f, 11.0f, 10.0f, 13.686f, 10.0f, 17.0f)
                curveTo(10.0f, 20.314f, 12.686f, 23.0f, 16.0f, 23.0f)
                curveTo(19.314f, 23.0f, 22.0f, 20.314f, 22.0f, 17.0f)
                curveTo(22.0f, 13.686f, 19.314f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(18.206f, 13.0f, 20.0f, 14.794f, 20.0f, 17.0f)
                curveTo(20.0f, 19.206f, 18.206f, 21.0f, 16.0f, 21.0f)
                curveTo(13.794f, 21.0f, 12.0f, 19.206f, 12.0f, 17.0f)
                curveTo(12.0f, 14.794f, 13.794f, 13.0f, 16.0f, 13.0f)
                close()
                moveTo(16.0f, 14.0f)
                lineTo(16.0f, 17.0f)
                lineTo(18.5938f, 15.5176f)
                curveTo(18.0758f, 14.6146f, 17.115f, 14.0f, 16.0f, 14.0f)
                close()
            }
        }
        .build()
        return _algolia!!
    }

private var _algolia: ImageVector? = null
