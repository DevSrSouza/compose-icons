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
                lineTo(14.0f, 10.295f)
                curveTo(14.634f, 10.105f, 15.305f, 10.0f, 16.0f, 10.0f)
                curveTo(16.695f, 10.0f, 17.366f, 10.105f, 18.0f, 10.295f)
                lineTo(18.0f, 9.0f)
                curveTo(18.0f, 8.448f, 17.552f, 8.0f, 17.0f, 8.0f)
                lineTo(15.0f, 8.0f)
                close()
                moveTo(10.707f, 10.0f)
                curveTo(10.451f, 10.0f, 10.195f, 10.099f, 10.0f, 10.295f)
                lineTo(9.293f, 11.0f)
                curveTo(8.902f, 11.391f, 8.902f, 12.024f, 9.293f, 12.414f)
                lineTo(10.109f, 13.232f)
                curveTo(10.655f, 12.381f, 11.379f, 11.657f, 12.23f, 11.111f)
                lineTo(11.414f, 10.295f)
                curveTo(11.219f, 10.099f, 10.963f, 10.0f, 10.707f, 10.0f)
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
                lineTo(18.594f, 15.518f)
                curveTo(18.076f, 14.615f, 17.115f, 14.0f, 16.0f, 14.0f)
                close()
            }
        }
        .build()
        return _algolia!!
    }

private var _algolia: ImageVector? = null
