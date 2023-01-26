package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.KeyboardDoubleArrowUp: ImageVector
    get() {
        if (_keyboardDoubleArrowUp != null) {
            return _keyboardDoubleArrowUp!!
        }
        _keyboardDoubleArrowUp = Builder(name = "KeyboardDoubleArrowUp", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 17.59f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.59f, -4.58f)
                lineToRelative(4.59f, 4.58f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.0f, -6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 11.0f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(4.59f, -4.58f)
                lineToRelative(4.59f, 4.58f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _keyboardDoubleArrowUp!!
    }

private var _keyboardDoubleArrowUp: ImageVector? = null
