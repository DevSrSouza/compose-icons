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

public val LineAwesomeIcons.Intercom: ImageVector
    get() {
        if (_intercom != null) {
            return _intercom!!
        }
        _intercom = Builder(name = "Intercom", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                moveTo(16.002f, 9.0f)
                curveTo(15.6837f, 9.0f, 15.3652f, 9.2113f, 15.3652f, 9.6328f)
                lineTo(15.3652f, 18.8496f)
                curveTo(15.3652f, 19.6926f, 16.6387f, 19.6926f, 16.6387f, 18.8496f)
                lineTo(16.6387f, 9.6328f)
                curveTo(16.6387f, 9.2113f, 16.3202f, 9.0f, 16.002f, 9.0f)
                close()
                moveTo(12.8223f, 9.3184f)
                curveTo(12.504f, 9.3184f, 12.1855f, 9.5297f, 12.1855f, 9.9512f)
                lineTo(12.1855f, 18.4434f)
                curveTo(12.1855f, 19.2864f, 13.457f, 19.2864f, 13.457f, 18.4434f)
                lineTo(13.457f, 9.9512f)
                curveTo(13.457f, 9.5297f, 13.1405f, 9.3184f, 12.8223f, 9.3184f)
                close()
                moveTo(19.1777f, 9.3184f)
                curveTo(18.8595f, 9.3184f, 18.541f, 9.5297f, 18.541f, 9.9512f)
                lineTo(18.541f, 18.4434f)
                curveTo(18.541f, 19.2864f, 19.8145f, 19.2864f, 19.8145f, 18.4434f)
                lineTo(19.8145f, 9.9512f)
                curveTo(19.8145f, 9.5297f, 19.496f, 9.3184f, 19.1777f, 9.3184f)
                close()
                moveTo(9.6406f, 10.5918f)
                curveTo(9.3224f, 10.5918f, 9.0059f, 10.8031f, 9.0059f, 11.2246f)
                lineTo(9.0059f, 16.9414f)
                curveTo(9.0059f, 17.7844f, 10.2773f, 17.7844f, 10.2773f, 16.9414f)
                lineTo(10.2773f, 11.2246f)
                curveTo(10.2773f, 10.8031f, 9.9589f, 10.5918f, 9.6406f, 10.5918f)
                close()
                moveTo(22.3574f, 10.5918f)
                curveTo(22.0392f, 10.5918f, 21.7207f, 10.8031f, 21.7207f, 11.2246f)
                lineTo(21.7207f, 16.9414f)
                curveTo(21.7207f, 17.7844f, 22.9941f, 17.7844f, 22.9941f, 16.9414f)
                lineTo(22.9941f, 11.2246f)
                curveTo(22.9941f, 10.8031f, 22.6757f, 10.5918f, 22.3574f, 10.5918f)
                close()
                moveTo(22.4316f, 19.7988f)
                curveTo(22.2748f, 19.7769f, 22.1041f, 19.8178f, 21.9453f, 19.9551f)
                curveTo(19.2553f, 22.2501f, 12.8616f, 22.3091f, 10.0566f, 19.9551f)
                curveTo(9.4176f, 19.4101f, 8.5915f, 20.3769f, 9.2305f, 20.9219f)
                curveTo(12.4825f, 23.7059f, 19.6725f, 23.6039f, 22.7715f, 20.9219f)
                curveTo(23.2477f, 20.5101f, 22.9021f, 19.8646f, 22.4316f, 19.7988f)
                close()
            }
        }
        .build()
        return _intercom!!
    }

private var _intercom: ImageVector? = null
