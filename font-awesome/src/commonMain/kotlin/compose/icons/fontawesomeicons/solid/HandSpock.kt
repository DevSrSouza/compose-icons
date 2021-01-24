package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HandSpock: ImageVector
    get() {
        if (_handSpock != null) {
            return _handSpock!!
        }
        _handSpock = Builder(name = "HandSpock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(510.901f, 145.27f)
                lineTo(442.604f, 432.094f)
                arcTo(103.995f, 103.995f, 0.0f, false, true, 341.437f, 512.0f)
                horizontalLineTo(214.074f)
                arcToRelative(135.97f, 135.97f, 0.0f, false, true, -93.185f, -36.953f)
                lineTo(12.591f, 373.127f)
                arcToRelative(39.992f, 39.992f, 0.0f, false, true, 54.812f, -58.25f)
                lineToRelative(60.593f, 57.025f)
                verticalLineToRelative(0.0f)
                arcToRelative(283.249f, 283.249f, 0.0f, false, false, -11.67f, -80.467f)
                lineTo(73.637f, 147.36f)
                arcToRelative(40.006f, 40.006f, 0.0f, true, true, 76.718f, -22.719f)
                lineToRelative(37.155f, 125.395f)
                arcToRelative(8.331f, 8.331f, 0.0f, false, false, 16.057f, -4.441f)
                lineTo(153.262f, 49.954f)
                arcTo(39.996f, 39.996f, 0.0f, true, true, 230.73f, 30.017f)
                lineToRelative(56.095f, 218.158f)
                arcToRelative(10.42f, 10.42f, 0.0f, false, false, 20.3f, -0.501f)
                lineTo(344.808f, 63.97f)
                arcToRelative(40.052f, 40.052f, 0.0f, false, true, 51.302f, -30.089f)
                curveToRelative(19.861f, 6.3f, 30.863f, 27.674f, 26.676f, 48.085f)
                lineToRelative(-33.839f, 164.966f)
                arcToRelative(7.552f, 7.552f, 0.0f, false, false, 14.744f, 3.267f)
                lineToRelative(29.397f, -123.459f)
                arcToRelative(39.994f, 39.994f, 0.0f, true, true, 77.812f, 18.531f)
                close()
            }
        }
        .build()
        return _handSpock!!
    }

private var _handSpock: ImageVector? = null
