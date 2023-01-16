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

public val MaterialDesignIcons.RollerShade: ImageVector
    get() {
        if (_rollerShade != null) {
            return _rollerShade!!
        }
        _rollerShade = Builder(name = "RollerShade", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                moveTo(6.0f, 19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.8f)
                curveTo(10.6f, 15.1f, 10.2f, 15.6f, 10.2f, 16.2f)
                curveTo(10.2f, 17.2f, 11.0f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveTo(13.8f, 17.2f, 13.8f, 16.2f)
                curveTo(13.8f, 15.6f, 13.5f, 15.1f, 13.0f, 14.8f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _rollerShade!!
    }

private var _rollerShade: ImageVector? = null
