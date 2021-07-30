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

public val LineAwesomeIcons.Erlang: ImageVector
    get() {
        if (_erlang != null) {
            return _erlang!!
        }
        _erlang = Builder(name = "Erlang", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                lineTo(2.0f, 25.0f)
                lineTo(6.3203f, 25.0f)
                curveTo(4.2603f, 22.35f, 3.0f, 18.84f, 3.0f, 15.0f)
                curveTo(3.0f, 11.92f, 4.1508f, 9.12f, 6.0508f, 7.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(15.65f, 7.0f, 15.32f, 7.0409f, 15.0f, 7.1309f)
                curveTo(13.27f, 7.5709f, 12.0f, 9.14f, 12.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                curveTo(20.0f, 8.79f, 18.21f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(25.6602f, 7.0f)
                curveTo(27.1302f, 9.27f, 28.0f, 12.03f, 28.0f, 15.0f)
                lineTo(26.0f, 15.0f)
                lineTo(24.0f, 15.0f)
                lineTo(18.0f, 15.0f)
                lineTo(16.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(12.0f, 15.0f)
                curveTo(12.0f, 18.51f, 13.0f, 21.5593f, 15.0f, 23.0293f)
                curveTo(15.31f, 23.2693f, 15.64f, 23.4594f, 16.0f, 23.6094f)
                curveTo(16.6f, 23.8594f, 17.27f, 24.0f, 18.0f, 24.0f)
                curveTo(20.97f, 24.0f, 23.5695f, 22.1807f, 24.9395f, 19.4707f)
                lineTo(26.9609f, 20.4805f)
                lineTo(28.5195f, 21.2598f)
                curveTo(27.8195f, 22.6598f, 26.8991f, 23.92f, 25.7891f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 22.0f)
                lineTo(30.0f, 18.0f)
                lineTo(30.0f, 15.0f)
                lineTo(30.0f, 7.0f)
                lineTo(25.6602f, 7.0f)
                close()
            }
        }
        .build()
        return _erlang!!
    }

private var _erlang: ImageVector? = null
