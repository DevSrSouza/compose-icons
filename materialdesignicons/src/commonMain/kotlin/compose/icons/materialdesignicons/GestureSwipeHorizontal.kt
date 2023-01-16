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

public val MaterialDesignIcons.GestureSwipeHorizontal: ImageVector
    get() {
        if (_gestureSwipeHorizontal != null) {
            return _gestureSwipeHorizontal!!
        }
        _gestureSwipeHorizontal = Builder(name = "GestureSwipeHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 1.0f)
                lineTo(3.0f, 4.0f)
                lineTo(6.0f, 7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                lineTo(12.0f, 4.0f)
                lineTo(9.0f, 1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(1.0f)
                moveTo(11.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 9.0f)
                verticalLineTo(19.0f)
                lineTo(6.8f, 17.28f)
                horizontalLineTo(6.58f)
                curveTo(6.3f, 17.28f, 6.03f, 17.39f, 5.84f, 17.6f)
                lineTo(5.1f, 18.37f)
                lineTo(10.0f, 22.57f)
                curveTo(10.26f, 22.85f, 10.62f, 23.0f, 11.0f, 23.0f)
                horizontalLineTo(17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 21.5f)
                verticalLineTo(17.14f)
                curveTo(19.0f, 16.56f, 18.68f, 16.03f, 18.15f, 15.79f)
                lineTo(13.21f, 13.6f)
                lineTo(12.0f, 13.47f)
                verticalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 8.0f)
                close()
            }
        }
        .build()
        return _gestureSwipeHorizontal!!
    }

private var _gestureSwipeHorizontal: ImageVector? = null
