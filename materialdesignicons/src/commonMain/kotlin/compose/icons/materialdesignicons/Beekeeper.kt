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

public val MaterialDesignIcons.Beekeeper: ImageVector
    get() {
        if (_beekeeper != null) {
            return _beekeeper!!
        }
        _beekeeper = Builder(name = "Beekeeper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 3.34f, 14.21f, 2.0f, 12.0f, 2.0f)
                curveTo(9.79f, 2.0f, 8.0f, 3.34f, 8.0f, 5.0f)
                horizontalLineTo(5.0f)
                curveTo(4.45f, 5.0f, 4.0f, 5.45f, 4.0f, 6.0f)
                reflectiveCurveTo(4.45f, 7.0f, 5.0f, 7.0f)
                verticalLineTo(14.0f)
                curveTo(5.0f, 15.11f, 5.9f, 16.0f, 7.0f, 16.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 16.0f, 19.0f, 15.11f, 19.0f, 14.0f)
                verticalLineTo(7.0f)
                curveTo(19.55f, 7.0f, 20.0f, 6.55f, 20.0f, 6.0f)
                reflectiveCurveTo(19.55f, 5.0f, 19.0f, 5.0f)
                moveTo(17.0f, 14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                moveTo(15.86f, 8.0f)
                curveTo(15.94f, 8.32f, 16.0f, 8.65f, 16.0f, 9.0f)
                curveTo(16.0f, 11.21f, 14.21f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(8.0f, 11.21f, 8.0f, 9.0f)
                curveTo(8.0f, 8.65f, 8.06f, 8.32f, 8.14f, 8.0f)
                horizontalLineTo(10.28f)
                curveTo(10.11f, 8.3f, 10.0f, 8.63f, 10.0f, 9.0f)
                curveTo(10.0f, 10.1f, 10.9f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(14.0f, 10.1f, 14.0f, 9.0f)
                curveTo(14.0f, 8.63f, 13.89f, 8.3f, 13.72f, 8.0f)
                horizontalLineTo(15.86f)
                moveTo(20.0f, 19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                curveTo(4.0f, 18.22f, 4.47f, 17.55f, 5.18f, 17.0f)
                horizontalLineTo(12.0f)
                curveTo(9.28f, 17.0f, 6.19f, 18.29f, 6.0f, 19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                curveTo(17.81f, 18.29f, 14.72f, 17.0f, 12.0f, 17.0f)
                horizontalLineTo(18.82f)
                curveTo(19.53f, 17.55f, 20.0f, 18.22f, 20.0f, 19.0f)
                close()
            }
        }
        .build()
        return _beekeeper!!
    }

private var _beekeeper: ImageVector? = null
