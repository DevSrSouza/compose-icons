package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.EmoticonConfused: ImageVector
    get() {
        if (_emoticonConfused != null) {
            return _emoticonConfused!!
        }
        _emoticonConfused = Builder(name = "EmoticonConfused", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(8.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 7.0f, 9.5f)
                arcTo(1.54f, 1.54f, 0.0f, false, true, 8.5f, 8.0f)
                moveTo(17.0f, 16.0f)
                horizontalLineTo(13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 9.53f, 18.0f)
                lineTo(7.8f, 17.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 13.0f, 14.0f)
                horizontalLineTo(17.0f)
                moveTo(15.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 17.0f, 9.5f)
                arcTo(1.54f, 1.54f, 0.0f, false, true, 15.5f, 11.0f)
                close()
            }
        }
        .build()
        return _emoticonConfused!!
    }

private var _emoticonConfused: ImageVector? = null
