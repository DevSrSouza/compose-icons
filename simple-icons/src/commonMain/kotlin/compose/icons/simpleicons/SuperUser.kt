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

public val SimpleIcons.SuperUser: ImageVector
    get() {
        if (_superUser != null) {
            return _superUser!!
        }
        _superUser = Builder(name = "SuperUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.41f, 0.0f)
                curveToRelative(-0.26f, 0.0f, -0.39f, 0.065f, -0.39f, 0.26f)
                verticalLineToRelative(1.425f)
                curveToRelative(0.0f, 0.195f, 0.13f, 0.26f, 0.325f, 0.26f)
                horizontalLineToRelative(0.454f)
                curveToRelative(2.14f, 0.0f, 3.747f, 1.75f, 3.747f, 3.436f)
                verticalLineToRelative(4.473f)
                curveToRelative(0.0f, 1.426f, 0.973f, 2.528f, 2.529f, 3.241f)
                curveToRelative(0.065f, 0.065f, 0.129f, 0.13f, 0.129f, 0.195f)
                reflectiveCurveToRelative(0.0f, 0.13f, -0.13f, 0.13f)
                curveToRelative(-1.685f, 0.648f, -2.528f, 2.269f, -2.528f, 3.5f)
                verticalLineToRelative(3.89f)
                curveToRelative(0.0f, 1.686f, -1.621f, 1.232f, -3.76f, 1.232f)
                horizontalLineToRelative(-0.454f)
                curveToRelative(-0.194f, 0.0f, -0.324f, 0.065f, -0.324f, 0.26f)
                verticalLineToRelative(1.426f)
                curveToRelative(0.0f, 0.194f, 0.194f, 0.26f, 0.389f, 0.26f)
                horizontalLineToRelative(0.583f)
                curveToRelative(3.566f, 0.0f, 6.178f, 0.324f, 6.178f, -2.723f)
                lineTo(18.158f, 17.18f)
                horizontalLineToRelative(0.007f)
                curveToRelative(0.0f, -1.426f, 0.791f, -2.268f, 2.283f, -2.722f)
                curveToRelative(0.713f, -0.195f, 0.972f, -0.325f, 0.972f, -0.584f)
                verticalLineToRelative(-1.167f)
                curveToRelative(0.0f, -0.454f, -0.26f, -0.454f, -0.843f, -0.649f)
                curveToRelative(-1.491f, -0.518f, -2.405f, -1.296f, -2.405f, -2.722f)
                lineTo(18.172f, 5.64f)
                curveToRelative(0.0f, -3.047f, -2.548f, -5.64f, -6.179f, -5.64f)
                close()
                moveTo(2.903f, 0.019f)
                curveToRelative(-0.194f, 0.0f, -0.324f, 0.065f, -0.324f, 0.26f)
                verticalLineToRelative(23.455f)
                curveToRelative(0.0f, 0.195f, 0.13f, 0.26f, 0.324f, 0.26f)
                lineTo(2.903f, 24.0f)
                lineTo(8.68f, 24.0f)
                curveToRelative(0.259f, 0.0f, 0.324f, -0.13f, 0.388f, -0.324f)
                verticalLineToRelative(-1.374f)
                curveToRelative(0.0f, -0.194f, -0.194f, -0.26f, -0.388f, -0.26f)
                lineTo(5.568f, 22.042f)
                curveToRelative(-0.26f, 0.0f, -0.388f, -0.065f, -0.388f, -0.26f)
                lineTo(5.18f, 2.289f)
                curveToRelative(0.0f, -0.194f, 0.064f, -0.324f, 0.388f, -0.324f)
                horizontalLineToRelative(3.177f)
                curveToRelative(0.195f, 0.0f, 0.324f, -0.064f, 0.324f, -0.258f)
                lineTo(9.069f, 0.279f)
                curveToRelative(0.0f, -0.195f, -0.194f, -0.26f, -0.388f, -0.26f)
                close()
                moveTo(11.662f, 8.428f)
                curveToRelative(-0.325f, 0.0f, -0.649f, 0.26f, -0.649f, 0.584f)
                verticalLineToRelative(1.425f)
                curveToRelative(0.0f, 0.325f, 0.26f, 0.584f, 0.649f, 0.584f)
                horizontalLineToRelative(1.296f)
                curveToRelative(0.324f, 0.0f, 0.648f, -0.26f, 0.648f, -0.584f)
                lineTo(13.606f, 9.012f)
                curveToRelative(0.0f, -0.324f, -0.259f, -0.584f, -0.648f, -0.584f)
                close()
            }
        }
        .build()
        return _superUser!!
    }

private var _superUser: ImageVector? = null
