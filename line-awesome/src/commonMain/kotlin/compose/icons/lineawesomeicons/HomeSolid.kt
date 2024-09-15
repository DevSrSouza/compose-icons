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

public val LineAwesomeIcons.HomeSolid: ImageVector
    get() {
        if (_homeSolid != null) {
            return _homeSolid!!
        }
        _homeSolid = Builder(name = "HomeSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.594f)
                lineTo(15.281f, 3.281f)
                lineTo(2.281f, 16.281f)
                lineTo(3.719f, 17.719f)
                lineTo(5.0f, 16.438f)
                lineTo(5.0f, 28.0f)
                lineTo(14.0f, 28.0f)
                lineTo(14.0f, 18.0f)
                lineTo(18.0f, 18.0f)
                lineTo(18.0f, 28.0f)
                lineTo(27.0f, 28.0f)
                lineTo(27.0f, 16.438f)
                lineTo(28.281f, 17.719f)
                lineTo(29.719f, 16.281f)
                lineTo(16.719f, 3.281f)
                close()
                moveTo(16.0f, 5.438f)
                lineTo(25.0f, 14.438f)
                lineTo(25.0f, 26.0f)
                lineTo(20.0f, 26.0f)
                lineTo(20.0f, 16.0f)
                lineTo(12.0f, 16.0f)
                lineTo(12.0f, 26.0f)
                lineTo(7.0f, 26.0f)
                lineTo(7.0f, 14.438f)
                close()
            }
        }
        .build()
        return _homeSolid!!
    }

private var _homeSolid: ImageVector? = null
