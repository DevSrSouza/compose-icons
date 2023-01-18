package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) {
            return _caretDoubleRight!!
        }
        _caretDoubleRight = Builder(name = "CaretDoubleRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.2f, 132.2f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineTo(127.5f, 128.0f)
                lineTo(51.8f, 52.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineToRelative(80.0f, 80.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 140.2f, 132.2f)
                close()
                moveTo(220.2f, 123.8f)
                lineTo(140.2f, 43.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 8.4f)
                lineTo(207.5f, 128.0f)
                lineToRelative(-75.7f, 75.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineToRelative(80.0f, -80.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 220.2f, 123.8f)
                close()
            }
        }
        .build()
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
