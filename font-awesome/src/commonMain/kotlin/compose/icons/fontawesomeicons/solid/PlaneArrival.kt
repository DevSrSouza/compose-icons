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

public val SolidGroup.PlaneArrival: ImageVector
    get() {
        if (_planeArrival != null) {
            return _planeArrival!!
        }
        _planeArrival = Builder(name = "PlaneArrival", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(624.0f, 448.0f)
                horizontalLineTo(16.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(608.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(44.81f, 205.66f)
                lineToRelative(88.74f, 80.0f)
                arcToRelative(62.607f, 62.607f, 0.0f, false, false, 25.47f, 13.93f)
                lineToRelative(287.6f, 78.35f)
                curveToRelative(26.48f, 7.21f, 54.56f, 8.72f, 81.0f, 1.36f)
                curveToRelative(29.67f, -8.27f, 43.44f, -21.21f, 47.25f, -35.71f)
                curveToRelative(3.83f, -14.5f, -1.73f, -32.71f, -23.37f, -54.96f)
                curveToRelative(-19.28f, -19.82f, -44.35f, -32.79f, -70.83f, -40.0f)
                lineToRelative(-97.51f, -26.56f)
                lineTo(282.8f, 30.22f)
                curveToRelative(-1.51f, -5.81f, -5.95f, -10.35f, -11.66f, -11.91f)
                lineTo(206.05f, 0.58f)
                curveToRelative(-10.56f, -2.88f, -20.9f, 5.32f, -20.71f, 16.44f)
                lineToRelative(47.92f, 164.21f)
                lineToRelative(-102.2f, -27.84f)
                lineToRelative(-27.59f, -67.88f)
                curveToRelative(-1.93f, -4.89f, -6.01f, -8.57f, -11.02f, -9.93f)
                lineTo(52.72f, 64.75f)
                curveToRelative(-10.34f, -2.82f, -20.53f, 5.0f, -20.72f, 15.88f)
                lineToRelative(0.23f, 101.78f)
                curveToRelative(0.19f, 8.91f, 6.03f, 17.34f, 12.58f, 23.25f)
                close()
            }
        }
        .build()
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
