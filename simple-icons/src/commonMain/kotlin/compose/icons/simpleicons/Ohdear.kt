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

public val SimpleIcons.Ohdear: ImageVector
    get() {
        if (_ohdear != null) {
            return _ohdear!!
        }
        _ohdear = Builder(name = "Ohdear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.811f, 9.3333f)
                curveToRelative(2.5345f, 0.0f, 4.5966f, 1.9939f, 4.5966f, 4.4444f)
                curveToRelative(0.0f, 2.4506f, -2.0621f, 4.4444f, -4.5966f, 4.4444f)
                curveToRelative(-2.2139f, 0.0f, -4.0673f, -1.5215f, -4.5007f, -3.5397f)
                horizontalLineToRelative(-6.3101f)
                verticalLineToRelative(-1.7972f)
                horizontalLineToRelative(6.3072f)
                curveToRelative(0.4287f, -2.0242f, 2.285f, -3.5519f, 4.5036f, -3.5519f)
                close()
                moveTo(18.1418f, 5.7777f)
                verticalLineToRelative(3.8766f)
                curveToRelative(0.601f, -0.3844f, 1.3334f, -0.586f, 2.1395f, -0.586f)
                curveToRelative(1.7157f, 0.0f, 3.7189f, 1.1521f, 3.7189f, 4.3993f)
                verticalLineToRelative(4.4583f)
                horizontalLineToRelative(-1.8453f)
                verticalLineToRelative(-4.4583f)
                curveToRelative(0.0f, -1.0234f, -0.2502f, -1.7562f, -0.7438f, -2.1787f)
                curveToRelative(-0.3887f, -0.3328f, -0.8448f, -0.4025f, -1.1591f, -0.4025f)
                curveToRelative(-0.9626f, 0.0f, -2.1102f, 0.4477f, -2.1102f, 2.5812f)
                verticalLineToRelative(4.4583f)
                horizontalLineToRelative(-1.8453f)
                verticalLineToRelative(-12.148f)
                close()
                moveTo(10.811f, 11.1518f)
                curveToRelative(-1.4978f, 0.0f, -2.7159f, 1.178f, -2.7159f, 2.6259f)
                reflectiveCurveToRelative(1.218f, 2.6259f, 2.7159f, 2.6259f)
                curveToRelative(1.4975f, 0.0f, 2.7155f, -1.178f, 2.7155f, -2.6259f)
                reflectiveCurveToRelative(-1.218f, -2.6259f, -2.7155f, -2.6259f)
                close()
            }
        }
        .build()
        return _ohdear!!
    }

private var _ohdear: ImageVector? = null
