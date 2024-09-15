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

public val SolidGroup.CaretUp: ImageVector
    get() {
        if (_caretUp != null) {
            return _caretUp!!
        }
        _caretUp = Builder(name = "CaretUp", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.66f, 352.0f)
                horizontalLineTo(31.34f)
                curveToRelative(-17.82f, 0.0f, -26.74f, -21.54f, -14.14f, -34.14f)
                lineToRelative(128.66f, -128.66f)
                curveToRelative(7.81f, -7.81f, 20.47f, -7.81f, 28.28f, 0.0f)
                lineToRelative(128.66f, 128.66f)
                curveToRelative(12.6f, 12.6f, 3.68f, 34.14f, -14.14f, 34.14f)
                close()
            }
        }
        .build()
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
