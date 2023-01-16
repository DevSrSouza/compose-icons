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

public val MaterialDesignIcons.VanityLight: ImageVector
    get() {
        if (_vanityLight != null) {
            return _vanityLight!!
        }
        _vanityLight = Builder(name = "VanityLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 18.34f, 17.34f, 13.0f, 19.0f, 13.0f)
                reflectiveCurveTo(22.0f, 18.34f, 22.0f, 20.0f)
                moveTo(12.0f, 13.0f)
                curveTo(10.34f, 13.0f, 9.0f, 18.34f, 9.0f, 20.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 18.34f, 13.66f, 13.0f, 12.0f, 13.0f)
                moveTo(5.0f, 13.0f)
                curveTo(3.34f, 13.0f, 2.0f, 18.34f, 2.0f, 20.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 18.34f, 6.66f, 13.0f, 5.0f, 13.0f)
                moveTo(14.82f, 6.0f)
                curveTo(14.26f, 4.44f, 12.53f, 3.64f, 11.0f, 4.2f)
                curveTo(10.14f, 4.5f, 9.5f, 5.17f, 9.18f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.18f)
                curveTo(9.5f, 8.85f, 10.15f, 9.5f, 11.0f, 9.82f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.82f)
                curveTo(13.85f, 9.5f, 14.5f, 8.85f, 14.82f, 8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.82f)
                close()
            }
        }
        .build()
        return _vanityLight!!
    }

private var _vanityLight: ImageVector? = null
