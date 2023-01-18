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

public val BoldGroup.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 108.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.0f, -19.6f)
                lineTo(244.0f, 64.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(32.0f, 44.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 12.0f, 64.0f)
                lineTo(12.0f, 88.8f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.0f, 19.6f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 39.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.0f, 19.6f)
                lineTo(12.0f, 192.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(224.0f, 212.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 167.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.0f, -19.6f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -39.2f)
                close()
                moveTo(36.0f, 170.3f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -84.6f)
                lineTo(36.0f, 68.0f)
                lineTo(84.0f, 68.0f)
                lineTo(84.0f, 188.0f)
                lineTo(36.0f, 188.0f)
                close()
                moveTo(220.0f, 170.3f)
                lineTo(220.0f, 188.0f)
                lineTo(108.0f, 188.0f)
                lineTo(108.0f, 68.0f)
                lineTo(220.0f, 68.0f)
                lineTo(220.0f, 85.7f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, 84.6f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
