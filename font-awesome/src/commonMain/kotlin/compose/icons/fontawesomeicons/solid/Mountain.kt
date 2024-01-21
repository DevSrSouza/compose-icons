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

public val SolidGroup.Mountain: ImageVector
    get() {
        if (_mountain != null) {
            return _mountain!!
        }
        _mountain = Builder(name = "Mountain", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveToRelative(12.5f, 0.0f, 24.1f, 6.4f, 30.8f, 17.0f)
                lineTo(503.4f, 394.4f)
                curveToRelative(5.6f, 8.9f, 8.6f, 19.2f, 8.6f, 29.7f)
                curveToRelative(0.0f, 30.9f, -25.0f, 55.9f, -55.9f, 55.9f)
                lineTo(55.9f, 480.0f)
                curveTo(25.0f, 480.0f, 0.0f, 455.0f, 0.0f, 424.1f)
                curveToRelative(0.0f, -10.5f, 3.0f, -20.8f, 8.6f, -29.7f)
                lineTo(225.2f, 49.0f)
                curveToRelative(6.6f, -10.6f, 18.3f, -17.0f, 30.8f, -17.0f)
                close()
                moveTo(321.0f, 224.0f)
                lineTo(256.0f, 120.4f)
                lineTo(176.9f, 246.5f)
                lineToRelative(18.3f, 24.4f)
                curveToRelative(6.4f, 8.5f, 19.2f, 8.5f, 25.6f, 0.0f)
                lineToRelative(25.6f, -34.1f)
                curveToRelative(6.0f, -8.1f, 15.5f, -12.8f, 25.6f, -12.8f)
                horizontalLineToRelative(49.0f)
                close()
            }
        }
        .build()
        return _mountain!!
    }

private var _mountain: ImageVector? = null
