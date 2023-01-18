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

public val RegularGroup.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 44.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 164.0f, 44.0f)
                close()
                moveTo(128.0f, 64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 128.0f, 64.0f)
                close()
                moveTo(211.8f, 139.5f)
                lineTo(172.5f, 88.9f)
                lineToRelative(-0.7f, -0.7f)
                arcTo(27.8f, 27.8f, 0.0f, false, false, 152.0f, 80.0f)
                lineTo(104.0f, 80.0f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, false, -19.8f, 8.2f)
                lineToRelative(-0.7f, 0.7f)
                lineTo(44.2f, 139.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.3f, 28.3f)
                lineToRelative(14.1f, -11.0f)
                lineTo(66.8f, 219.5f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -0.5f, 14.7f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, false, 10.4f, 11.3f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 15.3f, 0.7f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, false, 11.0f, -9.8f)
                lineTo(128.0f, 197.0f)
                lineToRelative(25.0f, 39.4f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, false, 11.0f, 9.8f)
                arcToRelative(20.9f, 20.9f, 0.0f, false, false, 6.9f, 1.2f)
                arcToRelative(19.1f, 19.1f, 0.0f, false, false, 8.4f, -1.9f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, false, 10.4f, -11.3f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -0.5f, -14.7f)
                lineToRelative(-19.8f, -62.7f)
                lineToRelative(14.1f, 11.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.3f, -28.3f)
                close()
                moveTo(200.1f, 156.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -5.7f, 0.0f)
                lineToRelative(-0.7f, -0.7f)
                lineToRelative(-34.8f, -27.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.5f, 8.7f)
                lineToRelative(27.7f, 87.6f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, false, 0.4f, 1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.1f, 3.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.0f, 2.3f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -3.1f, 0.1f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -2.2f, -2.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -0.5f, -0.9f)
                lineToRelative(-32.0f, -50.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -13.6f, 0.0f)
                lineToRelative(-32.0f, 50.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -0.5f, 0.9f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -2.2f, 2.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -3.1f, -0.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.0f, -2.3f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.1f, -3.0f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, false, 0.4f, -1.0f)
                lineToRelative(27.7f, -87.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.1f, -9.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -9.4f, 0.3f)
                lineToRelative(-34.8f, 27.0f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.7f, -5.7f)
                lineToRelative(0.7f, -0.7f)
                lineTo(95.8f, 99.2f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 104.0f, 96.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 8.2f, 3.2f)
                lineToRelative(39.2f, 50.5f)
                lineToRelative(0.7f, 0.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 1.2f, 2.9f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 200.1f, 156.1f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
