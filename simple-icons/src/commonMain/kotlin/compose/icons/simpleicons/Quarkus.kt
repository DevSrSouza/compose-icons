package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Quarkus: VectorAsset
    get() {
        if (_quarkus != null) {
            return _quarkus!!
        }
        _quarkus = VectorAssetBuilder(name = "Quarkus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.788f, 15.963f)
                lineToRelative(3.872f, -2.236f)
                verticalLineToRelative(-4.47f)
                lineToRelative(-3.872f, 2.235f)
                verticalLineToRelative(4.471f)
                close()
                moveTo(13.158f, 16.177f)
                lineTo(16.66f, 18.2f)
                verticalLineToRelative(-4.043f)
                lineToRelative(-3.502f, 2.021f)
                close()
                moveTo(16.449f, 8.463f)
                lineTo(16.449f, 4.42f)
                lineTo(12.947f, 6.44f)
                lineToRelative(3.502f, 2.022f)
                close()
                moveTo(12.577f, 6.655f)
                lineTo(8.704f, 8.891f)
                lineToRelative(3.873f, 2.236f)
                lineToRelative(3.872f, -2.236f)
                lineToRelative(-3.872f, -2.236f)
                close()
                moveTo(12.206f, 6.441f)
                lineTo(8.704f, 4.42f)
                verticalLineToRelative(4.043f)
                lineToRelative(3.502f, -2.022f)
                close()
                moveTo(17.031f, 9.471f)
                verticalLineToRelative(4.042f)
                lineToRelative(3.501f, -2.021f)
                lineToRelative(-3.501f, -2.022f)
                close()
                moveTo(12.366f, 15.963f)
                verticalLineToRelative(-4.471f)
                lineTo(8.494f, 9.256f)
                verticalLineToRelative(4.471f)
                lineToRelative(3.872f, 2.236f)
                close()
                moveTo(8.123f, 9.47f)
                lineTo(4.62f, 11.492f)
                lineToRelative(3.502f, 2.021f)
                lineTo(8.122f, 9.47f)
                close()
                moveTo(8.493f, 14.156f)
                verticalLineToRelative(4.043f)
                lineToRelative(3.502f, -2.022f)
                lineToRelative(-3.501f, -2.021f)
                close()
                moveTo(20.007f, 0.134f)
                lineTo(3.979f, 0.134f)
                curveTo(1.79f, 0.134f, 0.0f, 1.902f, 0.0f, 4.064f)
                verticalLineToRelative(15.832f)
                curveToRelative(0.0f, 2.161f, 1.79f, 3.93f, 3.979f, 3.93f)
                horizontalLineToRelative(10.976f)
                lineToRelative(-2.962f, -7.108f)
                lineToRelative(-2.15f, 4.488f)
                lineTo(3.98f, 21.206f)
                curveToRelative(-0.72f, 0.0f, -1.327f, -0.6f, -1.327f, -1.31f)
                lineTo(2.653f, 4.064f)
                curveToRelative(0.0f, -0.71f, 0.608f, -1.31f, 1.327f, -1.31f)
                horizontalLineToRelative(16.028f)
                curveToRelative(0.719f, 0.0f, 1.327f, 0.6f, 1.327f, 1.31f)
                verticalLineToRelative(15.832f)
                curveToRelative(0.0f, 0.71f, -0.608f, 1.31f, -1.327f, 1.31f)
                horizontalLineToRelative(-3.478f)
                lineToRelative(1.092f, 2.62f)
                horizontalLineToRelative(2.386f)
                curveToRelative(2.188f, 0.0f, 3.979f, -1.769f, 3.979f, -3.93f)
                lineTo(23.987f, 4.064f)
                curveToRelative(0.0f, -2.162f, -1.79f, -3.93f, -3.979f, -3.93f)
                close()
            }
        }
        .build()
        return _quarkus!!
    }

private var _quarkus: VectorAsset? = null
