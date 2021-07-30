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

public val LineAwesomeIcons.UserEditSolid: ImageVector
    get() {
        if (_userEditSolid != null) {
            return _userEditSolid!!
        }
        _userEditSolid = Builder(name = "UserEditSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(9.1445f, 3.0f, 6.0f, 6.1445f, 6.0f, 10.0f)
                curveTo(6.0f, 12.4102f, 7.2305f, 14.5508f, 9.0938f, 15.8125f)
                curveTo(5.5273f, 17.3438f, 3.0f, 20.8828f, 3.0f, 25.0f)
                lineTo(5.0f, 25.0f)
                curveTo(5.0f, 20.5703f, 8.5703f, 17.0f, 13.0f, 17.0f)
                curveTo(15.1445f, 17.0f, 17.0625f, 17.8789f, 18.5f, 19.25f)
                lineTo(13.7813f, 23.9688f)
                lineTo(13.7188f, 24.2813f)
                lineTo(13.0313f, 27.8125f)
                lineTo(12.7188f, 29.2813f)
                lineTo(14.1875f, 28.9688f)
                lineTo(17.7188f, 28.2813f)
                lineTo(18.0313f, 28.2188f)
                lineTo(28.125f, 18.125f)
                curveTo(29.2852f, 16.9648f, 29.2852f, 15.0352f, 28.125f, 13.875f)
                curveTo(27.543f, 13.293f, 26.7695f, 13.0f, 26.0f, 13.0f)
                curveTo(25.2461f, 13.0f, 24.4844f, 13.2852f, 23.9063f, 13.8438f)
                lineTo(19.9375f, 17.8125f)
                curveTo(19.0664f, 16.9766f, 18.0352f, 16.293f, 16.9063f, 15.8125f)
                curveTo(18.7695f, 14.5508f, 20.0f, 12.4102f, 20.0f, 10.0f)
                curveTo(20.0f, 6.1445f, 16.8555f, 3.0f, 13.0f, 3.0f)
                close()
                moveTo(13.0f, 5.0f)
                curveTo(15.7734f, 5.0f, 18.0f, 7.2266f, 18.0f, 10.0f)
                curveTo(18.0f, 12.7734f, 15.7734f, 15.0f, 13.0f, 15.0f)
                curveTo(10.2266f, 15.0f, 8.0f, 12.7734f, 8.0f, 10.0f)
                curveTo(8.0f, 7.2266f, 10.2266f, 5.0f, 13.0f, 5.0f)
                close()
                moveTo(26.0f, 15.0f)
                curveTo(26.2539f, 15.0f, 26.5195f, 15.082f, 26.7188f, 15.2813f)
                curveTo(27.1172f, 15.6797f, 27.1172f, 16.2891f, 26.7188f, 16.6875f)
                lineTo(17.0313f, 26.375f)
                lineTo(15.25f, 26.75f)
                lineTo(15.625f, 24.9688f)
                lineTo(25.3125f, 15.2813f)
                curveTo(25.5117f, 15.082f, 25.7461f, 15.0f, 26.0f, 15.0f)
                close()
            }
        }
        .build()
        return _userEditSolid!!
    }

private var _userEditSolid: ImageVector? = null
