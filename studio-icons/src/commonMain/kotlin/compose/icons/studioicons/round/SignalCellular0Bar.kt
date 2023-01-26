package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SignalCellular0Bar: ImageVector
    get() {
        if (_signalCellular0Bar != null) {
            return _signalCellular0Bar!!
        }
        _signalCellular0Bar = Builder(name = "SignalCellular0Bar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.41f, 22.0f)
                horizontalLineTo(21.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(4.41f)
                curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
                lineTo(3.71f, 20.29f)
                curveTo(3.08f, 20.92f, 3.52f, 22.0f, 4.41f, 22.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineTo(6.83f)
                lineTo(20.0f, 6.83f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _signalCellular0Bar!!
    }

private var _signalCellular0Bar: ImageVector? = null
