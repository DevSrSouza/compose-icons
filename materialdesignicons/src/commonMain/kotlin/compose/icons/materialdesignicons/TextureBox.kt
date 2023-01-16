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

public val MaterialDesignIcons.TextureBox: ImageVector
    get() {
        if (_textureBox != null) {
            return _textureBox!!
        }
        _textureBox = Builder(name = "TextureBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 22.0f, 22.0f, 21.11f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.11f, 2.0f, 20.0f, 2.0f)
                moveTo(4.0f, 6.0f)
                lineTo(6.0f, 4.0f)
                horizontalLineTo(10.9f)
                lineTo(4.0f, 10.9f)
                verticalLineTo(6.0f)
                moveTo(4.0f, 13.7f)
                lineTo(13.7f, 4.0f)
                horizontalLineTo(18.6f)
                lineTo(4.0f, 18.6f)
                verticalLineTo(13.7f)
                moveTo(20.0f, 18.0f)
                lineTo(18.0f, 20.0f)
                horizontalLineTo(13.1f)
                lineTo(20.0f, 13.1f)
                verticalLineTo(18.0f)
                moveTo(20.0f, 10.3f)
                lineTo(10.3f, 20.0f)
                horizontalLineTo(5.4f)
                lineTo(20.0f, 5.4f)
                verticalLineTo(10.3f)
                close()
            }
        }
        .build()
        return _textureBox!!
    }

private var _textureBox: ImageVector? = null
