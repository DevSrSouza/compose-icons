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

public val ThinGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.6f, 69.4f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.3f, -2.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.2f, 0.1f)
                lineToRelative(-1.0f, 0.8f)
                lineToRelative(-40.4f, 40.4f)
                lineToRelative(-23.6f, -4.7f)
                lineToRelative(-4.7f, -23.6f)
                lineToRelative(40.4f, -40.4f)
                lineToRelative(0.8f, -1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.1f, -3.2f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.1f, -2.3f)
                arcToRelative(67.7f, 67.7f, 0.0f, false, false, -74.7f, 14.5f)
                arcTo(68.4f, 68.4f, 0.0f, false, false, 99.0f, 126.0f)
                lineTo(36.4f, 180.0f)
                lineToRelative(-0.2f, 0.2f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 0.0f, 39.6f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 0.0f)
                lineToRelative(0.2f, -0.2f)
                lineToRelative(54.0f, -62.5f)
                arcToRelative(68.6f, 68.6f, 0.0f, false, false, 78.1f, -13.0f)
                arcTo(67.7f, 67.7f, 0.0f, false, false, 222.6f, 69.4f)
                close()
                moveTo(202.4f, 138.4f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, true, -71.3f, 10.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.1f, 0.8f)
                lineTo(70.0f, 214.2f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 41.8f, 186.0f)
                lineToRelative(64.8f, -56.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.9f, -5.0f)
                arcToRelative(60.2f, 60.2f, 0.0f, false, true, 10.1f, -71.4f)
                arcToRelative(59.5f, 59.5f, 0.0f, false, true, 60.1f, -14.9f)
                lineTo(140.2f, 76.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.1f, 3.6f)
                lineToRelative(5.7f, 28.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.1f, 3.1f)
                lineToRelative(28.3f, 5.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.6f, -1.1f)
                lineToRelative(37.5f, -37.5f)
                arcTo(59.5f, 59.5f, 0.0f, false, true, 202.4f, 138.4f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
