package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SportsHandball: ImageVector
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
                curveToRelative(-2.38f, -1.38f, -3.2f, -4.44f, -1.82f, -6.82f)
                lineToRelative(-1.73f, -1.0f)
                curveTo(8.1f, 3.83f, 8.6f, 7.21f, 10.66f, 9.4f)
                lineToRelative(-5.15f, 8.92f)
                lineToRelative(1.73f, 1.0f)
                lineToRelative(1.5f, -2.6f)
                lineToRelative(1.73f, 1.0f)
                lineToRelative(-3.0f, 5.2f)
                lineToRelative(1.73f, 1.0f)
                lineToRelative(6.29f, -10.89f)
                curveToRelative(1.14f, 1.55f, 1.33f, 3.69f, 0.31f, 5.46f)
                lineToRelative(1.73f, 1.0f)
                curveTo(19.13f, 16.74f, 18.81f, 12.91f, 15.84f, 10.41f)
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
