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

public val LightGroup.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(159.4f, 112.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 1.5f, -8.3f)
                lineToRelative(67.7f, -46.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 8.4f, 1.5f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -1.6f, 8.4f)
                lineToRelative(-67.7f, 46.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -3.4f, 1.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 159.4f, 112.0f)
                close()
                moveTo(237.0f, 197.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -5.0f, 2.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.4f, -1.1f)
                lineTo(136.0f, 135.3f)
                lineTo(91.0f, 166.1f)
                arcTo(33.6f, 33.6f, 0.0f, false, true, 94.0f, 180.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, -34.0f, -34.0f)
                arcToRelative(33.8f, 33.8f, 0.0f, false, true, 24.2f, 10.2f)
                lineTo(125.4f, 128.0f)
                lineTo(84.2f, 99.8f)
                arcTo(33.8f, 33.8f, 0.0f, false, true, 60.0f, 110.0f)
                arcTo(34.0f, 34.0f, 0.0f, true, true, 94.0f, 76.0f)
                arcToRelative(33.6f, 33.6f, 0.0f, false, true, -3.0f, 13.9f)
                lineToRelative(144.4f, 98.8f)
                arcTo(6.2f, 6.2f, 0.0f, false, true, 237.0f, 197.1f)
                close()
                moveTo(82.0f, 76.0f)
                arcTo(22.0f, 22.0f, 0.0f, true, false, 60.0f, 98.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 82.0f, 76.0f)
                close()
                moveTo(82.0f, 180.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, -22.0f, 22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 82.0f, 180.0f)
                close()
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
