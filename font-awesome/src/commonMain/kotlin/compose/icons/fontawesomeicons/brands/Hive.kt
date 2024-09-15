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
                moveTo(260.35f, 254.88f)
                lineTo(131.54f, 33.1f)
                arcToRelative(2.21f, 2.21f, 0.0f, false, false, -3.83f, 0.01f)
                lineTo(0.3f, 254.89f)
                arcTo(2.23f, 2.23f, 0.0f, false, false, 0.3f, 257.12f)
                lineTo(129.12f, 478.9f)
                arcToRelative(2.21f, 2.21f, 0.0f, false, false, 3.83f, -0.01f)
                lineTo(260.36f, 257.11f)
                arcTo(2.24f, 2.24f, 0.0f, false, false, 260.35f, 254.88f)
                close()
                moveTo(299.43f, 229.17f)
                arcToRelative(2.19f, 2.19f, 0.0f, false, false, 1.9f, 1.11f)
                horizontalLineToRelative(66.51f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, 1.9f, -3.34f)
                lineTo(259.11f, 33.11f)
                arcToRelative(2.19f, 2.19f, 0.0f, false, false, -1.9f, -1.11f)
                lineTo(190.71f, 32.0f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, -1.9f, 3.34f)
                close()
                moveTo(511.7f, 254.89f)
                lineTo(384.9f, 33.11f)
                arcTo(2.2f, 2.2f, 0.0f, false, false, 382.99f, 32.0f)
                horizontalLineToRelative(-66.6f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, -1.91f, 3.34f)
                lineTo(440.65f, 256.0f)
                lineTo(314.48f, 476.66f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, 1.91f, 3.34f)
                horizontalLineToRelative(66.6f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, 1.91f, -1.11f)
                lineTo(511.7f, 257.11f)
                arcTo(2.24f, 2.24f, 0.0f, false, false, 511.7f, 254.89f)
                close()
                moveTo(366.02f, 284.92f)
                lineTo(299.51f, 284.92f)
                arcToRelative(2.19f, 2.19f, 0.0f, false, false, -1.9f, 1.11f)
                lineToRelative(-108.8f, 190.63f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, 1.9f, 3.34f)
                horizontalLineToRelative(66.51f)
                arcToRelative(2.19f, 2.19f, 0.0f, false, false, 1.9f, -1.11f)
                lineToRelative(108.8f, -190.63f)
                arcTo(2.23f, 2.23f, 0.0f, false, false, 366.02f, 284.92f)
                close()
            }
        }
        .build()
        return _hive!!
    }

private var _hive: ImageVector? = null
