package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.NoStroller: ImageVector
    get() {
        if (_noStroller != null) {
            return _noStroller!!
        }
        _noStroller = Builder(name = "NoStroller", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.91f, 8.08f)
                lineTo(6.53f, 3.7f)
                curveTo(7.6f, 3.25f, 8.77f, 3.0f, 10.0f, 3.0f)
                curveToRelative(1.56f, 0.0f, 3.03f, 0.4f, 4.3f, 1.1f)
                lineTo(10.91f, 8.08f)
                close()
                moveTo(21.19f, 21.19f)
                lineToRelative(-4.78f, -4.78f)
                lineToRelative(-5.75f, -5.75f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(7.97f, 7.97f)
                lineTo(5.27f, 17.0f)
                horizontalLineToRelative(8.9f)
                lineToRelative(1.13f, 1.13f)
                curveToRelative(-0.88f, 0.33f, -1.47f, 1.25f, -1.26f, 2.28f)
                curveToRelative(0.15f, 0.76f, 0.78f, 1.39f, 1.54f, 1.54f)
                curveToRelative(1.03f, 0.21f, 1.95f, -0.38f, 2.28f, -1.26f)
                lineToRelative(1.91f, 1.91f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(6.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(7.1f, 18.0f, 6.0f, 18.0f)
                close()
                moveTo(17.0f, 6.27f)
                curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f)
                curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.48f)
                curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f)
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
