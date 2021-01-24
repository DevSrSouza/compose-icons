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

public val SolidGroup.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.1f, 6.3f)
                lineToRelative(-208.0f, 78.0f)
                curveToRelative(-18.7f, 7.0f, -31.1f, 25.0f, -31.1f, 45.0f)
                verticalLineToRelative(225.1f)
                curveToRelative(0.0f, 18.2f, 10.3f, 34.8f, 26.5f, 42.9f)
                lineToRelative(208.0f, 104.0f)
                curveToRelative(13.5f, 6.8f, 29.4f, 6.8f, 42.9f, 0.0f)
                lineToRelative(208.0f, -104.0f)
                curveToRelative(16.3f, -8.1f, 26.5f, -24.8f, 26.5f, -42.9f)
                lineTo(511.9f, 129.3f)
                curveToRelative(0.0f, -20.0f, -12.4f, -37.9f, -31.1f, -44.9f)
                lineToRelative(-208.0f, -78.0f)
                curveTo(262.0f, 2.2f, 250.0f, 2.2f, 239.1f, 6.3f)
                close()
                moveTo(256.0f, 68.4f)
                lineToRelative(192.0f, 72.0f)
                verticalLineToRelative(1.1f)
                lineToRelative(-192.0f, 78.0f)
                lineToRelative(-192.0f, -78.0f)
                verticalLineToRelative(-1.1f)
                lineToRelative(192.0f, -72.0f)
                close()
                moveTo(288.0f, 424.4f)
                lineTo(288.0f, 275.5f)
                lineToRelative(160.0f, -65.0f)
                verticalLineToRelative(133.9f)
                lineToRelative(-160.0f, 80.0f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
