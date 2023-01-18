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

public val FillGroup.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(name = "Magnet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.0f, 50.2f)
                arcTo(87.7f, 87.7f, 0.0f, false, false, 144.6f, 24.0f)
                horizontalLineToRelative(-0.3f)
                arcTo(87.3f, 87.3f, 0.0f, false, false, 82.0f, 49.8f)
                lineTo(48.3f, 83.9f)
                horizontalLineToRelative(0.0f)
                lineTo(15.9f, 116.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 0.1f, 22.6f)
                lineToRelative(28.6f, 28.6f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, 11.3f, 4.7f)
                lineTo(56.0f, 172.6f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 11.4f, -4.8f)
                lineToRelative(32.0f, -32.8f)
                horizontalLineToRelative(0.0f)
                lineTo(133.0f, 100.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 22.4f, -0.2f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, true, 4.7f, 11.2f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, true, -4.9f, 12.0f)
                lineToRelative(-34.1f, 33.0f)
                horizontalLineToRelative(0.0f)
                lineTo(88.3f, 188.6f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -0.2f, 22.8f)
                lineToRelative(28.6f, 28.7f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, 22.6f, 0.1f)
                lineToRelative(32.9f, -32.4f)
                horizontalLineToRelative(0.0f)
                lineToRelative(33.6f, -32.9f)
                curveTo(240.2f, 140.5f, 240.8f, 84.6f, 207.0f, 50.2f)
                close()
                moveTo(55.9f, 156.6f)
                lineTo(27.3f, 128.0f)
                lineTo(54.0f, 100.9f)
                lineToRelative(28.5f, 28.5f)
                close()
                moveTo(128.1f, 228.7f)
                lineTo(99.4f, 200.1f)
                lineToRelative(27.3f, -26.5f)
                lineToRelative(28.5f, 28.5f)
                close()
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
