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

public val SimpleIcons.Googlemeet: ImageVector
    get() {
        if (_googlemeet != null) {
            return _googlemeet!!
        }
        _googlemeet = Builder(name = "Googlemeet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.53f, 2.13f)
                lineTo(0.0f, 7.75f)
                horizontalLineToRelative(5.53f)
                close()
                moveTo(5.928f, 2.13f)
                verticalLineToRelative(5.62f)
                horizontalLineToRelative(7.608f)
                verticalLineToRelative(3.65f)
                lineToRelative(5.47f, -4.45f)
                curveToRelative(-0.014f, -1.22f, 0.031f, -2.25f, -0.025f, -3.46f)
                curveToRelative(-0.148f, -1.09f, -1.287f, -1.47f, -2.236f, -1.36f)
                close()
                moveTo(23.1f, 4.32f)
                curveToRelative(-0.802f, 0.295f, -1.358f, 0.995f, -2.047f, 1.49f)
                curveToRelative(-2.506f, 2.05f, -4.982f, 4.12f, -7.468f, 6.19f)
                curveToRelative(3.025f, 2.59f, 6.04f, 5.18f, 9.065f, 7.76f)
                curveToRelative(1.218f, 0.671f, 1.428f, -0.814f, 1.328f, -1.64f)
                verticalLineToRelative(-13.0f)
                arcToRelative(0.828f, 0.828f, 0.0f, false, false, -0.877f, -0.825f)
                close()
                moveTo(0.038f, 8.15f)
                verticalLineToRelative(7.7f)
                horizontalLineToRelative(5.53f)
                verticalLineToRelative(-7.7f)
                close()
                moveTo(13.615f, 16.25f)
                lineTo(6.008f, 16.25f)
                verticalLineToRelative(5.62f)
                curveToRelative(3.864f, -0.006f, 7.737f, 0.011f, 11.58f, -0.009f)
                curveToRelative(1.02f, -0.07f, 1.618f, -1.12f, 1.468f, -2.07f)
                verticalLineToRelative(-2.51f)
                lineToRelative(-5.47f, -4.68f)
                verticalLineToRelative(3.65f)
                close()
                moveTo(0.038f, 16.25f)
                curveToRelative(0.02f, 1.44f, -0.041f, 2.88f, 0.033f, 4.31f)
                curveToRelative(0.162f, 0.948f, 1.158f, 1.43f, 2.047f, 1.31f)
                horizontalLineToRelative(3.464f)
                verticalLineToRelative(-5.62f)
                close()
            }
        }
        .build()
        return _googlemeet!!
    }

private var _googlemeet: ImageVector? = null
