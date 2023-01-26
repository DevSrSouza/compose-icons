package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.KeyboardControlKey: ImageVector
    get() {
        if (_keyboardControlKey != null) {
            return _keyboardControlKey!!
        }
        _keyboardControlKey = Builder(name = "KeyboardControlKey", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(5.59f, -5.58f)
                lineToRelative(5.59f, 5.58f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _keyboardControlKey!!
    }

private var _keyboardControlKey: ImageVector? = null
