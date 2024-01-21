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

public val SimpleIcons.Voipdotms: ImageVector
    get() {
        if (_voipdotms != null) {
            return _voipdotms!!
        }
        _voipdotms = Builder(name = "Voipdotms", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.51f, 2.372f)
                curveToRelative(-0.946f, 0.0f, -1.877f, 0.24f, -2.71f, 0.696f)
                arcToRelative(5.721f, 5.721f, 0.0f, false, false, -2.055f, 1.92f)
                lineToRelative(-5.177f, 8.047f)
                curveToRelative(-0.928f, 1.446f, -3.076f, 1.656f, -3.92f, 0.943f)
                lineToRelative(4.051f, 6.343f)
                curveToRelative(0.258f, 0.402f, 0.611f, 0.731f, 1.027f, 0.96f)
                arcToRelative(2.808f, 2.808f, 0.0f, false, false, 2.706f, 0.0f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, false, 1.025f, -0.96f)
                lineTo(24.0f, 2.371f)
                close()
                moveTo(0.0f, 8.309f)
                lineToRelative(2.228f, 3.521f)
                reflectiveCurveToRelative(0.89f, 1.302f, 2.402f, 1.302f)
                curveToRelative(1.513f, 0.0f, 2.378f, -1.302f, 2.378f, -1.302f)
                lineToRelative(2.23f, -3.52f)
                close()
            }
        }
        .build()
        return _voipdotms!!
    }

private var _voipdotms: ImageVector? = null
