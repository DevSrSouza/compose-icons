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

public val FilledGroup.StyleGuide: ImageVector
    get() {
        if (_styleGuide != null) {
            return _styleGuide!!
        }
        _styleGuide = Builder(name = "StyleGuide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.4041f, 4.7225f)
                lineTo(20.1217f, 14.8647f)
                curveTo(20.5148f, 16.3318f, 19.6442f, 17.8397f, 18.1771f, 18.2328f)
                lineTo(11.8986f, 19.9151f)
                curveTo(10.4316f, 20.3082f, 8.9237f, 19.4376f, 8.5306f, 17.9706f)
                lineTo(5.813f, 7.8284f)
                curveTo(5.4199f, 6.3613f, 6.2905f, 4.8534f, 7.7575f, 4.4603f)
                lineTo(14.036f, 2.778f)
                curveTo(15.5031f, 2.3849f, 17.011f, 3.2555f, 17.4041f, 4.7225f)
                close()
                moveTo(10.9661f, 7.7417f)
                curveTo(10.8232f, 7.2082f, 10.2748f, 6.8916f, 9.7414f, 7.0346f)
                curveTo(9.2079f, 7.1775f, 8.8913f, 7.7258f, 9.0343f, 8.2593f)
                curveTo(9.1772f, 8.7928f, 9.7255f, 9.1094f, 10.259f, 8.9664f)
                curveTo(10.7925f, 8.8235f, 11.1091f, 8.2751f, 10.9661f, 7.7417f)
                close()
                moveTo(5.803f, 11.6585f)
                lineTo(7.5647f, 18.2294f)
                curveTo(7.7456f, 18.9048f, 8.0999f, 19.4875f, 8.5667f, 19.9424f)
                lineTo(8.1239f, 19.9186f)
                curveTo(6.6072f, 19.8391f, 5.4421f, 18.5452f, 5.5216f, 17.0285f)
                lineTo(5.803f, 11.6585f)
                close()
                moveTo(4.8784f, 10.1803f)
                lineTo(4.5229f, 16.9761f)
                curveTo(4.4863f, 17.6748f, 4.6434f, 18.3389f, 4.9472f, 18.9161f)
                lineTo(4.5328f, 18.7555f)
                curveTo(3.1149f, 18.2112f, 2.4067f, 16.6205f, 2.951f, 15.2026f)
                lineTo(4.8784f, 10.1803f)
                close()
            }
        }
        .build()
        return _styleGuide!!
    }

private var _styleGuide: ImageVector? = null
