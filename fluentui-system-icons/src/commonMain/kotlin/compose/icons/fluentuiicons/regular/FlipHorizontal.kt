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

public val RegularGroup.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) {
            return _flipHorizontal!!
        }
        _flipHorizontal = Builder(name = "FlipHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8806f, 19.6561f)
                curveTo(21.7425f, 19.8705f, 21.505f, 20.0001f, 21.25f, 20.0001f)
                horizontalLineTo(13.75f)
                curveTo(13.3358f, 20.0001f, 13.0f, 19.6643f, 13.0f, 19.2501f)
                lineTo(13.0f, 2.7501f)
                curveTo(13.0f, 2.397f, 13.2462f, 2.0918f, 13.5912f, 2.0171f)
                curveTo(13.9363f, 1.9423f, 14.2867f, 2.1183f, 14.4328f, 2.4397f)
                lineTo(21.9328f, 18.9397f)
                curveTo(22.0383f, 19.1719f, 22.0186f, 19.4417f, 21.8806f, 19.6561f)
                close()
                moveTo(14.5f, 6.2125f)
                verticalLineTo(18.5001f)
                horizontalLineTo(20.0852f)
                lineTo(14.5f, 6.2125f)
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
