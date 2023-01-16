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

public val MaterialDesignIcons.GoogleCloud: ImageVector
    get() {
        if (_googleCloud != null) {
            return _googleCloud!!
        }
        _googleCloud = Builder(name = "GoogleCloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 14.75f)
                curveTo(23.0f, 18.2f, 20.2f, 21.0f, 16.75f, 21.0f)
                horizontalLineTo(7.25f)
                curveTo(3.8f, 21.0f, 1.0f, 18.2f, 1.0f, 14.75f)
                curveTo(1.0f, 12.61f, 2.08f, 10.72f, 3.71f, 9.6f)
                curveTo(4.58f, 5.82f, 7.96f, 3.0f, 12.0f, 3.0f)
                curveTo(16.04f, 3.0f, 19.42f, 5.82f, 20.29f, 9.6f)
                curveTo(21.93f, 10.72f, 23.0f, 12.61f, 23.0f, 14.75f)
                moveTo(16.63f, 17.0f)
                curveTo(17.94f, 17.0f, 19.0f, 15.94f, 19.0f, 14.63f)
                curveTo(19.0f, 13.35f, 18.0f, 12.3f, 16.72f, 12.25f)
                lineTo(16.75f, 11.75f)
                curveTo(16.75f, 9.13f, 14.62f, 7.0f, 12.0f, 7.0f)
                curveTo(10.58f, 7.0f, 9.3f, 7.62f, 8.43f, 8.61f)
                curveTo(9.93f, 8.9f, 11.23f, 9.72f, 12.14f, 10.86f)
                lineTo(9.5f, 13.5f)
                curveTo(9.08f, 12.77f, 8.29f, 12.25f, 7.38f, 12.25f)
                curveTo(6.06f, 12.25f, 5.0f, 13.31f, 5.0f, 14.63f)
                curveTo(5.0f, 15.9f, 6.0f, 16.93f, 7.25f, 17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.63f)
                close()
            }
        }
        .build()
        return _googleCloud!!
    }

private var _googleCloud: ImageVector? = null
