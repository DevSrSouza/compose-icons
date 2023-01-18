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

public val BoldGroup.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) {
            return _gitDiff!!
        }
        _gitDiff = Builder(name = "GitDiff", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 149.8f)
                lineTo(208.0f, 119.9f)
                arcToRelative(59.3f, 59.3f, 0.0f, false, false, -17.6f, -42.4f)
                lineTo(173.0f, 60.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(144.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(132.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(156.0f, 77.0f)
                lineToRelative(17.5f, 17.4f)
                arcTo(35.9f, 35.9f, 0.0f, false, true, 184.0f, 119.9f)
                verticalLineToRelative(29.9f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 24.0f, 0.0f)
                close()
                moveTo(196.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 196.0f, 204.0f)
                close()
                moveTo(112.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(11.0f)
                lineTo(82.5f, 161.6f)
                arcTo(35.9f, 35.9f, 0.0f, false, true, 72.0f, 136.1f)
                lineTo(72.0f, 106.2f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -24.0f, 0.0f)
                verticalLineToRelative(29.9f)
                arcToRelative(59.3f, 59.3f, 0.0f, false, false, 17.6f, 42.4f)
                lineTo(83.0f, 196.0f)
                lineTo(72.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(124.0f, 168.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 112.0f, 156.0f)
                close()
                moveTo(60.0f, 52.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 44.0f, 68.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 60.0f, 52.0f)
                close()
            }
        }
        .build()
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
