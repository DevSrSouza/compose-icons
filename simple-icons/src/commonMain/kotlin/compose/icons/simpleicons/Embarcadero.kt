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

public val SimpleIcons.Embarcadero: ImageVector
    get() {
        if (_embarcadero != null) {
            return _embarcadero!!
        }
        _embarcadero = Builder(name = "Embarcadero", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(11.963f, 11.963f, 0.0f, false, false, -8.485f, 3.515f)
                arcTo(11.963f, 11.963f, 0.0f, false, false, 0.0f, 12.001f)
                curveToRelative(0.0f, 3.313f, 1.344f, 6.311f, 3.515f, 8.484f)
                arcTo(11.96f, 11.96f, 0.0f, false, false, 12.0f, 24.0f)
                arcToRelative(11.96f, 11.96f, 0.0f, false, false, 8.485f, -3.515f)
                arcTo(11.968f, 11.968f, 0.0f, false, false, 24.0f, 12.001f)
                curveToRelative(0.0f, -3.315f, -1.344f, -6.314f, -3.515f, -8.486f)
                arcTo(11.963f, 11.963f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.052f, 4.401f)
                curveToRelative(1.233f, 0.0f, 2.344f, 0.222f, 3.332f, 0.664f)
                curveToRelative(0.988f, 0.443f, 1.804f, 1.142f, 2.449f, 2.096f)
                curveToRelative(0.58f, 0.842f, 0.956f, 1.818f, 1.128f, 2.93f)
                curveToRelative(0.1f, 0.65f, 0.14f, 1.587f, 0.122f, 2.811f)
                lineTo(8.764f, 12.902f)
                curveToRelative(0.058f, 1.421f, 0.552f, 2.418f, 1.482f, 2.99f)
                curveToRelative(0.565f, 0.355f, 1.246f, 0.533f, 2.042f, 0.533f)
                curveToRelative(0.844f, 0.0f, 1.53f, -0.217f, 2.057f, -0.65f)
                curveToRelative(0.288f, -0.234f, 0.542f, -0.56f, 0.762f, -0.975f)
                horizontalLineToRelative(3.783f)
                curveToRelative(-0.1f, 0.84f, -0.558f, 1.694f, -1.374f, 2.56f)
                curveToRelative(-1.269f, 1.378f, -3.045f, 2.067f, -5.33f, 2.067f)
                curveToRelative(-1.886f, 0.0f, -3.549f, -0.58f, -4.99f, -1.743f)
                curveToRelative(-1.442f, -1.162f, -2.162f, -3.053f, -2.162f, -5.672f)
                curveToRelative(0.0f, -2.455f, 0.65f, -4.337f, 1.951f, -5.646f)
                curveTo(8.286f, 5.056f, 9.975f, 4.4f, 12.052f, 4.4f)
                close()
                moveTo(12.053f, 7.456f)
                curveToRelative(-0.95f, 0.0f, -1.688f, 0.27f, -2.211f, 0.81f)
                curveToRelative(-0.524f, 0.54f, -0.852f, 1.27f, -0.987f, 2.192f)
                horizontalLineToRelative(6.382f)
                curveToRelative(-0.067f, -0.983f, -0.396f, -1.73f, -0.987f, -2.238f)
                curveToRelative(-0.59f, -0.51f, -1.323f, -0.764f, -2.197f, -0.764f)
                close()
            }
        }
        .build()
        return _embarcadero!!
    }

private var _embarcadero: ImageVector? = null
