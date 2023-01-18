package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ZhihuFill: ImageVector
    get() {
        if (_zhihuFill != null) {
            return _zhihuFill!!
        }
        _zhihuFill = Builder(name = "ZhihuFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.373f, 18.897f)
                horizontalLineToRelative(1.452f)
                lineToRelative(0.478f, 1.637f)
                lineToRelative(2.605f, -1.637f)
                horizontalLineToRelative(3.07f)
                lineTo(20.978f, 5.395f)
                horizontalLineToRelative(-7.605f)
                verticalLineToRelative(13.502f)
                close()
                moveTo(14.918f, 6.86f)
                horizontalLineToRelative(4.515f)
                verticalLineToRelative(10.57f)
                horizontalLineToRelative(-1.732f)
                lineToRelative(-1.73f, 1.087f)
                lineToRelative(-0.314f, -1.084f)
                lineToRelative(-0.739f, -0.003f)
                lineTo(14.918f, 6.861f)
                close()
                moveTo(12.088f, 11.572f)
                lineTo(8.846f, 11.572f)
                arcToRelative(70.3f, 70.3f, 0.0f, false, false, 0.136f, -4.56f)
                horizontalLineToRelative(3.172f)
                reflectiveCurveToRelative(0.122f, -1.4f, -0.532f, -1.384f)
                lineTo(6.135f, 5.628f)
                curveToRelative(0.216f, -0.814f, 0.488f, -1.655f, 0.813f, -2.524f)
                curveToRelative(0.0f, 0.0f, -1.493f, 0.0f, -2.0f, 1.339f)
                curveToRelative(-0.211f, 0.552f, -0.82f, 2.677f, -1.904f, 4.848f)
                curveToRelative(0.365f, -0.04f, 1.573f, -0.073f, 2.284f, -1.378f)
                curveToRelative(0.131f, -0.366f, 0.156f, -0.413f, 0.318f, -0.902f)
                horizontalLineToRelative(1.79f)
                curveToRelative(0.0f, 0.651f, -0.074f, 4.151f, -0.104f, 4.558f)
                horizontalLineToRelative(-3.24f)
                curveToRelative(-0.729f, 0.0f, -0.965f, 1.466f, -0.965f, 1.466f)
                horizontalLineToRelative(4.066f)
                curveTo(6.92f, 16.131f, 5.456f, 18.74f, 2.8f, 20.8f)
                curveToRelative(1.27f, 0.363f, 2.536f, -0.057f, 3.162f, -0.614f)
                curveToRelative(0.0f, 0.0f, 1.425f, -1.297f, 2.206f, -4.298f)
                lineToRelative(3.346f, 4.03f)
                reflectiveCurveToRelative(0.49f, -1.668f, -0.077f, -2.481f)
                curveToRelative(-0.47f, -0.554f, -1.74f, -2.052f, -2.281f, -2.595f)
                lineToRelative(-0.907f, 0.72f)
                curveToRelative(0.27f, -0.867f, 0.433f, -1.71f, 0.488f, -2.524f)
                horizontalLineToRelative(3.822f)
                reflectiveCurveToRelative(-0.005f, -1.466f, -0.47f, -1.466f)
                close()
            }
        }
        .build()
        return _zhihuFill!!
    }

private var _zhihuFill: ImageVector? = null
