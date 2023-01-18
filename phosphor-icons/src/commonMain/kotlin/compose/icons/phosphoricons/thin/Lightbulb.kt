package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(88.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 232.0f)
                close()
                moveTo(212.0f, 104.0f)
                arcToRelative(83.8f, 83.8f, 0.0f, false, true, -32.1f, 66.1f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 172.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -7.8f, -15.8f)
                arcTo(83.7f, 83.7f, 0.0f, false, true, 44.0f, 104.5f)
                curveTo(43.8f, 59.0f, 80.5f, 21.1f, 126.0f, 20.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 86.0f, 84.0f)
                close()
                moveTo(204.0f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -77.8f, -76.0f)
                curveTo(85.0f, 29.0f, 51.8f, 63.3f, 52.0f, 104.4f)
                arcToRelative(75.8f, 75.8f, 0.0f, false, false, 29.2f, 59.5f)
                arcTo(27.8f, 27.8f, 0.0f, false, true, 92.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 10.9f, -22.2f)
                arcTo(75.5f, 75.5f, 0.0f, false, false, 204.0f, 104.0f)
                close()
                moveTo(136.8f, 52.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.6f, 3.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.3f, 4.6f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, true, 35.9f, 35.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.9f, 3.3f)
                horizontalLineToRelative(0.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.3f, -4.6f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 136.8f, 52.8f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
