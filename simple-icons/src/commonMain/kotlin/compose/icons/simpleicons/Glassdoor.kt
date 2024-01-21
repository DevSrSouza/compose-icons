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

public val SimpleIcons.Glassdoor: ImageVector
    get() {
        if (_glassdoor != null) {
            return _glassdoor!!
        }
        _glassdoor = Builder(name = "Glassdoor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1093f, 6.0E-4f)
                curveToRelative(-0.0749f, -0.0074f, -0.1348f, 0.0522f, -0.1348f, 0.127f)
                verticalLineToRelative(3.451f)
                curveToRelative(0.0f, 0.0673f, 0.0537f, 0.1194f, 0.121f, 0.127f)
                curveToRelative(2.619f, 0.172f, 4.6092f, 0.9501f, 4.6092f, 3.6814f)
                horizontalLineTo(13.086f)
                arcToRelative(0.1343f, 0.1343f, 0.0f, false, false, -0.1348f, 0.1347f)
                verticalLineToRelative(8.9644f)
                curveToRelative(0.0f, 0.0748f, 0.06f, 0.1347f, 0.1348f, 0.1347f)
                horizontalLineToRelative(10.0034f)
                curveToRelative(0.0748f, 0.0f, 0.1347f, -0.0599f, 0.1347f, -0.1347f)
                verticalLineTo(7.342f)
                curveToRelative(0.0f, -2.2374f, -0.7996f, -4.0558f, -2.4159f, -5.3279f)
                curveTo(19.3191f, 0.8469f, 17.0874f, 0.1428f, 14.1093f, 6.0E-4f)
                close()
                moveTo(0.9107f, 7.387f)
                arcToRelative(0.1342f, 0.1342f, 0.0f, false, false, -0.1347f, 0.1347f)
                verticalLineToRelative(8.9566f)
                curveToRelative(0.0f, 0.0748f, 0.06f, 0.1347f, 0.1347f, 0.1347f)
                horizontalLineToRelative(5.6189f)
                curveToRelative(0.0f, 2.7313f, -1.9902f, 3.5094f, -4.6091f, 3.6815f)
                curveToRelative(-0.0674f, 0.0075f, -0.1192f, 0.0596f, -0.1192f, 0.127f)
                verticalLineToRelative(3.451f)
                curveToRelative(0.0f, 0.0747f, 0.06f, 0.1343f, 0.1348f, 0.1269f)
                curveToRelative(2.9781f, -0.1422f, 5.2078f, -0.8463f, 6.6969f, -2.0136f)
                curveToRelative(1.6163f, -1.272f, 2.4159f, -3.0905f, 2.4159f, -5.3278f)
                verticalLineTo(7.5217f)
                arcToRelative(0.1343f, 0.1343f, 0.0f, false, false, -0.1348f, -0.1347f)
                close()
            }
        }
        .build()
        return _glassdoor!!
    }

private var _glassdoor: ImageVector? = null
