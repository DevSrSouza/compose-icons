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

public val SolidGroup.Directions: ImageVector
    get() {
        if (_directions != null) {
            return _directions!!
        }
        _directions = Builder(name = "Directions", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.61f, 233.32f)
                lineTo(278.68f, 9.39f)
                curveToRelative(-12.52f, -12.52f, -32.83f, -12.52f, -45.36f, 0.0f)
                lineTo(9.39f, 233.32f)
                curveToRelative(-12.52f, 12.53f, -12.52f, 32.83f, 0.0f, 45.36f)
                lineToRelative(223.93f, 223.93f)
                curveToRelative(12.52f, 12.53f, 32.83f, 12.53f, 45.36f, 0.0f)
                lineToRelative(223.93f, -223.93f)
                curveToRelative(12.52f, -12.53f, 12.52f, -32.83f, 0.0f, -45.36f)
                close()
                moveTo(401.63f, 245.88f)
                lineToRelative(-84.21f, 77.73f)
                curveToRelative(-5.12f, 4.73f, -13.43f, 1.1f, -13.43f, -5.88f)
                lineTo(303.99f, 264.0f)
                horizontalLineToRelative(-96.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                verticalLineToRelative(-80.0f)
                curveToRelative(0.0f, -17.67f, 14.33f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(112.0f)
                verticalLineToRelative(-53.73f)
                curveToRelative(0.0f, -6.97f, 8.3f, -10.61f, 13.43f, -5.88f)
                lineToRelative(84.21f, 77.73f)
                curveToRelative(3.43f, 3.17f, 3.43f, 8.59f, 0.0f, 11.76f)
                close()
            }
        }
        .build()
        return _directions!!
    }

private var _directions: ImageVector? = null
