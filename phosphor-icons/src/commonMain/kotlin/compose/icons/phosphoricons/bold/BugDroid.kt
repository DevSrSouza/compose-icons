package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) {
            return _bugDroid!!
        }
        _bugDroid = Builder(name = "BugDroid", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.1f, 84.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 140.1f, 84.0f)
                close()
                moveTo(100.1f, 100.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 100.1f, 100.0f)
                close()
                moveTo(220.0f, 108.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -184.0f, 0.0f)
                lineTo(36.0f, 108.0f)
                arcTo(91.6f, 91.6f, 0.0f, false, true, 59.0f, 47.2f)
                lineTo(47.8f, 36.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 64.2f, 19.2f)
                lineToRelative(13.0f, 12.1f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 101.6f, 0.0f)
                lineToRelative(13.0f, -12.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 16.4f, 17.6f)
                lineTo(197.0f, 47.2f)
                arcTo(91.6f, 91.6f, 0.0f, false, true, 220.0f, 108.0f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, false, -68.0f, 68.0f)
                verticalLineToRelative(8.0f)
                lineTo(196.0f, 116.0f)
                verticalLineToRelative(-8.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, false, 128.0f, 40.0f)
                close()
                moveTo(196.0f, 148.0f)
                verticalLineToRelative(-8.0f)
                lineTo(60.0f, 140.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 136.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
