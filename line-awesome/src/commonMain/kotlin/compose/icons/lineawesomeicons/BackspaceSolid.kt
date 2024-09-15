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

public val LineAwesomeIcons.BackspaceSolid: ImageVector
    get() {
        if (_backspaceSolid != null) {
            return _backspaceSolid!!
        }
        _backspaceSolid = Builder(name = "BackspaceSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.594f, 7.0f)
                lineTo(11.281f, 7.281f)
                lineTo(3.281f, 15.281f)
                lineTo(2.594f, 16.0f)
                lineTo(3.281f, 16.719f)
                lineTo(11.281f, 24.719f)
                lineTo(11.594f, 25.0f)
                lineTo(29.0f, 25.0f)
                lineTo(29.0f, 7.0f)
                close()
                moveTo(12.438f, 9.0f)
                lineTo(27.0f, 9.0f)
                lineTo(27.0f, 23.0f)
                lineTo(12.438f, 23.0f)
                lineTo(5.438f, 16.0f)
                close()
                moveTo(15.156f, 11.75f)
                lineTo(13.75f, 13.156f)
                lineTo(16.594f, 16.0f)
                lineTo(13.75f, 18.844f)
                lineTo(15.156f, 20.25f)
                lineTo(18.0f, 17.406f)
                lineTo(20.844f, 20.25f)
                lineTo(22.25f, 18.844f)
                lineTo(19.406f, 16.0f)
                lineTo(22.25f, 13.156f)
                lineTo(20.844f, 11.75f)
                lineTo(18.0f, 14.594f)
                close()
            }
        }
        .build()
        return _backspaceSolid!!
    }

private var _backspaceSolid: ImageVector? = null
