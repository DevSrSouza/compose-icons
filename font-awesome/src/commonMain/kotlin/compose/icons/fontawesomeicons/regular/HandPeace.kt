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

public val RegularGroup.HandPeace: ImageVector
    get() {
        if (_handPeace != null) {
            return _handPeace!!
        }
        _handPeace = Builder(name = "HandPeace", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(362.146f, 191.976f)
                curveToRelative(-13.71f, -21.649f, -38.761f, -34.016f, -65.006f, -30.341f)
                verticalLineTo(74.0f)
                curveToRelative(0.0f, -40.804f, -32.811f, -74.0f, -73.141f, -74.0f)
                curveToRelative(-40.33f, 0.0f, -73.14f, 33.196f, -73.14f, 74.0f)
                lineTo(160.0f, 168.0f)
                lineToRelative(-18.679f, -78.85f)
                curveTo(126.578f, 50.843f, 83.85f, 32.11f, 46.209f, 47.208f)
                curveTo(8.735f, 62.238f, -9.571f, 104.963f, 5.008f, 142.85f)
                lineToRelative(55.757f, 144.927f)
                curveToRelative(-30.557f, 24.956f, -43.994f, 57.809f, -24.733f, 92.218f)
                lineToRelative(54.853f, 97.999f)
                curveTo(102.625f, 498.97f, 124.73f, 512.0f, 148.575f, 512.0f)
                horizontalLineToRelative(205.702f)
                curveToRelative(30.744f, 0.0f, 57.558f, -21.44f, 64.555f, -51.797f)
                lineToRelative(27.427f, -118.999f)
                arcToRelative(67.801f, 67.801f, 0.0f, false, false, 1.729f, -15.203f)
                lineTo(448.0f, 256.0f)
                curveToRelative(0.0f, -44.956f, -43.263f, -77.343f, -85.854f, -64.024f)
                close()
                moveTo(399.987f, 326.0f)
                curveToRelative(0.0f, 1.488f, -0.169f, 2.977f, -0.502f, 4.423f)
                lineToRelative(-27.427f, 119.001f)
                curveToRelative(-1.978f, 8.582f, -9.29f, 14.576f, -17.782f, 14.576f)
                horizontalLineTo(148.575f)
                curveToRelative(-6.486f, 0.0f, -12.542f, -3.621f, -15.805f, -9.449f)
                lineToRelative(-54.854f, -98.0f)
                curveToRelative(-4.557f, -8.141f, -2.619f, -18.668f, 4.508f, -24.488f)
                lineToRelative(26.647f, -21.764f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 4.812f, -18.139f)
                lineToRelative(-64.09f, -166.549f)
                curveTo(37.226f, 92.956f, 84.37f, 74.837f, 96.51f, 106.389f)
                lineToRelative(59.784f, 155.357f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 171.227f, 272.0f)
                horizontalLineToRelative(11.632f)
                curveToRelative(8.837f, 0.0f, 16.0f, -7.163f, 16.0f, -16.0f)
                verticalLineTo(74.0f)
                curveToRelative(0.0f, -34.375f, 50.281f, -34.43f, 50.281f, 0.0f)
                verticalLineToRelative(182.0f)
                curveToRelative(0.0f, 8.837f, 7.163f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(6.856f)
                curveToRelative(8.837f, 0.0f, 16.0f, -7.163f, 16.0f, -16.0f)
                verticalLineToRelative(-28.0f)
                curveToRelative(0.0f, -25.122f, 36.567f, -25.159f, 36.567f, 0.0f)
                verticalLineToRelative(28.0f)
                curveToRelative(0.0f, 8.837f, 7.163f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(6.856f)
                curveToRelative(8.837f, 0.0f, 16.0f, -7.163f, 16.0f, -16.0f)
                curveToRelative(0.0f, -25.12f, 36.567f, -25.16f, 36.567f, 0.0f)
                verticalLineToRelative(70.0f)
                close()
            }
        }
        .build()
        return _handPeace!!
    }

private var _handPeace: ImageVector? = null
