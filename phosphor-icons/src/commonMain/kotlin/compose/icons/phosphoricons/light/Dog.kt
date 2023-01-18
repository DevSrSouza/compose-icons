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

public val LightGroup.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.0f, 140.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 102.0f, 140.0f)
                close()
                moveTo(164.0f, 150.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 164.0f, 150.0f)
                close()
                moveTo(231.9f, 142.1f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -5.9f, 1.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -10.9f, -5.4f)
                lineToRelative(-1.1f, -1.4f)
                lineTo(214.0f, 184.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, -38.0f, 38.0f)
                lineTo(80.0f, 222.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, -38.0f, -38.0f)
                lineTo(42.0f, 136.6f)
                lineTo(40.9f, 138.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 30.0f, 143.4f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -5.9f, -1.3f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -8.0f, -15.3f)
                lineTo(32.5f, 39.2f)
                arcTo(14.4f, 14.4f, 0.0f, false, true, 38.7f, 30.0f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, 11.0f, -1.8f)
                lineToRelative(55.0f, 13.8f)
                horizontalLineToRelative(46.6f)
                lineToRelative(55.0f, -13.8f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, 11.0f, 1.8f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, true, 6.2f, 9.2f)
                lineToRelative(16.4f, 87.6f)
                arcTo(13.7f, 13.7f, 0.0f, false, true, 231.9f, 142.1f)
                close()
                moveTo(93.6f, 51.6f)
                lineTo(46.8f, 39.9f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -1.1f, 0.3f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.9f, 1.4f)
                lineTo(27.9f, 129.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.6f, 1.6f)
                close()
                moveTo(202.0f, 121.3f)
                lineTo(149.1f, 54.0f)
                lineTo(106.9f, 54.0f)
                lineTo(54.0f, 121.3f)
                lineTo(54.0f, 184.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, false, 26.0f, 26.0f)
                horizontalLineToRelative(42.0f)
                lineTo(122.0f, 194.5f)
                lineToRelative(-14.2f, -14.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineTo(128.0f, 183.5f)
                lineToRelative(11.8f, -11.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                lineTo(134.0f, 194.5f)
                lineTo(134.0f, 210.0f)
                horizontalLineToRelative(42.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, false, 26.0f, -26.0f)
                close()
                moveTo(228.1f, 129.0f)
                lineTo(211.7f, 41.5f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.9f, -1.4f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -1.6f, -0.2f)
                lineTo(162.4f, 51.6f)
                lineToRelative(62.1f, 79.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.6f, -1.6f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
