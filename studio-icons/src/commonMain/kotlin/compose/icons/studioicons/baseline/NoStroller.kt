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

public val BaselineGroup.NoStroller: ImageVector
    get() {
        if (_noStroller != null) {
            return _noStroller!!
        }
        _noStroller = Builder(name = "NoStroller", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveTo(4.9f, 18.0f, 6.0f, 18.0f)
                close()
                moveTo(18.65f, 3.0f)
                curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f)
                lineToRelative(-3.5f, 4.11f)
                lineTo(17.0f, 14.17f)
                verticalLineToRelative(-7.9f)
                curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f)
                curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.48f)
                curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f)
                close()
                moveTo(10.67f, 10.67f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(7.97f, 7.97f)
                lineTo(6.7f, 15.31f)
                curveToRelative(-0.55f, 0.65f, -0.09f, 1.65f, 0.76f, 1.65f)
                horizontalLineToRelative(6.66f)
                lineToRelative(1.17f, 1.17f)
                curveTo(14.54f, 18.42f, 14.0f, 19.14f, 14.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.86f, 0.0f, 1.58f, -0.54f, 1.87f, -1.3f)
                lineToRelative(1.91f, 1.91f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.8f, -4.8f)
                lineTo(10.67f, 10.67f)
                close()
                moveTo(13.47f, 5.03f)
                curveToRelative(0.27f, -0.32f, 0.58f, -0.72f, 0.98f, -1.09f)
                curveToRelative(-2.46f, -1.19f, -5.32f, -1.22f, -7.81f, -0.13f)
                lineToRelative(4.25f, 4.25f)
                lineTo(13.47f, 5.03f)
                close()
            }
        }
        .build()
        return _noStroller!!
    }

private var _noStroller: ImageVector? = null
