package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.CodeOff: ImageVector
    get() {
        if (_codeOff != null) {
            return _codeOff!!
        }
        _codeOff = Builder(name = "CodeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.17f, 12.0f)
                lineToRelative(-4.58f, -4.59f)
                lineTo(16.0f, 6.0f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(-3.59f, 3.59f)
                lineTo(17.0f, 14.17f)
                lineTo(19.17f, 12.0f)
                close()
                moveTo(1.39f, 4.22f)
                lineToRelative(4.19f, 4.19f)
                lineTo(2.0f, 12.0f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.83f, 12.0f)
                lineTo(7.0f, 9.83f)
                lineToRelative(12.78f, 12.78f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                close()
            }
        }
        .build()
        return _codeOff!!
    }

private var _codeOff: ImageVector? = null
