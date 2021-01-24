package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.HandLizard: ImageVector
    get() {
        if (_handLizard != null) {
            return _handLizard!!
        }
        _handLizard = Builder(name = "HandLizard", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(556.686f, 290.542f)
                lineTo(410.328f, 64.829f)
                curveTo(397.001f, 44.272f, 374.417f, 32.0f, 349.917f, 32.0f)
                horizontalLineTo(56.0f)
                curveTo(25.121f, 32.0f, 0.0f, 57.122f, 0.0f, 88.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 44.112f, 35.888f, 80.0f, 80.0f, 80.0f)
                horizontalLineToRelative(196.042f)
                lineToRelative(-18.333f, 48.0f)
                horizontalLineTo(144.0f)
                curveToRelative(-48.523f, 0.0f, -88.0f, 39.477f, -88.0f, 88.0f)
                curveToRelative(0.0f, 30.879f, 25.121f, 56.0f, 56.0f, 56.0f)
                horizontalLineToRelative(131.552f)
                curveToRelative(2.987f, 0.0f, 5.914f, 0.549f, 8.697f, 1.631f)
                lineTo(352.0f, 408.418f)
                verticalLineTo(480.0f)
                horizontalLineToRelative(224.0f)
                verticalLineTo(355.829f)
                curveToRelative(0.0f, -23.225f, -6.679f, -45.801f, -19.314f, -65.287f)
                close()
                moveTo(528.0f, 432.0f)
                horizontalLineTo(400.0f)
                verticalLineToRelative(-23.582f)
                curveToRelative(0.0f, -19.948f, -12.014f, -37.508f, -30.604f, -44.736f)
                lineToRelative(-99.751f, -38.788f)
                arcTo(71.733f, 71.733f, 0.0f, false, false, 243.552f, 320.0f)
                horizontalLineTo(112.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                curveToRelative(0.0f, -22.056f, 17.944f, -40.0f, 40.0f, -40.0f)
                horizontalLineToRelative(113.709f)
                curveToRelative(19.767f, 0.0f, 37.786f, -12.407f, 44.84f, -30.873f)
                lineToRelative(24.552f, -64.281f)
                curveToRelative(8.996f, -23.553f, -8.428f, -48.846f, -33.63f, -48.846f)
                horizontalLineTo(80.0f)
                curveToRelative(-17.645f, 0.0f, -32.0f, -14.355f, -32.0f, -32.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(293.917f)
                curveToRelative(8.166f, 0.0f, 15.693f, 4.09f, 20.137f, 10.942f)
                lineToRelative(146.358f, 225.715f)
                arcTo(71.84f, 71.84f, 0.0f, false, true, 528.0f, 355.829f)
                verticalLineTo(432.0f)
                close()
            }
        }
        .build()
        return _handLizard!!
    }

private var _handLizard: ImageVector? = null
