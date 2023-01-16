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

public val MaterialDesignIcons.VectorSquare: ImageVector
    get() {
        if (_vectorSquare != null) {
            return _vectorSquare!!
        }
        _vectorSquare = Builder(name = "VectorSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                moveTo(16.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                moveTo(4.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                moveTo(18.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                moveTo(4.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                moveTo(18.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _vectorSquare!!
    }

private var _vectorSquare: ImageVector? = null
