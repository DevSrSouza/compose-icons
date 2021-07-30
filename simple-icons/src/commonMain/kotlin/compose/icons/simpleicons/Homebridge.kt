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

public val SimpleIcons.Homebridge: ImageVector
    get() {
        if (_homebridge != null) {
            return _homebridge!!
        }
        _homebridge = Builder(name = "Homebridge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(20.116f, 12.262f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.741f, -0.74f)
                curveToRelative(0.0f, -0.008f, 0.005f, -0.016f, 0.005f, -0.025f)
                lineToRelative(-1.46f, -1.46f)
                arcToRelative(1.31f, 1.31f, 0.0f, false, true, -0.38f, -0.917f)
                lineTo(17.54f, 5.731f)
                arcToRelative(0.285f, 0.285f, 0.0f, false, false, -0.284f, -0.283f)
                horizontalLineToRelative(-0.915f)
                arcToRelative(0.284f, 0.284f, 0.0f, false, false, -0.284f, 0.283f)
                verticalLineToRelative(2.413f)
                lineTo(12.17f, 4.383f)
                arcToRelative(0.284f, 0.284f, 0.0f, false, false, -0.4f, 0.003f)
                lineTo(4.438f, 11.72f)
                arcToRelative(0.283f, 0.283f, 0.0f, false, false, 0.0f, 0.4f)
                lineToRelative(0.696f, 0.697f)
                arcToRelative(0.286f, 0.286f, 0.0f, false, false, 0.4f, 0.0f)
                lineToRelative(5.635f, -5.552f)
                arcToRelative(1.302f, 1.302f, 0.0f, false, true, 1.83f, 0.008f)
                lineToRelative(5.525f, 5.525f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, 0.0f, 1.836f)
                lineToRelative(-0.679f, 0.68f)
                arcToRelative(1.305f, 1.305f, 0.0f, false, true, -1.824f, 0.012f)
                lineToRelative(-3.876f, -3.766f)
                arcToRelative(0.283f, 0.283f, 0.0f, false, false, -0.4f, 0.004f)
                lineToRelative(-3.723f, 3.74f)
                arcToRelative(0.285f, 0.285f, 0.0f, false, false, 0.0f, 0.4f)
                lineToRelative(0.687f, 0.69f)
                arcToRelative(0.283f, 0.283f, 0.0f, false, false, 0.4f, 0.0f)
                lineToRelative(2.013f, -1.986f)
                arcToRelative(1.302f, 1.302f, 0.0f, false, true, 1.824f, 0.0f)
                lineToRelative(1.994f, 1.96f)
                lineToRelative(0.007f, 0.007f)
                arcToRelative(1.299f, 1.299f, 0.0f, false, true, 0.0f, 1.837f)
                lineToRelative(-1.985f, 1.984f)
                verticalLineToRelative(0.013f)
                arcToRelative(0.74f, 0.74f, 0.0f, true, true, -0.74f, -0.741f)
                curveToRelative(0.009f, 0.0f, 0.016f, 0.005f, 0.025f, 0.005f)
                lineToRelative(1.975f, -1.98f)
                arcToRelative(0.284f, 0.284f, 0.0f, false, false, 0.084f, -0.201f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, false, -0.085f, -0.2f)
                lineToRelative(-1.995f, -1.96f)
                arcToRelative(0.285f, 0.285f, 0.0f, false, false, -0.4f, 0.0f)
                lineToRelative(-2.006f, 1.98f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -1.83f, -0.004f)
                lineToRelative(-0.69f, -0.689f)
                arcToRelative(1.301f, 1.301f, 0.0f, false, true, 0.0f, -1.834f)
                lineToRelative(3.72f, -3.74f)
                arcToRelative(1.303f, 1.303f, 0.0f, false, true, 1.826f, -0.016f)
                lineToRelative(3.879f, 3.758f)
                arcToRelative(0.285f, 0.285f, 0.0f, false, false, 0.4f, 0.0f)
                lineToRelative(0.679f, -0.679f)
                arcToRelative(0.285f, 0.285f, 0.0f, false, false, 0.0f, -0.4f)
                lineTo(12.28f, 7.986f)
                arcToRelative(0.284f, 0.284f, 0.0f, false, false, -0.4f, 0.0f)
                lineToRelative(-5.637f, 5.555f)
                arcToRelative(1.301f, 1.301f, 0.0f, false, true, -1.829f, -0.008f)
                lineToRelative(-0.698f, -0.694f)
                lineToRelative(-0.002f, -0.003f)
                arcToRelative(1.296f, 1.296f, 0.0f, false, true, 0.002f, -1.834f)
                lineToRelative(7.334f, -7.334f)
                arcToRelative(1.305f, 1.305f, 0.0f, false, true, 1.821f, -0.015f)
                lineToRelative(2.166f, 2.097f)
                verticalLineToRelative(-0.019f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, 1.299f, -1.298f)
                horizontalLineToRelative(0.916f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, 1.298f, 1.298f)
                verticalLineToRelative(3.384f)
                arcToRelative(0.282f, 0.282f, 0.0f, false, false, 0.083f, 0.2f)
                lineToRelative(1.467f, 1.467f)
                horizontalLineToRelative(0.014f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, 0.001f, 1.48f)
                close()
            }
        }
        .build()
        return _homebridge!!
    }

private var _homebridge: ImageVector? = null
