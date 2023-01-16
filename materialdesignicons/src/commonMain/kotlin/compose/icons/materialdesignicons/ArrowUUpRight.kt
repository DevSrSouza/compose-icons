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

public val MaterialDesignIcons.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) {
            return _arrowUUpRight!!
        }
        _arrowUUpRight = Builder(name = "ArrowUUpRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 9.5f)
                lineTo(20.09f, 10.92f)
                lineTo(17.0f, 7.83f)
                verticalLineTo(13.5f)
                curveTo(17.0f, 17.09f, 14.09f, 20.0f, 10.5f, 20.0f)
                reflectiveCurveTo(4.0f, 17.09f, 4.0f, 13.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.5f)
                curveTo(6.0f, 16.0f, 8.0f, 18.0f, 10.5f, 18.0f)
                reflectiveCurveTo(15.0f, 16.0f, 15.0f, 13.5f)
                verticalLineTo(7.83f)
                lineTo(11.91f, 10.91f)
                lineTo(10.5f, 9.5f)
                lineTo(16.0f, 4.0f)
                lineTo(21.5f, 9.5f)
                close()
            }
        }
        .build()
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
