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

public val BoldGroup.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(100.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(16.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 68.0f)
                close()
                moveTo(175.0f, 196.2f)
                lineTo(178.6f, 221.2f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 158.8f, 244.0f)
                lineTo(97.2f, 244.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -19.8f, -22.8f)
                lineToRelative(3.6f, -25.0f)
                arcTo(99.9f, 99.9f, 0.0f, false, true, 28.0f, 108.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 96.0f)
                lineTo(52.0f, 96.0f)
                lineTo(52.0f, 40.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 72.0f, 20.0f)
                lineTo(184.0f, 20.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                lineTo(204.0f, 96.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(99.9f, 99.9f, 0.0f, false, true, 175.0f, 196.2f)
                close()
                moveTo(76.0f, 96.0f)
                lineTo(180.0f, 96.0f)
                lineTo(180.0f, 44.0f)
                lineTo(76.0f, 44.0f)
                close()
                moveTo(152.0f, 205.1f)
                arcToRelative(100.8f, 100.8f, 0.0f, false, true, -48.0f, 0.0f)
                lineTo(101.8f, 220.0f)
                horizontalLineToRelative(52.4f)
                close()
                moveTo(203.1f, 120.0f)
                lineTo(52.9f, 120.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, false, 150.2f, 0.0f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
