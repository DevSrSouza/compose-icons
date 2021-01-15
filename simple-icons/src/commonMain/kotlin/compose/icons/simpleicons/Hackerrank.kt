package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Hackerrank: ImageVector
    get() {
        if (_hackerrank != null) {
            return _hackerrank!!
        }
        _hackerrank = Builder(name = "Hackerrank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(1.285f, 0.0f, 9.75f, 4.886f, 10.392f, 6.0f)
                curveToRelative(0.645f, 1.115f, 0.645f, 10.885f, 0.0f, 12.0f)
                reflectiveCurveTo(13.287f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(-9.75f, -4.885f, -10.395f, -6.0f)
                curveToRelative(-0.641f, -1.115f, -0.641f, -10.885f, 0.0f, -12.0f)
                curveTo(2.25f, 4.886f, 10.715f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(14.295f, 6.799f)
                curveToRelative(-0.141f, 0.0f, -0.258f, 0.115f, -0.258f, 0.258f)
                verticalLineToRelative(3.875f)
                lineTo(9.963f, 10.932f)
                lineTo(9.963f, 6.908f)
                horizontalLineToRelative(0.701f)
                curveToRelative(0.141f, 0.0f, 0.254f, -0.115f, 0.254f, -0.258f)
                curveToRelative(0.0f, -0.094f, -0.049f, -0.176f, -0.123f, -0.221f)
                lineTo(9.223f, 4.92f)
                curveToRelative(-0.049f, -0.063f, -0.141f, -0.109f, -0.226f, -0.109f)
                curveToRelative(-0.084f, 0.0f, -0.16f, 0.045f, -0.207f, 0.107f)
                lineTo(7.11f, 6.43f)
                curveToRelative(-0.072f, 0.045f, -0.12f, 0.126f, -0.12f, 0.218f)
                curveToRelative(0.0f, 0.143f, 0.113f, 0.258f, 0.255f, 0.258f)
                horizontalLineToRelative(0.704f)
                lineToRelative(0.008f, 10.035f)
                curveToRelative(0.0f, 0.145f, 0.111f, 0.258f, 0.254f, 0.258f)
                horizontalLineToRelative(1.492f)
                curveToRelative(0.142f, 0.0f, 0.259f, -0.115f, 0.259f, -0.256f)
                verticalLineToRelative(-4.004f)
                horizontalLineToRelative(4.073f)
                verticalLineToRelative(4.152f)
                horizontalLineToRelative(-0.699f)
                curveToRelative(-0.143f, 0.0f, -0.256f, 0.115f, -0.256f, 0.258f)
                curveToRelative(0.0f, 0.092f, 0.048f, 0.174f, 0.119f, 0.219f)
                lineToRelative(1.579f, 1.51f)
                curveToRelative(0.044f, 0.061f, 0.141f, 0.109f, 0.225f, 0.109f)
                curveToRelative(0.085f, 0.0f, 0.159f, -0.045f, 0.208f, -0.109f)
                lineToRelative(1.679f, -1.51f)
                curveToRelative(0.072f, -0.045f, 0.12f, -0.127f, 0.12f, -0.219f)
                curveToRelative(0.0f, -0.143f, -0.115f, -0.258f, -0.255f, -0.258f)
                horizontalLineToRelative(-0.704f)
                lineToRelative(-0.007f, -10.034f)
                curveToRelative(0.0f, -0.145f, -0.114f, -0.26f, -0.255f, -0.26f)
                horizontalLineToRelative(-1.494f)
                verticalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _hackerrank!!
    }

private var _hackerrank: ImageVector? = null
