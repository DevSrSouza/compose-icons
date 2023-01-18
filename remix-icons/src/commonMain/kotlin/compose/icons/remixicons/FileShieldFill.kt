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

public val RemixIcons.FileShieldFill: ImageVector
    get() {
        if (_fileShieldFill != null) {
            return _fileShieldFill!!
        }
        _fileShieldFill = Builder(name = "FileShieldFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                verticalLineToRelative(13.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.007f, 22.0f)
                lineTo(3.993f, 22.0f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                curveTo(3.0f, 2.455f, 3.447f, 2.0f, 3.998f, 2.0f)
                horizontalLineToRelative(11.999f)
                lineTo(21.0f, 7.0f)
                close()
                moveTo(8.0f, 8.0f)
                verticalLineToRelative(5.6f)
                curveToRelative(0.0f, 0.85f, 0.446f, 1.643f, 1.187f, 2.114f)
                lineTo(12.0f, 17.5f)
                lineToRelative(2.813f, -1.786f)
                arcTo(2.51f, 2.51f, 0.0f, false, false, 16.0f, 13.6f)
                lineTo(16.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.6f)
                curveToRelative(0.0f, 0.158f, -0.09f, 0.318f, -0.26f, 0.426f)
                lineTo(12.0f, 15.13f)
                lineToRelative(-1.74f, -1.105f)
                curveToRelative(-0.17f, -0.108f, -0.26f, -0.268f, -0.26f, -0.426f)
                lineTo(10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _fileShieldFill!!
    }

private var _fileShieldFill: ImageVector? = null
