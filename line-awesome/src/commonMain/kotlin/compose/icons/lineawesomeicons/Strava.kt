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

public val LineAwesomeIcons.Strava: ImageVector
    get() {
        if (_strava != null) {
            return _strava!!
        }
        _strava = Builder(name = "Strava", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.18f, 2.0f)
                lineTo(5.9f, 18.0f)
                lineTo(10.779f, 18.0f)
                lineTo(14.18f, 11.619f)
                lineTo(17.561f, 18.0f)
                lineTo(22.4f, 18.0f)
                lineTo(14.18f, 2.0f)
                close()
                moveTo(22.4f, 18.0f)
                lineTo(20.0f, 22.789f)
                lineTo(17.561f, 18.0f)
                lineTo(13.859f, 18.0f)
                lineTo(20.0f, 30.0f)
                lineTo(26.1f, 18.0f)
                lineTo(22.4f, 18.0f)
                close()
            }
        }
        .build()
        return _strava!!
    }

private var _strava: ImageVector? = null
