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

public val SolidGroup.Percentage: ImageVector
    get() {
        if (_percentage != null) {
            return _percentage!!
        }
        _percentage = Builder(name = "Percentage", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(109.25f, 173.25f)
                curveToRelative(24.99f, -24.99f, 24.99f, -65.52f, 0.0f, -90.51f)
                curveToRelative(-24.99f, -24.99f, -65.52f, -24.99f, -90.51f, 0.0f)
                curveToRelative(-24.99f, 24.99f, -24.99f, 65.52f, 0.0f, 90.51f)
                curveToRelative(25.0f, 25.0f, 65.52f, 25.0f, 90.51f, 0.0f)
                close()
                moveTo(365.25f, 338.74f)
                curveToRelative(-24.99f, -24.99f, -65.52f, -24.99f, -90.51f, 0.0f)
                curveToRelative(-24.99f, 24.99f, -24.99f, 65.52f, 0.0f, 90.51f)
                curveToRelative(24.99f, 24.99f, 65.52f, 24.99f, 90.51f, 0.0f)
                curveToRelative(25.0f, -24.99f, 25.0f, -65.51f, 0.0f, -90.51f)
                close()
                moveTo(363.31f, 107.31f)
                lineToRelative(-22.62f, -22.62f)
                curveToRelative(-12.5f, -12.5f, -32.76f, -12.5f, -45.25f, 0.0f)
                lineTo(20.69f, 359.44f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.76f, 0.0f, 45.25f)
                lineToRelative(22.62f, 22.62f)
                curveToRelative(12.5f, 12.5f, 32.76f, 12.5f, 45.25f, 0.0f)
                lineToRelative(274.75f, -274.75f)
                curveToRelative(12.5f, -12.49f, 12.5f, -32.75f, 0.0f, -45.25f)
                close()
            }
        }
        .build()
        return _percentage!!
    }

private var _percentage: ImageVector? = null
