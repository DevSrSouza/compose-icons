package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.FileImageSolid: ImageVector
    get() {
        if (_fileImageSolid != null) {
            return _fileImageSolid!!
        }
        _fileImageSolid = Builder(name = "FileImageSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 9.5938f)
                lineTo(25.7188f, 9.2813f)
                lineTo(19.7188f, 3.2813f)
                lineTo(19.4063f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                lineTo(18.0f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                close()
                moveTo(20.0f, 6.4375f)
                lineTo(22.5625f, 9.0f)
                lineTo(20.0f, 9.0f)
                close()
                moveTo(21.0938f, 14.0f)
                curveTo(20.543f, 14.0f, 20.0938f, 14.4492f, 20.0938f, 15.0f)
                curveTo(20.0938f, 15.5508f, 20.543f, 16.0f, 21.0938f, 16.0f)
                curveTo(21.6445f, 16.0f, 22.0938f, 15.5508f, 22.0938f, 15.0f)
                curveTo(22.0938f, 14.4492f, 21.6445f, 14.0f, 21.0938f, 14.0f)
                close()
                moveTo(14.0f, 15.5938f)
                lineTo(13.2813f, 16.2813f)
                lineTo(9.2813f, 20.2813f)
                lineTo(10.7188f, 21.7188f)
                lineTo(14.0f, 18.4375f)
                lineTo(16.2813f, 20.7188f)
                lineTo(17.0f, 21.4063f)
                lineTo(17.7188f, 20.7188f)
                lineTo(19.0f, 19.4375f)
                lineTo(21.2813f, 21.7188f)
                lineTo(22.7188f, 20.2813f)
                lineTo(19.7188f, 17.2813f)
                lineTo(19.0f, 16.5938f)
                lineTo(18.2813f, 17.2813f)
                lineTo(17.0f, 18.5625f)
                lineTo(14.7188f, 16.2813f)
                close()
            }
        }
        .build()
        return _fileImageSolid!!
    }

private var _fileImageSolid: ImageVector? = null
