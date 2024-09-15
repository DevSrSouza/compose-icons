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

public val LineAwesomeIcons.ShareSolid: ImageVector
    get() {
        if (_shareSolid != null) {
            return _shareSolid!!
        }
        _shareSolid = Builder(name = "ShareSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.719f, 5.281f)
                lineTo(18.281f, 6.719f)
                lineTo(24.563f, 13.0f)
                lineTo(11.0f, 13.0f)
                curveTo(7.145f, 13.0f, 4.0f, 16.145f, 4.0f, 20.0f)
                curveTo(4.0f, 23.855f, 7.145f, 27.0f, 11.0f, 27.0f)
                lineTo(11.0f, 25.0f)
                curveTo(8.227f, 25.0f, 6.0f, 22.773f, 6.0f, 20.0f)
                curveTo(6.0f, 17.227f, 8.227f, 15.0f, 11.0f, 15.0f)
                lineTo(24.563f, 15.0f)
                lineTo(18.281f, 21.281f)
                lineTo(19.719f, 22.719f)
                lineTo(27.719f, 14.719f)
                lineTo(28.406f, 14.0f)
                lineTo(27.719f, 13.281f)
                close()
            }
        }
        .build()
        return _shareSolid!!
    }

private var _shareSolid: ImageVector? = null
