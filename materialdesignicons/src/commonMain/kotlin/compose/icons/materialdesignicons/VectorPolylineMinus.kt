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

public val MaterialDesignIcons.VectorPolylineMinus: ImageVector
    get() {
        if (_vectorPolylineMinus != null) {
            return _vectorPolylineMinus!!
        }
        _vectorPolylineMinus = Builder(name = "VectorPolylineMinus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.95f)
                lineTo(6.95f, 15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.41f)
                lineTo(17.41f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.57f)
                lineTo(10.59f, 15.0f)
                horizontalLineTo(9.06f)
                lineTo(7.06f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(2.0f)
                moveTo(4.0f, 5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                moveTo(18.0f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                moveTo(8.0f, 17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                moveTo(15.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _vectorPolylineMinus!!
    }

private var _vectorPolylineMinus: ImageVector? = null
