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

public val LineAwesomeIcons.FileImage: ImageVector
    get() {
        if (_fileImage != null) {
            return _fileImage!!
        }
        _fileImage = Builder(name = "FileImage", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 9.594f)
                lineTo(25.719f, 9.281f)
                lineTo(19.719f, 3.281f)
                lineTo(19.406f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                lineTo(18.0f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                close()
                moveTo(20.0f, 6.438f)
                lineTo(22.563f, 9.0f)
                lineTo(20.0f, 9.0f)
                close()
                moveTo(21.094f, 14.0f)
                curveTo(20.543f, 14.0f, 20.094f, 14.449f, 20.094f, 15.0f)
                curveTo(20.094f, 15.551f, 20.543f, 16.0f, 21.094f, 16.0f)
                curveTo(21.645f, 16.0f, 22.094f, 15.551f, 22.094f, 15.0f)
                curveTo(22.094f, 14.449f, 21.645f, 14.0f, 21.094f, 14.0f)
                close()
                moveTo(14.0f, 15.594f)
                lineTo(13.281f, 16.281f)
                lineTo(9.281f, 20.281f)
                lineTo(10.719f, 21.719f)
                lineTo(14.0f, 18.438f)
                lineTo(16.281f, 20.719f)
                lineTo(17.0f, 21.406f)
                lineTo(17.719f, 20.719f)
                lineTo(19.0f, 19.438f)
                lineTo(21.281f, 21.719f)
                lineTo(22.719f, 20.281f)
                lineTo(19.719f, 17.281f)
                lineTo(19.0f, 16.594f)
                lineTo(18.281f, 17.281f)
                lineTo(17.0f, 18.563f)
                lineTo(14.719f, 16.281f)
                close()
            }
        }
        .build()
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
