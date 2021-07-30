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

public val SolidGroup.Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi = Builder(name = "Wifi", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(634.91f, 154.88f)
                curveTo(457.74f, -8.99f, 182.19f, -8.93f, 5.09f, 154.88f)
                curveToRelative(-6.66f, 6.16f, -6.79f, 16.59f, -0.35f, 22.98f)
                lineToRelative(34.24f, 33.97f)
                curveToRelative(6.14f, 6.1f, 16.02f, 6.23f, 22.4f, 0.38f)
                curveToRelative(145.92f, -133.68f, 371.3f, -133.71f, 517.25f, 0.0f)
                curveToRelative(6.38f, 5.85f, 16.26f, 5.71f, 22.4f, -0.38f)
                lineToRelative(34.24f, -33.97f)
                curveToRelative(6.43f, -6.39f, 6.3f, -16.82f, -0.36f, -22.98f)
                close()
                moveTo(320.0f, 352.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.65f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.65f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.65f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(522.67f, 268.41f)
                curveToRelative(-115.26f, -101.93f, -290.21f, -101.82f, -405.34f, 0.0f)
                curveToRelative(-6.9f, 6.1f, -7.12f, 16.69f, -0.57f, 23.15f)
                lineToRelative(34.44f, 33.99f)
                curveToRelative(6.0f, 5.92f, 15.66f, 6.32f, 22.05f, 0.8f)
                curveToRelative(83.95f, -72.57f, 209.74f, -72.41f, 293.49f, 0.0f)
                curveToRelative(6.39f, 5.52f, 16.05f, 5.13f, 22.05f, -0.8f)
                lineToRelative(34.44f, -33.99f)
                curveToRelative(6.56f, -6.46f, 6.33f, -17.06f, -0.56f, -23.15f)
                close()
            }
        }
        .build()
        return _wifi!!
    }

private var _wifi: ImageVector? = null
