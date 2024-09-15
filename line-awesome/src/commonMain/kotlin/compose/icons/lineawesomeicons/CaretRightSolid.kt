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

public val LineAwesomeIcons.CaretRightSolid: ImageVector
    get() {
        if (_caretRightSolid != null) {
            return _caretRightSolid!!
        }
        _caretRightSolid = Builder(name = "CaretRightSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.594f)
                lineTo(12.0f, 27.406f)
                lineTo(13.719f, 25.719f)
                lineTo(22.719f, 16.719f)
                lineTo(23.406f, 16.0f)
                lineTo(22.719f, 15.281f)
                lineTo(13.719f, 6.281f)
                close()
                moveTo(14.0f, 9.438f)
                lineTo(20.563f, 16.0f)
                lineTo(14.0f, 22.563f)
                close()
            }
        }
        .build()
        return _caretRightSolid!!
    }

private var _caretRightSolid: ImageVector? = null
