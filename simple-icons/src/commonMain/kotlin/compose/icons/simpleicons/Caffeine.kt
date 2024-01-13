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

public val SimpleIcons.Caffeine: ImageVector
    get() {
        if (_caffeine != null) {
            return _caffeine!!
        }
        _caffeine = Builder(name = "Caffeine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.162f, 1.557f)
                curveToRelative(-0.18f, 0.006f, -0.263f, 0.137f, -0.293f, 0.18f)
                lineTo(0.05f, 11.82f)
                curveToRelative(-0.07f, 0.142f, -0.06f, 0.27f, -0.004f, 0.356f)
                curveToRelative(1.942f, 3.36f, 3.882f, 6.723f, 5.822f, 10.085f)
                arcToRelative(0.337f, 0.337f, 0.0f, false, false, 0.305f, 0.182f)
                horizontalLineToRelative(11.65f)
                curveToRelative(0.138f, 0.003f, 0.26f, -0.09f, 0.31f, -0.182f)
                curveToRelative(1.94f, -3.36f, 3.878f, -6.721f, 5.82f, -10.08f)
                arcToRelative(0.361f, 0.361f, 0.0f, false, false, 0.0f, -0.358f)
                lineToRelative(-5.82f, -10.085f)
                curveToRelative(-0.112f, -0.193f, -0.308f, -0.181f, -0.308f, -0.181f)
                close()
                moveTo(6.966f, 2.276f)
                horizontalLineToRelative(9.513f)
                lineTo(10.136f, 5.94f)
                close()
                moveTo(6.539f, 2.879f)
                lineToRelative(2.964f, 3.426f)
                lineTo(6.54f, 8.018f)
                close()
                moveTo(16.839f, 2.897f)
                lineToRelative(-3.86f, 6.685f)
                lineTo(7.19f, 8.469f)
                close()
                moveTo(18.18f, 3.254f)
                lineToRelative(4.756f, 8.246f)
                lineToRelative(-4.756f, -0.916f)
                close()
                moveTo(5.82f, 3.256f)
                verticalLineToRelative(5.176f)
                lineToRelative(-4.48f, 2.587f)
                close()
                moveTo(17.46f, 3.256f)
                verticalLineToRelative(11.142f)
                lineToRelative(-3.857f, -4.457f)
                close()
                moveTo(7.127f, 9.186f)
                lineToRelative(5.847f, 1.126f)
                lineToRelative(3.898f, 4.502f)
                lineToRelative(-5.842f, -1.125f)
                close()
                moveTo(5.82f, 9.26f)
                verticalLineToRelative(3.425f)
                lineToRelative(-4.45f, -0.855f)
                close()
                moveTo(6.54f, 9.601f)
                lineToRelative(3.856f, 4.457f)
                lineToRelative(-3.857f, 6.685f)
                close()
                moveTo(18.18f, 11.314f)
                lineToRelative(4.447f, 0.856f)
                lineToRelative(-4.447f, 2.57f)
                close()
                moveTo(1.062f, 12.5f)
                lineToRelative(4.76f, 0.916f)
                verticalLineToRelative(7.33f)
                close()
                moveTo(22.659f, 12.98f)
                lineToRelative(-4.479f, 7.763f)
                verticalLineToRelative(-5.175f)
                close()
                moveTo(11.019f, 14.417f)
                lineToRelative(5.79f, 1.114f)
                lineToRelative(-9.649f, 5.572f)
                close()
                moveTo(17.459f, 15.982f)
                verticalLineToRelative(5.138f)
                lineToRelative(-2.964f, -3.425f)
                close()
                moveTo(13.862f, 18.06f)
                lineToRelative(3.172f, 3.664f)
                lineTo(7.52f, 21.724f)
                close()
            }
        }
        .build()
        return _caffeine!!
    }

private var _caffeine: ImageVector? = null
