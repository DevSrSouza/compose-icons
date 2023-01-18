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

public val BoldGroup.FileVue: ImageVector
    get() {
        if (_fileVue != null) {
            return _fileVue!!
        }
        _fileVue = Builder(name = "FileVue", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(188.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(176.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(200.0f, 176.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(200.0f, 204.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 232.0f, 220.0f)
                close()
                moveTo(80.4f, 152.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -15.6f, 6.8f)
                lineTo(54.0f, 187.2f)
                lineTo(43.2f, 159.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -22.4f, 8.8f)
                lineToRelative(22.0f, 56.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 22.4f, 0.0f)
                lineToRelative(22.0f, -56.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 80.4f, 152.8f)
                close()
                moveTo(32.0f, 124.0f)
                lineTo(32.0f, 44.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 52.0f, 24.0f)
                lineTo(156.0f, 24.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, 8.5f, 3.5f)
                lineToRelative(56.0f, 56.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, true, 224.0f, 92.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(200.0f, 112.0f)
                lineTo(148.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(136.0f, 48.0f)
                lineTo(56.0f, 48.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(160.0f, 57.0f)
                lineTo(160.0f, 88.0f)
                horizontalLineToRelative(31.0f)
                close()
                moveTo(148.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                lineTo(160.0f, 164.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 148.0f, 152.0f)
                close()
            }
        }
        .build()
        return _fileVue!!
    }

private var _fileVue: ImageVector? = null
