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
                curveToRelative(0.0f, -22.09f, 17.91f, -40.0f, 40.0f, -40.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-22.09f, 0.0f, -40.0f, -17.91f, -40.0f, -40.0f)
                reflectiveCurveToRelative(17.91f, -40.0f, 40.0f, -40.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(208.0f)
                verticalLineToRelative(-13.57f)
                lineToRelative(-177.55f, -69.74f)
                curveToRelative(-24.67f, -9.69f, -36.82f, -37.56f, -27.13f, -62.23f)
                curveToRelative(9.69f, -24.67f, 37.55f, -36.82f, 62.23f, -27.12f)
                lineToRelative(190.34f, 74.76f)
                lineToRelative(24.87f, -31.09f)
                curveToRelative(12.31f, -15.38f, 33.98f, -19.51f, 51.08f, -9.74f)
                lineToRelative(112.0f, 64.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 512.0f, 168.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 18.56f, -12.77f, 34.69f, -30.84f, 38.94f)
                lineToRelative(-136.0f, 32.0f)
                arcTo(39.98f, 39.98f, 0.0f, false, true, 336.0f, 480.0f)
                horizontalLineToRelative(-80.0f)
                curveToRelative(-22.09f, 0.0f, -40.0f, -17.91f, -40.0f, -40.0f)
                close()
            }
        }
        .build()
        return _handScissors!!
    }

private var _handScissors: ImageVector? = null
