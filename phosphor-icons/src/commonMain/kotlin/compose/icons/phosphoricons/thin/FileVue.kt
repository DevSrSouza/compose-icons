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

public val ThinGroup.FileVue: ImageVector
    get() {
        if (_fileVue != null) {
            return _fileVue!!
        }
        _fileVue = Builder(name = "FileVue", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 172.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(184.0f, 196.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(180.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(176.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(85.5f, 164.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.2f, 2.2f)
                lineTo(64.0f, 205.6f)
                lineTo(47.7f, 166.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.4f, 3.0f)
                lineToRelative(20.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.4f, 0.0f)
                lineToRelative(20.0f, -48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 85.5f, 164.3f)
                close()
                moveTo(148.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(30.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -28.0f, 0.0f)
                lineTo(116.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(30.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f)
                lineTo(152.0f, 168.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 148.0f, 164.0f)
                close()
                moveTo(212.0f, 88.1f)
                lineTo(212.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(204.0f, 92.0f)
                lineTo(152.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(148.0f, 36.0f)
                lineTo(56.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(44.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 28.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 2.8f, 1.2f)
                lineToRelative(56.0f, 55.9f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 212.0f, 88.0f)
                close()
                moveTo(156.0f, 84.0f)
                horizontalLineToRelative(42.3f)
                lineTo(156.0f, 41.7f)
                close()
            }
        }
        .build()
        return _fileVue!!
    }

private var _fileVue: ImageVector? = null
