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

public val SimpleIcons.Sky: ImageVector
    get() {
        if (_sky != null) {
            return _sky!!
        }
        _sky = Builder(name = "Sky", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.387f, 13.656f)
                curveToRelative(0.0f, 1.423f, -0.933f, 2.454f, -2.823f, 2.675f)
                curveToRelative(-1.35f, 0.147f, -3.337f, -0.025f, -4.294f, -0.148f)
                curveToRelative(-0.025f, -0.147f, -0.074f, -0.343f, -0.074f, -0.49f)
                curveToRelative(0.0f, -1.252f, 0.663f, -1.522f, 1.3f, -1.522f)
                curveToRelative(0.664f, 0.0f, 1.694f, 0.123f, 2.455f, 0.123f)
                curveToRelative(0.834f, 0.0f, 1.104f, -0.295f, 1.104f, -0.565f)
                curveToRelative(0.0f, -0.368f, -0.343f, -0.515f, -1.006f, -0.638f)
                lineToRelative(-1.767f, -0.343f)
                curveTo(0.785f, 12.453f, 0.0f, 11.423f, 0.0f, 10.343f)
                curveToRelative(0.0f, -1.325f, 0.933f, -2.454f, 2.798f, -2.65f)
                curveToRelative(1.398f, -0.148f, 3.116f, 0.024f, 4.049f, 0.122f)
                curveToRelative(0.024f, 0.172f, 0.049f, 0.32f, 0.049f, 0.491f)
                curveToRelative(0.0f, 1.252f, -0.663f, 1.522f, -1.276f, 1.522f)
                curveToRelative(-0.491f, 0.0f, -1.227f, -0.099f, -2.086f, -0.099f)
                curveToRelative(-0.884f, 0.0f, -1.227f, 0.246f, -1.227f, 0.54f)
                curveToRelative(0.0f, 0.32f, 0.343f, 0.442f, 0.883f, 0.54f)
                lineToRelative(1.718f, 0.32f)
                curveToRelative(1.742f, 0.294f, 2.479f, 1.3f, 2.479f, 2.527f)
                moveToRelative(3.092f, 1.521f)
                curveToRelative(0.0f, 0.761f, -0.295f, 1.203f, -1.792f, 1.203f)
                curveToRelative(-0.196f, 0.0f, -0.368f, -0.025f, -0.54f, -0.05f)
                lineTo(8.147f, 6.22f)
                curveToRelative(0.0f, -0.76f, 0.27f, -1.57f, 1.767f, -1.57f)
                curveToRelative(0.196f, 0.0f, 0.393f, 0.024f, 0.565f, 0.049f)
                close()
                moveTo(16.564f, 19.104f)
                curveToRelative(0.197f, 0.098f, 0.59f, 0.22f, 1.105f, 0.245f)
                curveToRelative(0.859f, 0.025f, 1.325f, -0.319f, 1.693f, -1.08f)
                lineTo(24.0f, 7.913f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.957f, -0.22f)
                curveToRelative(-0.589f, 0.0f, -1.399f, 0.122f, -1.914f, 1.325f)
                lineToRelative(-1.497f, 3.534f)
                lineToRelative(-2.945f, -4.81f)
                curveToRelative(-0.196f, -0.05f, -0.662f, -0.148f, -1.006f, -0.148f)
                curveToRelative(-1.03f, 0.0f, -1.62f, 0.393f, -2.233f, 1.031f)
                lineToRelative(-2.871f, 3.141f)
                lineToRelative(2.306f, 3.632f)
                curveToRelative(0.418f, 0.663f, 0.982f, 1.006f, 1.89f, 1.006f)
                curveToRelative(0.589f, 0.0f, 1.104f, -0.147f, 1.325f, -0.245f)
                lineToRelative(-2.773f, -4.196f)
                lineToRelative(1.963f, -2.086f)
                lineToRelative(3.24f, 5.08f)
                close()
            }
        }
        .build()
        return _sky!!
    }

private var _sky: ImageVector? = null
