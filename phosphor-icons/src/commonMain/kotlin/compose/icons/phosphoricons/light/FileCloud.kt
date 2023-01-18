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

public val LightGroup.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) {
            return _fileCloud!!
        }
        _fileCloud = Builder(name = "FileCloud", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.8f, -4.3f)
                lineToRelative(-56.0f, -55.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.4f, -0.3f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.4f, -0.3f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.4f, -0.2f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.5f, -0.2f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.1f, -0.1f)
                lineTo(56.0f, 26.7f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(54.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(90.0f)
                lineTo(146.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(50.0f)
                lineTo(202.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(176.0f, 218.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 88.0f)
                close()
                moveTo(158.0f, 46.5f)
                lineTo(193.5f, 82.0f)
                lineTo(158.0f, 82.0f)
                close()
                moveTo(108.0f, 130.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, -46.6f, 32.0f)
                lineTo(60.0f, 162.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 0.0f, 68.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 0.0f, -100.0f)
                close()
                moveTo(108.0f, 218.0f)
                lineTo(60.0f, 218.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -1.6f, -43.9f)
                arcTo(38.1f, 38.1f, 0.0f, false, false, 58.0f, 180.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 38.0f, 38.0f)
                close()
            }
        }
        .build()
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
