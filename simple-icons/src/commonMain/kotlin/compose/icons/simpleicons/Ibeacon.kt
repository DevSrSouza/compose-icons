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

public val SimpleIcons.Ibeacon: ImageVector
    get() {
        if (_ibeacon != null) {
            return _ibeacon!!
        }
        _ibeacon = Builder(name = "Ibeacon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.053f)
                curveToRelative(-6.617f, 0.0f, -12.0f, 5.383f, -12.0f, 12.0f)
                curveToRelative(0.0f, 6.077f, 4.541f, 11.113f, 10.408f, 11.894f)
                verticalLineToRelative(-0.364f)
                curveTo(4.741f, 22.804f, 0.36f, 17.931f, 0.36f, 12.053f)
                curveTo(0.36f, 5.635f, 5.582f, 0.413f, 12.0f, 0.413f)
                reflectiveCurveToRelative(11.64f, 5.222f, 11.64f, 11.64f)
                curveToRelative(0.0f, 5.878f, -4.38f, 10.751f, -10.048f, 11.53f)
                verticalLineToRelative(0.364f)
                curveTo(19.459f, 23.166f, 24.0f, 18.13f, 24.0f, 12.053f)
                curveToRelative(0.0f, -6.617f, -5.383f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(12.0f, 1.749f)
                curveToRelative(-5.653f, 0.0f, -10.251f, 4.598f, -10.251f, 10.25f)
                curveToRelative(0.0f, 5.112f, 3.76f, 9.362f, 8.66f, 10.129f)
                verticalLineToRelative(-0.366f)
                curveToRelative(-4.7f, -0.763f, -8.3f, -4.85f, -8.3f, -9.762f)
                curveToRelative(0.0f, -5.454f, 4.437f, -9.89f, 9.891f, -9.89f)
                reflectiveCurveToRelative(9.891f, 4.436f, 9.891f, 9.89f)
                curveToRelative(0.0f, 4.912f, -3.6f, 8.999f, -8.3f, 9.762f)
                verticalLineToRelative(0.366f)
                curveToRelative(4.9f, -0.767f, 8.66f, -5.017f, 8.66f, -10.128f)
                curveToRelative(0.0f, -5.653f, -4.598f, -10.25f, -10.251f, -10.25f)
                close()
                moveTo(12.0f, 3.485f)
                curveToRelative(-4.695f, 0.0f, -8.515f, 3.82f, -8.515f, 8.515f)
                curveToRelative(0.0f, 4.151f, 2.986f, 7.618f, 6.923f, 8.365f)
                verticalLineToRelative(-0.367f)
                curveTo(6.671f, 19.256f, 3.845f, 15.952f, 3.845f, 12.0f)
                curveToRelative(0.0f, -4.496f, 3.659f, -8.155f, 8.155f, -8.155f)
                curveToRelative(4.496f, 0.0f, 8.154f, 3.659f, 8.154f, 8.155f)
                curveToRelative(0.0f, 3.952f, -2.825f, 7.256f, -6.562f, 7.998f)
                verticalLineToRelative(0.367f)
                curveToRelative(3.937f, -0.747f, 6.923f, -4.214f, 6.923f, -8.365f)
                curveToRelative(0.0f, -4.695f, -3.82f, -8.515f, -8.515f, -8.515f)
                close()
                moveTo(12.0f, 5.21f)
                arcTo(6.798f, 6.798f, 0.0f, false, false, 5.21f, 12.0f)
                curveToRelative(0.0f, 3.196f, 2.22f, 5.883f, 5.198f, 6.602f)
                verticalLineToRelative(-0.372f)
                curveTo(7.63f, 17.52f, 5.57f, 14.996f, 5.57f, 12.0f)
                arcTo(6.437f, 6.437f, 0.0f, false, true, 12.0f, 5.57f)
                arcTo(6.437f, 6.437f, 0.0f, false, true, 18.43f, 12.0f)
                curveToRelative(0.0f, 2.996f, -2.06f, 5.52f, -4.838f, 6.23f)
                verticalLineToRelative(0.372f)
                curveToRelative(2.979f, -0.719f, 5.198f, -3.406f, 5.198f, -6.602f)
                arcTo(6.798f, 6.798f, 0.0f, false, false, 12.0f, 5.21f)
                close()
                moveTo(12.0f, 6.959f)
                arcTo(5.047f, 5.047f, 0.0f, false, false, 6.959f, 12.0f)
                arcToRelative(5.05f, 5.05f, 0.0f, false, false, 3.45f, 4.782f)
                verticalLineToRelative(-0.38f)
                arcTo(4.689f, 4.689f, 0.0f, false, true, 7.318f, 12.0f)
                curveToRelative(0.0f, -2.58f, 2.1f, -4.68f, 4.681f, -4.68f)
                reflectiveCurveToRelative(4.68f, 2.1f, 4.68f, 4.68f)
                arcToRelative(4.689f, 4.689f, 0.0f, false, true, -3.088f, 4.402f)
                verticalLineToRelative(0.38f)
                arcTo(5.05f, 5.05f, 0.0f, false, false, 17.042f, 12.0f)
                arcTo(5.047f, 5.047f, 0.0f, false, false, 12.0f, 6.96f)
                close()
                moveTo(12.0f, 8.696f)
                arcTo(3.308f, 3.308f, 0.0f, false, false, 8.696f, 12.0f)
                curveToRelative(0.0f, 1.245f, 0.692f, 2.33f, 1.712f, 2.894f)
                verticalLineToRelative(-0.42f)
                arcToRelative(2.943f, 2.943f, 0.0f, true, true, 3.184f, 0.0f)
                verticalLineToRelative(0.42f)
                arcTo(3.306f, 3.306f, 0.0f, false, false, 15.304f, 12.0f)
                arcTo(3.308f, 3.308f, 0.0f, false, false, 12.0f, 8.696f)
                close()
                moveTo(12.0f, 10.408f)
                arcTo(1.592f, 1.592f, 0.0f, false, false, 10.408f, 12.0f)
                arcTo(1.592f, 1.592f, 0.0f, false, false, 12.0f, 13.592f)
                arcTo(1.592f, 1.592f, 0.0f, false, false, 13.592f, 12.0f)
                arcTo(1.592f, 1.592f, 0.0f, false, false, 12.0f, 10.408f)
                close()
            }
        }
        .build()
        return _ibeacon!!
    }

private var _ibeacon: ImageVector? = null
