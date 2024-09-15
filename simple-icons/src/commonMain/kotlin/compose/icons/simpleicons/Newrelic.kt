package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Newrelic: ImageVector
    get() {
        if (_newrelic != null) {
            return _newrelic!!
        }
        _newrelic = Builder(name = "Newrelic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 16.355f)
                arcToRelative(4.354f, 4.354f, 0.0f, true, true, 4.354f, -4.354f)
                arcToRelative(4.36f, 4.36f, 0.0f, false, true, -4.354f, 4.354f)
                close()
                moveTo(11.999f, 8.221f)
                arcToRelative(3.779f, 3.779f, 0.0f, true, false, 3.779f, 3.779f)
                arcToRelative(3.784f, 3.784f, 0.0f, false, false, -3.779f, -3.779f)
                close()
                moveTo(13.028f, 19.14f)
                arcToRelative(6.972f, 6.972f, 0.0f, true, true, 6.974f, -6.972f)
                arcToRelative(6.981f, 6.981f, 0.0f, false, true, -6.974f, 6.972f)
                close()
                moveTo(13.028f, 5.776f)
                arcToRelative(6.397f, 6.397f, 0.0f, true, false, 6.399f, 6.398f)
                arcToRelative(6.405f, 6.405f, 0.0f, false, false, -6.399f, -6.403f)
                close()
                moveTo(10.856f, 21.774f)
                curveToRelative(-5.366f, 0.0f, -9.757f, -2.962f, -10.678f, -7.204f)
                curveTo(-0.952f, 9.373f, 3.431f, 3.991f, 9.949f, 2.573f)
                arcToRelative(15.055f, 15.055f, 0.0f, false, true, 3.193f, -0.346f)
                curveToRelative(5.366f, 0.0f, 9.757f, 2.962f, 10.678f, 7.202f)
                curveToRelative(0.55f, 2.53f, -0.171f, 5.173f, -2.032f, 7.445f)
                curveToRelative(-1.861f, 2.272f, -4.598f, 3.868f, -7.74f, 4.552f)
                arcToRelative(15.05f, 15.05f, 0.0f, false, true, -3.193f, 0.348f)
                close()
                moveTo(13.14f, 2.805f)
                arcToRelative(14.479f, 14.479f, 0.0f, false, false, -3.069f, 0.329f)
                curveTo(3.863f, 4.484f, -0.324f, 9.559f, 0.739f, 14.448f)
                curveToRelative(0.862f, 3.975f, 5.03f, 6.754f, 10.116f, 6.754f)
                arcToRelative(14.483f, 14.483f, 0.0f, false, false, 3.071f, -0.333f)
                curveToRelative(3.018f, -0.657f, 5.653f, -2.203f, 7.416f, -4.354f)
                curveToRelative(1.763f, -2.151f, 2.427f, -4.598f, 1.915f, -6.959f)
                curveToRelative(-0.864f, -3.978f, -5.024f, -6.754f, -10.116f, -6.754f)
                close()
            }
        }
        .build()
        return _newrelic!!
    }

private var _newrelic: ImageVector? = null
