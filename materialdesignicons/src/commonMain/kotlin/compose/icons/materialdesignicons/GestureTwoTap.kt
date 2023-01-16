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

public val MaterialDesignIcons.GestureTwoTap: ImageVector
    get() {
        if (_gestureTwoTap != null) {
            return _gestureTwoTap!!
        }
        _gestureTwoTap = Builder(name = "GestureTwoTap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(15.0f, 10.45f)
                verticalLineTo(9.24f)
                lineTo(15.0f, 9.23f)
                curveTo(15.23f, 9.03f, 15.42f, 8.79f, 15.57f, 8.54f)
                curveTo(15.84f, 8.09f, 16.0f, 7.56f, 16.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 4.0f)
                curveTo(12.21f, 4.0f, 11.5f, 4.31f, 10.95f, 4.81f)
                lineTo(10.81f, 4.95f)
                curveTo(10.68f, 5.09f, 10.56f, 5.24f, 10.46f, 5.4f)
                curveTo(10.36f, 5.56f, 10.27f, 5.74f, 10.2f, 5.92f)
                curveTo(10.17f, 6.0f, 10.15f, 6.06f, 10.13f, 6.13f)
                curveTo(8.9f, 6.5f, 8.0f, 7.65f, 8.0f, 9.0f)
                curveTo(8.0f, 9.7f, 8.24f, 10.34f, 8.64f, 10.85f)
                curveTo(8.74f, 11.0f, 8.87f, 11.11f, 9.0f, 11.23f)
                verticalLineTo(11.24f)
                lineTo(9.0f, 12.46f)
                verticalLineTo(12.46f)
                curveTo(7.8f, 11.77f, 7.0f, 10.5f, 7.0f, 9.0f)
                curveTo(7.0f, 7.38f, 7.97f, 6.0f, 9.35f, 5.35f)
                curveTo(10.0f, 3.97f, 11.38f, 3.0f, 13.0f, 3.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 17.0f, 7.0f)
                curveTo(17.0f, 8.5f, 16.2f, 9.77f, 15.0f, 10.46f)
                verticalLineTo(10.45f)
                close()
            }
        }
        .build()
        return _gestureTwoTap!!
    }

private var _gestureTwoTap: ImageVector? = null
