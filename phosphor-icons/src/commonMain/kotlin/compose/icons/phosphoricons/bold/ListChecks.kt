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

public val BoldGroup.ListChecks: ImageVector
    get() {
        if (_listChecks != null) {
            return _listChecks!!
        }
        _listChecks = Builder(name = "ListChecks", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(136.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 128.0f)
                close()
                moveTo(136.0f, 76.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(136.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(216.0f, 180.0f)
                lineTo(136.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(83.9f, 39.2f)
                lineTo(57.3f, 63.7f)
                lineToRelative(-9.2f, -8.5f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 31.9f, 72.8f)
                lineToRelative(17.3f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.3f, 0.0f)
                lineToRelative(34.6f, -32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 83.9f, 39.2f)
                close()
                moveTo(83.9f, 103.2f)
                lineTo(57.3f, 127.7f)
                lineToRelative(-9.2f, -8.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.2f, 17.6f)
                lineToRelative(17.3f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.3f, 0.0f)
                lineToRelative(34.6f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -16.2f, -17.6f)
                close()
                moveTo(83.9f, 167.2f)
                lineTo(57.3f, 191.7f)
                lineToRelative(-9.2f, -8.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.2f, 17.6f)
                lineToRelative(17.3f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.3f, 0.0f)
                lineToRelative(34.6f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -16.2f, -17.6f)
                close()
            }
        }
        .build()
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null
