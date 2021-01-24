package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(571.31f, 193.94f)
                lineToRelative(-22.63f, -22.63f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0.0f)
                lineToRelative(-11.31f, 11.31f)
                lineToRelative(-28.9f, -28.9f)
                curveToRelative(5.63f, -21.31f, 0.36f, -44.9f, -16.35f, -61.61f)
                lineToRelative(-45.25f, -45.25f)
                curveToRelative(-62.48f, -62.48f, -163.79f, -62.48f, -226.28f, 0.0f)
                lineToRelative(90.51f, 45.25f)
                verticalLineToRelative(18.75f)
                curveToRelative(0.0f, 16.97f, 6.74f, 33.25f, 18.75f, 45.25f)
                lineToRelative(49.14f, 49.14f)
                curveToRelative(16.71f, 16.71f, 40.3f, 21.98f, 61.61f, 16.35f)
                lineToRelative(28.9f, 28.9f)
                lineToRelative(-11.31f, 11.31f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0.0f, 22.63f)
                lineToRelative(22.63f, 22.63f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0.0f)
                lineToRelative(90.51f, -90.51f)
                curveToRelative(6.23f, -6.24f, 6.23f, -16.37f, -0.02f, -22.62f)
                close()
                moveTo(284.59f, 178.74f)
                curveToRelative(-3.7f, -3.7f, -6.84f, -7.79f, -9.85f, -11.95f)
                lineTo(19.64f, 404.96f)
                curveToRelative(-25.57f, 23.88f, -26.26f, 64.19f, -1.53f, 88.93f)
                reflectiveCurveToRelative(65.05f, 24.05f, 88.93f, -1.53f)
                lineToRelative(238.13f, -255.07f)
                curveToRelative(-3.96f, -2.91f, -7.9f, -5.87f, -11.44f, -9.41f)
                lineToRelative(-49.14f, -49.14f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
