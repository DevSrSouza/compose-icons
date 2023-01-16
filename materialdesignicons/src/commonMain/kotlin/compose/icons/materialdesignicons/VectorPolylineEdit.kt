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

public val MaterialDesignIcons.VectorPolylineEdit: ImageVector
    get() {
        if (_vectorPolylineEdit != null) {
            return _vectorPolylineEdit!!
        }
        _vectorPolylineEdit = Builder(name = "VectorPolylineEdit", defaultWidth = 24.0.dp,
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
                moveTo(21.15f, 13.0f)
                curveTo(21.0f, 13.0f, 20.87f, 13.05f, 20.76f, 13.16f)
                lineTo(19.75f, 14.18f)
                lineTo(21.82f, 16.25f)
                lineTo(22.84f, 15.24f)
                curveTo(23.05f, 15.03f, 23.05f, 14.67f, 22.84f, 14.46f)
                lineTo(21.54f, 13.16f)
                curveTo(21.43f, 13.05f, 21.29f, 13.0f, 21.15f, 13.0f)
                moveTo(19.15f, 14.76f)
                lineTo(13.0f, 20.91f)
                verticalLineTo(23.0f)
                horizontalLineTo(15.09f)
                lineTo(21.23f, 16.84f)
                lineTo(19.15f, 14.76f)
                moveTo(8.0f, 17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _vectorPolylineEdit!!
    }

private var _vectorPolylineEdit: ImageVector? = null
