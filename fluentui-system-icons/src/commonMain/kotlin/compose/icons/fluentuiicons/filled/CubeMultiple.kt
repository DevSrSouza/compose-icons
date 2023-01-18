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

public val FilledGroup.CubeMultiple: ImageVector
    get() {
        if (_cubeMultiple != null) {
            return _cubeMultiple!!
        }
        _cubeMultiple = Builder(name = "CubeMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5186f, 4.2508f)
                curveTo(11.4779f, 3.9164f, 12.5221f, 3.9164f, 13.4814f, 4.2508f)
                curveTo(13.5172f, 4.2626f, 13.5529f, 4.2748f, 13.5884f, 4.2874f)
                lineTo(19.5032f, 6.3862f)
                curveTo(19.8787f, 6.5194f, 20.2151f, 6.7223f, 20.5f, 6.9772f)
                verticalLineTo(6.5621f)
                curveTo(20.5f, 5.7154f, 19.9668f, 4.9604f, 19.1688f, 4.6772f)
                lineTo(14.0065f, 2.8454f)
                curveTo(12.7085f, 2.3849f, 11.2915f, 2.3849f, 9.9935f, 2.8454f)
                lineTo(4.8312f, 4.6772f)
                curveTo(4.0332f, 4.9604f, 3.5f, 5.7154f, 3.5f, 6.5621f)
                verticalLineTo(6.9772f)
                curveTo(3.7849f, 6.7223f, 4.1213f, 6.5194f, 4.4968f, 6.3862f)
                lineTo(10.4116f, 4.2874f)
                curveTo(10.4471f, 4.2748f, 10.4828f, 4.2626f, 10.5186f, 4.2508f)
                close()
                moveTo(13.254f, 5.2287f)
                curveTo(12.4428f, 4.9409f, 11.5572f, 4.9409f, 10.746f, 5.2287f)
                lineTo(4.8312f, 7.3275f)
                curveTo(4.0332f, 7.6107f, 3.5f, 8.3656f, 3.5f, 9.2124f)
                verticalLineTo(17.4467f)
                curveTo(3.5f, 18.2935f, 4.0332f, 19.0484f, 4.8312f, 19.3316f)
                lineTo(10.746f, 21.4304f)
                curveTo(11.5572f, 21.7183f, 12.4428f, 21.7183f, 13.254f, 21.4304f)
                lineTo(19.1688f, 19.3316f)
                curveTo(19.9668f, 19.0484f, 20.5f, 18.2935f, 20.5f, 17.4467f)
                verticalLineTo(9.2124f)
                curveTo(20.5f, 8.3656f, 19.9668f, 7.6107f, 19.1688f, 7.3275f)
                lineTo(13.254f, 5.2287f)
                close()
                moveTo(6.4494f, 10.1115f)
                curveTo(6.588f, 9.7211f, 7.0167f, 9.517f, 7.4071f, 9.6555f)
                lineTo(12.0f, 11.2852f)
                lineTo(16.5929f, 9.6555f)
                curveTo(16.9833f, 9.517f, 17.4121f, 9.7211f, 17.5506f, 10.1115f)
                curveTo(17.6891f, 10.5019f, 17.4849f, 10.9306f, 17.0946f, 11.0691f)
                lineTo(12.75f, 12.6107f)
                verticalLineTo(17.3311f)
                curveTo(12.75f, 17.7453f, 12.4142f, 18.0811f, 12.0f, 18.0811f)
                curveTo(11.5858f, 18.0811f, 11.25f, 17.7453f, 11.25f, 17.3311f)
                verticalLineTo(12.6107f)
                lineTo(6.9054f, 11.0691f)
                curveTo(6.5151f, 10.9306f, 6.3109f, 10.5019f, 6.4494f, 10.1115f)
                close()
            }
        }
        .build()
        return _cubeMultiple!!
    }

private var _cubeMultiple: ImageVector? = null
