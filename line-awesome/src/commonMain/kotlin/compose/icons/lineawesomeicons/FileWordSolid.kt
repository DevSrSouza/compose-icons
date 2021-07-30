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

public val LineAwesomeIcons.FileWordSolid: ImageVector
    get() {
        if (_fileWordSolid != null) {
            return _fileWordSolid!!
        }
        _fileWordSolid = Builder(name = "FileWordSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(24.0f, 5.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                close()
                moveTo(18.0f, 12.0f)
                lineTo(18.0f, 18.5f)
                curveTo(18.0f, 18.7148f, 17.7148f, 19.0f, 17.5f, 19.0f)
                curveTo(17.457f, 19.0f, 17.5195f, 19.0469f, 17.4375f, 18.9375f)
                curveTo(17.3555f, 18.8281f, 17.2305f, 18.5508f, 17.1563f, 18.25f)
                curveTo(17.0078f, 17.6523f, 17.0f, 17.0f, 17.0f, 17.0f)
                lineTo(17.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(15.0f, 19.5f)
                curveTo(15.0f, 19.7148f, 14.7148f, 20.0f, 14.5f, 20.0f)
                curveTo(14.2852f, 20.0f, 14.0f, 19.7148f, 14.0f, 19.5f)
                lineTo(14.0f, 13.0f)
                lineTo(10.0f, 13.0f)
                lineTo(10.0f, 15.0f)
                lineTo(12.0f, 15.0f)
                lineTo(12.0f, 19.5f)
                curveTo(12.0f, 20.8828f, 13.1172f, 22.0f, 14.5f, 22.0f)
                curveTo(15.4844f, 22.0f, 16.1875f, 21.3555f, 16.5938f, 20.5313f)
                curveTo(16.8945f, 20.7188f, 17.1133f, 21.0f, 17.5f, 21.0f)
                curveTo(18.8828f, 21.0f, 20.0f, 19.8828f, 20.0f, 18.5f)
                lineTo(20.0f, 14.0f)
                lineTo(22.0f, 14.0f)
                lineTo(22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _fileWordSolid!!
    }

private var _fileWordSolid: ImageVector? = null
