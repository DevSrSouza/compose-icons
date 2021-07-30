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

public val LineAwesomeIcons.Artstation: ImageVector
    get() {
        if (_artstation != null) {
            return _artstation!!
        }
        _artstation = Builder(name = "Artstation", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7305f, 5.0f)
                lineTo(26.0f, 27.0f)
                lineTo(27.9941f, 22.4883f)
                curveTo(28.4571f, 21.5623f, 28.4101f, 20.4631f, 27.8711f, 19.5801f)
                lineTo(20.0957f, 6.4355f)
                curveTo(19.5507f, 5.5445f, 18.5802f, 5.0f, 17.5352f, 5.0f)
                lineTo(13.7305f, 5.0f)
                close()
                moveTo(11.5117f, 7.1777f)
                lineTo(5.6309f, 18.0f)
                lineTo(17.5469f, 18.0f)
                lineTo(11.5117f, 7.1777f)
                close()
                moveTo(4.0f, 21.0f)
                lineTo(6.1719f, 25.3418f)
                curveTo(6.6799f, 26.3578f, 7.7175f, 27.0f, 8.8535f, 27.0f)
                lineTo(22.5664f, 27.0f)
                lineTo(19.2207f, 21.0f)
                lineTo(4.0f, 21.0f)
                close()
            }
        }
        .build()
        return _artstation!!
    }

private var _artstation: ImageVector? = null
