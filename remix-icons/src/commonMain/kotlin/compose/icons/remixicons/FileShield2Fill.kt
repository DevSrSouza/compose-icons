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

public val RemixIcons.FileShield2Fill: ImageVector
    get() {
        if (_fileShield2Fill != null) {
            return _fileShield2Fill!!
        }
        _fileShield2Fill = Builder(name = "FileShield2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                lineTo(11.0f, 10.0f)
                verticalLineToRelative(7.382f)
                curveToRelative(0.0f, 1.563f, 0.777f, 3.023f, 2.074f, 3.892f)
                lineToRelative(1.083f, 0.726f)
                lineTo(3.993f, 22.0f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                curveTo(3.0f, 2.455f, 3.447f, 2.0f, 3.998f, 2.0f)
                horizontalLineToRelative(11.999f)
                lineTo(21.0f, 7.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.382f)
                curveToRelative(0.0f, 0.897f, -0.446f, 1.734f, -1.187f, 2.23f)
                lineTo(17.0f, 21.499f)
                lineToRelative(-2.813f, -1.885f)
                arcTo(2.685f, 2.685f, 0.0f, false, true, 13.0f, 17.383f)
                lineTo(13.0f, 12.0f)
                close()
            }
        }
        .build()
        return _fileShield2Fill!!
    }

private var _fileShield2Fill: ImageVector? = null
