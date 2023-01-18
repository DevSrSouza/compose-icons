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

public val BoldGroup.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) {
            return _shareNetwork!!
        }
        _shareNetwork = Builder(name = "ShareNetwork", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 156.0f)
                arcToRelative(44.3f, 44.3f, 0.0f, false, false, -29.1f, 11.0f)
                lineToRelative(-40.8f, -26.2f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, false, 0.0f, -25.6f)
                lineTo(146.9f, 89.0f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 132.0f, 56.0f)
                arcToRelative(45.6f, 45.6f, 0.0f, false, false, 1.9f, 12.8f)
                lineTo(93.1f, 95.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 0.0f, 66.0f)
                lineToRelative(40.8f, 26.2f)
                arcTo(45.6f, 45.6f, 0.0f, false, false, 132.0f, 200.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, -44.0f)
                close()
                moveTo(176.0f, 36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 176.0f, 36.0f)
                close()
                moveTo(64.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 64.0f, 148.0f)
                close()
                moveTo(176.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 176.0f, 220.0f)
                close()
            }
        }
        .build()
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
