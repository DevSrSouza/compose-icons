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

public val LineAwesomeIcons.ChalkboardSolid: ImageVector
    get() {
        if (_chalkboardSolid != null) {
            return _chalkboardSolid!!
        }
        _chalkboardSolid = Builder(name = "ChalkboardSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                lineTo(5.0f, 23.0f)
                lineTo(3.0f, 23.0f)
                lineTo(3.0f, 25.0f)
                lineTo(29.0f, 25.0f)
                lineTo(29.0f, 23.0f)
                lineTo(27.0f, 23.0f)
                lineTo(27.0f, 7.0f)
                close()
                moveTo(7.0f, 9.0f)
                lineTo(25.0f, 9.0f)
                lineTo(25.0f, 23.0f)
                lineTo(7.0f, 23.0f)
                close()
                moveTo(21.281f, 12.281f)
                lineTo(17.0f, 16.563f)
                lineTo(13.719f, 13.281f)
                lineTo(13.0f, 12.594f)
                lineTo(12.281f, 13.281f)
                lineTo(9.281f, 16.281f)
                lineTo(10.719f, 17.719f)
                lineTo(13.0f, 15.438f)
                lineTo(16.281f, 18.719f)
                lineTo(17.0f, 19.406f)
                lineTo(17.719f, 18.719f)
                lineTo(22.719f, 13.719f)
                close()
                moveTo(20.0f, 20.0f)
                lineTo(19.0f, 21.0f)
                lineTo(20.0f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 20.0f)
                close()
            }
        }
        .build()
        return _chalkboardSolid!!
    }

private var _chalkboardSolid: ImageVector? = null
