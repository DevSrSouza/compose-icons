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

public val OutlineGroup.KeyboardDoubleArrowRight: ImageVector
    get() {
        if (_keyboardDoubleArrowRight != null) {
            return _keyboardDoubleArrowRight!!
        }
        _keyboardDoubleArrowRight = Builder(name = "KeyboardDoubleArrowRight", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.41f, 6.0f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.58f, 4.59f)
                lineToRelative(-4.58f, 4.59f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(6.0f, -6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.58f, 4.59f)
                lineToRelative(-4.58f, 4.59f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _keyboardDoubleArrowRight!!
    }

private var _keyboardDoubleArrowRight: ImageVector? = null
