package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.FileVue: ImageVector
    get() {
        if (_fileVue != null) {
            return _fileVue!!
        }
        _fileVue = Builder(name = "FileVue", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.0f, 174.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(186.0f, 198.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(22.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(180.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(174.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(86.3f, 162.5f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -7.8f, 3.2f)
                lineTo(64.0f, 200.4f)
                lineTo(49.5f, 165.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.0f, 4.6f)
                lineToRelative(20.0f, 48.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 11.0f, 0.0f)
                lineToRelative(20.0f, -48.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 86.3f, 162.5f)
                close()
                moveTo(148.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(30.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(118.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(30.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 48.0f, 0.0f)
                lineTo(154.0f, 168.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 148.0f, 162.0f)
                close()
                moveTo(214.0f, 88.2f)
                lineTo(214.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(202.0f, 94.0f)
                lineTo(152.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(146.0f, 38.0f)
                lineTo(56.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(42.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 56.0f, 26.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 4.2f, 1.8f)
                lineToRelative(56.0f, 55.9f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 88.0f)
                close()
                moveTo(158.0f, 82.0f)
                horizontalLineToRelative(35.5f)
                lineTo(158.0f, 46.5f)
                close()
            }
        }
        .build()
        return _fileVue!!
    }

private var _fileVue: ImageVector? = null
