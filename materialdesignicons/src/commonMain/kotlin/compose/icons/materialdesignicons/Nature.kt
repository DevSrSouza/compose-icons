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

public val MaterialDesignIcons.Nature: ImageVector
    get() {
        if (_nature != null) {
            return _nature!!
        }
        _nature = Builder(name = "Nature", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 16.12f)
                curveTo(16.47f, 15.71f, 19.17f, 12.76f, 19.17f, 9.17f)
                curveTo(19.17f, 5.3f, 16.04f, 2.17f, 12.17f, 2.17f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 5.17f, 9.17f)
                curveTo(5.17f, 12.64f, 7.69f, 15.5f, 11.0f, 16.06f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.12f)
                close()
            }
        }
        .build()
        return _nature!!
    }

private var _nature: ImageVector? = null
