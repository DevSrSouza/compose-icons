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

public val MaterialDesignIcons.Corn: ImageVector
    get() {
        if (_corn != null) {
            return _corn!!
        }
        _corn = Builder(name = "Corn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                horizontalLineTo(8.82f)
                curveTo(9.62f, 12.5f, 10.35f, 13.07f, 11.0f, 13.68f)
                verticalLineTo(12.0f)
                moveTo(7.0f, 11.0f)
                curveTo(7.27f, 5.88f, 9.37f, 2.0f, 12.0f, 2.0f)
                curveTo(14.66f, 2.0f, 16.77f, 5.94f, 17.0f, 11.12f)
                curveTo(18.5f, 10.43f, 20.17f, 10.0f, 22.0f, 10.0f)
                curveTo(16.25f, 12.57f, 18.25f, 22.0f, 12.0f, 22.0f)
                curveTo(6.0f, 22.0f, 7.93f, 12.57f, 2.0f, 10.0f)
                curveTo(3.82f, 10.0f, 5.5f, 10.4f, 7.0f, 11.0f)
                moveTo(11.0f, 11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.24f)
                lineTo(8.03f, 11.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.05f)
                curveTo(8.8f, 6.6f, 8.6f, 7.27f, 8.43f, 8.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 5.0f)
                verticalLineTo(3.3f)
                curveTo(10.45f, 3.63f, 9.95f, 4.22f, 9.5f, 5.0f)
                horizontalLineTo(11.0f)
                moveTo(12.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.23f)
                curveTo(13.42f, 16.45f, 14.15f, 18.0f, 14.32f, 19.23f)
                curveTo(15.31f, 17.56f, 15.96f, 14.84f, 16.0f, 11.76f)
                curveTo(15.94f, 7.0f, 14.13f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _corn!!
    }

private var _corn: ImageVector? = null
