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

public val LineAwesomeIcons.Cloudsmith: ImageVector
    get() {
        if (_cloudsmith != null) {
            return _cloudsmith!!
        }
        _cloudsmith = Builder(name = "Cloudsmith", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.8535f, 3.0f)
                curveTo(16.4435f, 3.0f, 14.291f, 4.9506f, 14.291f, 7.3496f)
                curveTo(14.291f, 9.7596f, 12.7596f, 11.291f, 10.3496f, 11.291f)
                curveTo(7.9506f, 11.291f, 6.0f, 13.4425f, 6.0f, 15.8535f)
                curveTo(6.0f, 18.2645f, 7.9506f, 20.0f, 10.3496f, 20.0f)
                curveTo(12.7596f, 20.0f, 14.707f, 18.2665f, 14.707f, 15.8555f)
                curveTo(14.707f, 13.4445f, 16.4435f, 11.709f, 18.8535f, 11.709f)
                curveTo(21.2535f, 11.709f, 23.0f, 9.7596f, 23.0f, 7.3496f)
                curveTo(23.0f, 4.9506f, 21.2535f, 3.0f, 18.8535f, 3.0f)
                close()
                moveTo(19.5059f, 20.0f)
                curveTo(17.0159f, 20.0f, 15.0f, 22.0151f, 15.0f, 24.4941f)
                curveTo(15.0f, 26.9851f, 17.0159f, 29.0f, 19.5059f, 29.0f)
                curveTo(21.9859f, 29.0f, 24.0f, 26.9851f, 24.0f, 24.4941f)
                curveTo(24.0f, 22.0151f, 21.9859f, 20.0f, 19.5059f, 20.0f)
                close()
            }
        }
        .build()
        return _cloudsmith!!
    }

private var _cloudsmith: ImageVector? = null
