package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 64.0f)
                close()
                moveTo(171.2f, 197.7f)
                lineTo(174.6f, 221.7f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 158.8f, 240.0f)
                lineTo(97.2f, 240.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -15.8f, -18.3f)
                lineToRelative(3.4f, -24.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 32.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(56.0f, 104.0f)
                lineTo(56.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 24.0f)
                lineTo(184.0f, 24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 171.2f, 197.7f)
                close()
                moveTo(72.0f, 104.0f)
                lineTo(184.0f, 104.0f)
                lineTo(184.0f, 40.0f)
                lineTo(72.0f, 40.0f)
                close()
                moveTo(155.9f, 203.9f)
                arcToRelative(97.0f, 97.0f, 0.0f, false, true, -55.8f, 0.0f)
                lineTo(97.2f, 224.0f)
                horizontalLineToRelative(61.6f)
                close()
                moveTo(207.6f, 120.0f)
                lineTo(48.4f, 120.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 159.2f, 0.0f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
