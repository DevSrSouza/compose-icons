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

public val FilledGroup.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) {
            return _flipHorizontal!!
        }
        _flipHorizontal = Builder(name = "FlipHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8369f, 19.5474f)
                curveTo(21.6522f, 19.8299f, 21.3375f, 20.0001f, 21.0f, 20.0001f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 20.0001f, 13.0f, 19.5524f, 13.0f, 19.0001f)
                lineTo(13.0f, 3.0001f)
                curveTo(13.0f, 2.5267f, 13.3319f, 2.1182f, 13.7952f, 2.0213f)
                curveTo(14.2586f, 1.9244f, 14.7264f, 2.1656f, 14.9162f, 2.5993f)
                lineTo(21.9162f, 18.5993f)
                curveTo(22.0514f, 18.9085f, 22.0216f, 19.265f, 21.8369f, 19.5474f)
                close()
                moveTo(15.0f, 7.7807f)
                verticalLineTo(18.0001f)
                horizontalLineTo(19.471f)
                lineTo(15.0f, 7.7807f)
                close()
                moveTo(2.5f, 20.0f)
                curveTo(2.3288f, 20.0f, 2.1695f, 19.9125f, 2.0778f, 19.768f)
                curveTo(1.9861f, 19.6234f, 1.9747f, 19.442f, 2.0476f, 19.2872f)
                lineTo(10.0476f, 2.2871f)
                curveTo(10.1473f, 2.0753f, 10.3806f, 1.961f, 10.6091f, 2.0121f)
                curveTo(10.8376f, 2.0632f, 11.0f, 2.2659f, 11.0f, 2.5001f)
                lineTo(11.0f, 19.5f)
                curveTo(11.0f, 19.7762f, 10.7761f, 20.0f, 10.5f, 20.0f)
                horizontalLineTo(2.5f)
                close()
            }
        }
        .build()
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
