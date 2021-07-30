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

public val LineAwesomeIcons.GithubAlt: ImageVector
    get() {
        if (_githubAlt != null) {
            return _githubAlt!!
        }
        _githubAlt = Builder(name = "GithubAlt", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6875f, 5.0f)
                curveTo(5.6875f, 5.0f, 5.0f, 6.207f, 5.0f, 8.25f)
                curveTo(5.0f, 9.6055f, 5.3086f, 10.3203f, 5.5313f, 10.6875f)
                curveTo(3.9688f, 12.3125f, 3.0f, 14.5156f, 3.0f, 17.3438f)
                curveTo(3.0f, 24.5859f, 7.5898f, 27.0f, 16.0f, 27.0f)
                curveTo(24.4102f, 27.0f, 29.0f, 24.5859f, 29.0f, 17.3438f)
                curveTo(29.0f, 14.418f, 28.0859f, 12.2188f, 26.5938f, 10.625f)
                curveTo(26.9648f, 9.5156f, 27.3828f, 7.4219f, 26.3438f, 5.0f)
                curveTo(23.2422f, 5.0f, 20.6563f, 7.3828f, 20.5625f, 7.4688f)
                curveTo(19.1133f, 7.1523f, 17.5742f, 7.0f, 16.0f, 7.0f)
                curveTo(14.3945f, 7.0f, 12.8203f, 7.1953f, 11.3438f, 7.5625f)
                curveTo(9.2656f, 5.5039f, 6.7578f, 5.0f, 5.6875f, 5.0f)
                close()
                moveTo(20.6875f, 15.4375f)
                curveTo(21.5313f, 15.4297f, 22.3125f, 15.5f, 23.0f, 15.7188f)
                curveTo(24.832f, 16.3008f, 26.0f, 17.9844f, 26.0f, 19.875f)
                curveTo(26.0f, 25.1094f, 23.1914f, 26.0f, 16.0f, 26.0f)
                curveTo(10.6563f, 26.0f, 6.3125f, 25.0586f, 6.3125f, 20.0625f)
                curveTo(6.3125f, 18.1563f, 7.3477f, 17.0781f, 8.0938f, 16.4063f)
                curveTo(9.7344f, 14.9297f, 12.3242f, 15.6563f, 16.0f, 15.6563f)
                curveTo(17.6719f, 15.6563f, 19.2773f, 15.4531f, 20.6875f, 15.4375f)
                close()
                moveTo(10.5f, 18.0f)
                curveTo(9.6719f, 18.0f, 9.0f, 18.8945f, 9.0f, 20.0f)
                curveTo(9.0f, 21.1055f, 9.6719f, 22.0f, 10.5f, 22.0f)
                curveTo(11.3281f, 22.0f, 12.0f, 21.1055f, 12.0f, 20.0f)
                curveTo(12.0f, 18.8945f, 11.3281f, 18.0f, 10.5f, 18.0f)
                close()
                moveTo(21.5f, 18.0f)
                curveTo(20.6719f, 18.0f, 20.0f, 18.8945f, 20.0f, 20.0f)
                curveTo(20.0f, 21.1055f, 20.6719f, 22.0f, 21.5f, 22.0f)
                curveTo(22.3281f, 22.0f, 23.0f, 21.1055f, 23.0f, 20.0f)
                curveTo(23.0f, 18.8945f, 22.3281f, 18.0f, 21.5f, 18.0f)
                close()
                moveTo(10.3438f, 18.8438f)
                curveTo(10.5781f, 18.8438f, 10.75f, 19.043f, 10.75f, 19.2813f)
                curveTo(10.75f, 19.5195f, 10.5781f, 19.7188f, 10.3438f, 19.7188f)
                curveTo(10.1094f, 19.7188f, 9.9063f, 19.5195f, 9.9063f, 19.2813f)
                curveTo(9.9063f, 19.043f, 10.1094f, 18.8438f, 10.3438f, 18.8438f)
                close()
                moveTo(21.3438f, 18.8438f)
                curveTo(21.5781f, 18.8438f, 21.75f, 19.043f, 21.75f, 19.2813f)
                curveTo(21.75f, 19.5195f, 21.5781f, 19.7188f, 21.3438f, 19.7188f)
                curveTo(21.1094f, 19.7188f, 20.9063f, 19.5195f, 20.9063f, 19.2813f)
                curveTo(20.9063f, 19.043f, 21.1094f, 18.8438f, 21.3438f, 18.8438f)
                close()
            }
        }
        .build()
        return _githubAlt!!
    }

private var _githubAlt: ImageVector? = null
