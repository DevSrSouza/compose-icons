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

public val MaterialDesignIcons.GestureTwoDoubleTap: ImageVector
    get() {
        if (_gestureTwoDoubleTap != null) {
            return _gestureTwoDoubleTap!!
        }
        _gestureTwoDoubleTap = Builder(name = "GestureTwoDoubleTap", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.14f)
                verticalLineTo(21.5f)
                curveTo(18.97f, 22.32f, 18.32f, 22.97f, 17.5f, 23.0f)
                horizontalLineTo(11.0f)
                curveTo(10.62f, 23.0f, 10.26f, 22.85f, 10.0f, 22.57f)
                lineTo(5.1f, 18.37f)
                lineTo(5.84f, 17.6f)
                curveTo(6.03f, 17.39f, 6.3f, 17.28f, 6.58f, 17.28f)
                horizontalLineTo(6.8f)
                lineTo(10.0f, 19.0f)
                verticalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 9.0f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 7.0f)
                verticalLineTo(12.0f)
                lineTo(18.15f, 13.84f)
                curveTo(18.66f, 14.07f, 19.0f, 14.58f, 19.0f, 15.14f)
                moveTo(13.0f, 3.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 17.0f, 7.0f)
                curveTo(17.0f, 8.5f, 16.2f, 9.77f, 15.0f, 10.46f)
                verticalLineTo(9.24f)
                curveTo(15.61f, 8.69f, 16.0f, 7.89f, 16.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 4.0f)
                curveTo(11.65f, 4.0f, 10.5f, 4.9f, 10.13f, 6.13f)
                curveTo(8.9f, 6.5f, 8.0f, 7.65f, 8.0f, 9.0f)
                curveTo(8.0f, 9.89f, 8.39f, 10.69f, 9.0f, 11.24f)
                verticalLineTo(12.46f)
                curveTo(7.8f, 11.77f, 7.0f, 10.5f, 7.0f, 9.0f)
                curveTo(7.0f, 7.38f, 7.97f, 6.0f, 9.35f, 5.35f)
                curveTo(10.0f, 3.97f, 11.38f, 3.0f, 13.0f, 3.0f)
                moveTo(13.0f, 1.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 19.0f, 7.0f)
                curveTo(19.0f, 9.06f, 17.96f, 10.88f, 16.38f, 11.96f)
                lineTo(15.26f, 11.46f)
                curveTo(16.89f, 10.64f, 18.0f, 8.95f, 18.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 13.0f, 2.0f)
                curveTo(11.11f, 2.0f, 9.46f, 3.05f, 8.61f, 4.61f)
                curveTo(7.05f, 5.46f, 6.0f, 7.11f, 6.0f, 9.0f)
                curveTo(6.0f, 11.05f, 7.23f, 12.81f, 9.0f, 13.58f)
                verticalLineTo(14.66f)
                curveTo(6.67f, 13.83f, 5.0f, 11.61f, 5.0f, 9.0f)
                curveTo(5.0f, 6.83f, 6.15f, 4.93f, 7.88f, 3.88f)
                curveTo(8.93f, 2.15f, 10.83f, 1.0f, 13.0f, 1.0f)
                close()
            }
        }
        .build()
        return _gestureTwoDoubleTap!!
    }

private var _gestureTwoDoubleTap: ImageVector? = null
