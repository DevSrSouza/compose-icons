package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Atari: ImageVector
    get() {
        if (_atari != null) {
            return _atari!!
        }
        _atari = Builder(name = "Atari", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 21.653f)
                reflectiveCurveToRelative(3.154f, -0.355f, 5.612f, -2.384f)
                curveToRelative(2.339f, -1.93f, 3.185f, -3.592f, 3.77f, -5.476f)
                curveToRelative(0.584f, -1.885f, 0.671f, -6.419f, 0.671f, -7.764f)
                lineTo(10.053f, 2.346f)
                lineTo(8.598f, 2.346f)
                verticalLineToRelative(1.365f)
                curveToRelative(-0.024f, 2.041f, -0.2f, 5.918f, -1.135f, 8.444f)
                curveTo(5.203f, 18.242f, 0.0f, 18.775f, 0.0f, 18.775f)
                close()
                moveTo(24.0f, 21.653f)
                reflectiveCurveToRelative(-3.154f, -0.355f, -5.61f, -2.384f)
                curveToRelative(-2.342f, -1.93f, -3.187f, -3.592f, -3.772f, -5.476f)
                curveToRelative(-0.583f, -1.885f, -0.671f, -6.419f, -0.671f, -7.764f)
                lineTo(13.947f, 2.346f)
                lineTo(15.4f, 2.346f)
                lineToRelative(0.001f, 1.365f)
                curveToRelative(0.024f, 2.041f, 0.202f, 5.918f, 1.138f, 8.444f)
                curveToRelative(2.258f, 6.087f, 7.46f, 6.62f, 7.46f, 6.62f)
                close()
                moveTo(10.659f, 2.348f)
                horizontalLineToRelative(2.685f)
                verticalLineToRelative(19.306f)
                lineTo(10.66f, 21.654f)
                close()
            }
        }
        .build()
        return _atari!!
    }

private var _atari: ImageVector? = null
