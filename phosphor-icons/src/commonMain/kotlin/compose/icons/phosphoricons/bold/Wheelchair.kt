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

public val BoldGroup.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.4f, 188.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.2f, -7.6f)
                lineToRelative(-14.1f, 4.7f)
                lineToRelative(-27.4f, -54.7f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 184.0f, 124.0f)
                horizontalLineTo(108.0f)
                verticalLineTo(108.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(108.0f)
                verticalLineTo(69.7f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -24.0f, 0.0f)
                verticalLineToRelative(17.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, 90.4f, 101.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -22.2f, -9.0f)
                arcTo(52.0f, 52.0f, 0.0f, true, true, 84.0f, 112.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(80.6f)
                lineToRelative(28.7f, 57.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 212.0f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, false, 3.8f, -0.6f)
                lineToRelative(24.0f, -8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 251.4f, 188.2f)
                close()
                moveTo(96.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 32.0f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
