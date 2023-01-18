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

public val BoldGroup.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.8f, 136.9f)
                lineTo(175.6f, 86.5f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, -1.0f, -1.1f)
                arcTo(31.5f, 31.5f, 0.0f, false, false, 152.0f, 76.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -48.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(31.5f, 31.5f, 0.0f, false, false, -22.6f, 9.4f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, -1.0f, 1.1f)
                lineTo(41.2f, 136.9f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 33.9f, 33.9f)
                lineToRelative(3.8f, -2.9f)
                lineTo(63.0f, 218.1f)
                arcToRelative(23.5f, 23.5f, 0.0f, false, false, -0.4f, 17.5f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 43.9f, 2.7f)
                lineTo(128.0f, 204.5f)
                lineToRelative(21.5f, 33.8f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, 13.2f, 11.6f)
                arcToRelative(23.3f, 23.3f, 0.0f, false, false, 8.2f, 1.5f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 193.0f, 218.1f)
                lineToRelative(-15.9f, -50.2f)
                lineToRelative(3.8f, 2.9f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 33.9f, -33.9f)
                close()
                moveTo(128.0f, 28.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 28.0f)
                close()
                moveTo(196.1f, 152.3f)
                lineTo(161.4f, 125.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.8f, 13.1f)
                lineToRelative(27.7f, 87.6f)
                lineToRelative(0.6f, 1.5f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.8f, -1.4f)
                lineToRelative(-32.0f, -50.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.2f, 0.0f)
                lineTo(85.9f, 226.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.8f, 1.4f)
                lineToRelative(0.6f, -1.5f)
                lineToRelative(27.7f, -87.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -4.6f, -13.4f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, false, -6.8f, -2.2f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, false, -7.4f, 2.5f)
                lineTo(59.9f, 152.3f)
                lineToRelative(-1.2f, 1.0f)
                lineToRelative(1.0f, -1.2f)
                lineToRelative(39.1f, -50.2f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 104.0f, 100.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 5.2f, 1.9f)
                lineToRelative(39.1f, 50.2f)
                lineToRelative(1.0f, 1.2f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
