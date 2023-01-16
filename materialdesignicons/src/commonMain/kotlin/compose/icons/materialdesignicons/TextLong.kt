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

public val MaterialDesignIcons.TextLong: ImageVector
    get() {
        if (_textLong != null) {
            return _textLong!!
        }
        _textLong = Builder(name = "TextLong", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                moveTo(4.0f, 9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                moveTo(4.0f, 13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                moveTo(4.0f, 17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _textLong!!
    }

private var _textLong: ImageVector? = null
