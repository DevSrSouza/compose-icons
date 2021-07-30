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

public val SimpleIcons.Beijingsubway: ImageVector
    get() {
        if (_beijingsubway != null) {
            return _beijingsubway!!
        }
        _beijingsubway = Builder(name = "Beijingsubway", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8857f, 0.7537f)
                curveTo(11.2092f, -0.5f, 15.09f, -0.1816f, 18.1547f, 1.6493f)
                curveToRelative(2.826f, 1.6916f, 5.055f, 4.7166f, 5.5526f, 7.5028f)
                curveToRelative(-1.2538f, 0.0f, -1.5523f, 0.0398f, -2.7862f, 0.0398f)
                curveToRelative(-0.796f, -2.5872f, -3.7216f, -5.4729f, -6.1097f, -6.07f)
                curveToRelative(-3.1246f, -0.6567f, -5.6321f, -0.199f, -7.8014f, 1.3335f)
                curveTo(5.418f, 5.55f, 3.9253f, 7.4604f, 3.368f, 9.3312f)
                curveToRelative(-0.8159f, 2.408f, -0.1592f, 5.8112f, 1.234f, 7.9208f)
                curveToRelative(1.0945f, 1.5722f, 3.005f, 3.0648f, 4.836f, 3.642f)
                curveToRelative(1.7911f, 0.5572f, 4.7166f, 0.0397f, 6.4878f, -0.5971f)
                curveToRelative(2.4877f, -0.9155f, 4.3186f, -3.1842f, 5.1147f, -5.6918f)
                lineToRelative(-3.4628f, 0.0398f)
                curveToRelative(-0.1593f, 1.1543f, -0.3384f, 1.5523f, -1.035f, 2.8857f)
                lineToRelative(-9.4929f, -0.0199f)
                verticalLineTo(6.4257f)
                horizontalLineToRelative(9.473f)
                curveToRelative(1.1345f, 1.4328f, 1.3136f, 3.6817f, 1.3335f, 5.5723f)
                curveToRelative(0.0f, 0.0f, 3.8011f, 0.02f, 6.1296f, 0.0f)
                curveToRelative(-0.0398f, 3.6022f, -1.5523f, 7.1645f, -4.4181f, 9.3935f)
                curveToRelative(-2.0897f, 1.6518f, -4.7166f, 2.607f, -7.3834f, 2.607f)
                curveToRelative(-3.7216f, 0.0598f, -7.4232f, -1.7314f, -9.6522f, -4.7166f)
                curveTo(1.0992f, 17.451f, 0.343f, 15.2021f, 0.0445f, 12.9334f)
                curveToRelative(-0.0796f, -1.3931f, 0.02f, -2.0897f, 0.0398f, -2.1693f)
                curveTo(0.343f, 9.1521f, 0.761f, 7.56f, 1.577f, 6.167f)
                curveTo(2.9501f, 3.6792f, 5.219f, 1.7289f, 7.8857f, 0.7537f)
                moveToRelative(1.811f, 8.1795f)
                verticalLineToRelative(6.2291f)
                lineToRelative(4.5972f, 0.02f)
                curveToRelative(1.0349f, -1.1942f, 0.995f, -1.9703f, -0.0398f, -3.0649f)
                curveToRelative(1.0349f, -1.0946f, 1.0946f, -2.2488f, 0.02f, -3.1842f)
                horizontalLineTo(9.6966f)
                close()
            }
        }
        .build()
        return _beijingsubway!!
    }

private var _beijingsubway: ImageVector? = null
