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

public val SimpleIcons.Hugo: ImageVector
    get() {
        if (_hugo != null) {
            return _hugo!!
        }
        _hugo = Builder(name = "Hugo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.754f, 0.0f)
                arcToRelative(3.998f, 3.998f, 0.0f, false, false, -2.049f, 0.596f)
                lineTo(3.33f, 4.532f)
                arcToRelative(4.252f, 4.252f, 0.0f, false, false, -2.017f, 3.615f)
                verticalLineToRelative(8.03f)
                curveToRelative(0.0f, 1.473f, 0.79f, 2.838f, 2.067f, 3.574f)
                lineToRelative(6.486f, 3.733f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, false, 3.835f, 0.018f)
                lineToRelative(7.043f, -3.966f)
                arcToRelative(3.817f, 3.817f, 0.0f, false, false, 1.943f, -3.323f)
                lineTo(22.687f, 7.752f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, -1.774f, -3.084f)
                lineTo(13.817f, 0.541f)
                arcToRelative(3.998f, 3.998f, 0.0f, false, false, -2.063f, -0.54f)
                close()
                moveTo(11.776f, 1.674f)
                curveToRelative(0.413f, -0.006f, 0.828f, 0.1f, 1.2f, 0.315f)
                lineToRelative(7.095f, 4.127f)
                curveToRelative(0.584f, 0.34f, 0.941f, 0.96f, 0.94f, 1.635f)
                verticalLineToRelative(8.462f)
                curveToRelative(0.0f, 0.774f, -0.414f, 1.484f, -1.089f, 1.864f)
                lineToRelative(-7.042f, 3.966f)
                arcToRelative(2.199f, 2.199f, 0.0f, false, true, -2.179f, -0.01f)
                lineToRelative(-6.485f, -3.734f)
                arcToRelative(2.447f, 2.447f, 0.0f, false, true, -1.228f, -2.123f)
                verticalLineToRelative(-8.03f)
                curveToRelative(0.0f, -0.893f, 0.461f, -1.72f, 1.221f, -2.19f)
                lineToRelative(6.376f, -3.935f)
                arcToRelative(2.323f, 2.323f, 0.0f, false, true, 1.19f, -0.347f)
                close()
                moveTo(7.076f, 5.518f)
                lineTo(7.076f, 18.37f)
                horizontalLineToRelative(2.69f)
                verticalLineToRelative(-5.62f)
                horizontalLineToRelative(4.46f)
                verticalLineToRelative(5.62f)
                horizontalLineToRelative(2.696f)
                lineTo(16.922f, 5.518f)
                horizontalLineToRelative(-2.696f)
                verticalLineToRelative(4.681f)
                horizontalLineToRelative(-4.46f)
                lineTo(9.766f, 5.518f)
                close()
            }
        }
        .build()
        return _hugo!!
    }

private var _hugo: ImageVector? = null
