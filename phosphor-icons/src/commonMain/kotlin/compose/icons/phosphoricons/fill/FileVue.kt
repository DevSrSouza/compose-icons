package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.FileVue: ImageVector
    get() {
        if (_fileVue != null) {
            return _fileVue!!
        }
        _fileVue = Builder(name = "FileVue", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 176.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(188.0f, 200.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(180.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(172.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(87.1f, 160.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.5f, 4.3f)
                lineTo(64.0f, 195.2f)
                lineTo(51.4f, 164.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.8f, 6.2f)
                lineToRelative(20.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.8f, 0.0f)
                lineToRelative(20.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 87.1f, 160.6f)
                close()
                moveTo(148.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(30.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -20.0f, 0.0f)
                lineTo(120.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(30.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 52.0f, 0.0f)
                lineTo(156.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 148.0f, 160.0f)
                close()
                moveTo(216.0f, 88.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(48.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 5.7f, 2.3f)
                lineToRelative(56.0f, 56.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 216.0f, 88.0f)
                close()
                moveTo(196.0f, 88.0f)
                lineTo(152.0f, 44.0f)
                lineTo(152.0f, 88.0f)
                close()
            }
        }
        .build()
        return _fileVue!!
    }

private var _fileVue: ImageVector? = null
