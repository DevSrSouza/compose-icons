package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ModeNight: ImageVector
    get() {
        if (_modeNight != null) {
            return _modeNight!!
        }
        _modeNight = Builder(name = "ModeNight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.93f, 2.3f)
                curveTo(9.89f, 1.8f, 7.91f, 1.95f, 6.16f, 2.58f)
                curveTo(5.44f, 2.84f, 5.25f, 3.8f, 5.85f, 4.29f)
                curveTo(8.08f, 6.12f, 9.5f, 8.89f, 9.5f, 12.0f)
                curveToRelative(0.0f, 3.11f, -1.42f, 5.88f, -3.65f, 7.71f)
                curveToRelative(-0.59f, 0.49f, -0.42f, 1.45f, 0.31f, 1.7f)
                curveTo(7.2f, 21.79f, 8.33f, 22.0f, 9.5f, 22.0f)
                curveToRelative(6.05f, 0.0f, 10.85f, -5.38f, 9.87f, -11.6f)
                curveTo(18.76f, 6.48f, 15.78f, 3.24f, 11.93f, 2.3f)
                close()
            }
        }
        .build()
        return _modeNight!!
    }

private var _modeNight: ImageVector? = null
