package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Hive: ImageVector
    get() {
        if (_hive != null) {
            return _hive!!
        }
        _hive = Builder(name = "Hive", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(260.353f, 254.878f)
                lineTo(131.538f, 33.1f)
                arcToRelative(2.208f, 2.208f, 0.0f, false, false, -3.829f, 0.009f)
                lineTo(0.3f, 254.887f)
                arcTo(2.234f, 2.234f, 0.0f, false, false, 0.3f, 257.122f)
                lineTo(129.116f, 478.9f)
                arcToRelative(2.208f, 2.208f, 0.0f, false, false, 3.83f, -0.009f)
                lineTo(260.358f, 257.113f)
                arcTo(2.239f, 2.239f, 0.0f, false, false, 260.353f, 254.878f)
                close()
                moveTo(299.431f, 229.165f)
                arcToRelative(2.19f, 2.19f, 0.0f, false, false, 1.9f, 1.111f)
                horizontalLineToRelative(66.509f)
                arcToRelative(2.226f, 2.226f, 0.0f, false, false, 1.9f, -3.341f)
                lineTo(259.115f, 33.111f)
                arcToRelative(2.187f, 2.187f, 0.0f, false, false, -1.9f, -1.111f)
                lineTo(190.707f, 32.0f)
                arcToRelative(2.226f, 2.226f, 0.0f, false, false, -1.9f, 3.341f)
                close()
                moveTo(511.7f, 254.886f)
                lineTo(384.9f, 33.112f)
                arcTo(2.2f, 2.2f, 0.0f, false, false, 382.99f, 32.0f)
                horizontalLineToRelative(-66.6f)
                arcToRelative(2.226f, 2.226f, 0.0f, false, false, -1.906f, 3.34f)
                lineTo(440.652f, 256.0f)
                lineTo(314.481f, 476.66f)
                arcToRelative(2.226f, 2.226f, 0.0f, false, false, 1.906f, 3.34f)
                horizontalLineToRelative(66.6f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 1.906f, -1.112f)
                lineTo(511.7f, 257.114f)
                arcTo(2.243f, 2.243f, 0.0f, false, false, 511.7f, 254.886f)
                close()
                moveTo(366.016f, 284.917f)
                lineTo(299.508f, 284.917f)
                arcToRelative(2.187f, 2.187f, 0.0f, false, false, -1.9f, 1.111f)
                lineToRelative(-108.8f, 190.631f)
                arcToRelative(2.226f, 2.226f, 0.0f, false, false, 1.9f, 3.341f)
                horizontalLineToRelative(66.509f)
                arcToRelative(2.187f, 2.187f, 0.0f, false, false, 1.9f, -1.111f)
                lineToRelative(108.8f, -190.631f)
                arcTo(2.226f, 2.226f, 0.0f, false, false, 366.016f, 284.917f)
                close()
            }
        }
        .build()
        return _hive!!
    }

private var _hive: ImageVector? = null
