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
                moveTo(5.688f, 5.0f)
                curveTo(5.688f, 5.0f, 5.0f, 6.207f, 5.0f, 8.25f)
                curveTo(5.0f, 9.605f, 5.309f, 10.32f, 5.531f, 10.688f)
                curveTo(3.969f, 12.313f, 3.0f, 14.516f, 3.0f, 17.344f)
                curveTo(3.0f, 24.586f, 7.59f, 27.0f, 16.0f, 27.0f)
                curveTo(24.41f, 27.0f, 29.0f, 24.586f, 29.0f, 17.344f)
                curveTo(29.0f, 14.418f, 28.086f, 12.219f, 26.594f, 10.625f)
                curveTo(26.965f, 9.516f, 27.383f, 7.422f, 26.344f, 5.0f)
                curveTo(23.242f, 5.0f, 20.656f, 7.383f, 20.563f, 7.469f)
                curveTo(19.113f, 7.152f, 17.574f, 7.0f, 16.0f, 7.0f)
                curveTo(14.395f, 7.0f, 12.82f, 7.195f, 11.344f, 7.563f)
                curveTo(9.266f, 5.504f, 6.758f, 5.0f, 5.688f, 5.0f)
                close()
                moveTo(20.688f, 15.438f)
                curveTo(21.531f, 15.43f, 22.313f, 15.5f, 23.0f, 15.719f)
                curveTo(24.832f, 16.301f, 26.0f, 17.984f, 26.0f, 19.875f)
                curveTo(26.0f, 25.109f, 23.191f, 26.0f, 16.0f, 26.0f)
                curveTo(10.656f, 26.0f, 6.313f, 25.059f, 6.313f, 20.063f)
                curveTo(6.313f, 18.156f, 7.348f, 17.078f, 8.094f, 16.406f)
                curveTo(9.734f, 14.93f, 12.324f, 15.656f, 16.0f, 15.656f)
                curveTo(17.672f, 15.656f, 19.277f, 15.453f, 20.688f, 15.438f)
                close()
                moveTo(10.5f, 18.0f)
                curveTo(9.672f, 18.0f, 9.0f, 18.895f, 9.0f, 20.0f)
                curveTo(9.0f, 21.105f, 9.672f, 22.0f, 10.5f, 22.0f)
                curveTo(11.328f, 22.0f, 12.0f, 21.105f, 12.0f, 20.0f)
                curveTo(12.0f, 18.895f, 11.328f, 18.0f, 10.5f, 18.0f)
                close()
                moveTo(21.5f, 18.0f)
                curveTo(20.672f, 18.0f, 20.0f, 18.895f, 20.0f, 20.0f)
                curveTo(20.0f, 21.105f, 20.672f, 22.0f, 21.5f, 22.0f)
                curveTo(22.328f, 22.0f, 23.0f, 21.105f, 23.0f, 20.0f)
                curveTo(23.0f, 18.895f, 22.328f, 18.0f, 21.5f, 18.0f)
                close()
                moveTo(10.344f, 18.844f)
                curveTo(10.578f, 18.844f, 10.75f, 19.043f, 10.75f, 19.281f)
                curveTo(10.75f, 19.52f, 10.578f, 19.719f, 10.344f, 19.719f)
                curveTo(10.109f, 19.719f, 9.906f, 19.52f, 9.906f, 19.281f)
                curveTo(9.906f, 19.043f, 10.109f, 18.844f, 10.344f, 18.844f)
                close()
                moveTo(21.344f, 18.844f)
                curveTo(21.578f, 18.844f, 21.75f, 19.043f, 21.75f, 19.281f)
                curveTo(21.75f, 19.52f, 21.578f, 19.719f, 21.344f, 19.719f)
                curveTo(21.109f, 19.719f, 20.906f, 19.52f, 20.906f, 19.281f)
                curveTo(20.906f, 19.043f, 21.109f, 18.844f, 21.344f, 18.844f)
                close()
            }
        }
        .build()
        return _githubAlt!!
    }

private var _githubAlt: ImageVector? = null
