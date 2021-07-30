package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HandScissors: ImageVector
    get() {
        if (_handScissors != null) {
            return _handScissors!!
        }
        _handScissors = Builder(name = "HandScissors", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 440.0f)
                curveToRelative(0.0f, -22.092f, 17.909f, -40.0f, 40.0f, -40.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-22.091f, 0.0f, -40.0f, -17.908f, -40.0f, -40.0f)
                reflectiveCurveToRelative(17.909f, -40.0f, 40.0f, -40.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(208.0f)
                verticalLineToRelative(-13.572f)
                lineToRelative(-177.551f, -69.74f)
                curveToRelative(-24.674f, -9.694f, -36.818f, -37.555f, -27.125f, -62.228f)
                curveToRelative(9.693f, -24.674f, 37.554f, -36.817f, 62.228f, -27.124f)
                lineToRelative(190.342f, 74.765f)
                lineToRelative(24.872f, -31.09f)
                curveToRelative(12.306f, -15.381f, 33.978f, -19.515f, 51.081f, -9.741f)
                lineToRelative(112.0f, 64.0f)
                arcTo(40.002f, 40.002f, 0.0f, false, true, 512.0f, 168.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 18.562f, -12.77f, 34.686f, -30.838f, 38.937f)
                lineToRelative(-136.0f, 32.0f)
                arcTo(39.982f, 39.982f, 0.0f, false, true, 336.0f, 480.0f)
                horizontalLineToRelative(-80.0f)
                curveToRelative(-22.091f, 0.0f, -40.0f, -17.908f, -40.0f, -40.0f)
                close()
            }
        }
        .build()
        return _handScissors!!
    }

private var _handScissors: ImageVector? = null
