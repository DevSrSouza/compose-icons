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

public val MaterialDesignIcons.VectorIntersection: ImageVector
    get() {
        if (_vectorIntersection != null) {
            return _vectorIntersection!!
        }
        _vectorIntersection = Builder(name = "VectorIntersection", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.14f, 1.0f)
                arcTo(2.14f, 2.14f, 0.0f, false, false, 1.0f, 3.14f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(3.14f)
                moveTo(7.0f, 1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(7.0f)
                moveTo(12.0f, 1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.14f)
                curveTo(16.0f, 1.96f, 15.04f, 1.0f, 13.86f, 1.0f)
                horizontalLineTo(12.0f)
                moveTo(1.0f, 7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(1.0f)
                moveTo(9.0f, 7.0f)
                curveTo(7.89f, 7.0f, 7.0f, 7.89f, 7.0f, 9.0f)
                curveTo(7.0f, 11.33f, 7.0f, 16.0f, 7.0f, 16.0f)
                curveTo(7.0f, 16.0f, 11.57f, 16.0f, 13.86f, 16.0f)
                arcTo(2.14f, 2.14f, 0.0f, false, false, 16.0f, 13.86f)
                curveTo(16.0f, 11.57f, 16.0f, 7.0f, 16.0f, 7.0f)
                curveTo(16.0f, 7.0f, 11.33f, 7.0f, 9.0f, 7.0f)
                moveTo(18.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 7.89f, 21.11f, 7.0f, 20.0f, 7.0f)
                horizontalLineTo(18.0f)
                moveTo(9.0f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                moveTo(1.0f, 12.0f)
                verticalLineTo(13.86f)
                curveTo(1.0f, 15.04f, 1.96f, 16.0f, 3.14f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(1.0f)
                moveTo(20.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                moveTo(7.0f, 18.0f)
                verticalLineTo(20.0f)
                curveTo(7.0f, 21.11f, 7.89f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                moveTo(20.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 22.0f, 22.0f, 21.11f, 22.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                moveTo(13.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _vectorIntersection!!
    }

private var _vectorIntersection: ImageVector? = null
