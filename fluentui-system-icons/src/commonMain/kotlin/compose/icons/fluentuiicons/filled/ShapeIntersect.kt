package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ShapeIntersect: ImageVector
    get() {
        if (_shapeIntersect != null) {
            return _shapeIntersect!!
        }
        _shapeIntersect = Builder(name = "ShapeIntersect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.25f)
                curveTo(2.0f, 3.4551f, 3.4551f, 2.0f, 5.25f, 2.0f)
                horizontalLineTo(13.25f)
                curveTo(15.0449f, 2.0f, 16.5f, 3.4551f, 16.5f, 5.25f)
                verticalLineTo(7.5f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 7.5f, 22.0f, 8.9551f, 22.0f, 10.75f)
                verticalLineTo(18.75f)
                curveTo(22.0f, 20.5449f, 20.5449f, 22.0f, 18.75f, 22.0f)
                horizontalLineTo(10.75f)
                curveTo(8.9551f, 22.0f, 7.5f, 20.5449f, 7.5f, 18.75f)
                verticalLineTo(16.5f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 16.5f, 2.0f, 15.0449f, 2.0f, 13.25f)
                verticalLineTo(5.25f)
                close()
                moveTo(15.0f, 5.25f)
                curveTo(15.0f, 4.2835f, 14.2165f, 3.5f, 13.25f, 3.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 3.5f, 3.5f, 4.2835f, 3.5f, 5.25f)
                verticalLineTo(13.25f)
                curveTo(3.5f, 14.2165f, 4.2835f, 15.0f, 5.25f, 15.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(10.75f)
                curveTo(7.5f, 10.113f, 7.6833f, 9.5187f, 8.0f, 9.0172f)
                curveTo(8.241f, 8.6355f, 8.5593f, 8.3074f, 8.9329f, 8.055f)
                curveTo(8.9607f, 8.0363f, 8.9888f, 8.0179f, 9.0172f, 8.0f)
                curveTo(9.5187f, 7.6833f, 10.113f, 7.5f, 10.75f, 7.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.25f)
                close()
                moveTo(16.0f, 14.9828f)
                curveTo(15.9821f, 15.0112f, 15.9637f, 15.0393f, 15.945f, 15.0671f)
                curveTo(15.6926f, 15.4407f, 15.3645f, 15.759f, 14.9828f, 16.0f)
                curveTo(14.4813f, 16.3167f, 13.887f, 16.5f, 13.25f, 16.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.75f)
                curveTo(9.0f, 19.7165f, 9.7835f, 20.5f, 10.75f, 20.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 20.5f, 20.5f, 19.7165f, 20.5f, 18.75f)
                verticalLineTo(10.75f)
                curveTo(20.5f, 9.7835f, 19.7165f, 9.0f, 18.75f, 9.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(13.25f)
                curveTo(16.5f, 13.887f, 16.3167f, 14.4813f, 16.0f, 14.9828f)
                close()
            }
        }
        .build()
        return _shapeIntersect!!
    }

private var _shapeIntersect: ImageVector? = null
