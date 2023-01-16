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

public val MaterialDesignIcons.TumbleDryer: ImageVector
    get() {
        if (_tumbleDryer != null) {
            return _tumbleDryer!!
        }
        _tumbleDryer = Builder(name = "TumbleDryer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 2.0f)
                moveTo(7.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 4.0f)
                moveTo(10.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 4.0f)
                moveTo(12.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 20.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 8.0f)
                moveTo(8.11f, 10.5f)
                horizontalLineTo(10.0f)
                curveTo(9.76f, 11.88f, 10.0f, 12.67f, 10.58f, 13.29f)
                curveTo(11.68f, 14.36f, 12.16f, 15.71f, 11.89f, 17.5f)
                horizontalLineTo(10.0f)
                curveTo(10.24f, 16.12f, 10.0f, 15.33f, 9.42f, 14.71f)
                curveTo(8.32f, 13.64f, 7.85f, 12.29f, 8.11f, 10.5f)
                moveTo(12.11f, 10.5f)
                horizontalLineTo(14.0f)
                curveTo(13.76f, 11.88f, 14.0f, 12.67f, 14.58f, 13.29f)
                curveTo(15.68f, 14.36f, 16.16f, 15.71f, 15.89f, 17.5f)
                horizontalLineTo(14.0f)
                curveTo(14.24f, 16.12f, 14.0f, 15.33f, 13.42f, 14.71f)
                curveTo(12.32f, 13.64f, 11.85f, 12.29f, 12.11f, 10.5f)
                close()
            }
        }
        .build()
        return _tumbleDryer!!
    }

private var _tumbleDryer: ImageVector? = null
