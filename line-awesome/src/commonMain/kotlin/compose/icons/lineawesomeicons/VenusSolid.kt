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

public val LineAwesomeIcons.VenusSolid: ImageVector
    get() {
        if (_venusSolid != null) {
            return _venusSolid!!
        }
        _venusSolid = Builder(name = "VenusSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(11.594f, 3.0f, 8.0f, 6.594f, 8.0f, 11.0f)
                curveTo(8.0f, 15.066f, 11.066f, 18.438f, 15.0f, 18.938f)
                lineTo(15.0f, 23.0f)
                lineTo(11.0f, 23.0f)
                lineTo(11.0f, 25.0f)
                lineTo(15.0f, 25.0f)
                lineTo(15.0f, 29.0f)
                lineTo(17.0f, 29.0f)
                lineTo(17.0f, 25.0f)
                lineTo(21.0f, 25.0f)
                lineTo(21.0f, 23.0f)
                lineTo(17.0f, 23.0f)
                lineTo(17.0f, 18.938f)
                curveTo(20.934f, 18.438f, 24.0f, 15.066f, 24.0f, 11.0f)
                curveTo(24.0f, 6.594f, 20.406f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(19.324f, 5.0f, 22.0f, 7.676f, 22.0f, 11.0f)
                curveTo(22.0f, 14.324f, 19.324f, 17.0f, 16.0f, 17.0f)
                curveTo(12.676f, 17.0f, 10.0f, 14.324f, 10.0f, 11.0f)
                curveTo(10.0f, 7.676f, 12.676f, 5.0f, 16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _venusSolid!!
    }

private var _venusSolid: ImageVector? = null
