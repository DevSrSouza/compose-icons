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

public val FilledGroup.FlashAuto: ImageVector
    get() {
        if (_flashAuto != null) {
            return _flashAuto!!
        }
        _flashAuto = Builder(name = "FlashAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.425f, 2.8305f)
                curveTo(7.6024f, 2.3325f, 8.0739f, 2.0f, 8.6026f, 2.0f)
                horizontalLineTo(15.0562f)
                curveTo(15.9094f, 2.0f, 16.5118f, 2.8359f, 16.242f, 3.6453f)
                lineTo(14.7905f, 8.0f)
                horizontalLineTo(18.7492f)
                curveTo(19.8534f, 8.0f, 20.4153f, 9.3268f, 19.647f, 10.1198f)
                lineTo(18.9752f, 10.8132f)
                curveTo(18.2426f, 9.6434f, 16.4113f, 9.732f, 15.8682f, 11.1073f)
                lineTo(13.927f, 16.0235f)
                lineTo(8.586f, 21.536f)
                curveTo(7.5323f, 22.6236f, 5.714f, 21.6422f, 6.045f, 20.1645f)
                lineTo(7.3142f, 14.4964f)
                lineTo(5.7457f, 14.4904f)
                curveTo(4.539f, 14.4858f, 3.699f, 13.2899f, 4.1039f, 12.1532f)
                lineTo(7.425f, 2.8305f)
                close()
                moveTo(18.1935f, 11.4745f)
                lineTo(21.9432f, 20.9704f)
                curveTo(22.0953f, 21.3557f, 21.9063f, 21.7913f, 21.521f, 21.9434f)
                curveTo(21.1679f, 22.0829f, 20.7724f, 21.9357f, 20.5917f, 21.6134f)
                lineTo(20.548f, 21.5213f)
                lineTo(19.55f, 18.996f)
                horizontalLineTo(15.44f)
                lineTo(14.4439f, 21.5213f)
                curveTo(14.3044f, 21.8745f, 13.9267f, 22.0627f, 13.568f, 21.9744f)
                lineTo(13.4708f, 21.9434f)
                curveTo(13.1177f, 21.804f, 12.9294f, 21.4263f, 13.0177f, 21.0676f)
                lineTo(13.0487f, 20.9704f)
                lineTo(16.7984f, 11.4745f)
                curveTo(16.8865f, 11.2512f, 17.0551f, 11.1067f, 17.2474f, 11.041f)
                curveTo(17.4245f, 10.9806f, 17.6216f, 10.9869f, 17.7944f, 11.0601f)
                curveTo(17.9344f, 11.1194f, 18.0584f, 11.2225f, 18.143f, 11.3695f)
                lineTo(18.1935f, 11.4745f)
                close()
                moveTo(16.032f, 17.496f)
                horizontalLineTo(18.958f)
                lineTo(17.495f, 13.791f)
                lineTo(16.032f, 17.496f)
                close()
            }
        }
        .build()
        return _flashAuto!!
    }

private var _flashAuto: ImageVector? = null
