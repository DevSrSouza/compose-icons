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

public val MaterialDesignIcons.RayEnd: ImageVector
    get() {
        if (_rayEnd != null) {
            return _rayEnd!!
        }
        _rayEnd = Builder(name = "RayEnd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 9.0f)
                curveTo(18.69f, 9.0f, 17.58f, 9.83f, 17.17f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.17f)
                curveTo(17.58f, 14.17f, 18.69f, 15.0f, 20.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 23.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 20.0f, 9.0f)
                close()
            }
        }
        .build()
        return _rayEnd!!
    }

private var _rayEnd: ImageVector? = null
