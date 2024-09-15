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

public val LineAwesomeIcons.ThumbtackSolid: ImageVector
    get() {
        if (_thumbtackSolid != null) {
            return _thumbtackSolid!!
        }
        _thumbtackSolid = Builder(name = "ThumbtackSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.531f, 2.563f)
                lineTo(19.844f, 3.5f)
                lineTo(14.938f, 10.188f)
                curveTo(12.309f, 9.73f, 9.527f, 10.473f, 7.5f, 12.5f)
                lineTo(6.781f, 13.188f)
                lineTo(12.094f, 18.5f)
                lineTo(4.0f, 26.594f)
                lineTo(4.0f, 28.0f)
                lineTo(5.406f, 28.0f)
                lineTo(13.5f, 19.906f)
                lineTo(18.813f, 25.219f)
                lineTo(19.5f, 24.5f)
                curveTo(21.527f, 22.473f, 22.27f, 19.691f, 21.813f, 17.063f)
                lineTo(28.5f, 12.156f)
                lineTo(29.438f, 11.469f)
                close()
                moveTo(20.781f, 5.625f)
                lineTo(26.375f, 11.219f)
                lineTo(20.156f, 15.781f)
                lineTo(19.594f, 16.188f)
                lineTo(19.781f, 16.844f)
                curveTo(20.262f, 18.676f, 19.738f, 20.586f, 18.594f, 22.188f)
                lineTo(9.813f, 13.406f)
                curveTo(11.414f, 12.262f, 13.324f, 11.738f, 15.156f, 12.219f)
                lineTo(15.813f, 12.406f)
                lineTo(16.219f, 11.844f)
                close()
            }
        }
        .build()
        return _thumbtackSolid!!
    }

private var _thumbtackSolid: ImageVector? = null
