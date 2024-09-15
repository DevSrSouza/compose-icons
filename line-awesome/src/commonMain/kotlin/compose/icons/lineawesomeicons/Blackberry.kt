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

public val LineAwesomeIcons.Blackberry: ImageVector
    get() {
        if (_blackberry != null) {
            return _blackberry!!
        }
        _blackberry = Builder(name = "Blackberry", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.086f, 5.0f, 27.0f, 9.914f, 27.0f, 16.0f)
                curveTo(27.0f, 22.086f, 22.086f, 27.0f, 16.0f, 27.0f)
                curveTo(9.914f, 27.0f, 5.0f, 22.086f, 5.0f, 16.0f)
                curveTo(5.0f, 9.914f, 9.914f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(9.719f, 11.0f)
                lineTo(9.125f, 13.688f)
                lineTo(11.281f, 13.688f)
                curveTo(12.953f, 13.688f, 13.438f, 12.922f, 13.438f, 12.188f)
                curveTo(13.438f, 11.668f, 13.117f, 11.0f, 11.781f, 11.0f)
                close()
                moveTo(15.25f, 11.0f)
                lineTo(14.656f, 13.688f)
                lineTo(16.813f, 13.688f)
                curveTo(18.484f, 13.688f, 18.969f, 12.922f, 18.969f, 12.188f)
                curveTo(18.969f, 11.668f, 18.645f, 11.0f, 17.313f, 11.0f)
                close()
                moveTo(20.313f, 13.406f)
                lineTo(19.719f, 16.125f)
                lineTo(21.844f, 16.125f)
                curveTo(23.516f, 16.125f, 24.0f, 15.332f, 24.0f, 14.594f)
                curveTo(24.0f, 14.074f, 23.676f, 13.406f, 22.344f, 13.406f)
                close()
                moveTo(8.969f, 15.063f)
                lineTo(8.406f, 17.781f)
                lineTo(10.531f, 17.781f)
                curveTo(12.203f, 17.781f, 12.688f, 16.984f, 12.688f, 16.25f)
                curveTo(12.688f, 15.73f, 12.367f, 15.063f, 11.031f, 15.063f)
                close()
                moveTo(14.5f, 15.063f)
                lineTo(13.938f, 17.781f)
                lineTo(16.063f, 17.781f)
                curveTo(17.734f, 17.781f, 18.219f, 16.984f, 18.219f, 16.25f)
                curveTo(18.219f, 15.73f, 17.895f, 15.063f, 16.563f, 15.063f)
                close()
                moveTo(19.5f, 17.656f)
                lineTo(18.906f, 20.344f)
                lineTo(21.063f, 20.344f)
                curveTo(22.734f, 20.344f, 23.188f, 19.547f, 23.188f, 18.813f)
                curveTo(23.188f, 18.293f, 22.895f, 17.656f, 21.563f, 17.656f)
                close()
                moveTo(13.719f, 19.313f)
                lineTo(13.125f, 22.0f)
                lineTo(15.281f, 22.0f)
                curveTo(16.953f, 22.0f, 17.406f, 21.203f, 17.406f, 20.469f)
                curveTo(17.406f, 19.949f, 17.113f, 19.313f, 15.781f, 19.313f)
                close()
            }
        }
        .build()
        return _blackberry!!
    }

private var _blackberry: ImageVector? = null
