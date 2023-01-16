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

public val MaterialDesignIcons.VectorTriangle: ImageVector
    get() {
        if (_vectorTriangle != null) {
            return _vectorTriangle!!
        }
        _vectorTriangle = Builder(name = "VectorTriangle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.73f)
                lineTo(5.79f, 16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.21f)
                lineTo(14.27f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                moveTo(11.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                moveTo(12.0f, 9.04f)
                lineTo(16.0f, 16.15f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.15f)
                moveTo(4.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                moveTo(18.0f, 18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
            }
        }
        .build()
        return _vectorTriangle!!
    }

private var _vectorTriangle: ImageVector? = null
