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

public val MaterialDesignIcons.FlagMinusOutline: ImageVector
    get() {
        if (_flagMinusOutline != null) {
            return _flagMinusOutline!!
        }
        _flagMinusOutline = Builder(name = "FlagMinusOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.36f, 6.0f)
                lineTo(12.76f, 8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.64f)
                lineTo(14.24f, 12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.36f)
                moveTo(14.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.6f)
                lineTo(13.0f, 16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.4f)
                moveTo(23.0f, 18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _flagMinusOutline!!
    }

private var _flagMinusOutline: ImageVector? = null
