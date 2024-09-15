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
                moveTo(569.34f, 231.63f)
                curveTo(512.96f, 135.95f, 407.81f, 72.0f, 288.0f, 72.0f)
                curveToRelative(-28.47f, 0.0f, -56.1f, 3.62f, -82.45f, 10.41f)
                lineTo(152.78f, 10.24f)
                curveToRelative(-7.6f, -10.86f, -22.56f, -13.5f, -33.42f, -5.9f)
                lineToRelative(-13.11f, 9.18f)
                curveToRelative(-10.86f, 7.6f, -13.5f, 22.57f, -5.9f, 33.43f)
                lineToRelative(43.13f, 58.4f)
                curveTo(89.45f, 131.73f, 40.23f, 174.68f, 6.68f, 231.58f)
                curveToRelative(-0.01f, 0.02f, -0.02f, 0.03f, -0.03f, 0.05f)
                curveToRelative(-8.77f, 14.88f, -8.96f, 33.53f, 0.0f, 48.74f)
                curveToRelative(38.5f, 65.33f, 99.74f, 115.86f, 172.86f, 141.35f)
                lineTo(55.32f, 244.3f)
                arcTo(272.19f, 272.19f, 0.0f, false, true, 83.61f, 208.39f)
                lineToRelative(119.4f, 170.58f)
                horizontalLineToRelative(0.01f)
                lineToRelative(40.63f, 58.04f)
                arcToRelative(330.05f, 330.05f, 0.0f, false, false, 78.94f, 1.17f)
                lineToRelative(-189.98f, -271.4f)
                arcToRelative(277.63f, 277.63f, 0.0f, false, true, 38.78f, -21.56f)
                lineToRelative(251.84f, 356.54f)
                curveToRelative(7.6f, 10.86f, 22.56f, 13.5f, 33.42f, 5.9f)
                lineToRelative(13.11f, -9.18f)
                curveToRelative(10.86f, -7.6f, 13.5f, -22.57f, 5.9f, -33.43f)
                lineToRelative(-43.12f, -58.38f)
                lineToRelative(-0.01f, -0.01f)
                curveToRelative(57.16f, -27.98f, 104.83f, -72.04f, 136.81f, -126.3f)
                arcToRelative(47.94f, 47.94f, 0.0f, false, false, 0.0f, -48.74f)
                close()
                moveTo(390.03f, 345.94f)
                lineToRelative(-19.07f, -27.23f)
                curveToRelative(24.68f, -32.57f, 27.71f, -76.35f, 8.8f, -111.68f)
                verticalLineToRelative(0.03f)
                curveToRelative(0.0f, 23.65f, -19.17f, 42.82f, -42.82f, 42.82f)
                curveToRelative(-23.83f, 0.0f, -42.82f, -19.35f, -42.82f, -42.82f)
                curveToRelative(0.0f, -23.65f, 19.17f, -42.82f, 42.82f, -42.82f)
                horizontalLineToRelative(0.03f)
                curveToRelative(-24.75f, -13.25f, -53.52f, -15.64f, -79.51f, -7.68f)
                lineToRelative(-19.07f, -27.24f)
                curveTo(253.76f, 123.31f, 270.49f, 120.0f, 288.0f, 120.0f)
                curveToRelative(75.16f, 0.0f, 136.0f, 60.83f, 136.0f, 136.0f)
                curveToRelative(0.0f, 34.5f, -12.83f, 65.97f, -33.97f, 89.94f)
                close()
            }
        }
        .build()
        return _lowVision!!
    }

private var _lowVision: ImageVector? = null
