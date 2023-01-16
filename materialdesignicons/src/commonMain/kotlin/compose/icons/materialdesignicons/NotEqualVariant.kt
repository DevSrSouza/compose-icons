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

public val MaterialDesignIcons.NotEqualVariant: ImageVector
    get() {
        if (_notEqualVariant != null) {
            return _notEqualVariant!!
        }
        _notEqualVariant = Builder(name = "NotEqualVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.08f, 4.61f)
                lineTo(15.92f, 5.4f)
                lineTo(14.8f, 8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.95f)
                lineTo(12.23f, 14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.38f)
                lineTo(9.92f, 19.4f)
                lineTo(8.08f, 18.61f)
                lineTo(9.2f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.06f)
                lineTo(11.77f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.63f)
                lineTo(14.08f, 4.61f)
                close()
            }
        }
        .build()
        return _notEqualVariant!!
    }

private var _notEqualVariant: ImageVector? = null
