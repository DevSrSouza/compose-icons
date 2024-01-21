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

public val SimpleIcons.Sitecore: ImageVector
    get() {
        if (_sitecore != null) {
            return _sitecore!!
        }
        _sitecore = Builder(name = "Sitecore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.37f, 0.0f, 0.0f, 5.37f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.37f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.37f, 12.0f, -12.0f)
                reflectiveCurveTo(18.63f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 3.266f)
                arcTo(8.714f, 8.714f, 0.0f, false, true, 20.734f, 12.0f)
                curveToRelative(0.0f, 4.815f, -3.92f, 8.734f, -8.734f, 8.734f)
                arcTo(8.73f, 8.73f, 0.0f, false, true, 3.266f, 12.0f)
                arcTo(8.73f, 8.73f, 0.0f, false, true, 12.0f, 3.266f)
                close()
                moveTo(18.701f, 7.113f)
                lineTo(15.823f, 8.952f)
                curveToRelative(0.87f, 1.379f, 0.991f, 2.879f, 0.314f, 4.403f)
                curveToRelative(-0.774f, 1.838f, -2.613f, 3.41f, -4.694f, 4.16f)
                arcToRelative(7.337f, 7.337f, 0.0f, false, false, 2.662f, -0.87f)
                curveToRelative(2.032f, -1.137f, 3.194f, -3.073f, 3.29f, -5.468f)
                verticalLineToRelative(-0.218f)
                horizontalLineToRelative(2.83f)
                curveToRelative(-0.168f, -1.427f, -0.725f, -2.734f, -1.524f, -3.846f)
                close()
                moveTo(17.831f, 11.395f)
                curveToRelative(-0.17f, 2.42f, -1.428f, 4.476f, -3.508f, 5.613f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, -3.92f, 0.992f)
                arcToRelative(9.19f, 9.19f, 0.0f, false, true, -3.194f, -0.58f)
                curveToRelative(1.259f, 0.774f, 2.662f, 1.21f, 4.113f, 1.21f)
                horizontalLineToRelative(0.025f)
                curveToRelative(2.613f, 0.0f, 4.984f, -1.38f, 6.314f, -3.727f)
                lineToRelative(0.121f, -0.193f)
                lineToRelative(1.621f, 1.04f)
                arcTo(8.166f, 8.166f, 0.0f, false, false, 20.3f, 12.0f)
                curveToRelative(0.0f, -0.194f, -0.025f, -0.387f, -0.025f, -0.605f)
                close()
                moveTo(17.903f, 15.338f)
                curveToRelative(-1.427f, 2.323f, -3.846f, 3.726f, -6.556f, 3.726f)
                curveToRelative(-2.637f, 0.0f, -5.105f, -1.306f, -6.847f, -3.532f)
                curveToRelative(1.33f, 2.807f, 4.185f, 4.766f, 7.5f, 4.766f)
                arcToRelative(8.267f, 8.267f, 0.0f, false, false, 7.185f, -4.161f)
                close()
            }
        }
        .build()
        return _sitecore!!
    }

private var _sitecore: ImageVector? = null
