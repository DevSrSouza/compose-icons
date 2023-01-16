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

public val MaterialDesignIcons.KeyVariant: ImageVector
    get() {
        if (_keyVariant != null) {
            return _keyVariant!!
        }
        _keyVariant = Builder(name = "KeyVariant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                lineTo(9.74f, 13.74f)
                curveTo(9.19f, 13.91f, 8.61f, 14.0f, 8.0f, 14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 2.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 8.0f, 2.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 14.0f, 8.0f)
                curveTo(14.0f, 8.61f, 13.91f, 9.19f, 13.74f, 9.74f)
                lineTo(22.0f, 18.0f)
                moveTo(7.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 5.0f)
                close()
            }
        }
        .build()
        return _keyVariant!!
    }

private var _keyVariant: ImageVector? = null
