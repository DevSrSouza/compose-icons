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

public val SimpleIcons.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.234f)
                lineToRelative(21.912f, 20.537f)
                reflectiveCurveToRelative(0.412f, 0.575f, -0.124f, 1.151f)
                curveToRelative(-0.535f, 0.576f, -1.236f, 0.083f, -1.236f, 0.083f)
                lineTo(0.0f, 0.234f)
                close()
                moveTo(6.508f, 2.292f)
                lineToRelative(17.01f, 15.638f)
                reflectiveCurveToRelative(0.413f, 0.576f, -0.123f, 1.152f)
                curveToRelative(-0.534f, 0.576f, -1.235f, 0.083f, -1.235f, 0.083f)
                lineTo(6.508f, 2.292f)
                close()
                moveTo(1.936f, 6.696f)
                lineToRelative(17.01f, 15.638f)
                reflectiveCurveToRelative(0.412f, 0.576f, -0.123f, 1.152f)
                reflectiveCurveToRelative(-1.235f, 0.082f, -1.235f, 0.082f)
                lineTo(1.936f, 6.696f)
                close()
                moveTo(12.009f, 4.061f)
                lineToRelative(11.886f, 10.927f)
                reflectiveCurveToRelative(0.287f, 0.401f, -0.087f, 0.805f)
                reflectiveCurveToRelative(-0.863f, 0.058f, -0.863f, 0.058f)
                lineTo(12.009f, 4.061f)
                close()
                moveTo(3.442f, 11.798f)
                lineToRelative(11.886f, 10.926f)
                reflectiveCurveToRelative(0.285f, 0.4f, -0.088f, 0.803f)
                curveToRelative(-0.375f, 0.403f, -0.863f, 0.059f, -0.863f, 0.059f)
                lineTo(3.442f, 11.798f)
                close()
                moveTo(17.629f, 6.613f)
                lineToRelative(5.426f, 4.955f)
                reflectiveCurveToRelative(0.142f, 0.188f, -0.044f, 0.377f)
                curveToRelative(-0.185f, 0.188f, -0.428f, 0.027f, -0.428f, 0.027f)
                lineToRelative(-4.954f, -5.358f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(6.178f, 17.231f)
                lineToRelative(5.425f, 4.956f)
                reflectiveCurveToRelative(0.144f, 0.188f, -0.042f, 0.377f)
                reflectiveCurveToRelative(-0.427f, 0.026f, -0.427f, 0.026f)
                lineToRelative(-4.956f, -5.359f)
                close()
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
