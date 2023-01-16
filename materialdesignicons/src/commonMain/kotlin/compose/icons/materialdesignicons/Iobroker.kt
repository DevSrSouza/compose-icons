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

public val MaterialDesignIcons.Iobroker: ImageVector
    get() {
        if (_iobroker != null) {
            return _iobroker!!
        }
        _iobroker = Builder(name = "Iobroker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(11.5f, 2.0f, 11.0f, 2.04f, 10.5f, 2.11f)
                verticalLineTo(4.85f)
                curveTo(11.0f, 4.75f, 11.5f, 4.7f, 12.0f, 4.7f)
                curveTo(12.5f, 4.7f, 13.0f, 4.75f, 13.5f, 4.85f)
                verticalLineTo(2.12f)
                curveTo(13.0f, 2.04f, 12.5f, 2.0f, 12.0f, 2.0f)
                moveTo(9.82f, 2.25f)
                curveTo(5.4f, 3.25f, 2.11f, 7.24f, 2.11f, 12.0f)
                curveTo(2.11f, 17.5f, 6.53f, 22.0f, 12.0f, 22.0f)
                curveTo(17.47f, 22.0f, 21.89f, 17.5f, 21.89f, 12.0f)
                curveTo(21.89f, 7.24f, 18.6f, 3.25f, 14.19f, 2.25f)
                verticalLineTo(5.03f)
                curveTo(17.17f, 5.96f, 19.34f, 8.73f, 19.34f, 12.0f)
                curveTo(19.34f, 16.0f, 16.05f, 19.3f, 12.0f, 19.3f)
                curveTo(7.96f, 19.3f, 4.67f, 16.0f, 4.67f, 12.0f)
                curveTo(4.67f, 8.73f, 6.84f, 5.96f, 9.82f, 5.03f)
                moveTo(12.0f, 5.45f)
                curveTo(11.5f, 5.45f, 11.0f, 5.5f, 10.5f, 5.62f)
                verticalLineTo(18.27f)
                curveTo(11.0f, 18.38f, 11.5f, 18.44f, 12.0f, 18.44f)
                curveTo(12.5f, 18.44f, 13.0f, 18.39f, 13.5f, 18.27f)
                verticalLineTo(5.62f)
                curveTo(13.0f, 5.5f, 12.5f, 5.45f, 12.0f, 5.45f)
                close()
            }
        }
        .build()
        return _iobroker!!
    }

private var _iobroker: ImageVector? = null
