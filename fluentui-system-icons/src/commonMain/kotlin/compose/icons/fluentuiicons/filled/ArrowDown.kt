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

public val FilledGroup.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = Builder(name = "ArrowDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7162f, 13.7045f)
                curveTo(20.1038f, 13.3111f, 20.0991f, 12.678f, 19.7057f, 12.2903f)
                curveTo(19.3123f, 11.9027f, 18.6792f, 11.9074f, 18.2915f, 12.3008f)
                lineTo(13.0002f, 17.6711f)
                verticalLineTo(4.0f)
                curveTo(13.0002f, 3.4477f, 12.5525f, 3.0f, 12.0002f, 3.0f)
                curveTo(11.4479f, 3.0f, 11.0002f, 3.4477f, 11.0002f, 4.0f)
                verticalLineTo(17.6646f)
                lineTo(5.7153f, 12.3008f)
                curveTo(5.3276f, 11.9074f, 4.6945f, 11.9027f, 4.3011f, 12.2903f)
                curveTo(3.9077f, 12.678f, 3.903f, 13.3111f, 4.2906f, 13.7045f)
                lineTo(11.113f, 20.6287f)
                curveTo(11.6026f, 21.1256f, 12.4042f, 21.1256f, 12.8938f, 20.6287f)
                lineTo(19.7162f, 13.7045f)
                close()
            }
        }
        .build()
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
