package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.KeyboardDoubleArrowDown: ImageVector
    get() {
        if (_keyboardDoubleArrowDown != null) {
            return _keyboardDoubleArrowDown!!
        }
        _keyboardDoubleArrowDown = Builder(name = "KeyboardDoubleArrowDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.41f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-4.59f, 4.58f)
                lineToRelative(-4.59f, -4.58f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(6.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-4.59f, 4.58f)
                lineToRelative(-4.59f, -4.58f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _keyboardDoubleArrowDown!!
    }

private var _keyboardDoubleArrowDown: ImageVector? = null
