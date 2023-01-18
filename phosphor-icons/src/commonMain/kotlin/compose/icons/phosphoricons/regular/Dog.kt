package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 140.0f)
                close()
                moveTo(164.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 128.0f)
                close()
                moveTo(232.7f, 144.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -6.7f, 1.4f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, -10.0f, -3.6f)
                lineTo(216.0f, 184.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                lineTo(80.0f, 224.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f)
                lineTo(40.0f, 141.8f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, -10.0f, 3.6f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -6.7f, -1.4f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -9.1f, -17.6f)
                lineTo(30.6f, 38.9f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 50.2f, 26.3f)
                lineTo(105.0f, 40.0f)
                horizontalLineToRelative(46.0f)
                lineToRelative(54.8f, -13.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 19.6f, 12.6f)
                lineToRelative(16.4f, 87.5f)
                arcTo(15.8f, 15.8f, 0.0f, false, true, 232.7f, 144.0f)
                close()
                moveTo(90.1f, 52.8f)
                lineToRelative(-43.8f, -11.0f)
                lineTo(29.9f, 129.4f)
                close()
                moveTo(200.0f, 184.0f)
                lineTo(200.0f, 122.0f)
                lineTo(148.1f, 56.0f)
                lineTo(107.9f, 56.0f)
                lineTo(56.0f, 122.0f)
                verticalLineToRelative(62.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(40.0f)
                lineTo(120.0f, 195.3f)
                lineToRelative(-13.7f, -13.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineTo(128.0f, 180.7f)
                lineToRelative(10.3f, -10.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                lineTo(136.0f, 195.3f)
                lineTo(136.0f, 208.0f)
                horizontalLineToRelative(40.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 200.0f, 184.0f)
                close()
                moveTo(226.1f, 129.4f)
                lineTo(209.7f, 41.8f)
                lineToRelative(-43.8f, 11.0f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
