package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.LessThan: ImageVector
    get() {
        if (_lessThan != null) {
            return _lessThan!!
        }
        _lessThan = Builder(name = "LessThan", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(365.46f, 357.74f)
                lineTo(147.04f, 255.89f)
                lineToRelative(218.47f, -101.88f)
                curveToRelative(16.02f, -7.47f, 22.95f, -26.51f, 15.48f, -42.53f)
                lineToRelative(-13.52f, -29.0f)
                curveTo(360.0f, 66.46f, 340.96f, 59.53f, 324.94f, 67.0f)
                lineTo(18.48f, 209.91f)
                arcToRelative(32.014f, 32.014f, 0.0f, false, false, -18.48f, 29.0f)
                verticalLineToRelative(34.24f)
                curveToRelative(0.0f, 12.44f, 7.21f, 23.75f, 18.48f, 29.0f)
                lineToRelative(306.31f, 142.83f)
                curveToRelative(16.06f, 7.49f, 35.15f, 0.54f, 42.64f, -15.52f)
                lineToRelative(13.56f, -29.08f)
                curveToRelative(7.49f, -16.06f, 0.54f, -35.15f, -15.53f, -42.64f)
                close()
            }
        }
        .build()
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
