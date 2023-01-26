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

public val OutlineGroup.SwitchLeft: ImageVector
    get() {
        if (_switchLeft != null) {
            return _switchLeft!!
        }
        _switchLeft = Builder(name = "SwitchLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 8.62f)
                verticalLineToRelative(6.76f)
                lineTo(5.12f, 12.0f)
                lineTo(8.5f, 8.62f)
                moveTo(10.0f, 5.0f)
                lineToRelative(-7.0f, 7.0f)
                lineToRelative(7.0f, 7.0f)
                verticalLineTo(5.0f)
                lineTo(10.0f, 5.0f)
                close()
                moveTo(14.0f, 5.0f)
                verticalLineToRelative(14.0f)
                lineToRelative(7.0f, -7.0f)
                lineTo(14.0f, 5.0f)
                close()
            }
        }
        .build()
        return _switchLeft!!
    }

private var _switchLeft: ImageVector? = null
