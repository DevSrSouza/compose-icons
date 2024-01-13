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

public val SimpleIcons.Boulanger: ImageVector
    get() {
        if (_boulanger != null) {
            return _boulanger!!
        }
        _boulanger = Builder(name = "Boulanger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.405f, 3.612f)
                verticalLineToRelative(3.5777f)
                horizontalLineToRelative(5.6616f)
                curveToRelative(2.987f, 0.0347f, 5.3836f, 2.4311f, 5.3836f, 5.4181f)
                curveToRelative(-0.0347f, 2.987f, -2.4313f, 5.3834f, -5.3836f, 5.4181f)
                horizontalLineToRelative(-3.1259f)
                curveToRelative(-2.987f, 0.0f, -5.4181f, -2.431f, -5.4181f, -5.418f)
                lineTo(5.5226f, 8.4052f)
                curveToRelative(0.0f, -2.084f, 1.1458f, -3.8903f, 2.8824f, -4.7933f)
                close()
                curveTo(3.7856f, 3.612f, 0.0f, 7.3975f, 0.0f, 12.017f)
                curveToRelative(0.0f, 4.6194f, 3.7162f, 8.371f, 8.3704f, 8.371f)
                horizontalLineToRelative(7.2592f)
                curveTo(20.249f, 20.388f, 24.0f, 16.6711f, 24.0f, 12.017f)
                curveToRelative(0.0f, -4.6542f, -3.6815f, -8.405f, -8.3704f, -8.405f)
                close()
                moveTo(8.4403f, 10.0375f)
                verticalLineToRelative(2.5357f)
                curveToRelative(0.0f, 1.3893f, 1.1457f, 2.535f, 2.535f, 2.535f)
                horizontalLineToRelative(3.0222f)
                curveToRelative(1.3893f, 0.0f, 2.535f, -1.1457f, 2.535f, -2.535f)
                curveToRelative(0.0f, -1.3893f, -1.111f, -2.5357f, -2.535f, -2.5357f)
                close()
            }
        }
        .build()
        return _boulanger!!
    }

private var _boulanger: ImageVector? = null
