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

public val ThinGroup.ListChecks: ImageVector
    get() {
        if (_listChecks != null) {
            return _listChecks!!
        }
        _listChecks = Builder(name = "ListChecks", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(128.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 128.0f)
                close()
                moveTo(128.0f, 68.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(128.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(216.0f, 188.0f)
                lineTo(128.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(89.3f, 45.1f)
                lineToRelative(-32.0f, 29.5f)
                lineTo(42.7f, 61.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.4f, 5.8f)
                lineToRelative(17.3f, 16.0f)
                arcTo(4.3f, 4.3f, 0.0f, false, false, 57.3f, 84.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 60.0f, 82.9f)
                lineToRelative(34.7f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.4f, -5.8f)
                close()
                moveTo(89.3f, 109.1f)
                lineTo(57.3f, 138.6f)
                lineTo(42.7f, 125.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.4f, 5.8f)
                lineToRelative(17.3f, 16.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.7f, 1.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.7f, -1.1f)
                lineToRelative(34.7f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.4f, -5.8f)
                close()
                moveTo(89.3f, 173.1f)
                lineTo(57.3f, 202.6f)
                lineTo(42.7f, 189.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.4f, 5.8f)
                lineToRelative(17.3f, 16.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.7f, 1.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.7f, -1.1f)
                lineToRelative(34.7f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.4f, -5.8f)
                close()
            }
        }
        .build()
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null
