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

public val MaterialDesignIcons.DeleteVariant: ImageVector
    get() {
        if (_deleteVariant != null) {
            return _deleteVariant!!
        }
        _deleteVariant = Builder(name = "DeleteVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.03f, 3.0f)
                lineTo(18.0f, 20.31f)
                curveTo(17.83f, 21.27f, 17.0f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(7.0f, 22.0f, 6.17f, 21.27f, 6.0f, 20.31f)
                lineTo(2.97f, 3.0f)
                horizontalLineTo(21.03f)
                moveTo(5.36f, 5.0f)
                lineTo(8.0f, 20.0f)
                horizontalLineTo(16.0f)
                lineTo(18.64f, 5.0f)
                horizontalLineTo(5.36f)
                moveTo(9.0f, 18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                moveTo(13.0f, 13.18f)
                lineTo(9.82f, 10.0f)
                lineTo(13.0f, 6.82f)
                lineTo(16.18f, 10.0f)
                lineTo(13.0f, 13.18f)
                close()
            }
        }
        .build()
        return _deleteVariant!!
    }

private var _deleteVariant: ImageVector? = null
