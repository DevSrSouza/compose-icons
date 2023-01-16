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

public val MaterialDesignIcons.HeadCheckOutline: ImageVector
    get() {
        if (_headCheckOutline != null) {
            return _headCheckOutline!!
        }
        _headCheckOutline = Builder(name = "HeadCheckOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(16.88f, 3.0f, 20.0f, 6.14f, 20.0f, 10.0f)
                curveTo(20.0f, 12.8f, 18.37f, 15.19f, 16.0f, 16.31f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                curveTo(6.89f, 18.0f, 6.0f, 17.11f, 6.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.5f)
                curveTo(4.08f, 13.0f, 3.84f, 12.5f, 4.08f, 12.19f)
                lineTo(6.0f, 9.66f)
                curveTo(6.19f, 5.95f, 9.23f, 3.0f, 13.0f, 3.0f)
                moveTo(13.0f, 1.0f)
                curveTo(8.42f, 1.0f, 4.61f, 4.43f, 4.06f, 8.91f)
                lineTo(2.5f, 11.0f)
                curveTo(1.92f, 11.72f, 1.82f, 12.72f, 2.24f, 13.59f)
                curveTo(2.6f, 14.31f, 3.24f, 14.8f, 4.0f, 14.95f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 17.86f, 5.28f, 19.43f, 7.0f, 19.87f)
                verticalLineTo(23.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.47f)
                curveTo(20.5f, 15.83f, 22.0f, 13.06f, 22.0f, 10.0f)
                curveTo(22.0f, 5.04f, 17.96f, 1.0f, 13.0f, 1.0f)
                moveTo(12.47f, 13.0f)
                lineTo(9.0f, 9.5f)
                lineTo(10.4f, 8.09f)
                lineTo(12.47f, 10.17f)
                lineTo(16.6f, 6.0f)
                lineTo(18.0f, 7.41f)
                lineTo(12.47f, 13.0f)
                close()
            }
        }
        .build()
        return _headCheckOutline!!
    }

private var _headCheckOutline: ImageVector? = null
