package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.ToggleLeft: ImageVector
    get() {
        if (_toggleLeft != null) {
            return _toggleLeft!!
        }
        _toggleLeft = Builder(name = "ToggleLeft", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 60.0f)
                lineTo(80.0f, 60.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 0.0f, 136.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 0.0f, -136.0f)
                close()
                moveTo(176.0f, 188.0f)
                lineTo(80.0f, 188.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 80.0f, 68.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 0.0f, 120.0f)
                close()
                moveTo(80.0f, 92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 80.0f, 92.0f)
                close()
                moveTo(80.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 80.0f, 156.0f)
                close()
            }
        }
        .build()
        return _toggleLeft!!
    }

private var _toggleLeft: ImageVector? = null
