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

public val MaterialDesignIcons.MouseVariant: ImageVector
    get() {
        if (_mouseVariant != null) {
            return _mouseVariant!!
        }
        _mouseVariant = Builder(name = "MouseVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.1f)
                curveTo(12.28f, 2.56f, 14.0f, 4.58f, 14.0f, 7.0f)
                moveTo(4.0f, 7.0f)
                curveTo(4.0f, 4.58f, 5.72f, 2.56f, 8.0f, 2.1f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 14.42f, 12.28f, 16.44f, 10.0f, 16.9f)
                verticalLineTo(18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.0f, 18.0f)
                verticalLineTo(13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 9.0f)
                horizontalLineTo(22.0f)
                lineTo(21.0f, 10.0f)
                lineTo(22.0f, 11.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 13.0f, 23.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 8.0f, 18.0f)
                verticalLineTo(16.9f)
                curveTo(5.72f, 16.44f, 4.0f, 14.42f, 4.0f, 12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _mouseVariant!!
    }

private var _mouseVariant: ImageVector? = null
