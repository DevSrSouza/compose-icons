package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) {
            return _shareNetwork!!
        }
        _shareNetwork = Builder(name = "ShareNetwork", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 200.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -80.0f, 0.0f)
                arcToRelative(41.0f, 41.0f, 0.0f, false, true, 2.7f, -14.5f)
                lineTo(92.6f, 155.9f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, -55.8f)
                lineToRelative(46.1f, -29.6f)
                arcTo(41.0f, 41.0f, 0.0f, false, true, 136.0f, 56.0f)
                arcToRelative(40.1f, 40.1f, 0.0f, true, true, 11.4f, 27.9f)
                lineToRelative(-46.1f, 29.6f)
                arcToRelative(40.3f, 40.3f, 0.0f, false, true, 0.0f, 29.0f)
                lineToRelative(46.1f, 29.6f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 216.0f, 200.0f)
                close()
            }
        }
        .build()
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
