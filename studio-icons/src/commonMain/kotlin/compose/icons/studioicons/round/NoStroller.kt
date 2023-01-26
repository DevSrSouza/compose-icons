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

public val RoundGroup.NoStroller: ImageVector
    get() {
        if (_noStroller != null) {
            return _noStroller!!
        }
        _noStroller = Builder(name = "NoStroller", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveTo(8.0f, 18.9f, 8.0f, 20.0f)
                close()
                moveTo(14.3f, 4.1f)
                curveTo(13.03f, 3.4f, 11.56f, 3.0f, 10.0f, 3.0f)
                curveTo(8.77f, 3.0f, 7.61f, 3.26f, 6.54f, 3.71f)
                lineToRelative(4.37f, 4.37f)
                lineTo(14.3f, 4.1f)
                close()
                moveTo(20.49f, 21.9f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-9.82f, -9.82f)
                lineTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(7.26f, 7.26f)
                lineToRelative(-2.66f, 3.12f)
                curveToRelative(-0.55f, 0.65f, -0.09f, 1.65f, 0.76f, 1.65f)
                horizontalLineToRelative(6.66f)
                lineToRelative(1.17f, 1.17f)
                curveToRelative(-0.88f, 0.33f, -1.47f, 1.25f, -1.26f, 2.28f)
                curveToRelative(0.15f, 0.76f, 0.78f, 1.39f, 1.54f, 1.54f)
                curveToRelative(1.03f, 0.21f, 1.95f, -0.38f, 2.28f, -1.26f)
                lineToRelative(1.2f, 1.2f)
                curveTo(19.46f, 22.29f, 20.09f, 22.29f, 20.49f, 21.9f)
                lineTo(20.49f, 21.9f)
                close()
                moveTo(17.0f, 6.27f)
                curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f)
                curveToRelative(0.68f, 0.0f, 1.22f, 0.52f, 1.33f, 1.21f)
                curveTo(20.08f, 6.66f, 20.48f, 7.0f, 20.96f, 7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.06f, 0.0f, -0.11f, -0.01f, -0.16f)
                lineToRelative(0.0f, -0.01f)
                curveTo(21.65f, 4.22f, 20.3f, 3.0f, 18.65f, 3.0f)
                curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f)
                lineToRelative(-3.5f, 4.11f)
                lineTo(17.0f, 14.17f)
                verticalLineTo(6.27f)
                close()
            }
        }
        .build()
        return _noStroller!!
    }

private var _noStroller: ImageVector? = null
