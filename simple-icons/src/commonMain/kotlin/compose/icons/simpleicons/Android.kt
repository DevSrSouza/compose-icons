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

public val SimpleIcons.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.523f, 15.341f)
                curveToRelative(-0.551f, 0.0f, -0.999f, -0.449f, -0.999f, -1.0f)
                reflectiveCurveToRelative(0.448f, -0.999f, 0.999f, -0.999f)
                curveToRelative(0.551f, 0.0f, 0.999f, 0.448f, 0.999f, 0.999f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -0.999f, 1.0f)
                moveToRelative(-11.046f, 0.0f)
                curveToRelative(-0.551f, 0.0f, -0.999f, -0.449f, -0.999f, -1.0f)
                reflectiveCurveToRelative(0.448f, -0.999f, 0.999f, -0.999f)
                curveToRelative(0.551f, 0.0f, 0.999f, 0.448f, 0.999f, 0.999f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -0.999f, 1.0f)
                moveToRelative(11.405f, -6.02f)
                lineToRelative(1.997f, -3.459f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, false, -0.152f, -0.568f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, false, -0.568f, 0.152f)
                lineToRelative(-2.022f, 3.503f)
                curveTo(15.59f, 8.244f, 13.853f, 7.851f, 12.0f, 7.851f)
                reflectiveCurveToRelative(-3.59f, 0.393f, -5.137f, 1.099f)
                lineTo(4.841f, 5.447f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, false, -0.568f, -0.152f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, false, -0.152f, 0.568f)
                lineToRelative(1.997f, 3.459f)
                curveTo(2.689f, 11.187f, 0.343f, 14.659f, 0.0f, 18.761f)
                horizontalLineToRelative(24.0f)
                curveToRelative(-0.343f, -4.102f, -2.689f, -7.574f, -6.119f, -9.44f)
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null
