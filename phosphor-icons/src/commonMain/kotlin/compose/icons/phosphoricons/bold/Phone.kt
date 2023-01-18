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

public val BoldGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 228.0f)
                curveTo(94.4f, 228.0f, 28.0f, 161.6f, 28.0f, 80.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 80.4f, 20.5f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 20.8f, 12.0f)
                lineToRelative(20.1f, 46.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -1.6f, 18.9f)
                lineToRelative(-15.4f, 23.4f)
                arcToRelative(72.3f, 72.3f, 0.0f, false, false, 30.3f, 30.2f)
                lineToRelative(23.1f, -15.4f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 19.0f, -1.7f)
                lineToRelative(46.8f, 20.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 12.0f, 20.8f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 176.0f, 228.0f)
                close()
                moveTo(80.4f, 44.8f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 52.0f, 80.0f)
                arcTo(124.1f, 124.1f, 0.0f, false, false, 176.0f, 204.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 35.2f, -28.4f)
                lineToRelative(-42.0f, -18.0f)
                lineTo(146.0f, 173.1f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -19.7f, 1.4f)
                arcToRelative(96.5f, 96.5f, 0.0f, false, true, -44.6f, -44.4f)
                arcTo(19.8f, 19.8f, 0.0f, false, true, 83.0f, 110.4f)
                lineTo(98.4f, 86.8f)
                close()
                moveTo(136.7f, 152.9f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
