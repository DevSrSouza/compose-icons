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

public val MaterialDesignIcons.BrushVariant: ImageVector
    get() {
        if (_brushVariant != null) {
            return _brushVariant!!
        }
        _brushVariant = Builder(name = "BrushVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                curveTo(5.79f, 3.0f, 4.0f, 4.79f, 4.0f, 7.0f)
                verticalLineTo(14.0f)
                curveTo(4.0f, 15.1f, 4.9f, 16.0f, 6.0f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                curveTo(9.0f, 21.1f, 9.9f, 22.0f, 11.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(14.1f, 22.0f, 15.0f, 21.1f, 15.0f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 16.0f, 20.0f, 15.1f, 20.0f, 14.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                moveTo(8.0f, 5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 5.9f, 6.9f, 5.0f, 8.0f, 5.0f)
                moveTo(6.0f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _brushVariant!!
    }

private var _brushVariant: ImageVector? = null
