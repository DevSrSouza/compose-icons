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

public val ThinGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(28.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(192.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 196.0f, 216.0f)
                close()
                moveTo(227.3f, 106.2f)
                lineTo(227.5f, 105.9f)
                lineTo(227.7f, 105.5f)
                curveToRelative(0.0f, -0.1f, 0.1f, -0.2f, 0.1f, -0.4f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.1f, -0.3f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 0.0f, -1.6f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.1f, -0.3f)
                curveToRelative(0.0f, -0.2f, -0.1f, -0.3f, -0.1f, -0.4f)
                lineToRelative(-0.2f, -0.4f)
                lineToRelative(-0.2f, -0.3f)
                lineToRelative(-0.5f, -0.6f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                lineTo(214.3f, 100.0f)
                lineTo(168.0f, 100.0f)
                arcToRelative(99.7f, 99.7f, 0.0f, false, false, -96.8f, 75.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.8f, 4.9f)
                horizontalLineToRelative(1.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.9f, -3.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 168.0f, 108.0f)
                horizontalLineToRelative(46.3f)
                lineToRelative(-41.1f, 41.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineToRelative(48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
