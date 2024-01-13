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

public val SimpleIcons.Pinetwork: ImageVector
    get() {
        if (_pinetwork != null) {
            return _pinetwork!!
        }
        _pinetwork = Builder(name = "Pinetwork", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.002f)
                curveToRelative(-6.628f, 0.0f, -12.0f, 5.371f, -12.0f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.372f, 11.996f, 12.0f, 11.996f)
                reflectiveCurveToRelative(12.0f, -5.371f, 12.0f, -12.0f)
                curveTo(24.0f, 5.37f, 18.624f, 0.002f, 12.0f, 0.002f)
                close()
                moveTo(12.0f, 1.721f)
                curveToRelative(5.679f, 0.0f, 10.281f, 4.602f, 10.281f, 10.281f)
                reflectiveCurveTo(17.68f, 22.283f, 12.0f, 22.283f)
                reflectiveCurveTo(1.719f, 17.681f, 1.719f, 12.002f)
                reflectiveCurveTo(6.32f, 1.721f, 12.0f, 1.721f)
                close()
                moveTo(9.102f, 5.943f)
                curveToRelative(-0.123f, 0.0f, -0.227f, 0.1f, -0.227f, 0.227f)
                verticalLineToRelative(1.139f)
                curveToRelative(0.0f, 0.122f, 0.1f, 0.226f, 0.227f, 0.226f)
                horizontalLineToRelative(1.56f)
                arcToRelative(0.225f, 0.225f, 0.0f, false, false, 0.227f, -0.226f)
                verticalLineToRelative(-1.14f)
                curveToRelative(0.0f, -0.121f, -0.1f, -0.226f, -0.227f, -0.226f)
                horizontalLineToRelative(-1.56f)
                close()
                moveTo(12.787f, 5.943f)
                curveToRelative(-0.122f, 0.0f, -0.226f, 0.1f, -0.226f, 0.227f)
                verticalLineToRelative(1.139f)
                curveToRelative(0.0f, 0.122f, 0.1f, 0.226f, 0.226f, 0.226f)
                horizontalLineToRelative(1.559f)
                arcToRelative(0.228f, 0.228f, 0.0f, false, false, 0.226f, -0.226f)
                verticalLineToRelative(-1.14f)
                curveToRelative(0.0f, -0.121f, -0.1f, -0.226f, -0.226f, -0.226f)
                horizontalLineToRelative(-1.559f)
                close()
                moveTo(16.006f, 7.35f)
                verticalLineToRelative(1.19f)
                lineTo(7.352f, 8.54f)
                curveToRelative(-1.895f, 0.026f, -1.975f, 2.042f, -1.975f, 2.042f)
                verticalLineToRelative(1.461f)
                lineTo(7.43f, 12.043f)
                lineToRelative(0.008f, -1.447f)
                horizontalLineToRelative(1.398f)
                verticalLineToRelative(7.574f)
                curveToRelative(-0.005f, 0.457f, 0.451f, 0.285f, 0.451f, 0.285f)
                lineToRelative(1.461f, -0.516f)
                curveToRelative(0.23f, -0.099f, 0.186f, -0.308f, 0.186f, -0.308f)
                verticalLineToRelative(-7.022f)
                horizontalLineToRelative(1.591f)
                verticalLineToRelative(7.641f)
                curveToRelative(0.014f, 0.357f, 0.366f, 0.213f, 0.366f, 0.213f)
                lineToRelative(1.591f, -0.565f)
                curveToRelative(0.14f, -0.076f, 0.118f, -0.195f, 0.118f, -0.195f)
                lineToRelative(-0.022f, -7.062f)
                lineToRelative(1.527f, -0.04f)
                curveToRelative(1.909f, -0.027f, 1.963f, -2.103f, 1.963f, -2.103f)
                lineTo(18.068f, 7.35f)
                horizontalLineToRelative(-2.062f)
            }
        }
        .build()
        return _pinetwork!!
    }

private var _pinetwork: ImageVector? = null
