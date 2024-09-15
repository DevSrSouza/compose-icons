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
                curveTo(9.145f, 3.0f, 6.0f, 6.145f, 6.0f, 10.0f)
                curveTo(6.0f, 12.41f, 7.23f, 14.551f, 9.094f, 15.813f)
                curveTo(5.527f, 17.344f, 3.0f, 20.883f, 3.0f, 25.0f)
                lineTo(5.0f, 25.0f)
                curveTo(5.0f, 20.57f, 8.57f, 17.0f, 13.0f, 17.0f)
                curveTo(15.145f, 17.0f, 17.063f, 17.879f, 18.5f, 19.25f)
                lineTo(13.781f, 23.969f)
                lineTo(13.719f, 24.281f)
                lineTo(13.031f, 27.813f)
                lineTo(12.719f, 29.281f)
                lineTo(14.188f, 28.969f)
                lineTo(17.719f, 28.281f)
                lineTo(18.031f, 28.219f)
                lineTo(28.125f, 18.125f)
                curveTo(29.285f, 16.965f, 29.285f, 15.035f, 28.125f, 13.875f)
                curveTo(27.543f, 13.293f, 26.77f, 13.0f, 26.0f, 13.0f)
                curveTo(25.246f, 13.0f, 24.484f, 13.285f, 23.906f, 13.844f)
                lineTo(19.938f, 17.813f)
                curveTo(19.066f, 16.977f, 18.035f, 16.293f, 16.906f, 15.813f)
                curveTo(18.77f, 14.551f, 20.0f, 12.41f, 20.0f, 10.0f)
                curveTo(20.0f, 6.145f, 16.855f, 3.0f, 13.0f, 3.0f)
                close()
                moveTo(13.0f, 5.0f)
                curveTo(15.773f, 5.0f, 18.0f, 7.227f, 18.0f, 10.0f)
                curveTo(18.0f, 12.773f, 15.773f, 15.0f, 13.0f, 15.0f)
                curveTo(10.227f, 15.0f, 8.0f, 12.773f, 8.0f, 10.0f)
                curveTo(8.0f, 7.227f, 10.227f, 5.0f, 13.0f, 5.0f)
                close()
                moveTo(26.0f, 15.0f)
                curveTo(26.254f, 15.0f, 26.52f, 15.082f, 26.719f, 15.281f)
                curveTo(27.117f, 15.68f, 27.117f, 16.289f, 26.719f, 16.688f)
                lineTo(17.031f, 26.375f)
                lineTo(15.25f, 26.75f)
                lineTo(15.625f, 24.969f)
                lineTo(25.313f, 15.281f)
                curveTo(25.512f, 15.082f, 25.746f, 15.0f, 26.0f, 15.0f)
                close()
            }
        }
        .build()
        return _userEditSolid!!
    }

private var _userEditSolid: ImageVector? = null
