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
                curveTo(28.0f, 12.926f, 24.511f, 14.528f, 18.652f, 14.914f)
                curveTo(17.815f, 14.969f, 16.931f, 15.0f, 16.0f, 15.0f)
                curveTo(8.556f, 15.0f, 4.0f, 13.058f, 4.0f, 12.0f)
                curveTo(4.0f, 10.942f, 8.556f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(4.0f, 14.707f)
                curveTo(4.059f, 14.742f, 4.134f, 14.771f, 4.195f, 14.805f)
                curveTo(4.419f, 14.928f, 4.656f, 15.047f, 4.908f, 15.16f)
                curveTo(5.007f, 15.205f, 5.106f, 15.248f, 5.209f, 15.291f)
                curveTo(5.555f, 15.435f, 5.915f, 15.573f, 6.303f, 15.699f)
                curveTo(7.116f, 15.964f, 8.028f, 16.179f, 8.984f, 16.363f)
                curveTo(9.273f, 16.418f, 9.571f, 16.463f, 9.869f, 16.51f)
                curveTo(10.719f, 16.647f, 11.595f, 16.757f, 12.502f, 16.834f)
                curveTo(13.651f, 16.932f, 14.821f, 17.0f, 16.0f, 17.0f)
                curveTo(17.179f, 17.0f, 18.349f, 16.932f, 19.498f, 16.834f)
                curveTo(20.405f, 16.757f, 21.281f, 16.647f, 22.131f, 16.51f)
                curveTo(22.429f, 16.463f, 22.727f, 16.418f, 23.016f, 16.363f)
                curveTo(23.972f, 16.179f, 24.884f, 15.964f, 25.697f, 15.699f)
                curveTo(26.085f, 15.573f, 26.445f, 15.435f, 26.791f, 15.291f)
                curveTo(26.894f, 15.248f, 26.993f, 15.205f, 27.092f, 15.16f)
                curveTo(27.344f, 15.047f, 27.581f, 14.928f, 27.805f, 14.805f)
                curveTo(27.866f, 14.771f, 27.941f, 14.742f, 28.0f, 14.707f)
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
