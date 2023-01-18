package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) {
            return _bugDroid!!
        }
        _bugDroid = Builder(name = "BugDroid", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 128.0f)
                horizontalLineTo(208.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -160.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(191.4f, 47.0f)
                lineToRelative(14.1f, -13.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, true, false, -11.0f, -11.8f)
                lineTo(179.2f, 36.5f)
                arcToRelative(87.7f, 87.7f, 0.0f, false, false, -102.4f, 0.0f)
                lineTo(61.5f, 22.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.0f, 11.8f)
                lineTo(64.6f, 47.0f)
                arcTo(87.7f, 87.7f, 0.0f, false, false, 40.0f, 108.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                lineTo(216.0f, 108.0f)
                arcTo(87.7f, 87.7f, 0.0f, false, false, 191.4f, 47.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, 72.0f, 72.0f)
                verticalLineToRelative(12.0f)
                lineTo(56.0f, 120.0f)
                lineTo(56.0f, 108.0f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, -72.0f, -72.0f)
                lineTo(56.0f, 136.0f)
                lineTo(200.0f, 136.0f)
                verticalLineToRelative(12.0f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(144.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 92.0f)
                close()
                moveTo(88.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 92.0f)
                close()
            }
        }
        .build()
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
