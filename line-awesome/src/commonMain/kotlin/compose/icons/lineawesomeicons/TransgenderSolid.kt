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

public val LineAwesomeIcons.TransgenderSolid: ImageVector
    get() {
        if (_transgenderSolid != null) {
            return _transgenderSolid!!
        }
        _transgenderSolid = Builder(name = "TransgenderSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(19.0f, 5.0f)
                lineTo(22.594f, 5.0f)
                lineTo(18.188f, 9.406f)
                curveTo(17.016f, 8.523f, 15.574f, 8.0f, 14.0f, 8.0f)
                curveTo(10.145f, 8.0f, 7.0f, 11.145f, 7.0f, 15.0f)
                curveTo(7.0f, 18.516f, 9.617f, 21.418f, 13.0f, 21.906f)
                lineTo(13.0f, 25.0f)
                lineTo(10.0f, 25.0f)
                lineTo(10.0f, 27.0f)
                lineTo(13.0f, 27.0f)
                lineTo(13.0f, 30.0f)
                lineTo(15.0f, 30.0f)
                lineTo(15.0f, 27.0f)
                lineTo(18.0f, 27.0f)
                lineTo(18.0f, 25.0f)
                lineTo(15.0f, 25.0f)
                lineTo(15.0f, 21.906f)
                curveTo(18.383f, 21.418f, 21.0f, 18.516f, 21.0f, 15.0f)
                curveTo(21.0f, 13.426f, 20.477f, 11.984f, 19.594f, 10.813f)
                lineTo(24.0f, 6.406f)
                lineTo(24.0f, 10.0f)
                lineTo(26.0f, 10.0f)
                lineTo(26.0f, 3.0f)
                close()
                moveTo(14.0f, 10.0f)
                curveTo(16.773f, 10.0f, 19.0f, 12.227f, 19.0f, 15.0f)
                curveTo(19.0f, 17.773f, 16.773f, 20.0f, 14.0f, 20.0f)
                curveTo(11.227f, 20.0f, 9.0f, 17.773f, 9.0f, 15.0f)
                curveTo(9.0f, 12.227f, 11.227f, 10.0f, 14.0f, 10.0f)
                close()
            }
        }
        .build()
        return _transgenderSolid!!
    }

private var _transgenderSolid: ImageVector? = null
