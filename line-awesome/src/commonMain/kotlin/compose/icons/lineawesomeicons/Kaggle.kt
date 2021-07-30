package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Kaggle: ImageVector
    get() {
        if (_kaggle != null) {
            return _kaggle!!
        }
        _kaggle = Builder(name = "Kaggle", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.3516f, 4.0f)
                curveTo(10.1176f, 4.0f, 10.0f, 4.1166f, 10.0f, 4.3516f)
                lineTo(10.0f, 27.6445f)
                curveTo(10.0f, 27.8785f, 10.1166f, 27.9961f, 10.3516f, 27.9961f)
                lineTo(12.6484f, 27.9961f)
                curveTo(12.8824f, 27.9961f, 13.002f, 27.8795f, 13.002f, 27.6445f)
                lineTo(13.002f, 22.8086f)
                lineTo(14.8105f, 21.0859f)
                lineTo(20.0488f, 27.75f)
                curveTo(20.1908f, 27.915f, 20.3549f, 28.0f, 20.5449f, 28.0f)
                lineTo(23.7168f, 28.0f)
                curveTo(23.8828f, 28.0f, 23.977f, 27.9524f, 24.0f, 27.8574f)
                lineTo(23.9336f, 27.498f)
                lineTo(17.0234f, 18.9102f)
                lineTo(23.6504f, 12.498f)
                curveTo(23.7734f, 12.37f, 23.7304f, 12.0f, 23.3984f, 12.0f)
                lineTo(20.1172f, 12.0f)
                curveTo(19.9512f, 12.0f, 19.7851f, 12.086f, 19.6191f, 12.252f)
                lineTo(13.0f, 18.9746f)
                lineTo(13.0f, 4.3516f)
                curveTo(13.0f, 4.1166f, 12.8834f, 4.0f, 12.6484f, 4.0f)
                lineTo(10.3516f, 4.0f)
                close()
            }
        }
        .build()
        return _kaggle!!
    }

private var _kaggle: ImageVector? = null
