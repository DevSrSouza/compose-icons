package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.WalkieTalkie: ImageVector
    get() {
        if (_walkieTalkie != null) {
            return _walkieTalkie!!
        }
        _walkieTalkie = Builder(name = "WalkieTalkie", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 7.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(9.5f)
                close()
                moveTo(8.75f, 1.0f)
                curveTo(9.1642f, 1.0f, 9.5f, 1.3358f, 9.5f, 1.75f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.75f)
                curveTo(17.9926f, 3.0f, 19.0f, 4.0074f, 19.0f, 5.25f)
                verticalLineTo(14.0f)
                curveTo(19.0f, 14.1885f, 18.929f, 14.3702f, 18.8011f, 14.5087f)
                lineTo(17.5f, 15.9182f)
                verticalLineTo(19.75f)
                curveTo(17.5f, 20.9926f, 16.4926f, 22.0f, 15.25f, 22.0f)
                horizontalLineTo(8.7511f)
                curveTo(7.5085f, 22.0f, 6.5011f, 20.9926f, 6.5011f, 19.75f)
                verticalLineTo(15.9184f)
                lineTo(5.1991f, 14.5089f)
                curveTo(5.0711f, 14.3703f, 5.0f, 14.1886f, 5.0f, 14.0f)
                verticalLineTo(5.25f)
                curveTo(5.0f, 4.0074f, 6.0074f, 3.0f, 7.25f, 3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.75f)
                curveTo(8.0f, 1.3358f, 8.3358f, 1.0f, 8.75f, 1.0f)
                close()
                moveTo(8.0f, 6.75f)
                verticalLineTo(11.25f)
                curveTo(8.0f, 11.6642f, 8.3358f, 12.0f, 8.75f, 12.0f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 12.0f, 16.0f, 11.6642f, 16.0f, 11.25f)
                verticalLineTo(6.75f)
                curveTo(16.0f, 6.3358f, 15.6642f, 6.0f, 15.25f, 6.0f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 6.0f, 8.0f, 6.3358f, 8.0f, 6.75f)
                close()
                moveTo(9.5f, 14.75f)
                curveTo(9.5f, 15.1642f, 9.8358f, 15.5f, 10.25f, 15.5f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 15.5f, 14.5f, 15.1642f, 14.5f, 14.75f)
                curveTo(14.5f, 14.3358f, 14.1642f, 14.0f, 13.75f, 14.0f)
                horizontalLineTo(10.25f)
                curveTo(9.8358f, 14.0f, 9.5f, 14.3358f, 9.5f, 14.75f)
                close()
            }
        }
        .build()
        return _walkieTalkie!!
    }

private var _walkieTalkie: ImageVector? = null
