package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Fan: ImageVector
    get() {
        if (_fan != null) {
            return _fan!!
        }
        _fan = Builder(name = "Fan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.57f, 128.0f)
                curveToRelative(-28.09f, 0.0f, -54.09f, 4.52f, -77.06f, 12.86f)
                lineToRelative(12.41f, -123.11f)
                curveTo(289.0f, 7.31f, 279.81f, -1.18f, 269.33f, 0.13f)
                curveTo(189.63f, 10.13f, 128.0f, 77.64f, 128.0f, 159.43f)
                curveToRelative(0.0f, 28.09f, 4.52f, 54.09f, 12.86f, 77.06f)
                lineTo(17.75f, 224.08f)
                curveTo(7.31f, 223.0f, -1.18f, 232.19f, 0.13f, 242.67f)
                curveToRelative(10.0f, 79.7f, 77.51f, 141.33f, 159.3f, 141.33f)
                curveToRelative(28.09f, 0.0f, 54.09f, -4.52f, 77.06f, -12.86f)
                lineToRelative(-12.41f, 123.11f)
                curveToRelative(-1.05f, 10.43f, 8.11f, 18.93f, 18.59f, 17.62f)
                curveToRelative(79.7f, -10.0f, 141.33f, -77.51f, 141.33f, -159.3f)
                curveToRelative(0.0f, -28.09f, -4.52f, -54.09f, -12.86f, -77.06f)
                lineToRelative(123.11f, 12.41f)
                curveToRelative(10.44f, 1.05f, 18.93f, -8.11f, 17.62f, -18.59f)
                curveToRelative(-10.0f, -79.7f, -77.51f, -141.33f, -159.3f, -141.33f)
                close()
                moveTo(256.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _fan!!
    }

private var _fan: ImageVector? = null
