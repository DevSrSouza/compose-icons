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

public val OutlineGroup.SportsFootball: ImageVector
    get() {
        if (_sportsFootball != null) {
            return _sportsFootball!!
        }
        _sportsFootball = Builder(name = "SportsFootball", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.31f, 3.69f)
                curveTo(19.99f, 3.36f, 18.37f, 3.0f, 16.26f, 3.0f)
                curveToRelative(-3.03f, 0.0f, -7.09f, 0.75f, -9.8f, 3.46f)
                curveTo(1.87f, 11.05f, 2.9f, 19.52f, 3.69f, 20.31f)
                curveTo(4.01f, 20.64f, 5.63f, 21.0f, 7.74f, 21.0f)
                curveToRelative(3.03f, 0.0f, 7.09f, -0.75f, 9.8f, -3.46f)
                curveTo(22.13f, 12.95f, 21.1f, 4.48f, 20.31f, 3.69f)
                close()
                moveTo(7.74f, 19.0f)
                curveToRelative(-1.14f, 0.0f, -2.02f, -0.12f, -2.53f, -0.23f)
                curveToRelative(-0.18f, -0.79f, -0.3f, -2.21f, -0.17f, -3.83f)
                lineToRelative(4.01f, 4.01f)
                curveTo(8.53f, 18.99f, 8.08f, 19.0f, 7.74f, 19.0f)
                close()
                moveTo(16.13f, 16.13f)
                curveToRelative(-1.33f, 1.33f, -3.06f, 2.05f, -4.66f, 2.44f)
                lineToRelative(-6.04f, -6.04f)
                curveToRelative(0.42f, -1.68f, 1.16f, -3.37f, 2.45f, -4.65f)
                curveToRelative(1.32f, -1.32f, 3.05f, -2.04f, 4.64f, -2.43f)
                lineToRelative(6.05f, 6.05f)
                curveTo(18.15f, 13.17f, 17.4f, 14.85f, 16.13f, 16.13f)
                close()
                moveTo(18.96f, 9.09f)
                lineToRelative(-4.03f, -4.03f)
                curveTo(15.45f, 5.01f, 15.91f, 5.0f, 16.26f, 5.0f)
                curveToRelative(1.14f, 0.0f, 2.02f, 0.12f, 2.53f, 0.23f)
                curveTo(18.97f, 6.02f, 19.09f, 7.45f, 18.96f, 9.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.4997f, 14.1002f)
                lineToRelative(5.6002f, -5.6002f)
                lineToRelative(1.4001f, 1.4001f)
                lineToRelative(-5.6002f, 5.6002f)
                close()
            }
        }
        .build()
        return _sportsFootball!!
    }

private var _sportsFootball: ImageVector? = null
