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

public val FilledGroup.SoundSource: ImageVector
    get() {
        if (_soundSource != null) {
            return _soundSource!!
        }
        _soundSource = Builder(name = "SoundSource", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 12.0f)
                curveTo(3.5f, 7.3056f, 7.3056f, 3.5f, 12.0f, 3.5f)
                curveTo(16.6944f, 3.5f, 20.5f, 7.3056f, 20.5f, 12.0f)
                curveTo(20.5f, 14.2167f, 19.6515f, 16.2352f, 18.2615f, 17.7484f)
                lineTo(19.2543f, 18.883f)
                curveTo(20.9559f, 17.0901f, 22.0f, 14.667f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 14.667f, 3.0441f, 17.0902f, 4.7458f, 18.8831f)
                lineTo(5.7385f, 17.7485f)
                curveTo(4.3485f, 16.2352f, 3.5f, 14.2167f, 3.5f, 12.0f)
                close()
                moveTo(19.25f, 12.125f)
                curveTo(19.25f, 13.9331f, 18.5765f, 15.5838f, 17.4667f, 16.8401f)
                lineTo(16.4686f, 15.6993f)
                curveTo(17.2692f, 14.7276f, 17.75f, 13.4824f, 17.75f, 12.125f)
                curveTo(17.75f, 9.0184f, 15.2316f, 6.5f, 12.125f, 6.5f)
                curveTo(9.0184f, 6.5f, 6.5f, 9.0184f, 6.5f, 12.125f)
                curveTo(6.5f, 13.4137f, 6.9334f, 14.6013f, 7.6624f, 15.5498f)
                lineTo(6.6594f, 16.6961f)
                curveTo(5.6235f, 15.4589f, 5.0f, 13.8648f, 5.0f, 12.125f)
                curveTo(5.0f, 8.19f, 8.19f, 5.0f, 12.125f, 5.0f)
                curveTo(16.06f, 5.0f, 19.25f, 8.19f, 19.25f, 12.125f)
                close()
                moveTo(16.25f, 12.0f)
                curveTo(16.25f, 12.9395f, 15.9452f, 13.8078f, 15.429f, 14.5113f)
                lineTo(14.4028f, 13.3385f)
                curveTo(14.624f, 12.9424f, 14.75f, 12.4859f, 14.75f, 12.0f)
                curveTo(14.75f, 10.4812f, 13.5188f, 9.25f, 12.0f, 9.25f)
                curveTo(10.4812f, 9.25f, 9.25f, 10.4812f, 9.25f, 12.0f)
                curveTo(9.25f, 12.4859f, 9.376f, 12.9424f, 9.5972f, 13.3386f)
                lineTo(8.571f, 14.5114f)
                curveTo(8.0548f, 13.8078f, 7.75f, 12.9395f, 7.75f, 12.0f)
                curveTo(7.75f, 9.6528f, 9.6528f, 7.75f, 12.0f, 7.75f)
                curveTo(14.3472f, 7.75f, 16.25f, 9.6528f, 16.25f, 12.0f)
                close()
                moveTo(12.0f, 12.5f)
                curveTo(12.2163f, 12.5f, 12.422f, 12.5934f, 12.5644f, 12.7561f)
                lineTo(19.5644f, 20.7561f)
                curveTo(19.7582f, 20.9776f, 19.8046f, 21.2919f, 19.683f, 21.5599f)
                curveTo(19.5614f, 21.8279f, 19.2943f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(4.7057f, 22.0f, 4.4386f, 21.8279f, 4.317f, 21.5599f)
                curveTo(4.1954f, 21.2919f, 4.2418f, 20.9776f, 4.4356f, 20.7561f)
                lineTo(11.4356f, 12.7561f)
                curveTo(11.578f, 12.5934f, 11.7837f, 12.5f, 12.0f, 12.5f)
                close()
            }
        }
        .build()
        return _soundSource!!
    }

private var _soundSource: ImageVector? = null
