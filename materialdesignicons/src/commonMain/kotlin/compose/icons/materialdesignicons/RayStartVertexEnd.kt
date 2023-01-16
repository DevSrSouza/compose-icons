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

public val MaterialDesignIcons.RayStartVertexEnd: ImageVector
    get() {
        if (_rayStartVertexEnd != null) {
            return _rayStartVertexEnd!!
        }
        _rayStartVertexEnd = Builder(name = "RayStartVertexEnd", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 9.0f)
                curveTo(18.69f, 9.0f, 17.58f, 9.83f, 17.17f, 11.0f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 9.84f, 13.3f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(9.6f, 9.84f, 9.18f, 11.0f)
                horizontalLineTo(6.83f)
                curveTo(6.42f, 9.83f, 5.31f, 9.0f, 4.0f, 9.0f)
                curveTo(2.34f, 9.0f, 1.0f, 10.34f, 1.0f, 12.0f)
                reflectiveCurveTo(2.34f, 15.0f, 4.0f, 15.0f)
                curveTo(5.31f, 15.0f, 6.42f, 14.17f, 6.83f, 13.0f)
                horizontalLineTo(9.18f)
                curveTo(9.6f, 14.16f, 10.7f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(14.4f, 14.16f, 14.82f, 13.0f)
                horizontalLineTo(17.17f)
                curveTo(17.58f, 14.17f, 18.69f, 15.0f, 20.0f, 15.0f)
                curveTo(21.66f, 15.0f, 23.0f, 13.66f, 23.0f, 12.0f)
                reflectiveCurveTo(21.66f, 9.0f, 20.0f, 9.0f)
            }
        }
        .build()
        return _rayStartVertexEnd!!
    }

private var _rayStartVertexEnd: ImageVector? = null
