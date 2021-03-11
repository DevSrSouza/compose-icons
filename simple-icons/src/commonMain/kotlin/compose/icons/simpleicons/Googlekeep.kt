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

public val SimpleIcons.Googlekeep: ImageVector
    get() {
        if (_googlekeep != null) {
            return _googlekeep!!
        }
        _googlekeep = Builder(name = "Googlekeep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.995f, 7.995f)
                curveTo(19.995f, 3.6f, 16.396f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(4.005f, 3.6f, 4.005f, 7.995f)
                curveToRelative(0.0f, 2.55f, 1.2f, 4.89f, 3.194f, 6.405f)
                verticalLineToRelative(7.979f)
                lineTo(8.82f, 22.379f)
                lineTo(8.82f, 24.0f)
                horizontalLineToRelative(6.359f)
                verticalLineToRelative(-1.62f)
                lineTo(16.8f, 22.38f)
                lineTo(16.8f, 14.4f)
                curveToRelative(2.011f, -1.5f, 3.195f, -3.87f, 3.195f, -6.405f)
                close()
                moveTo(8.805f, 20.774f)
                verticalLineToRelative(-1.575f)
                horizontalLineToRelative(6.391f)
                verticalLineToRelative(1.575f)
                lineTo(8.805f, 20.774f)
                close()
                moveTo(8.805f, 17.58f)
                verticalLineToRelative(-1.575f)
                horizontalLineToRelative(6.391f)
                verticalLineToRelative(1.575f)
                lineTo(8.805f, 17.58f)
                close()
                moveTo(15.555f, 13.319f)
                lineToRelative(-0.359f, 0.24f)
                verticalLineToRelative(0.841f)
                lineTo(8.805f, 14.4f)
                verticalLineToRelative(-0.84f)
                lineToRelative(-0.345f, -0.24f)
                curveToRelative(-1.8f, -1.199f, -2.85f, -3.18f, -2.85f, -5.324f)
                curveToRelative(0.0f, -3.525f, 2.85f, -6.391f, 6.39f, -6.391f)
                reflectiveCurveToRelative(6.39f, 2.851f, 6.39f, 6.391f)
                curveToRelative(0.0f, 2.145f, -1.05f, 4.14f, -2.85f, 5.324f)
                horizontalLineToRelative(0.015f)
                close()
            }
        }
        .build()
        return _googlekeep!!
    }

private var _googlekeep: ImageVector? = null
