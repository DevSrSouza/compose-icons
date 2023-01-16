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

public val MaterialDesignIcons.BulkheadLight: ImageVector
    get() {
        if (_bulkheadLight != null) {
            return _bulkheadLight!!
        }
        _bulkheadLight = Builder(name = "BulkheadLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.09f)
                curveTo(13.0f, 2.06f, 13.0f, 2.03f, 13.0f, 2.0f)
                curveTo(13.0f, 1.45f, 12.55f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(11.0f, 1.45f, 11.0f, 2.0f)
                curveTo(11.0f, 2.03f, 11.0f, 2.06f, 11.0f, 2.09f)
                curveTo(8.19f, 2.56f, 6.03f, 5.0f, 6.03f, 7.97f)
                verticalLineTo(16.0f)
                curveTo(6.03f, 19.0f, 8.19f, 21.44f, 11.0f, 21.91f)
                curveTo(11.0f, 21.94f, 11.0f, 21.97f, 11.0f, 22.0f)
                curveTo(11.0f, 22.55f, 11.45f, 23.0f, 12.0f, 23.0f)
                reflectiveCurveTo(13.0f, 22.55f, 13.0f, 22.0f)
                curveTo(13.0f, 21.97f, 13.0f, 21.94f, 13.0f, 21.91f)
                curveTo(15.81f, 21.44f, 17.97f, 19.0f, 17.97f, 16.0f)
                verticalLineTo(7.97f)
                curveTo(18.0f, 5.0f, 15.81f, 2.56f, 13.0f, 2.09f)
                moveTo(16.0f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.4f)
                curveTo(15.6f, 6.09f, 16.0f, 7.0f, 16.0f, 8.0f)
                verticalLineTo(8.0f)
                moveTo(14.0f, 19.44f)
                curveTo(13.41f, 19.79f, 12.73f, 20.0f, 12.0f, 20.0f)
                curveTo(11.27f, 20.0f, 10.59f, 19.79f, 10.0f, 19.44f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.44f)
                moveTo(10.0f, 15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                moveTo(9.0f, 15.0f)
                horizontalLineTo(8.03f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                moveTo(10.0f, 4.56f)
                curveTo(10.59f, 4.21f, 11.27f, 4.0f, 12.0f, 4.0f)
                curveTo(12.73f, 4.0f, 13.41f, 4.21f, 14.0f, 4.56f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.56f)
                moveTo(15.0f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                moveTo(9.0f, 5.4f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.03f)
                verticalLineTo(7.97f)
                curveTo(8.03f, 7.0f, 8.4f, 6.09f, 9.0f, 5.4f)
                moveTo(8.03f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.6f)
                curveTo(8.4f, 17.91f, 8.03f, 17.0f, 8.03f, 16.03f)
                verticalLineTo(16.0f)
                moveTo(15.0f, 18.6f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                curveTo(16.0f, 17.0f, 15.6f, 17.91f, 15.0f, 18.6f)
                close()
            }
        }
        .build()
        return _bulkheadLight!!
    }

private var _bulkheadLight: ImageVector? = null
