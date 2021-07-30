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

public val SimpleIcons.Adblock: ImageVector
    get() {
        if (_adblock != null) {
            return _adblock!!
        }
        _adblock = Builder(name = "Adblock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.775f, 0.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -1.273f, 0.527f)
                lineTo(0.528f, 6.503f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 0.0f, 7.775f)
                verticalLineToRelative(8.45f)
                curveToRelative(0.0f, 0.478f, 0.19f, 0.936f, 0.528f, 1.274f)
                lineToRelative(5.974f, 5.974f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 7.775f, 24.0f)
                horizontalLineToRelative(8.45f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.273f, -0.527f)
                lineToRelative(5.975f, -5.974f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 24.0f, 16.225f)
                verticalLineToRelative(-8.45f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.527f, -1.272f)
                lineTo(17.498f, 0.527f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 16.225f, 0.0f)
                close()
                moveTo(12.202f, 3.0f)
                curveToRelative(1.02f, 0.0f, 0.958f, 1.108f, 0.958f, 1.108f)
                verticalLineToRelative(6.784f)
                reflectiveCurveToRelative(-0.009f, 0.218f, 0.16f, 0.218f)
                curveToRelative(0.188f, 0.0f, 0.175f, -0.226f, 0.175f, -0.226f)
                lineToRelative(-0.002f, -5.63f)
                reflectiveCurveToRelative(-0.05f, -0.986f, 0.959f, -0.986f)
                curveToRelative(1.01f, 0.0f, 0.97f, 0.983f, 0.97f, 0.983f)
                verticalLineToRelative(7.621f)
                reflectiveCurveToRelative(0.014f, 0.158f, 0.141f, 0.158f)
                curveToRelative(0.127f, 0.0f, 0.944f, -2.122f, 0.944f, -2.122f)
                reflectiveCurveToRelative(0.451f, -1.497f, 2.576f, -1.1f)
                curveToRelative(0.038f, 0.008f, -0.167f, 0.688f, -0.167f, 0.688f)
                lineToRelative(-2.283f, 6.556f)
                reflectiveCurveTo(15.69f, 20.7f, 11.714f, 20.7f)
                curveToRelative(-5.044f, 0.0f, -4.808f, -5.407f, -4.814f, -5.405f)
                lineTo(6.9f, 7.562f)
                reflectiveCurveToRelative(-0.016f, -0.99f, 0.897f, -0.99f)
                curveToRelative(0.858f, 0.0f, 0.849f, 0.99f, 0.849f, 0.99f)
                lineToRelative(0.007f, 3.583f)
                reflectiveCurveToRelative(-0.004f, 0.172f, 0.167f, 0.172f)
                curveToRelative(0.16f, 0.0f, 0.141f, -0.172f, 0.141f, -0.172f)
                lineToRelative(0.01f, -5.926f)
                reflectiveCurveToRelative(-0.055f, -1.162f, 0.966f, -1.162f)
                curveToRelative(1.04f, 0.0f, 0.983f, 1.142f, 0.983f, 1.142f)
                verticalLineToRelative(5.611f)
                reflectiveCurveToRelative(-0.005f, 0.204f, 0.152f, 0.204f)
                curveToRelative(0.168f, 0.0f, 0.154f, -0.206f, 0.154f, -0.206f)
                lineToRelative(0.01f, -6.693f)
                reflectiveCurveTo(11.18f, 3.0f, 12.202f, 3.0f)
                close()
            }
        }
        .build()
        return _adblock!!
    }

private var _adblock: ImageVector? = null
