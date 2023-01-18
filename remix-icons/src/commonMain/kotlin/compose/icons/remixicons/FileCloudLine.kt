package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.FileCloudLine: ImageVector
    get() {
        if (_fileCloudLine != null) {
            return _fileCloudLine!!
        }
        _fileCloudLine = Builder(name = "FileCloudLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.997f, 2.0f)
                lineTo(21.0f, 8.0f)
                lineToRelative(0.001f, 4.26f)
                arcToRelative(5.471f, 5.471f, 0.0f, false, false, -2.0f, -1.053f)
                lineTo(19.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(14.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(5.06f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, false, 0.817f, 2.0f)
                lineTo(3.993f, 22.0f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.986f, -0.876f)
                lineTo(3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                curveToRelative(0.0f, -0.498f, 0.387f, -0.927f, 0.885f, -0.985f)
                lineTo(4.002f, 2.0f)
                horizontalLineToRelative(10.995f)
                close()
                moveTo(17.5f, 13.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                lineToRelative(-0.001f, 0.103f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.581f, 5.392f)
                lineTo(20.25f, 22.0f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(-0.168f, -0.005f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.579f, -5.392f)
                lineTo(14.0f, 16.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                close()
                moveTo(17.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.473f, 1.215f)
                lineToRelative(-0.02f, 0.14f)
                lineTo(16.0f, 16.5f)
                verticalLineToRelative(1.62f)
                lineToRelative(-1.444f, 0.406f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.08f, 1.466f)
                lineToRelative(0.109f, 0.008f)
                horizontalLineToRelative(5.51f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.19f, -1.474f)
                lineToRelative(-1.013f, -0.283f)
                lineTo(19.0f, 18.12f)
                lineTo(19.0f, 16.5f)
                lineToRelative(-0.007f, -0.144f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 15.0f)
                close()
            }
        }
        .build()
        return _fileCloudLine!!
    }

private var _fileCloudLine: ImageVector? = null
