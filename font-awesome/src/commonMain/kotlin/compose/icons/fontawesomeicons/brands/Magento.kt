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

public val BrandsGroup.Magento: ImageVector
    get() {
        if (_magento != null) {
            return _magento!!
        }
        _magento = Builder(name = "Magento", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(445.7f, 127.9f)
                verticalLineTo(384.0f)
                lineToRelative(-63.4f, 36.5f)
                verticalLineTo(164.7f)
                lineTo(223.8f, 73.1f)
                lineTo(65.2f, 164.7f)
                lineToRelative(0.4f, 255.9f)
                lineTo(2.3f, 384.0f)
                verticalLineTo(128.1f)
                lineTo(224.2f, 0.0f)
                lineToRelative(221.5f, 127.9f)
                close()
                moveTo(255.6f, 420.5f)
                lineTo(224.0f, 438.9f)
                lineToRelative(-31.8f, -18.2f)
                verticalLineToRelative(-256.0f)
                lineToRelative(-63.3f, 36.6f)
                lineToRelative(0.1f, 255.9f)
                lineToRelative(94.9f, 54.9f)
                lineToRelative(95.1f, -54.9f)
                verticalLineToRelative(-256.0f)
                lineToRelative(-63.4f, -36.6f)
                verticalLineToRelative(255.9f)
                close()
            }
        }
        .build()
        return _magento!!
    }

private var _magento: ImageVector? = null
