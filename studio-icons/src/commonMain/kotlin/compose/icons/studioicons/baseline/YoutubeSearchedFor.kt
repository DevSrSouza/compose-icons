package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.YoutubeSearchedFor: ImageVector
    get() {
        if (_youtubeSearchedFor != null) {
            return _youtubeSearchedFor!!
        }
        _youtubeSearchedFor = Builder(name = "YoutubeSearchedFor", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.01f, 14.0f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-0.27f, -0.27f)
                curveToRelative(0.98f, -1.14f, 1.57f, -2.61f, 1.57f, -4.23f)
                curveToRelative(0.0f, -3.59f, -2.91f, -6.5f, -6.5f, -6.5f)
                reflectiveCurveToRelative(-6.5f, 3.0f, -6.5f, 6.5f)
                horizontalLineTo(2.0f)
                lineToRelative(3.84f, 4.0f)
                lineToRelative(4.16f, -4.0f)
                horizontalLineTo(6.51f)
                curveTo(6.51f, 7.0f, 8.53f, 5.0f, 11.01f, 5.0f)
                reflectiveCurveToRelative(4.5f, 2.01f, 4.5f, 4.5f)
                curveToRelative(0.0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                curveToRelative(-0.65f, 0.0f, -1.26f, -0.14f, -1.82f, -0.38f)
                lineTo(7.71f, 15.1f)
                curveToRelative(0.97f, 0.57f, 2.09f, 0.9f, 3.3f, 0.9f)
                curveToRelative(1.61f, 0.0f, 3.08f, -0.59f, 4.22f, -1.57f)
                lineToRelative(0.27f, 0.27f)
                verticalLineToRelative(0.79f)
                lineToRelative(5.01f, 4.99f)
                lineTo(22.0f, 19.0f)
                lineToRelative(-4.99f, -5.0f)
                close()
            }
        }
        .build()
        return _youtubeSearchedFor!!
    }

private var _youtubeSearchedFor: ImageVector? = null
