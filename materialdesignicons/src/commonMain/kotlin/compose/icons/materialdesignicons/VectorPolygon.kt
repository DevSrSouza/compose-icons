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

public val MaterialDesignIcons.VectorPolygon: ImageVector
    get() {
        if (_vectorPolygon != null) {
            return _vectorPolygon!!
        }
        _vectorPolygon = Builder(name = "VectorPolygon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.28f)
                lineTo(5.57f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.06f)
                lineTo(15.0f, 20.05f)
                verticalLineTo(22.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.17f)
                lineTo(20.0f, 9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.53f)
                lineTo(14.8f, 8.0f)
                horizontalLineTo(9.59f)
                lineTo(8.0f, 5.82f)
                verticalLineTo(2.0f)
                moveTo(4.0f, 4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                moveTo(18.0f, 5.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                moveTo(6.31f, 8.0f)
                horizontalLineTo(7.11f)
                lineTo(9.0f, 10.59f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.91f)
                lineTo(16.57f, 9.0f)
                horizontalLineTo(18.0f)
                lineTo(17.16f, 16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.06f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.6f)
                moveTo(11.0f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                moveTo(6.0f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                moveTo(17.0f, 18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
            }
        }
        .build()
        return _vectorPolygon!!
    }

private var _vectorPolygon: ImageVector? = null
