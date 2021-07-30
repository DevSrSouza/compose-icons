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

public val LineAwesomeIcons.SpaceShuttleSolid: ImageVector
    get() {
        if (_spaceShuttleSolid != null) {
            return _spaceShuttleSolid!!
        }
        _spaceShuttleSolid = Builder(name = "SpaceShuttleSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                lineTo(2.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                lineTo(0.0f, 13.0f)
                lineTo(1.0f, 13.0f)
                lineTo(1.0f, 19.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 28.0f)
                lineTo(6.5625f, 28.0f)
                curveTo(9.0195f, 28.0f, 11.3867f, 27.0195f, 13.125f, 25.2813f)
                lineTo(17.4688f, 20.9688f)
                lineTo(25.5f, 20.2813f)
                curveTo(28.0742f, 20.0664f, 30.4102f, 18.7109f, 31.8438f, 16.5625f)
                lineTo(32.1875f, 16.0f)
                lineTo(31.8438f, 15.4375f)
                curveTo(30.4102f, 13.2891f, 28.0742f, 11.9336f, 25.5f, 11.7188f)
                lineTo(17.4688f, 11.0313f)
                lineTo(13.2813f, 6.8438f)
                lineTo(13.125f, 6.7188f)
                curveTo(11.3867f, 4.9805f, 9.0195f, 4.0f, 6.5625f, 4.0f)
                close()
                moveTo(4.0f, 6.0f)
                lineTo(6.5625f, 6.0f)
                curveTo(8.4922f, 6.0f, 10.3555f, 6.7617f, 11.7188f, 8.125f)
                lineTo(14.5625f, 11.0f)
                lineTo(10.0f, 11.0f)
                lineTo(10.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                lineTo(25.3125f, 13.6875f)
                curveTo(27.0f, 13.8281f, 28.4648f, 14.7383f, 29.5625f, 16.0f)
                curveTo(28.4648f, 17.2617f, 27.0f, 18.1719f, 25.3125f, 18.3125f)
                lineTo(16.9063f, 19.0f)
                lineTo(10.0f, 19.0f)
                lineTo(10.0f, 21.0f)
                lineTo(14.5625f, 21.0f)
                lineTo(11.7188f, 23.875f)
                curveTo(10.3555f, 25.2383f, 8.4922f, 26.0f, 6.5625f, 26.0f)
                lineTo(4.0f, 26.0f)
                lineTo(4.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                close()
                moveTo(24.0f, 15.0f)
                lineTo(24.0f, 17.0f)
                lineTo(26.0f, 17.0f)
                lineTo(26.0f, 15.0f)
                close()
                moveTo(6.0f, 21.0f)
                lineTo(6.0f, 24.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 21.0f)
                close()
            }
        }
        .build()
        return _spaceShuttleSolid!!
    }

private var _spaceShuttleSolid: ImageVector? = null
