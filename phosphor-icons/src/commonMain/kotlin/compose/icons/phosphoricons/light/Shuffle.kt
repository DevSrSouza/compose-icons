package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.2f, 179.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, 8.4f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineTo(217.5f, 190.0f)
                lineTo(200.9f, 190.0f)
                arcTo(70.2f, 70.2f, 0.0f, false, true, 144.0f, 160.7f)
                lineToRelative(-41.7f, -58.4f)
                arcTo(58.2f, 58.2f, 0.0f, false, false, 55.1f, 78.0f)
                lineTo(32.0f, 78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(55.1f, 66.0f)
                arcTo(70.2f, 70.2f, 0.0f, false, true, 112.0f, 95.3f)
                lineToRelative(41.7f, 58.4f)
                arcTo(58.2f, 58.2f, 0.0f, false, false, 200.9f, 178.0f)
                horizontalLineToRelative(16.6f)
                lineToRelative(-13.7f, -13.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                close()
                moveTo(144.2f, 105.4f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 3.5f, 1.1f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.8f, -2.5f)
                lineToRelative(1.2f, -1.7f)
                arcTo(58.2f, 58.2f, 0.0f, false, true, 200.9f, 78.0f)
                horizontalLineToRelative(16.6f)
                lineTo(203.8f, 91.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, -8.4f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 8.4f)
                lineTo(217.5f, 66.0f)
                lineTo(200.9f, 66.0f)
                arcTo(70.2f, 70.2f, 0.0f, false, false, 144.0f, 95.3f)
                lineTo(142.8f, 97.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 144.2f, 105.4f)
                close()
                moveTo(111.8f, 150.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.3f, 1.4f)
                lineToRelative(-1.2f, 1.7f)
                arcTo(58.2f, 58.2f, 0.0f, false, true, 55.1f, 178.0f)
                lineTo(32.0f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(55.1f, 190.0f)
                arcTo(70.2f, 70.2f, 0.0f, false, false, 112.0f, 160.7f)
                lineToRelative(1.2f, -1.7f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 111.8f, 150.6f)
                close()
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
