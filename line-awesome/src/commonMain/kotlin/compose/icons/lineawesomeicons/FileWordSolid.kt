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
                curveTo(18.0f, 18.715f, 17.715f, 19.0f, 17.5f, 19.0f)
                curveTo(17.457f, 19.0f, 17.52f, 19.047f, 17.438f, 18.938f)
                curveTo(17.355f, 18.828f, 17.23f, 18.551f, 17.156f, 18.25f)
                curveTo(17.008f, 17.652f, 17.0f, 17.0f, 17.0f, 17.0f)
                lineTo(17.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(15.0f, 19.5f)
                curveTo(15.0f, 19.715f, 14.715f, 20.0f, 14.5f, 20.0f)
                curveTo(14.285f, 20.0f, 14.0f, 19.715f, 14.0f, 19.5f)
                lineTo(14.0f, 13.0f)
                lineTo(10.0f, 13.0f)
                lineTo(10.0f, 15.0f)
                lineTo(12.0f, 15.0f)
                lineTo(12.0f, 19.5f)
                curveTo(12.0f, 20.883f, 13.117f, 22.0f, 14.5f, 22.0f)
                curveTo(15.484f, 22.0f, 16.188f, 21.355f, 16.594f, 20.531f)
                curveTo(16.895f, 20.719f, 17.113f, 21.0f, 17.5f, 21.0f)
                curveTo(18.883f, 21.0f, 20.0f, 19.883f, 20.0f, 18.5f)
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
