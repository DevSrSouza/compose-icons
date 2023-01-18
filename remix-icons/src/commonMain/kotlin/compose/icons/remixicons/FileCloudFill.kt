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

public val RemixIcons.FileCloudFill: ImageVector
    get() {
        if (_fileCloudFill != null) {
            return _fileCloudFill!!
        }
        _fileCloudFill = Builder(name = "FileCloudFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.997f, 2.0f)
                lineTo(21.0f, 8.0f)
                lineToRelative(0.001f, 4.26f)
                arcTo(5.466f, 5.466f, 0.0f, false, false, 17.5f, 11.0f)
                lineToRelative(-0.221f, 0.004f)
                arcToRelative(5.503f, 5.503f, 0.0f, false, false, -5.127f, 4.205f)
                lineToRelative(-0.016f, 0.074f)
                lineToRelative(-0.03f, 0.02f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 10.878f, 22.0f)
                lineTo(3.993f, 22.0f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.986f, -0.876f)
                lineTo(3.0f, 21.008f)
                verticalLineTo(2.992f)
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
            }
        }
        .build()
        return _fileCloudFill!!
    }

private var _fileCloudFill: ImageVector? = null
