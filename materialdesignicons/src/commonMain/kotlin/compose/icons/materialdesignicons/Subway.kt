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

public val MaterialDesignIcons.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.5f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.5f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.5f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.5f, 15.0f)
                moveTo(7.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                moveTo(15.5f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.5f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.5f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.5f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.5f, 15.0f)
                moveTo(18.0f, 15.88f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 6.38f, 15.32f, 6.0f, 12.0f, 6.0f)
                curveTo(9.0f, 6.0f, 6.0f, 6.37f, 6.0f, 9.0f)
                verticalLineTo(15.88f)
                arcTo(2.62f, 2.62f, 0.0f, false, false, 8.62f, 18.5f)
                lineTo(7.5f, 19.62f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.17f)
                lineTo(10.67f, 18.5f)
                horizontalLineTo(13.5f)
                lineTo(15.0f, 20.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(19.62f)
                lineTo(15.37f, 18.5f)
                curveTo(16.82f, 18.5f, 18.0f, 17.33f, 18.0f, 15.88f)
                moveTo(17.8f, 2.8f)
                curveTo(20.47f, 3.84f, 22.0f, 6.05f, 22.0f, 8.86f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.86f)
                curveTo(2.0f, 6.05f, 3.53f, 3.84f, 6.2f, 2.8f)
                curveTo(8.0f, 2.09f, 10.14f, 2.0f, 12.0f, 2.0f)
                curveTo(13.86f, 2.0f, 16.0f, 2.09f, 17.8f, 2.8f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null
