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

public val LineAwesomeIcons.DungeonSolid: ImageVector
    get() {
        if (_dungeonSolid != null) {
            return _dungeonSolid!!
        }
        _dungeonSolid = Builder(name = "DungeonSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(14.962f, 5.0f, 13.96f, 5.155f, 13.006f, 5.428f)
                lineTo(14.447f, 9.18f)
                curveTo(14.947f, 9.066f, 15.466f, 9.0f, 16.0f, 9.0f)
                curveTo(16.534f, 9.0f, 17.053f, 9.066f, 17.553f, 9.18f)
                lineTo(18.994f, 5.428f)
                curveTo(18.04f, 5.156f, 17.038f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.141f, 6.152f)
                curveTo(9.641f, 6.898f, 8.333f, 7.974f, 7.314f, 9.287f)
                lineTo(10.699f, 11.441f)
                curveTo(10.795f, 11.33f, 10.898f, 11.226f, 11.0f, 11.121f)
                lineTo(11.0f, 11.131f)
                curveTo(11.03f, 11.081f, 11.081f, 11.03f, 11.131f, 11.0f)
                lineTo(11.113f, 11.0f)
                curveTo(11.551f, 10.572f, 12.042f, 10.199f, 12.58f, 9.896f)
                lineTo(11.141f, 6.152f)
                close()
                moveTo(20.859f, 6.152f)
                lineTo(19.42f, 9.898f)
                curveTo(19.955f, 10.2f, 20.441f, 10.574f, 20.877f, 11.0f)
                lineTo(20.869f, 11.0f)
                curveTo(20.919f, 11.03f, 20.97f, 11.081f, 21.0f, 11.131f)
                lineTo(21.0f, 11.115f)
                curveTo(21.167f, 11.286f, 21.326f, 11.463f, 21.475f, 11.65f)
                lineTo(24.939f, 9.629f)
                curveTo(23.888f, 8.161f, 22.488f, 6.962f, 20.859f, 6.152f)
                close()
                moveTo(6.234f, 10.971f)
                curveTo(5.451f, 12.482f, 5.0f, 14.189f, 5.0f, 16.0f)
                lineTo(9.0f, 16.0f)
                curveTo(9.0f, 14.976f, 9.227f, 14.006f, 9.623f, 13.129f)
                lineTo(6.234f, 10.971f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(15.66f, 11.0f, 15.32f, 11.03f, 15.0f, 11.1f)
                lineTo(15.0f, 25.0f)
                lineTo(17.0f, 25.0f)
                lineTo(17.0f, 11.1f)
                curveTo(16.68f, 11.03f, 16.34f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(25.949f, 11.354f)
                lineTo(22.484f, 13.375f)
                curveTo(22.813f, 14.187f, 23.0f, 15.072f, 23.0f, 16.0f)
                lineTo(27.0f, 16.0f)
                curveTo(27.0f, 14.34f, 26.615f, 12.769f, 25.949f, 11.354f)
                close()
                moveTo(13.0f, 12.0f)
                curveTo(11.79f, 12.91f, 11.0f, 14.37f, 11.0f, 16.0f)
                lineTo(11.0f, 25.0f)
                lineTo(13.0f, 25.0f)
                lineTo(13.0f, 12.0f)
                close()
                moveTo(19.0f, 12.0f)
                lineTo(19.0f, 25.0f)
                lineTo(21.0f, 25.0f)
                lineTo(21.0f, 16.0f)
                curveTo(21.0f, 14.37f, 20.21f, 12.91f, 19.0f, 12.0f)
                close()
                moveTo(5.0f, 18.0f)
                lineTo(5.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                lineTo(9.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                close()
                moveTo(23.0f, 18.0f)
                lineTo(23.0f, 22.0f)
                lineTo(27.0f, 22.0f)
                lineTo(27.0f, 18.0f)
                lineTo(23.0f, 18.0f)
                close()
                moveTo(5.0f, 24.0f)
                lineTo(5.0f, 27.0f)
                lineTo(9.0f, 27.0f)
                lineTo(9.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                close()
                moveTo(23.0f, 24.0f)
                lineTo(23.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 24.0f)
                lineTo(23.0f, 24.0f)
                close()
            }
        }
        .build()
        return _dungeonSolid!!
    }

private var _dungeonSolid: ImageVector? = null
