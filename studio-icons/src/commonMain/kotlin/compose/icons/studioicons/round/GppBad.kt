package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.GppBad: ImageVector
    get() {
        if (_gppBad != null) {
            return _gppBad!!
        }
        _gppBad = Builder(name = "GppBad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7f, 4.51f)
                lineToRelative(-6.0f, -2.25f)
                curveToRelative(-0.45f, -0.17f, -0.95f, -0.17f, -1.4f, 0.0f)
                lineToRelative(-6.0f, 2.25f)
                curveTo(4.52f, 4.81f, 4.0f, 5.55f, 4.0f, 6.39f)
                verticalLineToRelative(4.7f)
                curveToRelative(0.0f, 4.94f, 3.27f, 9.57f, 7.71f, 10.83f)
                curveToRelative(0.19f, 0.05f, 0.39f, 0.05f, 0.57f, 0.0f)
                curveTo(16.73f, 20.66f, 20.0f, 16.03f, 20.0f, 11.09f)
                verticalLineToRelative(-4.7f)
                curveTo(20.0f, 5.55f, 19.48f, 4.81f, 18.7f, 4.51f)
                close()
                moveTo(14.8f, 14.79f)
                lineTo(14.8f, 14.79f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.01f)
                lineTo(12.0f, 13.42f)
                lineToRelative(-1.39f, 1.38f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(10.59f, 12.0f)
                lineTo(9.2f, 10.61f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineTo(12.0f, 10.59f)
                lineToRelative(1.39f, -1.39f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(13.42f, 12.0f)
                lineToRelative(1.38f, 1.38f)
                curveTo(15.19f, 13.77f, 15.19f, 14.4f, 14.8f, 14.79f)
                close()
            }
        }
        .build()
        return _gppBad!!
    }

private var _gppBad: ImageVector? = null
