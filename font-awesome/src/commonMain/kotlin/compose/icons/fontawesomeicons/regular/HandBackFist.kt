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

public val RegularGroup.HandBackFist: ImageVector
    get() {
        if (_handBackFist != null) {
            return _handBackFist!!
        }
        _handBackFist = Builder(name = "HandBackFist", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(377.1f, 68.05f)
                curveTo(364.4f, 50.65f, 343.7f, 40.0f, 321.2f, 40.0f)
                horizontalLineToRelative(-13.53f)
                curveToRelative(-3.518f, 0.0f, -7.039f, 0.275f, -10.53f, 0.818f)
                curveTo(284.8f, 31.33f, 269.6f, 26.0f, 253.5f, 26.0f)
                horizontalLineTo(240.0f)
                curveToRelative(-3.977f, 0.0f, -7.904f, 0.369f, -11.75f, 1.084f)
                curveTo(216.7f, 10.71f, 197.6f, 0.0f, 176.0f, 0.0f)
                horizontalLineTo(160.0f)
                curveTo(124.7f, 0.0f, 96.0f, 28.65f, 96.0f, 64.0f)
                verticalLineToRelative(49.71f)
                lineTo(63.04f, 143.3f)
                curveTo(43.3f, 160.0f, 32.0f, 184.6f, 32.0f, 210.9f)
                verticalLineToRelative(78.97f)
                curveToRelative(0.0f, 32.1f, 17.11f, 61.65f, 44.65f, 77.12f)
                lineTo(112.0f, 386.9f)
                verticalLineToRelative(101.1f)
                curveTo(112.0f, 501.3f, 122.7f, 512.0f, 135.1f, 512.0f)
                reflectiveCurveTo(160.0f, 501.3f, 160.0f, 488.0f)
                verticalLineToRelative(-129.9f)
                curveToRelative(-1.316f, -0.654f, -2.775f, -0.92f, -4.062f, -1.639f)
                lineToRelative(-55.78f, -31.34f)
                curveTo(87.72f, 318.2f, 80.0f, 304.6f, 80.0f, 289.9f)
                verticalLineTo(210.9f)
                curveToRelative(0.0f, -12.31f, 5.281f, -23.77f, 14.5f, -31.39f)
                lineTo(112.0f, 163.8f)
                verticalLineTo(208.0f)
                curveTo(112.0f, 216.8f, 119.2f, 224.0f, 128.0f, 224.0f)
                reflectiveCurveToRelative(16.0f, -7.156f, 16.0f, -16.0f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -8.828f, 7.188f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                curveTo(184.8f, 48.0f, 192.0f, 55.17f, 192.0f, 64.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 9.578f, 7.942f, 16.04f, 16.15f, 16.04f)
                curveToRelative(6.432f, 0.0f, 12.31f, -4.018f, 14.73f, -10.17f)
                curveTo(223.3f, 84.84f, 228.3f, 74.0f, 240.0f, 74.0f)
                horizontalLineToRelative(13.53f)
                curveToRelative(20.97f, 0.0f, 17.92f, 19.58f, 34.27f, 19.58f)
                curveToRelative(8.177f, 0.0f, 9.9f, -5.584f, 19.88f, -5.584f)
                horizontalLineToRelative(13.53f)
                curveToRelative(25.54f, 0.0f, 18.27f, 28.23f, 38.66f, 28.23f)
                curveToRelative(0.156f, 0.0f, 0.313f, -0.002f, 0.467f, -0.008f)
                lineTo(375.4f, 116.0f)
                curveTo(388.1f, 116.0f, 400.0f, 127.7f, 400.0f, 142.0f)
                verticalLineTo(272.0f)
                curveToRelative(0.0f, 36.15f, -19.54f, 67.32f, -48.0f, 83.69f)
                verticalLineToRelative(132.3f)
                curveTo(352.0f, 501.3f, 362.7f, 512.0f, 375.1f, 512.0f)
                reflectiveCurveTo(400.0f, 501.3f, 400.0f, 488.0f)
                verticalLineToRelative(-108.1f)
                curveTo(430.1f, 352.8f, 448.0f, 313.6f, 448.0f, 272.0f)
                verticalLineTo(142.0f)
                curveTo(448.0f, 102.1f, 416.8f, 69.44f, 377.1f, 68.05f)
                close()
            }
        }
        .build()
        return _handBackFist!!
    }

private var _handBackFist: ImageVector? = null
