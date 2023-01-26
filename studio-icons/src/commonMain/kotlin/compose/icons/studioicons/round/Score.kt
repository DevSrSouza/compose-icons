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

public val RoundGroup.Score: ImageVector
    get() {
        if (_score != null) {
            return _score!!
        }
        _score = Builder(name = "Score", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(12.0f, 5.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(13.5f, 8.0f)
                lineToRelative(1.79f, -2.69f)
                curveToRelative(0.13f, -0.19f, 0.35f, -0.31f, 0.59f, -0.31f)
                curveToRelative(0.56f, 0.0f, 0.9f, 0.63f, 0.59f, 1.1f)
                lineTo(15.2f, 8.0f)
                lineToRelative(1.27f, 1.9f)
                curveToRelative(0.31f, 0.47f, -0.02f, 1.1f, -0.59f, 1.1f)
                curveToRelative(-0.24f, 0.0f, -0.46f, -0.12f, -0.59f, -0.31f)
                lineTo(13.5f, 8.0f)
                verticalLineToRelative(2.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(7.0f, 8.25f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.5f)
                lineTo(9.5f, 6.5f)
                lineTo(7.75f, 6.5f)
                curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveTo(7.34f, 5.0f, 7.75f, 5.0f)
                lineTo(10.0f, 5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(1.75f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(8.5f, 8.75f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(8.0f, 11.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(7.0f, 8.25f)
                close()
                moveTo(18.74f, 13.26f)
                lineToRelative(-5.03f, 5.03f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineTo(9.0f, 15.0f)
                lineToRelative(-2.49f, 2.49f)
                curveToRelative(-0.56f, 0.56f, -1.51f, 0.16f, -1.51f, -0.62f)
                curveToRelative(0.0f, -0.23f, 0.09f, -0.46f, 0.26f, -0.62f)
                lineToRelative(3.03f, -3.03f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineTo(13.0f, 16.5f)
                lineToRelative(4.49f, -4.49f)
                curveToRelative(0.56f, -0.56f, 1.51f, -0.16f, 1.51f, 0.62f)
                curveToRelative(0.0f, 0.24f, -0.09f, 0.46f, -0.26f, 0.63f)
                close()
            }
        }
        .build()
        return _score!!
    }

private var _score: ImageVector? = null
