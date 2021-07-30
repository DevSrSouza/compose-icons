package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Pray: ImageVector
    get() {
        if (_pray != null) {
            return _pray!!
        }
        _pray = Builder(name = "Pray", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 128.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                reflectiveCurveTo(291.35f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(-64.0f, 28.65f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.65f, 64.0f, 64.0f, 64.0f)
                close()
                moveTo(225.37f, 297.75f)
                curveToRelative(14.06f, 16.72f, 39.0f, 19.09f, 55.97f, 5.22f)
                lineToRelative(88.0f, -72.02f)
                curveToRelative(17.09f, -13.98f, 19.59f, -39.19f, 5.62f, -56.28f)
                curveToRelative(-13.97f, -17.11f, -39.19f, -19.59f, -56.31f, -5.62f)
                lineToRelative(-57.44f, 47.0f)
                lineToRelative(-38.91f, -46.31f)
                curveToRelative(-15.44f, -18.39f, -39.22f, -27.92f, -64.0f, -25.33f)
                curveToRelative(-24.19f, 2.48f, -45.25f, 16.27f, -56.37f, 36.92f)
                lineToRelative(-49.37f, 92.03f)
                curveToRelative(-23.4f, 43.64f, -8.69f, 96.37f, 34.19f, 123.75f)
                lineTo(131.56f, 432.0f)
                lineTo(40.0f, 432.0f)
                curveToRelative(-22.09f, 0.0f, -40.0f, 17.91f, -40.0f, 40.0f)
                reflectiveCurveToRelative(17.91f, 40.0f, 40.0f, 40.0f)
                horizontalLineToRelative(208.0f)
                curveToRelative(34.08f, 0.0f, 53.77f, -42.79f, 28.28f, -68.28f)
                lineTo(166.42f, 333.86f)
                lineToRelative(34.8f, -64.87f)
                lineToRelative(24.15f, 28.76f)
                close()
            }
        }
        .build()
        return _pray!!
    }

private var _pray: ImageVector? = null
