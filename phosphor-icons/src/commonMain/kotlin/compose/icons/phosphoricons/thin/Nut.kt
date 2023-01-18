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

public val ThinGroup.Nut: ImageVector
    get() {
        if (_nut != null) {
            return _nut!!
        }
        _nut = Builder(name = "Nut", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.9f, 70.2f)
                lineToRelative(-84.0f, -47.5f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, -11.8f, 0.0f)
                lineToRelative(-84.0f, 47.5f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 32.0f, 80.7f)
                verticalLineToRelative(94.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.1f, 10.5f)
                lineToRelative(84.0f, 47.5f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, 11.8f, 0.0f)
                lineToRelative(84.0f, -47.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.1f, -10.5f)
                lineTo(224.0f, 80.7f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 217.9f, 70.2f)
                close()
                moveTo(216.0f, 175.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, 3.5f)
                lineToRelative(-84.0f, 47.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.0f, 0.0f)
                lineTo(42.0f, 178.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -3.5f)
                lineTo(40.0f, 80.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.0f, -3.5f)
                lineToRelative(84.0f, -47.5f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 4.0f, 0.0f)
                lineToRelative(84.0f, 47.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.0f, 3.5f)
                close()
                moveTo(128.0f, 88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 128.0f, 88.0f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 128.0f, 160.0f)
                close()
            }
        }
        .build()
        return _nut!!
    }

private var _nut: ImageVector? = null
