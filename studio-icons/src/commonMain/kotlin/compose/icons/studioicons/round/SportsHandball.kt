package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SportsHandball: ImageVector
    get() {
        if (_sportsHandball != null) {
            return _sportsHandball!!
        }
        _sportsHandball = Builder(name = "SportsHandball", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.27f, 6.0f)
                curveTo(13.72f, 6.95f, 14.05f, 8.18f, 15.0f, 8.73f)
                curveToRelative(0.95f, 0.55f, 2.18f, 0.22f, 2.73f, -0.73f)
                curveToRelative(0.55f, -0.95f, 0.22f, -2.18f, -0.73f, -2.73f)
                curveTo(16.05f, 4.72f, 14.82f, 5.05f, 14.27f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.84f, 10.41f)
                curveToRelative(0.0f, 0.0f, -1.63f, -0.94f, -2.6f, -1.5f)
                curveToRelative(-2.13f, -1.24f, -3.01f, -3.83f, -2.18f, -6.07f)
                curveToRelative(0.17f, -0.46f, -0.01f, -0.97f, -0.43f, -1.21f)
                curveTo(10.1f, 1.33f, 9.41f, 1.56f, 9.2f, 2.13f)
                curveTo(8.25f, 4.64f, 8.85f, 7.48f, 10.66f, 9.4f)
                lineToRelative(-4.65f, 8.05f)
                curveToRelative(-0.28f, 0.48f, -0.11f, 1.09f, 0.37f, 1.37f)
                curveToRelative(0.48f, 0.28f, 1.09f, 0.11f, 1.37f, -0.37f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(1.73f, 1.0f)
                lineToRelative(-2.5f, 4.33f)
                curveToRelative(-0.28f, 0.48f, -0.11f, 1.09f, 0.37f, 1.37f)
                curveToRelative(0.48f, 0.28f, 1.09f, 0.11f, 1.37f, -0.37f)
                lineToRelative(5.79f, -10.02f)
                curveToRelative(0.98f, 1.34f, 1.26f, 3.12f, 0.66f, 4.72f)
                curveToRelative(-0.17f, 0.45f, 0.02f, 0.96f, 0.43f, 1.2f)
                curveToRelative(0.53f, 0.31f, 1.22f, 0.08f, 1.44f, -0.5f)
                curveTo(19.01f, 15.83f, 18.45f, 12.61f, 15.84f, 10.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 3.8f)
                curveToRelative(0.72f, 0.41f, 1.63f, 0.17f, 2.05f, -0.55f)
                curveToRelative(0.41f, -0.72f, 0.17f, -1.63f, -0.55f, -2.05f)
                curveToRelative(-0.72f, -0.41f, -1.63f, -0.17f, -2.05f, 0.55f)
                curveTo(11.79f, 2.47f, 12.03f, 3.39f, 12.75f, 3.8f)
                close()
            }
        }
        .build()
        return _sportsHandball!!
    }

private var _sportsHandball: ImageVector? = null
