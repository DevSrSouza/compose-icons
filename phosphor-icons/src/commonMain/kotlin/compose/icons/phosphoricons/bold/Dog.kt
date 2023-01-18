package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 108.0f, 136.0f)
                close()
                moveTo(164.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 164.0f, 120.0f)
                close()
                moveTo(234.4f, 147.6f)
                arcToRelative(21.2f, 21.2f, 0.0f, false, true, -8.4f, 1.8f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, -6.0f, -0.9f)
                lineTo(220.0f, 184.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -44.0f, 44.0f)
                lineTo(80.0f, 228.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -44.0f, -44.0f)
                lineTo(36.0f, 148.5f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, -6.0f, 0.9f)
                arcToRelative(21.2f, 21.2f, 0.0f, false, true, -8.4f, -1.8f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, -11.4f, -21.9f)
                lineTo(26.6f, 38.1f)
                arcTo(20.2f, 20.2f, 0.0f, false, true, 35.5f, 25.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 15.6f, -2.6f)
                lineTo(105.5f, 36.0f)
                horizontalLineToRelative(45.0f)
                lineToRelative(54.4f, -13.6f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 220.5f, 25.0f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, true, 8.9f, 13.1f)
                lineToRelative(16.4f, 87.6f)
                arcTo(19.8f, 19.8f, 0.0f, false, true, 234.4f, 147.6f)
                close()
                moveTo(172.9f, 55.1f)
                lineToRelative(46.3f, 59.0f)
                lineTo(206.6f, 46.7f)
                close()
                moveTo(36.8f, 114.1f)
                lineTo(83.1f, 55.1f)
                lineTo(49.4f, 46.7f)
                close()
                moveTo(196.0f, 184.0f)
                lineTo(196.0f, 123.4f)
                lineTo(146.2f, 60.0f)
                lineTo(109.8f, 60.0f)
                lineTo(60.0f, 123.4f)
                lineTo(60.0f, 184.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(-7.0f)
                lineToRelative(-12.5f, -12.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(128.0f, 175.0f)
                lineToRelative(7.5f, -7.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(140.0f, 197.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 196.0f, 184.0f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
