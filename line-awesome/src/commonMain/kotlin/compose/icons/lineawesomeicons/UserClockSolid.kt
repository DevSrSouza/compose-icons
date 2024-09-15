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

public val LineAwesomeIcons.UserClockSolid: ImageVector
    get() {
        if (_userClockSolid != null) {
            return _userClockSolid!!
        }
        _userClockSolid = Builder(name = "UserClockSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.1f)
                curveTo(12.1f, 5.1f, 9.0f, 8.2f, 9.0f, 12.1f)
                curveTo(9.0f, 14.5f, 10.2f, 16.7f, 12.1f, 17.9f)
                curveTo(8.5f, 19.3f, 6.0f, 22.9f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 22.6f, 11.6f, 19.0f, 16.0f, 19.0f)
                curveTo(16.6f, 19.0f, 17.1f, 19.099f, 17.6f, 19.199f)
                curveTo(17.646f, 19.137f, 17.707f, 19.083f, 17.756f, 19.021f)
                curveTo(16.661f, 20.391f, 16.0f, 22.121f, 16.0f, 24.0f)
                curveTo(16.0f, 28.4f, 19.6f, 32.0f, 24.0f, 32.0f)
                curveTo(28.4f, 32.0f, 32.0f, 28.4f, 32.0f, 24.0f)
                curveTo(32.0f, 19.6f, 28.4f, 16.0f, 24.0f, 16.0f)
                curveTo(23.112f, 16.0f, 22.259f, 16.153f, 21.459f, 16.424f)
                curveTo(22.422f, 15.232f, 23.0f, 13.667f, 23.0f, 12.1f)
                curveTo(23.0f, 8.2f, 19.9f, 5.1f, 16.0f, 5.1f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.8f, 7.0f, 21.0f, 9.2f, 21.0f, 12.0f)
                curveTo(21.0f, 14.8f, 18.8f, 17.0f, 16.0f, 17.0f)
                curveTo(13.2f, 17.0f, 11.0f, 14.8f, 11.0f, 12.0f)
                curveTo(11.0f, 9.2f, 13.2f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(19.275f, 17.566f)
                curveTo(19.247f, 17.587f, 19.218f, 17.608f, 19.189f, 17.629f)
                curveTo(19.218f, 17.608f, 19.246f, 17.587f, 19.275f, 17.566f)
                close()
                moveTo(24.0f, 18.0f)
                curveTo(27.3f, 18.0f, 30.0f, 20.7f, 30.0f, 24.0f)
                curveTo(30.0f, 27.3f, 27.3f, 30.0f, 24.0f, 30.0f)
                curveTo(20.7f, 30.0f, 18.0f, 27.3f, 18.0f, 24.0f)
                curveTo(18.0f, 20.7f, 20.7f, 18.0f, 24.0f, 18.0f)
                close()
                moveTo(18.498f, 18.215f)
                curveTo(18.375f, 18.332f, 18.256f, 18.453f, 18.141f, 18.578f)
                curveTo(18.256f, 18.454f, 18.373f, 18.332f, 18.498f, 18.215f)
                close()
                moveTo(23.0f, 20.0f)
                lineTo(23.0f, 24.6f)
                lineTo(21.301f, 26.301f)
                lineTo(22.699f, 27.699f)
                lineTo(25.0f, 25.4f)
                lineTo(25.0f, 20.0f)
                lineTo(23.0f, 20.0f)
                close()
            }
        }
        .build()
        return _userClockSolid!!
    }

private var _userClockSolid: ImageVector? = null
