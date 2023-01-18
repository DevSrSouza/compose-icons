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

public val ThinGroup.Checks: ImageVector
    get() {
        if (_checks != null) {
            return _checks!!
        }
        _checks = Builder(name = "Checks", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.8f, 86.8f)
                lineToRelative(-88.0f, 88.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineToRelative(-44.0f, -44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, -5.6f)
                lineTo(60.0f, 166.3f)
                lineToRelative(85.2f, -85.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, 5.6f)
                close()
                moveTo(242.8f, 81.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.6f, 0.0f)
                lineTo(152.0f, 166.3f)
                lineToRelative(-20.5f, -20.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.7f, 5.7f)
                lineToRelative(23.4f, 23.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineToRelative(88.0f, -88.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 242.8f, 81.2f)
                close()
            }
        }
        .build()
        return _checks!!
    }

private var _checks: ImageVector? = null
