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

public val BoldGroup.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.5f, 140.9f)
                lineTo(188.0f, 155.1f)
                lineToRelative(-35.5f, -14.2f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -9.0f, 0.0f)
                lineTo(108.0f, 155.1f)
                lineTo(72.5f, 140.9f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -9.0f, 0.0f)
                lineToRelative(-40.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 9.0f, 22.2f)
                lineToRelative(3.5f, -1.4f)
                lineTo(36.0f, 184.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, 44.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, -44.0f)
                lineTo(220.0f, 168.1f)
                lineToRelative(12.5f, -5.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.0f, -22.2f)
                close()
                moveTo(196.0f, 184.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(80.0f, 204.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(60.0f, 168.1f)
                lineToRelative(8.0f, -3.2f)
                lineToRelative(35.5f, 14.2f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 9.0f, 0.0f)
                lineTo(148.0f, 164.9f)
                lineToRelative(35.5f, 14.2f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 9.0f, 0.0f)
                lineToRelative(3.5f, -1.4f)
                close()
                moveTo(232.0f, 100.0f)
                lineTo(219.2f, 100.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, -182.4f, 0.0f)
                lineTo(24.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(232.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, true, 66.9f, 56.0f)
                lineTo(61.1f, 100.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 128.0f, 44.0f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
