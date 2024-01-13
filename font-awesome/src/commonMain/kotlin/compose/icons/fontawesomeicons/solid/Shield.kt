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

public val SolidGroup.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveToRelative(4.6f, 0.0f, 9.2f, 1.0f, 13.4f, 2.9f)
                lineTo(457.7f, 82.8f)
                curveToRelative(22.0f, 9.3f, 38.4f, 31.0f, 38.3f, 57.2f)
                curveToRelative(-0.5f, 99.2f, -41.3f, 280.7f, -213.6f, 363.2f)
                curveToRelative(-16.7f, 8.0f, -36.1f, 8.0f, -52.8f, 0.0f)
                curveTo(57.3f, 420.7f, 16.5f, 239.2f, 16.0f, 140.0f)
                curveToRelative(-0.1f, -26.2f, 16.3f, -47.9f, 38.3f, -57.2f)
                lineTo(242.7f, 2.9f)
                curveTo(246.8f, 1.0f, 251.4f, 0.0f, 256.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
