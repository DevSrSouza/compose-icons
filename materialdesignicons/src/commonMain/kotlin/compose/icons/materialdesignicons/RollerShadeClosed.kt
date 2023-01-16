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

public val MaterialDesignIcons.RollerShadeClosed: ImageVector
    get() {
        if (_rollerShadeClosed != null) {
            return _rollerShadeClosed!!
        }
        _rollerShadeClosed = Builder(name = "RollerShadeClosed", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.25f)
                curveTo(10.25f, 21.97f, 11.03f, 22.75f, 12.0f, 22.75f)
                reflectiveCurveTo(13.75f, 21.97f, 13.75f, 21.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                moveTo(6.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                moveTo(13.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _rollerShadeClosed!!
    }

private var _rollerShadeClosed: ImageVector? = null
