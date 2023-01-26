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

public val BaselineGroup.WifiTetheringOff: ImageVector
    get() {
        if (_wifiTetheringOff != null) {
            return _wifiTetheringOff!!
        }
        _wifiTetheringOff = Builder(name = "WifiTetheringOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(2.69f, 2.69f)
                curveTo(2.78f, 8.6f, 2.0f, 10.71f, 2.0f, 13.0f)
                curveToRelative(0.0f, 2.76f, 1.12f, 5.26f, 2.93f, 7.07f)
                lineToRelative(1.42f, -1.42f)
                curveTo(4.9f, 17.21f, 4.0f, 15.21f, 4.0f, 13.0f)
                curveToRelative(0.0f, -1.75f, 0.57f, -3.35f, 1.51f, -4.66f)
                lineToRelative(1.43f, 1.43f)
                curveTo(6.35f, 10.7f, 6.0f, 11.81f, 6.0f, 13.0f)
                curveToRelative(0.0f, 1.66f, 0.68f, 3.15f, 1.76f, 4.24f)
                lineToRelative(1.42f, -1.42f)
                curveTo(8.45f, 15.1f, 8.0f, 14.11f, 8.0f, 13.0f)
                curveToRelative(0.0f, -0.63f, 0.15f, -1.23f, 0.41f, -1.76f)
                lineToRelative(1.61f, 1.61f)
                curveToRelative(0.0f, 0.05f, -0.02f, 0.1f, -0.02f, 0.15f)
                curveToRelative(0.0f, 0.55f, 0.23f, 1.05f, 0.59f, 1.41f)
                curveTo(10.95f, 14.77f, 11.45f, 15.0f, 12.0f, 15.0f)
                curveToRelative(0.05f, 0.0f, 0.1f, -0.01f, 0.16f, -0.02f)
                lineToRelative(7.62f, 7.62f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
                moveTo(17.7f, 14.87f)
                curveTo(17.89f, 14.28f, 18.0f, 13.65f, 18.0f, 13.0f)
                curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f)
                curveToRelative(-0.65f, 0.0f, -1.28f, 0.1f, -1.87f, 0.3f)
                lineToRelative(1.71f, 1.71f)
                curveTo(11.89f, 9.0f, 11.95f, 9.0f, 12.0f, 9.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.05f, 0.0f, 0.11f, -0.01f, 0.16f)
                lineTo(17.7f, 14.87f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f)
                curveToRelative(0.0f, 1.22f, -0.27f, 2.37f, -0.77f, 3.4f)
                lineToRelative(1.49f, 1.49f)
                curveTo(21.53f, 16.45f, 22.0f, 14.78f, 22.0f, 13.0f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
                curveToRelative(-1.78f, 0.0f, -3.44f, 0.46f, -4.89f, 1.28f)
                lineToRelative(1.48f, 1.48f)
                curveTo(9.63f, 5.27f, 10.78f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _wifiTetheringOff!!
    }

private var _wifiTetheringOff: ImageVector? = null
