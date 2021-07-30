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

public val SimpleIcons.Blazor: ImageVector
    get() {
        if (_blazor != null) {
            return _blazor!!
        }
        _blazor = Builder(name = "Blazor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.8337f, 8.1013f)
                arcToRelative(13.9123f, 13.9123f, 0.0f, false, true, -13.6424f, 11.72f)
                arcToRelative(10.1053f, 10.1053f, 0.0f, false, true, -1.994f, -0.121f)
                arcToRelative(6.111f, 6.111f, 0.0f, false, true, -5.0824f, -5.7607f)
                arcToRelative(5.9344f, 5.9344f, 0.0f, false, true, 11.867f, -0.0838f)
                curveToRelative(0.025f, 0.9835f, -0.4011f, 1.8464f, -1.277f, 1.8713f)
                curveToRelative(-0.9356f, 0.0f, -1.3742f, -0.6677f, -1.3742f, -1.5674f)
                verticalLineToRelative(-2.5001f)
                arcToRelative(1.5313f, 1.5313f, 0.0f, false, false, -1.5196f, -1.5328f)
                lineTo(8.7152f, 10.1268f)
                arcToRelative(3.6481f, 3.6481f, 0.0f, true, false, 2.6948f, 6.0794f)
                lineToRelative(0.0733f, -0.1093f)
                lineToRelative(0.0734f, 0.1213f)
                arcToRelative(2.5807f, 2.5807f, 0.0f, false, false, 2.2007f, 1.0479f)
                arcToRelative(2.9088f, 2.9088f, 0.0f, false, false, 2.6947f, -3.0406f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, false, -0.217f, -1.9324f)
                arcToRelative(7.4043f, 7.4043f, 0.0f, false, false, -14.6395f, 1.6033f)
                arcToRelative(7.4971f, 7.4971f, 0.0f, false, false, 7.307f, 7.4043f)
                reflectiveCurveToRelative(0.549f, 0.05f, 1.1677f, 0.0357f)
                arcToRelative(15.8029f, 15.8029f, 0.0f, false, false, 8.4747f, -2.5283f)
                curveToRelative(0.036f, -0.025f, 0.0719f, 0.025f, 0.048f, 0.0614f)
                arcToRelative(12.4392f, 12.4392f, 0.0f, false, true, -9.6901f, 3.9625f)
                arcTo(8.7442f, 8.7442f, 0.0f, false, true, 0.003f, 13.8603f)
                arcToRelative(9.049f, 9.049f, 0.0f, false, true, 3.6349f, -7.2471f)
                arcToRelative(8.8634f, 8.8634f, 0.0f, false, true, 5.229f, -1.7262f)
                horizontalLineToRelative(2.813f)
                arcToRelative(7.9145f, 7.9145f, 0.0f, false, false, 5.8386f, -2.5777f)
                arcToRelative(0.1093f, 0.1093f, 0.0f, false, true, 0.0594f, -0.034f)
                arcToRelative(0.1115f, 0.1115f, 0.0f, false, true, 0.1195f, 0.0522f)
                arcToRelative(0.113f, 0.113f, 0.0f, false, true, 0.0155f, 0.0672f)
                arcToRelative(7.9345f, 7.9345f, 0.0f, false, true, -1.2274f, 3.5493f)
                arcToRelative(0.1075f, 0.1075f, 0.0f, false, false, -0.0132f, 0.0609f)
                arcToRelative(0.1098f, 0.1098f, 0.0f, false, false, 0.0724f, 0.0945f)
                arcToRelative(0.109f, 0.109f, 0.0f, false, false, 0.0619f, 0.0033f)
                arcToRelative(8.5054f, 8.5054f, 0.0f, false, false, 5.9134f, -4.876f)
                arcToRelative(0.1554f, 0.1554f, 0.0f, false, true, 0.0546f, -0.0527f)
                arcToRelative(0.1497f, 0.1497f, 0.0f, false, true, 0.147f, 0.0f)
                arcToRelative(0.1535f, 0.1535f, 0.0f, false, true, 0.0546f, 0.0527f)
                arcToRelative(10.779f, 10.779f, 0.0f, false, true, 1.0575f, 6.8746f)
                close()
                moveTo(8.8954f, 11.6283f)
                arcToRelative(2.188f, 2.188f, 0.0f, true, false, 2.1877f, 2.1878f)
                verticalLineToRelative(-2.0425f)
                arcToRelative(0.1577f, 0.1577f, 0.0f, false, false, -0.1497f, -0.1497f)
                close()
            }
        }
        .build()
        return _blazor!!
    }

private var _blazor: ImageVector? = null
