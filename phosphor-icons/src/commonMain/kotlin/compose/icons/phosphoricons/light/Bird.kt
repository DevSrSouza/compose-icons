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

public val LightGroup.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 68.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 68.0f)
                close()
                moveTo(123.8f, 131.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 0.8f)
                lineToRelative(-40.0f, 48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 80.0f, 190.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 4.6f, -2.2f)
                lineToRelative(40.0f, -48.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 123.8f, 131.4f)
                close()
                moveTo(238.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.7f, 5.0f)
                lineTo(214.0f, 99.2f)
                lineTo(214.0f, 120.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, true, 112.0f, 222.0f)
                lineTo(8.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.7f, -9.7f)
                lineTo(98.0f, 93.9f)
                lineTo(98.0f, 76.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 211.5f, 59.1f)
                lineTo(235.3f, 75.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 238.0f, 80.0f)
                close()
                moveTo(221.2f, 80.0f)
                lineTo(203.0f, 67.9f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, true, -2.5f, -3.5f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 110.0f, 76.0f)
                lineTo(110.0f, 96.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -1.3f, 3.7f)
                lineTo(20.5f, 210.0f)
                lineTo(112.0f, 210.0f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, false, 90.0f, -90.0f)
                lineTo(202.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.7f, -5.0f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
