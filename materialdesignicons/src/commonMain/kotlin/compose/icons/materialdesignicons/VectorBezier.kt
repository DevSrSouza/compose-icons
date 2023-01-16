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

public val MaterialDesignIcons.VectorBezier: ImageVector
    get() {
        if (_vectorBezier != null) {
            return _vectorBezier!!
        }
        _vectorBezier = Builder(name = "VectorBezier", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 7.0f)
                curveTo(8.13f, 7.0f, 8.7f, 6.6f, 8.91f, 6.0f)
                horizontalLineTo(13.0f)
                curveTo(13.67f, 5.33f, 14.33f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(8.91f)
                curveTo(8.7f, 4.4f, 8.13f, 4.0f, 7.5f, 4.0f)
                moveTo(19.0f, 5.0f)
                curveTo(8.0f, 5.0f, 14.0f, 17.0f, 5.0f, 17.0f)
                verticalLineTo(19.0f)
                curveTo(16.0f, 19.0f, 10.0f, 7.0f, 19.0f, 7.0f)
                verticalLineTo(5.0f)
                moveTo(16.5f, 17.0f)
                curveTo(15.87f, 17.0f, 15.3f, 17.4f, 15.09f, 18.0f)
                horizontalLineTo(11.0f)
                curveTo(10.33f, 18.67f, 9.67f, 19.0f, 9.0f, 19.0f)
                horizontalLineTo(15.09f)
                curveTo(15.3f, 19.6f, 15.87f, 20.0f, 16.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 17.0f)
                close()
            }
        }
        .build()
        return _vectorBezier!!
    }

private var _vectorBezier: ImageVector? = null
