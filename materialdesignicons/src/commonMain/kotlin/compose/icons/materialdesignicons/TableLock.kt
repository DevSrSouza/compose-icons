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

public val MaterialDesignIcons.TableLock: ImageVector
    get() {
        if (_tableLock != null) {
            return _tableLock!!
        }
        _tableLock = Builder(name = "TableLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 16.0f)
                verticalLineTo(15.5f)
                curveTo(21.0f, 14.12f, 19.88f, 13.0f, 18.5f, 13.0f)
                reflectiveCurveTo(16.0f, 14.12f, 16.0f, 15.5f)
                verticalLineTo(16.0f)
                curveTo(15.45f, 16.0f, 15.0f, 16.45f, 15.0f, 17.0f)
                verticalLineTo(21.0f)
                curveTo(15.0f, 21.55f, 15.45f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 22.0f, 22.0f, 21.55f, 22.0f, 21.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 16.45f, 21.55f, 16.0f, 21.0f, 16.0f)
                moveTo(20.0f, 16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.5f)
                curveTo(17.0f, 14.67f, 17.67f, 14.0f, 18.5f, 14.0f)
                reflectiveCurveTo(20.0f, 14.67f, 20.0f, 15.5f)
                verticalLineTo(16.0f)
                moveTo(13.0f, 18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.26f)
                curveTo(14.54f, 13.21f, 15.04f, 12.5f, 15.69f, 12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.05f)
                curveTo(18.17f, 11.03f, 18.33f, 11.0f, 18.5f, 11.0f)
                curveTo(19.03f, 11.0f, 19.53f, 11.1f, 20.0f, 11.26f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 4.89f, 19.11f, 4.0f, 18.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.11f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                moveTo(10.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                moveTo(10.0f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _tableLock!!
    }

private var _tableLock: ImageVector? = null
