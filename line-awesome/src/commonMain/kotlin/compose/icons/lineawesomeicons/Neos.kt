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

public val LineAwesomeIcons.Neos: ImageVector
    get() {
        if (_neos != null) {
            return _neos!!
        }
        _neos = Builder(name = "Neos", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2871f, 5.0f)
                lineTo(6.0f, 6.7012f)
                lineTo(6.0f, 26.0f)
                lineTo(6.668f, 26.0f)
                lineTo(10.6621f, 26.0f)
                lineTo(14.0039f, 23.5566f)
                lineTo(14.002f, 19.5234f)
                lineTo(18.3672f, 26.0f)
                lineTo(21.7871f, 26.0f)
                lineTo(25.0f, 24.0f)
                lineTo(25.0f, 5.0f)
                lineTo(20.3379f, 5.0f)
                lineTo(17.0f, 7.4199f)
                lineTo(17.0f, 11.3496f)
                lineTo(12.7676f, 5.0f)
                lineTo(8.2871f, 5.0f)
                close()
                moveTo(9.3887f, 6.0f)
                lineTo(12.2324f, 6.0f)
                lineTo(21.0f, 19.1504f)
                lineTo(21.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineTo(24.0f, 23.0f)
                lineTo(20.7207f, 23.0f)
                lineTo(9.3887f, 6.0f)
                close()
                moveTo(8.3281f, 6.2148f)
                lineTo(20.1855f, 24.0f)
                lineTo(23.041f, 24.0f)
                lineTo(21.4746f, 25.0f)
                lineTo(18.9844f, 25.0f)
                lineTo(14.0f, 17.748f)
                lineTo(14.0f, 17.7344f)
                lineTo(13.9902f, 17.7344f)
                lineTo(10.0f, 11.9297f)
                lineTo(10.0f, 22.25f)
                lineTo(7.0f, 24.5f)
                lineTo(7.0f, 7.2031f)
                lineTo(8.3281f, 6.2148f)
                close()
                moveTo(20.0f, 6.4805f)
                lineTo(20.0f, 15.8496f)
                lineTo(18.0f, 12.8496f)
                lineTo(18.0f, 7.9297f)
                lineTo(20.0f, 6.4805f)
                close()
                moveTo(11.0f, 15.0703f)
                lineTo(13.0f, 18.0371f)
                lineTo(13.0039f, 23.0488f)
                lineTo(10.3379f, 25.0f)
                lineTo(8.0f, 25.0f)
                lineTo(11.0f, 22.75f)
                lineTo(11.0f, 15.0703f)
                close()
            }
        }
        .build()
        return _neos!!
    }

private var _neos: ImageVector? = null
