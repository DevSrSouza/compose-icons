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

public val LightGroup.CaretCircleUp: ImageVector
    get() {
        if (_caretCircleUp != null) {
            return _caretCircleUp!!
        }
        _caretCircleUp = Builder(name = "CaretCircleUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.1f, 55.9f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 55.9f, 200.1f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 200.1f, 55.9f)
                close()
                moveTo(191.6f, 191.6f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 0.0f, -127.2f)
                arcTo(89.5f, 89.5f, 0.0f, false, true, 191.6f, 191.6f)
                close()
                moveTo(168.5f, 140.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.5f, 10.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -4.5f, -2.0f)
                lineTo(128.0f, 113.0f)
                lineTo(96.5f, 148.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.0f, -8.0f)
                lineToRelative(36.0f, -40.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 9.0f, 0.0f)
                close()
            }
        }
        .build()
        return _caretCircleUp!!
    }

private var _caretCircleUp: ImageVector? = null
