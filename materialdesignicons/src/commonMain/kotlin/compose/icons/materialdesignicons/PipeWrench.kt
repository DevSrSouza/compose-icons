package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.PipeWrench: ImageVector
    get() {
        if (_pipeWrench != null) {
            return _pipeWrench!!
        }
        _pipeWrench = Builder(name = "PipeWrench", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.17f, 5.63f)
                lineTo(14.06f, 7.78f)
                lineTo(11.91f, 5.63f)
                lineTo(16.17f, 1.41f)
                lineTo(19.69f, 4.92f)
                curveTo(20.86f, 6.09f, 20.86f, 8.0f, 19.69f, 9.19f)
                lineTo(16.17f, 5.63f)
                moveTo(4.83f, 12.7f)
                lineTo(7.0f, 14.81f)
                lineTo(10.5f, 11.3f)
                lineTo(8.39f, 9.19f)
                lineTo(4.83f, 12.7f)
                moveTo(15.47f, 7.78f)
                lineTo(19.0f, 11.3f)
                lineTo(17.58f, 12.7f)
                lineTo(16.88f, 12.0f)
                lineTo(6.23f, 22.59f)
                lineTo(3.42f, 19.78f)
                lineTo(11.91f, 11.3f)
                lineTo(7.69f, 7.03f)
                lineTo(9.8f, 4.92f)
                lineTo(14.06f, 9.19f)
                lineTo(15.47f, 7.78f)
                close()
            }
        }
        .build()
        return _pipeWrench!!
    }

private var _pipeWrench: ImageVector? = null
