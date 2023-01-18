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

public val FilledGroup.Password: ImageVector
    get() {
        if (_password != null) {
            return _password!!
        }
        _password = Builder(name = "Password", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2492f, 5.0f)
                curveTo(3.454f, 5.0f, 2.0f, 6.4554f, 2.0f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(2.0f, 17.5449f, 3.4551f, 19.0f, 5.25f, 19.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 19.0f, 22.0f, 17.5449f, 22.0f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(22.0f, 6.4554f, 20.546f, 5.0f, 18.7508f, 5.0f)
                horizontalLineTo(5.2492f)
                close()
                moveTo(6.2802f, 10.2195f)
                lineTo(7.0002f, 10.9392f)
                lineTo(7.7197f, 10.2197f)
                curveTo(8.0126f, 9.9268f, 8.4874f, 9.9268f, 8.7803f, 10.2197f)
                curveTo(9.0732f, 10.5126f, 9.0732f, 10.9874f, 8.7803f, 11.2803f)
                lineTo(8.0611f, 11.9996f)
                lineTo(8.7802f, 12.7184f)
                curveTo(9.0732f, 13.0112f, 9.0733f, 13.4861f, 8.7805f, 13.779f)
                curveTo(8.4876f, 14.072f, 8.0128f, 14.0721f, 7.7198f, 13.7793f)
                lineTo(7.0004f, 13.0602f)
                lineTo(6.2803f, 13.7803f)
                curveTo(5.9874f, 14.0732f, 5.5126f, 14.0732f, 5.2197f, 13.7803f)
                curveTo(4.9268f, 13.4874f, 4.9268f, 13.0126f, 5.2197f, 12.7197f)
                lineTo(5.9395f, 11.9998f)
                lineTo(5.2198f, 11.2805f)
                curveTo(4.9268f, 10.9876f, 4.9267f, 10.5128f, 5.2195f, 10.2198f)
                curveTo(5.5124f, 9.9268f, 5.9872f, 9.9267f, 6.2802f, 10.2195f)
                close()
                moveTo(11.7802f, 10.2195f)
                lineTo(12.5002f, 10.9392f)
                lineTo(13.2197f, 10.2197f)
                curveTo(13.5126f, 9.9268f, 13.9874f, 9.9268f, 14.2803f, 10.2197f)
                curveTo(14.5732f, 10.5126f, 14.5732f, 10.9874f, 14.2803f, 11.2803f)
                lineTo(13.5611f, 11.9996f)
                lineTo(14.2802f, 12.7184f)
                curveTo(14.5732f, 13.0112f, 14.5733f, 13.4861f, 14.2805f, 13.779f)
                curveTo(13.9876f, 14.072f, 13.5128f, 14.0721f, 13.2198f, 13.7793f)
                lineTo(12.5004f, 13.0602f)
                lineTo(11.7803f, 13.7803f)
                curveTo(11.4874f, 14.0732f, 11.0126f, 14.0732f, 10.7197f, 13.7803f)
                curveTo(10.4268f, 13.4874f, 10.4268f, 13.0126f, 10.7197f, 12.7197f)
                lineTo(11.4395f, 11.9998f)
                lineTo(10.7198f, 11.2805f)
                curveTo(10.4268f, 10.9876f, 10.4267f, 10.5128f, 10.7195f, 10.2198f)
                curveTo(11.0124f, 9.9268f, 11.4872f, 9.9267f, 11.7802f, 10.2195f)
                close()
                moveTo(15.75f, 14.25f)
                curveTo(15.75f, 13.8358f, 16.0858f, 13.5f, 16.5f, 13.5f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 13.5f, 19.0f, 13.8358f, 19.0f, 14.25f)
                curveTo(19.0f, 14.6642f, 18.6642f, 15.0f, 18.25f, 15.0f)
                horizontalLineTo(16.5f)
                curveTo(16.0858f, 15.0f, 15.75f, 14.6642f, 15.75f, 14.25f)
                close()
            }
        }
        .build()
        return _password!!
    }

private var _password: ImageVector? = null
