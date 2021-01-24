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

public val SolidGroup.LowVision: ImageVector
    get() {
        if (_lowVision != null) {
            return _lowVision!!
        }
        _lowVision = Builder(name = "LowVision", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(569.344f, 231.631f)
                curveTo(512.96f, 135.949f, 407.81f, 72.0f, 288.0f, 72.0f)
                curveToRelative(-28.468f, 0.0f, -56.102f, 3.619f, -82.451f, 10.409f)
                lineTo(152.778f, 10.24f)
                curveToRelative(-7.601f, -10.858f, -22.564f, -13.5f, -33.423f, -5.9f)
                lineToRelative(-13.114f, 9.178f)
                curveToRelative(-10.86f, 7.601f, -13.502f, 22.566f, -5.9f, 33.426f)
                lineToRelative(43.131f, 58.395f)
                curveTo(89.449f, 131.73f, 40.228f, 174.683f, 6.682f, 231.581f)
                curveToRelative(-0.01f, 0.017f, -0.023f, 0.033f, -0.034f, 0.05f)
                curveToRelative(-8.765f, 14.875f, -8.964f, 33.528f, 0.0f, 48.739f)
                curveToRelative(38.5f, 65.332f, 99.742f, 115.862f, 172.859f, 141.349f)
                lineTo(55.316f, 244.302f)
                arcTo(272.194f, 272.194f, 0.0f, false, true, 83.61f, 208.39f)
                lineToRelative(119.4f, 170.58f)
                horizontalLineToRelative(0.01f)
                lineToRelative(40.63f, 58.04f)
                arcToRelative(330.055f, 330.055f, 0.0f, false, false, 78.94f, 1.17f)
                lineToRelative(-189.98f, -271.4f)
                arcToRelative(277.628f, 277.628f, 0.0f, false, true, 38.777f, -21.563f)
                lineToRelative(251.836f, 356.544f)
                curveToRelative(7.601f, 10.858f, 22.564f, 13.499f, 33.423f, 5.9f)
                lineToRelative(13.114f, -9.178f)
                curveToRelative(10.86f, -7.601f, 13.502f, -22.567f, 5.9f, -33.426f)
                lineToRelative(-43.12f, -58.377f)
                lineToRelative(-0.007f, -0.009f)
                curveToRelative(57.161f, -27.978f, 104.835f, -72.04f, 136.81f, -126.301f)
                arcToRelative(47.938f, 47.938f, 0.0f, false, false, 0.001f, -48.739f)
                close()
                moveTo(390.026f, 345.94f)
                lineToRelative(-19.066f, -27.23f)
                curveToRelative(24.682f, -32.567f, 27.711f, -76.353f, 8.8f, -111.68f)
                verticalLineToRelative(0.03f)
                curveToRelative(0.0f, 23.65f, -19.17f, 42.82f, -42.82f, 42.82f)
                curveToRelative(-23.828f, 0.0f, -42.82f, -19.349f, -42.82f, -42.82f)
                curveToRelative(0.0f, -23.65f, 19.17f, -42.82f, 42.82f, -42.82f)
                horizontalLineToRelative(0.03f)
                curveToRelative(-24.75f, -13.249f, -53.522f, -15.643f, -79.51f, -7.68f)
                lineToRelative(-19.068f, -27.237f)
                curveTo(253.758f, 123.306f, 270.488f, 120.0f, 288.0f, 120.0f)
                curveToRelative(75.162f, 0.0f, 136.0f, 60.826f, 136.0f, 136.0f)
                curveToRelative(0.0f, 34.504f, -12.833f, 65.975f, -33.974f, 89.94f)
                close()
            }
        }
        .build()
        return _lowVision!!
    }

private var _lowVision: ImageVector? = null
