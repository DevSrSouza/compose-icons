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

public val MaterialDesignIcons.RayVertex: ImageVector
    get() {
        if (_rayVertex != null) {
            return _rayVertex!!
        }
        _rayVertex = Builder(name = "RayVertex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 11.0f)
                horizontalLineTo(9.17f)
                curveTo(9.58f, 9.83f, 10.69f, 9.0f, 12.0f, 9.0f)
                curveTo(13.31f, 9.0f, 14.42f, 9.83f, 14.83f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.83f)
                curveTo(14.42f, 14.17f, 13.31f, 15.0f, 12.0f, 15.0f)
                curveTo(10.69f, 15.0f, 9.58f, 14.17f, 9.17f, 13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _rayVertex!!
    }

private var _rayVertex: ImageVector? = null
