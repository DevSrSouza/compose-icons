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

public val LineAwesomeIcons.OmSolid: ImageVector
    get() {
        if (_omSolid != null) {
            return _omSolid!!
        }
        _omSolid = Builder(name = "OmSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.0f, 19.121f)
                curveTo(29.0f, 21.207f, 28.156f, 26.574f, 23.59f, 26.574f)
                curveTo(19.238f, 26.574f, 17.652f, 22.73f, 17.953f, 21.34f)
                curveTo(18.203f, 21.766f, 18.996f, 23.957f, 23.277f, 23.957f)
                curveTo(27.668f, 23.957f, 27.715f, 19.078f, 27.715f, 19.078f)
                curveTo(27.715f, 19.078f, 27.641f, 15.617f, 24.965f, 15.617f)
                curveTo(21.699f, 15.617f, 21.59f, 20.809f, 18.309f, 20.809f)
                curveTo(16.664f, 20.809f, 16.113f, 19.938f, 15.781f, 19.699f)
                curveTo(16.488f, 21.895f, 15.652f, 27.0f, 10.277f, 27.0f)
                curveTo(2.605f, 27.0f, 3.004f, 18.723f, 3.004f, 18.723f)
                curveTo(3.004f, 18.723f, 4.289f, 23.824f, 10.145f, 23.824f)
                curveTo(13.715f, 23.824f, 14.184f, 21.785f, 14.184f, 20.852f)
                curveTo(14.184f, 19.922f, 13.473f, 18.281f, 10.277f, 18.281f)
                lineTo(9.578f, 14.965f)
                curveTo(9.578f, 14.965f, 10.523f, 15.273f, 11.691f, 15.273f)
                curveTo(13.23f, 15.273f, 13.582f, 14.246f, 13.582f, 13.402f)
                curveTo(13.582f, 12.563f, 12.758f, 11.711f, 11.25f, 11.711f)
                curveTo(8.914f, 11.711f, 7.039f, 14.109f, 7.039f, 14.109f)
                lineTo(5.223f, 10.738f)
                curveTo(5.223f, 10.738f, 6.91f, 8.563f, 10.328f, 8.563f)
                curveTo(13.742f, 8.563f, 15.293f, 11.359f, 15.293f, 13.0f)
                curveTo(15.293f, 14.641f, 14.527f, 16.0f, 13.074f, 16.77f)
                curveTo(15.035f, 17.691f, 14.441f, 18.367f, 15.691f, 18.367f)
                curveTo(17.762f, 18.367f, 18.043f, 16.676f, 19.016f, 15.141f)
                curveTo(19.914f, 13.73f, 21.191f, 12.469f, 23.453f, 12.469f)
                curveTo(27.98f, 12.469f, 29.0f, 17.039f, 29.0f, 19.121f)
                close()
                moveTo(20.172f, 11.98f)
                curveTo(22.473f, 11.98f, 24.254f, 10.648f, 24.254f, 10.648f)
                lineTo(22.344f, 7.277f)
                curveTo(22.344f, 7.277f, 21.016f, 9.141f, 18.441f, 9.141f)
                curveTo(15.867f, 9.141f, 13.738f, 6.789f, 13.738f, 6.789f)
                curveTo(13.738f, 6.789f, 14.715f, 11.98f, 20.172f, 11.98f)
                close()
                moveTo(20.527f, 6.613f)
                lineTo(18.617f, 4.57f)
                lineTo(16.488f, 6.434f)
                lineTo(18.398f, 8.609f)
                close()
            }
        }
        .build()
        return _omSolid!!
    }

private var _omSolid: ImageVector? = null
