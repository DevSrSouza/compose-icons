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

public val MaterialDesignIcons.Ferry: ImageVector
    get() {
        if (_ferry != null) {
            return _ferry!!
        }
        _ferry = Builder(name = "Ferry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.96f)
                lineTo(12.0f, 8.0f)
                lineTo(6.0f, 9.96f)
                moveTo(3.94f, 19.0f)
                horizontalLineTo(4.0f)
                curveTo(5.6f, 19.0f, 7.0f, 18.12f, 8.0f, 17.0f)
                curveTo(9.0f, 18.12f, 10.4f, 19.0f, 12.0f, 19.0f)
                curveTo(13.6f, 19.0f, 15.0f, 18.12f, 16.0f, 17.0f)
                curveTo(17.0f, 18.12f, 18.4f, 19.0f, 20.0f, 19.0f)
                horizontalLineTo(20.05f)
                lineTo(21.95f, 12.31f)
                curveTo(22.03f, 12.06f, 22.0f, 11.78f, 21.89f, 11.54f)
                curveTo(21.76f, 11.3f, 21.55f, 11.12f, 21.29f, 11.04f)
                lineTo(20.0f, 10.62f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 4.89f, 19.1f, 4.0f, 18.0f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 6.0f)
                verticalLineTo(10.62f)
                lineTo(2.71f, 11.04f)
                curveTo(2.45f, 11.12f, 2.24f, 11.3f, 2.11f, 11.54f)
                curveTo(2.0f, 11.78f, 1.97f, 12.06f, 2.05f, 12.31f)
                moveTo(20.0f, 21.0f)
                curveTo(18.61f, 21.0f, 17.22f, 20.53f, 16.0f, 19.67f)
                curveTo(13.56f, 21.38f, 10.44f, 21.38f, 8.0f, 19.67f)
                curveTo(6.78f, 20.53f, 5.39f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(4.0f)
                curveTo(5.37f, 23.0f, 6.74f, 22.65f, 8.0f, 22.0f)
                curveTo(10.5f, 23.3f, 13.5f, 23.3f, 16.0f, 22.0f)
                curveTo(17.26f, 22.65f, 18.62f, 23.0f, 20.0f, 23.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _ferry!!
    }

private var _ferry: ImageVector? = null
