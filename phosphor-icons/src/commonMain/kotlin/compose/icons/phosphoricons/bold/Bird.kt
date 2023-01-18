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

public val BoldGroup.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 72.0f)
                close()
                moveTo(244.0f, 80.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -5.3f, 10.0f)
                lineTo(220.0f, 102.4f)
                lineTo(220.0f, 120.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, true, 112.0f, 228.0f)
                lineTo(12.0f, 228.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -10.8f, -6.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 1.3f, -12.6f)
                lineTo(92.0f, 91.9f)
                lineTo(92.0f, 76.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 216.6f, 55.3f)
                lineTo(238.7f, 70.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 244.0f, 80.0f)
                close()
                moveTo(210.4f, 80.0f)
                lineTo(199.7f, 72.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -5.0f, -7.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 116.0f, 76.0f)
                lineTo(116.0f, 96.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -2.5f, 7.3f)
                lineTo(36.3f, 204.0f)
                lineTo(112.0f, 204.0f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, false, 84.0f, -84.0f)
                lineTo(196.0f, 96.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 5.3f, -10.0f)
                close()
                moveTo(128.6f, 126.5f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -16.8f, 2.2f)
                lineToRelative(-30.7f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.3f, 16.8f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 7.3f, 2.5f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 9.5f, -4.7f)
                lineToRelative(30.7f, -40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.6f, 126.5f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
