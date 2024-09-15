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

public val LineAwesomeIcons.ReplySolid: ImageVector
    get() {
        if (_replySolid != null) {
            return _replySolid!!
        }
        _replySolid = Builder(name = "ReplySolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.281f, 5.281f)
                lineTo(4.281f, 13.281f)
                lineTo(3.594f, 14.0f)
                lineTo(4.281f, 14.719f)
                lineTo(12.281f, 22.719f)
                lineTo(13.719f, 21.281f)
                lineTo(7.438f, 15.0f)
                lineTo(21.0f, 15.0f)
                curveTo(23.773f, 15.0f, 26.0f, 17.227f, 26.0f, 20.0f)
                curveTo(26.0f, 22.773f, 23.773f, 25.0f, 21.0f, 25.0f)
                lineTo(21.0f, 27.0f)
                curveTo(24.855f, 27.0f, 28.0f, 23.855f, 28.0f, 20.0f)
                curveTo(28.0f, 16.145f, 24.855f, 13.0f, 21.0f, 13.0f)
                lineTo(7.438f, 13.0f)
                lineTo(13.719f, 6.719f)
                close()
            }
        }
        .build()
        return _replySolid!!
    }

private var _replySolid: ImageVector? = null
