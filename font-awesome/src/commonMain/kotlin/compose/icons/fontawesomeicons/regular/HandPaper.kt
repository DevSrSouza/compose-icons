package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.HandPaper: ImageVector
    get() {
        if (_handPaper != null) {
            return _handPaper!!
        }
        _handPaper = Builder(name = "HandPaper", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(372.57f, 112.641f)
                verticalLineToRelative(-10.825f)
                curveToRelative(0.0f, -43.612f, -40.52f, -76.691f, -83.039f, -65.546f)
                curveToRelative(-25.629f, -49.5f, -94.09f, -47.45f, -117.982f, 0.747f)
                curveTo(130.269f, 26.456f, 89.144f, 57.945f, 89.144f, 102.0f)
                verticalLineToRelative(126.13f)
                curveToRelative(-19.953f, -7.427f, -43.308f, -5.068f, -62.083f, 8.871f)
                curveToRelative(-29.355f, 21.796f, -35.794f, 63.333f, -14.55f, 93.153f)
                lineTo(132.48f, 498.569f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 26.062f, 13.432f)
                horizontalLineToRelative(222.897f)
                curveToRelative(14.904f, 0.0f, 27.835f, -10.289f, 31.182f, -24.813f)
                lineToRelative(30.184f, -130.958f)
                arcTo(203.637f, 203.637f, 0.0f, false, false, 448.0f, 310.564f)
                lineTo(448.0f, 179.0f)
                curveToRelative(0.0f, -40.62f, -35.523f, -71.992f, -75.43f, -66.359f)
                close()
                moveTo(399.997f, 310.563f)
                curveToRelative(0.0f, 11.731f, -1.334f, 23.469f, -3.965f, 34.886f)
                lineTo(368.707f, 464.0f)
                horizontalLineToRelative(-201.92f)
                lineTo(51.591f, 302.303f)
                curveToRelative(-14.439f, -20.27f, 15.023f, -42.776f, 29.394f, -22.605f)
                lineToRelative(27.128f, 38.079f)
                curveToRelative(8.995f, 12.626f, 29.031f, 6.287f, 29.031f, -9.283f)
                lineTo(137.144f, 102.0f)
                curveToRelative(0.0f, -25.645f, 36.571f, -24.81f, 36.571f, 0.691f)
                lineTo(173.715f, 256.0f)
                curveToRelative(0.0f, 8.837f, 7.163f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(6.856f)
                curveToRelative(8.837f, 0.0f, 16.0f, -7.163f, 16.0f, -16.0f)
                lineTo(212.571f, 67.0f)
                curveToRelative(0.0f, -25.663f, 36.571f, -24.81f, 36.571f, 0.691f)
                lineTo(249.142f, 256.0f)
                curveToRelative(0.0f, 8.837f, 7.163f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(6.856f)
                curveToRelative(8.837f, 0.0f, 16.0f, -7.163f, 16.0f, -16.0f)
                lineTo(287.998f, 101.125f)
                curveToRelative(0.0f, -25.672f, 36.57f, -24.81f, 36.57f, 0.691f)
                lineTo(324.568f, 256.0f)
                curveToRelative(0.0f, 8.837f, 7.163f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(6.857f)
                curveToRelative(8.837f, 0.0f, 16.0f, -7.163f, 16.0f, -16.0f)
                verticalLineToRelative(-76.309f)
                curveToRelative(0.0f, -26.242f, 36.57f, -25.64f, 36.57f, -0.691f)
                verticalLineToRelative(131.563f)
                close()
            }
        }
        .build()
        return _handPaper!!
    }

private var _handPaper: ImageVector? = null
