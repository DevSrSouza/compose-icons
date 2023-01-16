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

public val MaterialDesignIcons.SelectionEllipseRemove: ImageVector
    get() {
        if (_selectionEllipseRemove != null) {
            return _selectionEllipseRemove!!
        }
        _selectionEllipseRemove = Builder(name = "SelectionEllipseRemove", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.35f, 20.25f)
                lineTo(7.56f, 18.66f)
                curveTo(8.42f, 19.23f, 9.39f, 19.64f, 10.43f, 19.85f)
                lineTo(10.16f, 21.83f)
                curveTo(8.77f, 21.57f, 7.5f, 21.0f, 6.35f, 20.25f)
                moveTo(16.43f, 18.66f)
                lineTo(17.64f, 20.26f)
                curveTo(16.5f, 21.03f, 15.23f, 21.57f, 13.84f, 21.83f)
                lineTo(13.57f, 19.85f)
                curveTo(14.61f, 19.64f, 15.57f, 19.23f, 16.43f, 18.66f)
                moveTo(19.84f, 13.59f)
                lineTo(21.83f, 13.86f)
                curveTo(21.57f, 15.25f, 21.0f, 16.54f, 20.24f, 17.66f)
                lineTo(18.65f, 16.45f)
                curveTo(19.22f, 15.6f, 19.63f, 14.63f, 19.84f, 13.59f)
                moveTo(2.17f, 13.84f)
                lineTo(4.15f, 13.57f)
                curveTo(4.36f, 14.61f, 4.77f, 15.58f, 5.34f, 16.44f)
                lineTo(3.75f, 17.65f)
                curveTo(3.0f, 16.5f, 2.43f, 15.23f, 2.17f, 13.84f)
                moveTo(14.59f, 8.0f)
                lineTo(12.0f, 10.59f)
                lineTo(9.41f, 8.0f)
                lineTo(8.0f, 9.41f)
                lineTo(10.59f, 12.0f)
                lineTo(8.0f, 14.59f)
                lineTo(9.41f, 16.0f)
                lineTo(12.0f, 13.41f)
                lineTo(14.59f, 16.0f)
                lineTo(16.0f, 14.59f)
                lineTo(13.41f, 12.0f)
                lineTo(16.0f, 9.41f)
                lineTo(14.59f, 8.0f)
                moveTo(18.66f, 7.56f)
                lineTo(20.25f, 6.35f)
                curveTo(21.03f, 7.5f, 21.58f, 8.78f, 21.83f, 10.18f)
                lineTo(19.85f, 10.45f)
                curveTo(19.64f, 9.4f, 19.23f, 8.42f, 18.66f, 7.56f)
                moveTo(4.15f, 10.43f)
                lineTo(2.17f, 10.16f)
                curveTo(2.43f, 8.77f, 3.0f, 7.5f, 3.75f, 6.35f)
                lineTo(5.34f, 7.56f)
                curveTo(4.77f, 8.42f, 4.36f, 9.39f, 4.15f, 10.43f)
                moveTo(13.57f, 4.15f)
                lineTo(13.84f, 2.17f)
                curveTo(15.23f, 2.43f, 16.5f, 3.0f, 17.65f, 3.75f)
                lineTo(16.44f, 5.34f)
                curveTo(15.58f, 4.77f, 14.61f, 4.36f, 13.57f, 4.15f)
                moveTo(7.56f, 5.34f)
                lineTo(6.35f, 3.75f)
                curveTo(7.5f, 3.0f, 8.77f, 2.43f, 10.16f, 2.17f)
                lineTo(10.43f, 4.15f)
                curveTo(9.39f, 4.36f, 8.42f, 4.77f, 7.56f, 5.34f)
                close()
            }
        }
        .build()
        return _selectionEllipseRemove!!
    }

private var _selectionEllipseRemove: ImageVector? = null
