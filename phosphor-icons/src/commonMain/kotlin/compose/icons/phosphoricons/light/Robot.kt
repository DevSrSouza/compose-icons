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

public val LightGroup.Robot: ImageVector
    get() {
        if (_robot != null) {
            return _robot!!
        }
        _robot = Builder(name = "Robot", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 50.0f)
                lineTo(134.0f, 50.0f)
                lineTo(134.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 50.0f)
                lineTo(56.0f, 50.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 26.0f, 80.0f)
                lineTo(26.0f, 192.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, false, 30.0f, 30.0f)
                lineTo(200.0f, 222.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, false, 30.0f, -30.0f)
                lineTo(230.0f, 80.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 200.0f, 50.0f)
                close()
                moveTo(218.0f, 192.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, -18.0f, 18.0f)
                lineTo(56.0f, 210.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, -18.0f, -18.0f)
                lineTo(38.0f, 80.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 56.0f, 62.0f)
                lineTo(200.0f, 62.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, 18.0f, 18.0f)
                close()
                moveTo(164.0f, 138.0f)
                lineTo(92.0f, 138.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, 52.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, -52.0f)
                close()
                moveTo(142.0f, 150.0f)
                verticalLineToRelative(28.0f)
                lineTo(114.0f, 178.0f)
                lineTo(114.0f, 150.0f)
                close()
                moveTo(78.0f, 164.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, -14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(28.0f)
                lineTo(92.0f, 178.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 78.0f, 164.0f)
                close()
                moveTo(164.0f, 178.0f)
                lineTo(154.0f, 178.0f)
                lineTo(154.0f, 150.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, 28.0f)
                close()
                moveTo(74.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 74.0f, 108.0f)
                close()
                moveTo(162.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 162.0f, 108.0f)
                close()
            }
        }
        .build()
        return _robot!!
    }

private var _robot: ImageVector? = null
