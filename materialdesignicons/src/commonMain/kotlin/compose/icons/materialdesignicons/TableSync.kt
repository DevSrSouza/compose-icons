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

public val MaterialDesignIcons.TableSync: ImageVector
    get() {
        if (_tableSync != null) {
            return _tableSync!!
        }
        _tableSync = Builder(name = "TableSync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                verticalLineTo(13.5f)
                curveTo(21.21f, 13.5f, 23.0f, 15.29f, 23.0f, 17.5f)
                curveTo(23.0f, 18.32f, 22.76f, 19.08f, 22.33f, 19.71f)
                lineTo(21.24f, 18.62f)
                curveTo(21.41f, 18.28f, 21.5f, 17.9f, 21.5f, 17.5f)
                curveTo(21.5f, 16.12f, 20.38f, 15.0f, 19.0f, 15.0f)
                verticalLineTo(16.5f)
                lineTo(16.75f, 14.25f)
                lineTo(19.0f, 12.0f)
                moveTo(19.0f, 23.0f)
                verticalLineTo(21.5f)
                curveTo(16.79f, 21.5f, 15.0f, 19.71f, 15.0f, 17.5f)
                curveTo(15.0f, 16.68f, 15.25f, 15.92f, 15.67f, 15.29f)
                lineTo(16.76f, 16.38f)
                curveTo(16.59f, 16.72f, 16.5f, 17.1f, 16.5f, 17.5f)
                curveTo(16.5f, 18.88f, 17.62f, 20.0f, 19.0f, 20.0f)
                verticalLineTo(18.5f)
                lineTo(21.25f, 20.75f)
                lineTo(19.0f, 23.0f)
                moveTo(4.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 3.0f, 20.0f, 3.9f, 20.0f, 5.0f)
                verticalLineTo(11.0f)
                lineTo(19.5f, 11.0f)
                curveTo(17.66f, 11.0f, 16.0f, 11.77f, 14.81f, 13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                lineTo(13.0f, 17.5f)
                curveTo(13.0f, 18.0f, 13.06f, 18.5f, 13.17f, 19.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 19.0f, 2.0f, 18.11f, 2.0f, 17.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 3.9f, 2.9f, 3.0f, 4.0f, 3.0f)
                moveTo(4.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                moveTo(12.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                moveTo(4.0f, 13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _tableSync!!
    }

private var _tableSync: ImageVector? = null
