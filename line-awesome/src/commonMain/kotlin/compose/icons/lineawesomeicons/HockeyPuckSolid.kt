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

public val LineAwesomeIcons.HockeyPuckSolid: ImageVector
    get() {
        if (_hockeyPuckSolid != null) {
            return _hockeyPuckSolid!!
        }
        _hockeyPuckSolid = Builder(name = "HockeyPuckSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                curveTo(9.043f, 7.0f, 2.0f, 8.718f, 2.0f, 12.0f)
                lineTo(2.0f, 20.0f)
                curveTo(2.0f, 23.282f, 9.043f, 25.0f, 16.0f, 25.0f)
                curveTo(22.957f, 25.0f, 30.0f, 23.282f, 30.0f, 20.0f)
                lineTo(30.0f, 12.0f)
                curveTo(30.0f, 8.718f, 22.957f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(16.0f, 9.0f)
                curveTo(23.444f, 9.0f, 28.0f, 10.942f, 28.0f, 12.0f)
                curveTo(28.0f, 12.9257f, 24.5113f, 14.5279f, 18.6523f, 14.9141f)
                curveTo(17.8154f, 14.9692f, 16.9305f, 15.0f, 16.0f, 15.0f)
                curveTo(8.556f, 15.0f, 4.0f, 13.058f, 4.0f, 12.0f)
                curveTo(4.0f, 10.942f, 8.556f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(4.0f, 14.707f)
                curveTo(4.0593f, 14.7417f, 4.1338f, 14.7708f, 4.1953f, 14.8047f)
                curveTo(4.4194f, 14.9283f, 4.6562f, 15.0469f, 4.9082f, 15.1602f)
                curveTo(5.0074f, 15.2046f, 5.1058f, 15.2482f, 5.209f, 15.291f)
                curveTo(5.5546f, 15.435f, 5.9155f, 15.5732f, 6.3027f, 15.6992f)
                curveTo(7.1157f, 15.9637f, 8.0276f, 16.1789f, 8.9844f, 16.3633f)
                curveTo(9.2726f, 16.4179f, 9.5709f, 16.4625f, 9.8691f, 16.5098f)
                curveTo(10.7193f, 16.6473f, 11.5946f, 16.7566f, 12.502f, 16.834f)
                curveTo(13.6514f, 16.932f, 14.8207f, 17.0f, 16.0f, 17.0f)
                curveTo(17.1793f, 17.0f, 18.3486f, 16.932f, 19.498f, 16.834f)
                curveTo(20.4054f, 16.7566f, 21.2807f, 16.6473f, 22.1309f, 16.5098f)
                curveTo(22.4291f, 16.4625f, 22.7274f, 16.4179f, 23.0156f, 16.3633f)
                curveTo(23.9724f, 16.1789f, 24.8843f, 15.9637f, 25.6973f, 15.6992f)
                curveTo(26.0845f, 15.5732f, 26.4454f, 15.435f, 26.791f, 15.291f)
                curveTo(26.8942f, 15.2482f, 26.9926f, 15.2046f, 27.0918f, 15.1602f)
                curveTo(27.3438f, 15.0469f, 27.5806f, 14.9283f, 27.8047f, 14.8047f)
                curveTo(27.8662f, 14.7708f, 27.9407f, 14.7417f, 28.0f, 14.707f)
                lineTo(28.0f, 20.0f)
                curveTo(28.0f, 21.058f, 23.444f, 23.0f, 16.0f, 23.0f)
                curveTo(8.556f, 23.0f, 4.0f, 21.058f, 4.0f, 20.0f)
                lineTo(4.0f, 14.707f)
                close()
            }
        }
        .build()
        return _hockeyPuckSolid!!
    }

private var _hockeyPuckSolid: ImageVector? = null
