package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SportsVolleyball: ImageVector
    get() {
        if (_sportsVolleyball != null) {
            return _sportsVolleyball!!
        }
        _sportsVolleyball = Builder(name = "SportsVolleyball", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.0f, 4.07f)
                curveToRelative(3.07f, 0.38f, 5.57f, 2.52f, 6.54f, 5.36f)
                lineTo(13.0f, 5.65f)
                verticalLineTo(4.07f)
                close()
                moveTo(8.0f, 5.08f)
                curveToRelative(1.18f, -0.69f, 3.33f, -1.06f, 3.0f, -1.02f)
                verticalLineToRelative(7.35f)
                lineToRelative(-3.0f, 1.73f)
                verticalLineTo(5.08f)
                close()
                moveTo(4.63f, 15.1f)
                curveTo(4.23f, 14.14f, 4.0f, 13.1f, 4.0f, 12.0f)
                curveToRelative(0.0f, -2.02f, 0.76f, -3.86f, 2.0f, -5.27f)
                verticalLineToRelative(7.58f)
                lineTo(4.63f, 15.1f)
                close()
                moveTo(5.64f, 16.83f)
                lineTo(12.0f, 13.15f)
                lineToRelative(3.0f, 1.73f)
                lineToRelative(-6.98f, 4.03f)
                curveTo(7.09f, 18.38f, 6.28f, 17.68f, 5.64f, 16.83f)
                close()
                moveTo(10.42f, 19.84f)
                moveTo(12.0f, 20.0f)
                curveToRelative(-0.54f, 0.0f, -1.07f, -0.06f, -1.58f, -0.16f)
                lineToRelative(6.58f, -3.8f)
                lineToRelative(1.36f, 0.78f)
                curveTo(16.9f, 18.75f, 14.6f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(13.0f, 11.42f)
                verticalLineTo(7.96f)
                lineToRelative(7.0f, 4.05f)
                curveToRelative(0.0f, 1.1f, -0.23f, 2.14f, -0.63f, 3.09f)
                lineTo(13.0f, 11.42f)
                close()
            }
        }
        .build()
        return _sportsVolleyball!!
    }

private var _sportsVolleyball: ImageVector? = null
