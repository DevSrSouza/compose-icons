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
                moveTo(13.73f, 5.0f)
                lineTo(26.0f, 27.0f)
                lineTo(27.994f, 22.488f)
                curveTo(28.457f, 21.562f, 28.41f, 20.463f, 27.871f, 19.58f)
                lineTo(20.096f, 6.436f)
                curveTo(19.551f, 5.545f, 18.58f, 5.0f, 17.535f, 5.0f)
                lineTo(13.73f, 5.0f)
                close()
                moveTo(11.512f, 7.178f)
                lineTo(5.631f, 18.0f)
                lineTo(17.547f, 18.0f)
                lineTo(11.512f, 7.178f)
                close()
                moveTo(4.0f, 21.0f)
                lineTo(6.172f, 25.342f)
                curveTo(6.68f, 26.358f, 7.718f, 27.0f, 8.854f, 27.0f)
                lineTo(22.566f, 27.0f)
                lineTo(19.221f, 21.0f)
                lineTo(4.0f, 21.0f)
                close()
            }
        }
        .build()
        return _artstation!!
    }

private var _artstation: ImageVector? = null
