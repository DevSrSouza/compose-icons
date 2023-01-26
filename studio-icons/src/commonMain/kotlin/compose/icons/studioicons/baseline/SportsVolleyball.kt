package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SportsVolleyball: ImageVector
    get() {
        if (_sportsVolleyball != null) {
            return _sportsVolleyball!!
        }
        _sportsVolleyball = Builder(name = "SportsVolleyball", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.01f)
                curveTo(3.58f, 5.84f, 2.0f, 8.73f, 2.0f, 12.0f)
                curveToRelative(0.0f, 1.46f, 0.32f, 2.85f, 0.89f, 4.11f)
                lineTo(6.0f, 14.31f)
                verticalLineTo(4.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.42f)
                verticalLineTo(2.05f)
                curveTo(9.94f, 2.16f, 8.93f, 2.43f, 8.0f, 2.84f)
                verticalLineToRelative(10.32f)
                lineTo(11.0f, 11.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.15f)
                lineToRelative(-8.11f, 4.68f)
                curveToRelative(0.61f, 0.84f, 1.34f, 1.59f, 2.18f, 2.2f)
                lineTo(15.0f, 14.89f)
                lineTo(12.0f, 13.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.96f)
                verticalLineToRelative(3.46f)
                lineToRelative(8.11f, 4.68f)
                curveToRelative(0.42f, -0.93f, 0.7f, -1.93f, 0.82f, -2.98f)
                lineTo(13.0f, 7.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.07f, 21.2f)
                curveTo(9.28f, 21.71f, 10.6f, 22.0f, 12.0f, 22.0f)
                curveToRelative(3.34f, 0.0f, 6.29f, -1.65f, 8.11f, -4.16f)
                lineTo(17.0f, 16.04f)
                lineTo(8.07f, 21.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.92f, 10.81f)
                curveToRelative(-0.55f, -4.63f, -4.26f, -8.3f, -8.92f, -8.76f)
                verticalLineToRelative(3.6f)
                lineTo(21.92f, 10.81f)
                close()
            }
        }
        .build()
        return _sportsVolleyball!!
    }

private var _sportsVolleyball: ImageVector? = null
