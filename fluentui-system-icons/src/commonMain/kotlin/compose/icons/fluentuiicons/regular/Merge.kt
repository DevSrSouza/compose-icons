package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Merge: ImageVector
    get() {
        if (_merge != null) {
            return _merge!!
        }
        _merge = Builder(name = "Merge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.75f)
                curveTo(3.0f, 6.3358f, 3.3358f, 6.0f, 3.75f, 6.0f)
                horizontalLineTo(7.0074f)
                curveTo(8.0019f, 6.0f, 8.9558f, 6.3951f, 9.659f, 7.0984f)
                lineTo(12.6088f, 10.0481f)
                curveTo(13.2183f, 10.6576f, 14.0449f, 11.0f, 14.9069f, 11.0f)
                horizontalLineTo(19.4379f)
                lineTo(15.7196f, 7.2802f)
                curveTo(15.4267f, 6.9873f, 15.4268f, 6.5124f, 15.7198f, 6.2196f)
                curveTo(16.0127f, 5.9267f, 16.4876f, 5.9268f, 16.7804f, 6.2198f)
                lineTo(21.7785f, 11.2198f)
                curveTo(22.0713f, 11.5126f, 22.0713f, 11.9874f, 21.7785f, 12.2802f)
                lineTo(16.7804f, 17.2802f)
                curveTo(16.4876f, 17.5732f, 16.0127f, 17.5733f, 15.7198f, 17.2804f)
                curveTo(15.4268f, 16.9876f, 15.4267f, 16.5127f, 15.7196f, 16.2198f)
                lineTo(19.4379f, 12.5f)
                horizontalLineTo(14.9672f)
                curveTo(14.0764f, 12.5f, 13.2246f, 12.8657f, 12.611f, 13.5116f)
                lineTo(9.9308f, 16.3328f)
                curveTo(9.2228f, 17.0781f, 8.24f, 17.5f, 7.2121f, 17.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 17.5f, 3.0f, 17.1642f, 3.0f, 16.75f)
                curveTo(3.0f, 16.3358f, 3.3358f, 16.0f, 3.75f, 16.0f)
                horizontalLineTo(7.2121f)
                curveTo(7.8288f, 16.0f, 8.4185f, 15.7468f, 8.8433f, 15.2997f)
                lineTo(11.5235f, 12.4784f)
                curveTo(11.7811f, 12.2073f, 12.0674f, 11.9699f, 12.3755f, 11.7693f)
                curveTo(12.0783f, 11.5821f, 11.8005f, 11.3611f, 11.5481f, 11.1088f)
                lineTo(8.5983f, 8.159f)
                curveTo(8.1764f, 7.7371f, 7.6041f, 7.5f, 7.0074f, 7.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 7.5f, 3.0f, 7.1642f, 3.0f, 6.75f)
                close()
            }
        }
        .build()
        return _merge!!
    }

private var _merge: ImageVector? = null
