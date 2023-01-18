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

public val BoldGroup.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = Builder(name = "FastForward", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 111.2f)
                lineTo(154.8f, 53.8f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 124.0f, 70.7f)
                verticalLineToRelative(32.7f)
                lineTo(46.8f, 53.8f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 16.0f, 70.7f)
                lineTo(16.0f, 185.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 10.4f, 17.6f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, false, 9.6f, 2.4f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 10.8f, -3.1f)
                lineTo(124.0f, 152.6f)
                verticalLineToRelative(32.7f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 10.4f, 17.6f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, false, 9.6f, 2.4f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 10.8f, -3.1f)
                lineTo(244.0f, 144.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 0.0f, -33.6f)
                close()
                moveTo(40.0f, 178.0f)
                lineTo(40.0f, 78.0f)
                lineToRelative(77.8f, 50.0f)
                close()
                moveTo(148.0f, 178.0f)
                lineTo(148.0f, 78.0f)
                lineToRelative(77.8f, 50.0f)
                close()
            }
        }
        .build()
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
