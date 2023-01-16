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

public val MaterialDesignIcons.VectorCircleVariant: ImageVector
    get() {
        if (_vectorCircleVariant != null) {
            return _vectorCircleVariant!!
        }
        _vectorCircleVariant = Builder(name = "VectorCircleVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                horizontalLineTo(19.97f)
                curveTo(18.7f, 5.41f, 15.31f, 3.0f, 11.5f, 3.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 2.5f, 12.0f)
                curveTo(2.5f, 17.0f, 6.53f, 21.0f, 11.5f, 21.0f)
                curveTo(15.31f, 21.0f, 18.7f, 18.6f, 20.0f, 15.0f)
                horizontalLineTo(22.0f)
                moveTo(20.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                moveTo(17.82f, 15.0f)
                curveTo(16.66f, 17.44f, 14.2f, 19.0f, 11.5f, 19.0f)
                curveTo(7.64f, 19.0f, 4.5f, 15.87f, 4.5f, 12.0f)
                curveTo(4.5f, 8.14f, 7.64f, 5.0f, 11.5f, 5.0f)
                curveTo(14.2f, 5.0f, 16.66f, 6.57f, 17.81f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
            }
        }
        .build()
        return _vectorCircleVariant!!
    }

private var _vectorCircleVariant: ImageVector? = null
