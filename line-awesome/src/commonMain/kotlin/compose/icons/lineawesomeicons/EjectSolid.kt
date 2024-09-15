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

public val LineAwesomeIcons.EjectSolid: ImageVector
    get() {
        if (_ejectSolid != null) {
            return _ejectSolid!!
        }
        _ejectSolid = Builder(name = "EjectSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.594f)
                lineTo(15.281f, 7.281f)
                lineTo(6.281f, 16.281f)
                lineTo(4.594f, 18.0f)
                lineTo(27.406f, 18.0f)
                lineTo(25.719f, 16.281f)
                lineTo(16.719f, 7.281f)
                close()
                moveTo(16.0f, 9.438f)
                lineTo(22.563f, 16.0f)
                lineTo(9.438f, 16.0f)
                close()
                moveTo(4.0f, 22.0f)
                lineTo(4.0f, 24.0f)
                lineTo(28.0f, 24.0f)
                lineTo(28.0f, 22.0f)
                close()
            }
        }
        .build()
        return _ejectSolid!!
    }

private var _ejectSolid: ImageVector? = null
