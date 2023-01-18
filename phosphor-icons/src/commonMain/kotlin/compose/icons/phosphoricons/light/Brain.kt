package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Brain: ImageVector
    get() {
        if (_brain != null) {
            return _brain!!
        }
        _brain = Builder(name = "Brain", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 132.0f)
                arcToRelative(54.1f, 54.1f, 0.0f, false, false, -32.0f, -49.3f)
                lineTo(214.0f, 72.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -86.0f, -22.7f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 42.0f, 72.0f)
                lineTo(42.0f, 82.7f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 0.0f, 98.6f)
                lineTo(42.0f, 184.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 86.0f, 22.7f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 214.0f, 184.0f)
                verticalLineToRelative(-2.7f)
                arcTo(54.1f, 54.1f, 0.0f, false, false, 246.0f, 132.0f)
                close()
                moveTo(88.0f, 218.0f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, true, -34.0f, -32.9f)
                arcToRelative(55.5f, 55.5f, 0.0f, false, false, 10.0f, 0.9f)
                horizontalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(64.0f, 174.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 50.0f, 92.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.0f, -5.7f)
                lineTo(54.0f, 72.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f)
                verticalLineToRelative(81.0f)
                arcToRelative(45.9f, 45.9f, 0.0f, false, false, -34.0f, -15.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, 68.0f)
                close()
                moveTo(192.0f, 174.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(55.5f, 55.5f, 0.0f, false, false, 10.0f, -0.9f)
                arcTo(34.0f, 34.0f, 0.0f, true, true, 168.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                arcToRelative(45.9f, 45.9f, 0.0f, false, false, -34.0f, 15.0f)
                lineTo(134.0f, 72.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f)
                lineTo(202.0f, 86.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.0f, 5.7f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 192.0f, 174.0f)
                close()
                moveTo(60.0f, 126.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 82.0f, 92.0f)
                lineTo(82.0f, 84.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 60.0f, 126.0f)
                close()
                moveTo(202.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, true, -34.0f, -34.0f)
                lineTo(162.0f, 84.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 22.0f, 22.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 202.0f, 120.0f)
                close()
            }
        }
        .build()
        return _brain!!
    }

private var _brain: ImageVector? = null
