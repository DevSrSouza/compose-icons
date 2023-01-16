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

public val MaterialDesignIcons.UmbrellaClosed: ImageVector
    get() {
        if (_umbrellaClosed != null) {
            return _umbrellaClosed!!
        }
        _umbrellaClosed = Builder(name = "UmbrellaClosed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(11.6f, 2.0f, 11.3f, 2.2f, 11.1f, 2.6f)
                lineTo(6.5f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                curveTo(11.0f, 19.6f, 10.6f, 20.0f, 10.0f, 20.0f)
                curveTo(9.4f, 20.0f, 9.0f, 19.6f, 9.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                curveTo(7.0f, 20.7f, 8.3f, 22.0f, 10.0f, 22.0f)
                reflectiveCurveTo(13.0f, 20.7f, 13.0f, 19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.5f)
                lineTo(12.9f, 2.6f)
                curveTo(12.7f, 2.2f, 12.4f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _umbrellaClosed!!
    }

private var _umbrellaClosed: ImageVector? = null
