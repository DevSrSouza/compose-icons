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

public val SimpleIcons.Jeep: ImageVector
    get() {
        if (_jeep != null) {
            return _jeep!!
        }
        _jeep = Builder(name = "Jeep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.056f, 12.325f)
                curveToRelative(-0.021f, 1.07f, 0.21f, 1.637f, 1.09f, 1.637f)
                curveToRelative(0.882f, 0.0f, 1.008f, -0.965f, 1.008f, -1.7f)
                curveToRelative(0.0f, -0.734f, -0.168f, -1.447f, -1.091f, -1.447f)
                curveToRelative(-0.567f, 0.0f, -0.986f, 0.44f, -1.007f, 1.51f)
                moveToRelative(-1.784f, 4.47f)
                verticalLineToRelative(-7.24f)
                horizontalLineToRelative(1.805f)
                verticalLineToRelative(0.826f)
                curveToRelative(0.065f, -0.14f, 0.11f, -0.236f, 0.251f, -0.406f)
                curveToRelative(0.122f, -0.147f, 0.462f, -0.566f, 1.364f, -0.566f)
                curveToRelative(0.902f, 0.0f, 2.308f, 0.63f, 2.308f, 2.853f)
                curveToRelative(0.0f, 1.72f, -0.84f, 2.98f, -2.287f, 2.98f)
                curveToRelative(-0.797f, 0.0f, -1.154f, -0.278f, -1.364f, -0.441f)
                arcToRelative(1.098f, 1.098f, 0.0f, false, true, -0.251f, -0.252f)
                verticalLineToRelative(2.245f)
                horizontalLineToRelative(-1.826f)
                moveTo(16.03f, 11.55f)
                curveToRelative(0.0f, -0.525f, -0.294f, -1.028f, -0.966f, -1.028f)
                curveToRelative(-0.65f, 0.0f, -0.88f, 0.461f, -0.88f, 1.028f)
                close()
                moveTo(14.939f, 9.347f)
                curveToRelative(1.531f, 0.0f, 2.874f, 0.587f, 2.874f, 3.294f)
                horizontalLineToRelative(-3.63f)
                curveToRelative(0.0f, 0.86f, 0.357f, 1.217f, 0.986f, 1.217f)
                curveToRelative(0.63f, 0.0f, 0.84f, -0.504f, 0.84f, -0.504f)
                horizontalLineToRelative(1.783f)
                curveToRelative(0.0f, 0.776f, -1.07f, 1.826f, -2.685f, 1.805f)
                curveToRelative(-1.847f, 0.0f, -2.749f, -1.364f, -2.749f, -2.77f)
                reflectiveCurveToRelative(0.797f, -3.042f, 2.58f, -3.042f)
                moveToRelative(-4.741f, 2.203f)
                curveToRelative(0.0f, -0.525f, -0.293f, -1.028f, -0.965f, -1.028f)
                curveToRelative(-0.65f, 0.0f, -0.881f, 0.461f, -0.881f, 1.028f)
                close()
                moveTo(9.106f, 9.346f)
                curveToRelative(1.532f, 0.0f, 2.874f, 0.587f, 2.874f, 3.294f)
                lineTo(8.35f, 12.64f)
                curveToRelative(0.0f, 0.86f, 0.357f, 1.217f, 0.987f, 1.217f)
                curveToRelative(0.629f, 0.0f, 0.839f, -0.504f, 0.839f, -0.504f)
                horizontalLineToRelative(1.783f)
                curveToRelative(0.0f, 0.776f, -1.07f, 1.826f, -2.685f, 1.805f)
                curveToRelative(-1.847f, 0.0f, -2.749f, -1.364f, -2.749f, -2.77f)
                reflectiveCurveToRelative(0.798f, -3.042f, 2.58f, -3.042f)
                moveToRelative(-4.972f, -2.14f)
                horizontalLineToRelative(1.952f)
                verticalLineToRelative(5.12f)
                curveToRelative(0.0f, 0.88f, -0.378f, 2.727f, -3.085f, 2.727f)
                curveToRelative(-2.706f, 0.0f, -3.0f, -1.72f, -3.0f, -2.686f)
                verticalLineToRelative(-0.944f)
                horizontalLineToRelative(1.888f)
                verticalLineToRelative(0.923f)
                curveToRelative(0.0f, 0.567f, 0.378f, 1.091f, 1.091f, 1.091f)
                curveToRelative(0.714f, 0.0f, 1.154f, -0.398f, 1.154f, -1.07f)
                lineTo(4.133f, 7.206f)
                close()
            }
        }
        .build()
        return _jeep!!
    }

private var _jeep: ImageVector? = null
