package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CaretRight: ImageVector
    get() {
        if (_caretRight != null) {
            return _caretRight!!
        }
        _caretRight = Builder(name = "CaretRight", defaultWidth = 192.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 192.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 384.662f)
                verticalLineTo(127.338f)
                curveToRelative(0.0f, -17.818f, 21.543f, -26.741f, 34.142f, -14.142f)
                lineToRelative(128.662f, 128.662f)
                curveToRelative(7.81f, 7.81f, 7.81f, 20.474f, 0.0f, 28.284f)
                lineTo(34.142f, 398.804f)
                curveTo(21.543f, 411.404f, 0.0f, 402.48f, 0.0f, 384.662f)
                close()
            }
        }
        .build()
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
