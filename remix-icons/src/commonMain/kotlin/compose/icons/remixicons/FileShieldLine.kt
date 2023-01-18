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

public val RemixIcons.FileShieldLine: ImageVector
    get() {
        if (_fileShieldLine != null) {
            return _fileShieldLine!!
        }
        _fileShieldLine = Builder(name = "FileShieldLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                lineTo(14.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.62f)
                curveToRelative(0.0f, 0.844f, -0.446f, 1.633f, -1.187f, 2.101f)
                lineTo(12.0f, 17.498f)
                lineTo(9.187f, 15.72f)
                curveTo(8.446f, 15.253f, 8.0f, 14.464f, 8.0f, 13.62f)
                lineTo(8.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(21.0f, 8.0f)
                verticalLineToRelative(12.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.007f, 22.0f)
                lineTo(3.993f, 22.0f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                curveTo(3.0f, 2.455f, 3.449f, 2.0f, 4.002f, 2.0f)
                horizontalLineToRelative(10.995f)
                lineTo(21.0f, 8.0f)
                close()
                moveTo(10.0f, 13.62f)
                curveToRelative(0.0f, 0.15f, 0.087f, 0.304f, 0.255f, 0.41f)
                lineTo(12.0f, 15.132f)
                lineToRelative(1.745f, -1.102f)
                curveToRelative(0.168f, -0.106f, 0.255f, -0.26f, 0.255f, -0.41f)
                lineTo(14.0f, 10.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.62f)
                close()
            }
        }
        .build()
        return _fileShieldLine!!
    }

private var _fileShieldLine: ImageVector? = null
