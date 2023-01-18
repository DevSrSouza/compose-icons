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

public val FillGroup.CaretCircleRight: ImageVector
    get() {
        if (_caretCircleRight != null) {
            return _caretCircleRight!!
        }
        _caretCircleRight = Builder(name = "CaretCircleRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(161.4f, 133.9f)
                lineTo(121.4f, 169.9f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 116.0f, 172.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.9f, -2.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.5f, -11.3f)
                lineTo(144.0f, 128.0f)
                lineTo(110.6f, 97.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.8f, -11.8f)
                lineToRelative(40.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.8f)
                close()
            }
        }
        .build()
        return _caretCircleRight!!
    }

private var _caretCircleRight: ImageVector? = null
