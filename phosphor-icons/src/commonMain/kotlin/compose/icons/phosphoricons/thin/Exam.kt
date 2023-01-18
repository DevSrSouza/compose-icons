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

public val ThinGroup.Exam: ImageVector
    get() {
        if (_exam != null) {
            return _exam!!
        }
        _exam = Builder(name = "Exam", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 216.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.9f, 3.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.9f, 0.2f)
                lineTo(64.0f, 204.5f)
                lineToRelative(30.2f, 15.1f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 3.6f, 0.0f)
                lineTo(128.0f, 204.5f)
                lineToRelative(30.2f, 15.1f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 3.6f, 0.0f)
                lineTo(192.0f, 204.5f)
                lineToRelative(30.2f, 15.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 228.0f, 216.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(220.0f, 209.5f)
                lineTo(193.8f, 196.4f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.6f, 0.0f)
                lineTo(160.0f, 211.5f)
                lineToRelative(-30.2f, -15.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -3.6f, 0.0f)
                lineTo(96.0f, 211.5f)
                lineTo(65.8f, 196.4f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.6f, 0.0f)
                lineTo(36.0f, 209.5f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(107.6f, 94.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.2f, 0.0f)
                lineToRelative(-32.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.2f, 3.6f)
                lineTo(82.5f, 148.0f)
                horizontalLineToRelative(43.0f)
                lineToRelative(6.9f, 13.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 136.0f, 164.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.8f, -0.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.8f, -5.4f)
                close()
                moveTo(86.5f, 140.0f)
                lineTo(104.0f, 104.9f)
                lineTo(121.5f, 140.0f)
                close()
                moveTo(196.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(176.0f, 132.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(168.0f, 132.0f)
                lineTo(152.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                lineTo(168.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 196.0f, 128.0f)
                close()
            }
        }
        .build()
        return _exam!!
    }

private var _exam: ImageVector? = null
