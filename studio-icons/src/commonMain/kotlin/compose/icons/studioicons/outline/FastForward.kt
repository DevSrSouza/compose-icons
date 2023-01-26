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

public val OutlineGroup.FastForward: ImageVector
    get() {
        if (_fastForward != null) {
            return _fastForward!!
        }
        _fastForward = Builder(name = "FastForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.86f)
                lineTo(18.03f, 12.0f)
                lineTo(15.0f, 14.14f)
                verticalLineTo(9.86f)
                moveTo(6.0f, 9.86f)
                lineTo(9.03f, 12.0f)
                lineTo(6.0f, 14.14f)
                verticalLineTo(9.86f)
                moveTo(13.0f, 6.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(8.5f, -6.0f)
                lineTo(13.0f, 6.0f)
                lineTo(13.0f, 6.0f)
                close()
                moveTo(4.0f, 6.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(8.5f, -6.0f)
                lineTo(4.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                close()
            }
        }
        .build()
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
