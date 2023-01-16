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

public val MaterialDesignIcons.VectorSquareMinus: ImageVector
    get() {
        if (_vectorSquareMinus != null) {
            return _vectorSquareMinus!!
        }
        _vectorSquareMinus = Builder(name = "VectorSquareMinus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 18.7f, 13.0f, 18.3f, 13.1f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.1f)
                curveTo(18.3f, 13.0f, 18.7f, 13.0f, 19.0f, 13.0f)
                curveTo(19.3f, 13.0f, 19.7f, 13.0f, 20.0f, 13.1f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.1f)
                curveTo(13.0f, 19.7f, 13.0f, 19.3f, 13.0f, 19.0f)
                moveTo(18.0f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                moveTo(4.0f, 4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                moveTo(6.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                moveTo(23.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _vectorSquareMinus!!
    }

private var _vectorSquareMinus: ImageVector? = null
