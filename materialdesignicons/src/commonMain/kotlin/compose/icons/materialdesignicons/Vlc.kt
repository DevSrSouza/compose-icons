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

public val MaterialDesignIcons.Vlc: ImageVector
    get() {
        if (_vlc != null) {
            return _vlc!!
        }
        _vlc = Builder(name = "Vlc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(11.58f, 1.0f, 11.19f, 1.23f, 11.0f, 1.75f)
                lineTo(9.88f, 4.88f)
                curveTo(10.36f, 5.4f, 11.28f, 5.5f, 12.0f, 5.5f)
                curveTo(12.72f, 5.5f, 13.64f, 5.4f, 14.13f, 4.88f)
                lineTo(13.0f, 1.75f)
                curveTo(12.82f, 1.25f, 12.42f, 1.0f, 12.0f, 1.0f)
                moveTo(8.44f, 8.91f)
                lineTo(7.0f, 12.91f)
                curveTo(8.07f, 14.27f, 10.26f, 14.5f, 12.0f, 14.5f)
                curveTo(13.74f, 14.5f, 15.93f, 14.27f, 17.0f, 12.91f)
                lineTo(15.56f, 8.91f)
                curveTo(14.76f, 9.83f, 13.24f, 10.0f, 12.0f, 10.0f)
                curveTo(10.76f, 10.0f, 9.24f, 9.83f, 8.44f, 8.91f)
                moveTo(5.44f, 15.0f)
                curveTo(4.62f, 15.0f, 3.76f, 15.65f, 3.53f, 16.44f)
                lineTo(2.06f, 21.56f)
                curveTo(1.84f, 22.35f, 2.3f, 23.0f, 3.13f, 23.0f)
                horizontalLineTo(20.88f)
                curveTo(21.7f, 23.0f, 22.16f, 22.35f, 21.94f, 21.56f)
                lineTo(20.47f, 16.44f)
                curveTo(20.24f, 15.65f, 19.38f, 15.0f, 18.56f, 15.0f)
                horizontalLineTo(17.75f)
                lineTo(18.09f, 15.97f)
                curveTo(18.21f, 16.29f, 18.29f, 16.69f, 18.09f, 16.97f)
                curveTo(16.84f, 18.7f, 14.14f, 19.0f, 12.0f, 19.0f)
                curveTo(9.86f, 19.0f, 7.16f, 18.7f, 5.91f, 16.97f)
                curveTo(5.71f, 16.69f, 5.79f, 16.29f, 5.91f, 15.97f)
                lineTo(6.25f, 15.0f)
                horizontalLineTo(5.44f)
                close()
            }
        }
        .build()
        return _vlc!!
    }

private var _vlc: ImageVector? = null
