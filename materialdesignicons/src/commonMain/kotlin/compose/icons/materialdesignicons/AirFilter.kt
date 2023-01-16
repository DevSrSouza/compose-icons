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

public val MaterialDesignIcons.AirFilter: ImageVector
    get() {
        if (_airFilter != null) {
            return _airFilter!!
        }
        _airFilter = Builder(name = "AirFilter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 18.31f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 20.0f)
                verticalLineTo(16.3f)
                curveTo(4.54f, 16.12f, 3.95f, 16.0f, 3.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 14.0f)
                curveTo(3.82f, 14.0f, 4.47f, 14.08f, 5.0f, 14.21f)
                verticalLineTo(12.3f)
                curveTo(4.54f, 12.12f, 3.95f, 12.0f, 3.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 10.0f)
                curveTo(3.82f, 10.0f, 4.47f, 10.08f, 5.0f, 10.21f)
                verticalLineTo(8.3f)
                curveTo(4.54f, 8.12f, 3.95f, 8.0f, 3.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 6.0f)
                curveTo(3.82f, 6.0f, 4.47f, 6.08f, 5.0f, 6.21f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 2.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 4.0f)
                verticalLineTo(6.16f)
                curveTo(20.78f, 6.47f, 21.54f, 7.13f, 21.71f, 7.29f)
                curveTo(22.1f, 7.68f, 22.1f, 8.32f, 21.71f, 8.71f)
                curveTo(21.32f, 9.1f, 20.8f, 9.09f, 20.29f, 8.71f)
                verticalLineTo(8.71f)
                curveTo(20.29f, 8.71f, 19.25f, 8.0f, 17.0f, 8.0f)
                curveTo(15.74f, 8.0f, 14.91f, 8.41f, 13.95f, 8.9f)
                curveTo(12.91f, 9.41f, 11.74f, 10.0f, 10.0f, 10.0f)
                curveTo(9.64f, 10.0f, 9.31f, 10.0f, 9.0f, 9.96f)
                verticalLineTo(7.95f)
                curveTo(9.3f, 8.0f, 9.63f, 8.0f, 10.0f, 8.0f)
                curveTo(11.26f, 8.0f, 12.09f, 7.59f, 13.05f, 7.11f)
                curveTo(14.09f, 6.59f, 15.27f, 6.0f, 17.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                curveTo(18.5f, 18.0f, 18.97f, 18.29f, 19.0f, 18.31f)
                moveTo(17.0f, 10.0f)
                curveTo(15.27f, 10.0f, 14.09f, 10.59f, 13.05f, 11.11f)
                curveTo(12.09f, 11.59f, 11.26f, 12.0f, 10.0f, 12.0f)
                curveTo(9.63f, 12.0f, 9.3f, 12.0f, 9.0f, 11.95f)
                verticalLineTo(13.96f)
                curveTo(9.31f, 14.0f, 9.64f, 14.0f, 10.0f, 14.0f)
                curveTo(11.74f, 14.0f, 12.91f, 13.41f, 13.95f, 12.9f)
                curveTo(14.91f, 12.42f, 15.74f, 12.0f, 17.0f, 12.0f)
                curveTo(19.25f, 12.0f, 20.29f, 12.71f, 20.29f, 12.71f)
                verticalLineTo(12.71f)
                curveTo(20.8f, 13.1f, 21.32f, 13.1f, 21.71f, 12.71f)
                curveTo(22.1f, 12.32f, 22.1f, 11.69f, 21.71f, 11.29f)
                curveTo(21.5f, 11.08f, 20.25f, 10.0f, 17.0f, 10.0f)
                moveTo(17.0f, 14.0f)
                curveTo(15.27f, 14.0f, 14.09f, 14.59f, 13.05f, 15.11f)
                curveTo(12.09f, 15.59f, 11.26f, 16.0f, 10.0f, 16.0f)
                curveTo(9.63f, 16.0f, 9.3f, 16.0f, 9.0f, 15.95f)
                verticalLineTo(17.96f)
                curveTo(9.31f, 18.0f, 9.64f, 18.0f, 10.0f, 18.0f)
                curveTo(11.74f, 18.0f, 12.91f, 17.41f, 13.95f, 16.9f)
                curveTo(14.91f, 16.42f, 15.74f, 16.0f, 17.0f, 16.0f)
                curveTo(19.25f, 16.0f, 20.29f, 16.71f, 20.29f, 16.71f)
                verticalLineTo(16.71f)
                curveTo(20.8f, 17.1f, 21.32f, 17.1f, 21.71f, 16.71f)
                curveTo(22.1f, 16.32f, 22.1f, 15.69f, 21.71f, 15.29f)
                curveTo(21.5f, 15.08f, 20.25f, 14.0f, 17.0f, 14.0f)
                close()
            }
        }
        .build()
        return _airFilter!!
    }

private var _airFilter: ImageVector? = null
