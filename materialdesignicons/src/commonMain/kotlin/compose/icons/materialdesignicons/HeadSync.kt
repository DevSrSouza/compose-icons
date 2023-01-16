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

public val MaterialDesignIcons.HeadSync: ImageVector
    get() {
        if (_headSync != null) {
            return _headSync!!
        }
        _headSync = Builder(name = "HeadSync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(9.23f, 3.0f, 6.19f, 5.95f, 6.0f, 9.66f)
                lineTo(4.08f, 12.19f)
                curveTo(3.84f, 12.5f, 4.08f, 13.0f, 4.5f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 17.11f, 6.89f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.31f)
                curveTo(18.37f, 15.19f, 20.0f, 12.8f, 20.0f, 10.0f)
                curveTo(20.0f, 6.14f, 16.88f, 3.0f, 13.0f, 3.0f)
                moveTo(13.0f, 15.0f)
                verticalLineTo(13.5f)
                curveTo(10.79f, 13.5f, 9.0f, 11.71f, 9.0f, 9.5f)
                curveTo(9.0f, 8.68f, 9.25f, 7.92f, 9.67f, 7.29f)
                lineTo(10.76f, 8.38f)
                curveTo(10.59f, 8.72f, 10.5f, 9.1f, 10.5f, 9.5f)
                curveTo(10.5f, 10.88f, 11.62f, 12.0f, 13.0f, 12.0f)
                verticalLineTo(10.5f)
                lineTo(15.25f, 12.75f)
                lineTo(13.0f, 15.0f)
                moveTo(16.33f, 11.71f)
                lineTo(15.24f, 10.62f)
                curveTo(15.41f, 10.28f, 15.5f, 9.9f, 15.5f, 9.5f)
                curveTo(15.5f, 8.12f, 14.38f, 7.0f, 13.0f, 7.0f)
                verticalLineTo(8.5f)
                lineTo(10.75f, 6.25f)
                lineTo(13.0f, 4.0f)
                verticalLineTo(5.5f)
                curveTo(15.21f, 5.5f, 17.0f, 7.29f, 17.0f, 9.5f)
                curveTo(17.0f, 10.32f, 16.75f, 11.08f, 16.33f, 11.71f)
                close()
            }
        }
        .build()
        return _headSync!!
    }

private var _headSync: ImageVector? = null
