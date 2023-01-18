package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.CaretDoubleDown: ImageVector
    get() {
        if (_caretDoubleDown != null) {
            return _caretDoubleDown!!
        }
        _caretDoubleDown = Builder(name = "CaretDoubleDown", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.4f, 124.9f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.7f, 8.8f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.7f, -8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 120.0f)
                horizontalLineToRelative(60.7f)
                lineTo(42.3f, 53.7f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.7f, -8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 40.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.4f, 4.9f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.7f, 8.8f)
                lineTo(147.3f, 120.0f)
                horizontalLineTo(208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 215.4f, 124.9f)
                close()
            }
        }
        .build()
        return _caretDoubleDown!!
    }

private var _caretDoubleDown: ImageVector? = null
