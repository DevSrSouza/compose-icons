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

public val FilledGroup.LocalLanguage: ImageVector
    get() {
        if (_localLanguage != null) {
            return _localLanguage!!
        }
        _localLanguage = Builder(name = "LocalLanguage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5626f, 7.5054f)
                lineTo(9.6186f, 7.6221f)
                lineTo(14.9259f, 20.6267f)
                curveTo(15.1346f, 21.1381f, 14.8892f, 21.7217f, 14.3779f, 21.9304f)
                curveTo(13.903f, 22.1242f, 13.3658f, 21.9265f, 13.1244f, 21.4879f)
                lineTo(13.0741f, 21.3824f)
                lineTo(11.693f, 17.999f)
                horizontalLineTo(5.407f)
                lineTo(3.9161f, 21.4056f)
                curveTo(3.7104f, 21.8754f, 3.1873f, 22.1078f, 2.7085f, 21.9612f)
                lineTo(2.599f, 21.9206f)
                curveTo(2.1292f, 21.715f, 1.8968f, 21.1918f, 2.0433f, 20.7131f)
                lineTo(2.0839f, 20.6036f)
                lineTo(7.7767f, 7.599f)
                curveTo(8.1134f, 6.8298f, 9.1713f, 6.8044f, 9.5626f, 7.5054f)
                close()
                moveTo(19.0f, 2.0f)
                curveTo(19.5128f, 2.0f, 19.9355f, 2.386f, 19.9933f, 2.8834f)
                lineTo(20.0f, 3.0f)
                lineTo(19.9998f, 7.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5128f, 7.0f, 21.9355f, 7.386f, 21.9933f, 7.8834f)
                lineTo(22.0f, 8.0f)
                curveTo(22.0f, 8.5128f, 21.614f, 8.9355f, 21.1166f, 8.9933f)
                lineTo(21.0f, 9.0f)
                horizontalLineTo(19.9998f)
                lineTo(20.0f, 16.0f)
                curveTo(20.0f, 16.5128f, 19.614f, 16.9355f, 19.1166f, 16.9933f)
                lineTo(19.0f, 17.0f)
                curveTo(18.4872f, 17.0f, 18.0645f, 16.614f, 18.0067f, 16.1166f)
                lineTo(18.0f, 16.0f)
                verticalLineTo(3.0f)
                curveTo(18.0f, 2.4477f, 18.4477f, 2.0f, 19.0f, 2.0f)
                close()
                moveTo(8.6605f, 10.5674f)
                lineTo(6.282f, 15.999f)
                horizontalLineTo(10.877f)
                lineTo(8.6605f, 10.5674f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5128f, 2.0f, 16.9355f, 2.386f, 16.9933f, 2.8834f)
                lineTo(17.0f, 3.0f)
                verticalLineTo(5.9749f)
                curveTo(17.0f, 8.184f, 15.2091f, 9.9749f, 13.0f, 9.9749f)
                curveTo(12.4477f, 9.9749f, 12.0f, 9.5272f, 12.0f, 8.9749f)
                curveTo(12.0f, 8.4226f, 12.4477f, 7.9749f, 13.0f, 7.9749f)
                curveTo(14.0544f, 7.9749f, 14.9182f, 7.159f, 14.9945f, 6.1241f)
                lineTo(15.0f, 5.9749f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                curveTo(10.4477f, 4.0f, 10.0f, 3.5523f, 10.0f, 3.0f)
                curveTo(10.0f, 2.4872f, 10.386f, 2.0645f, 10.8834f, 2.0067f)
                lineTo(11.0f, 2.0f)
                horizontalLineTo(16.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _localLanguage!!
    }

private var _localLanguage: ImageVector? = null
