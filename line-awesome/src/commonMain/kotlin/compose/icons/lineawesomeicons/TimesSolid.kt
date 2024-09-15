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

public val LineAwesomeIcons.TimesSolid: ImageVector
    get() {
        if (_timesSolid != null) {
            return _timesSolid!!
        }
        _timesSolid = Builder(name = "TimesSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.219f, 5.781f)
                lineTo(5.781f, 7.219f)
                lineTo(14.563f, 16.0f)
                lineTo(5.781f, 24.781f)
                lineTo(7.219f, 26.219f)
                lineTo(16.0f, 17.438f)
                lineTo(24.781f, 26.219f)
                lineTo(26.219f, 24.781f)
                lineTo(17.438f, 16.0f)
                lineTo(26.219f, 7.219f)
                lineTo(24.781f, 5.781f)
                lineTo(16.0f, 14.563f)
                close()
            }
        }
        .build()
        return _timesSolid!!
    }

private var _timesSolid: ImageVector? = null
