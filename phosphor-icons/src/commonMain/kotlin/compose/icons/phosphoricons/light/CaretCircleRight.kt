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

public val LightGroup.CaretCircleRight: ImageVector
    get() {
        if (_caretCircleRight != null) {
            return _caretCircleRight!!
        }
        _caretCircleRight = Builder(name = "CaretCircleRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(160.0f, 123.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 9.0f)
                lineToRelative(-40.0f, 36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.0f, 1.5f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -4.5f, -2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.5f, -8.5f)
                lineTo(147.0f, 128.0f)
                lineTo(112.0f, 96.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.0f, -9.0f)
                close()
            }
        }
        .build()
        return _caretCircleRight!!
    }

private var _caretCircleRight: ImageVector? = null
