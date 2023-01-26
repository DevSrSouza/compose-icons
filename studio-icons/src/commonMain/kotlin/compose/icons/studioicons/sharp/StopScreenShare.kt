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

public val SharpGroup.StopScreenShare: ImageVector
    get() {
        if (_stopScreenShare != null) {
            return _stopScreenShare!!
        }
        _stopScreenShare = Builder(name = "StopScreenShare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.79f, 18.0f)
                lineToRelative(2.0f, 2.0f)
                lineTo(24.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 9.13f)
                lineTo(13.0f, 7.0f)
                lineToRelative(4.0f, 3.74f)
                lineToRelative(-1.28f, 1.19f)
                lineToRelative(5.18f, 5.18f)
                lineTo(22.0f, 16.0f)
                lineTo(22.0f, 4.02f)
                lineTo(7.8f, 4.02f)
                lineToRelative(5.13f, 5.13f)
                curveToRelative(0.03f, -0.01f, 0.05f, -0.02f, 0.07f, -0.02f)
                close()
                moveTo(1.11f, 2.98f)
                lineToRelative(0.89f, 0.9f)
                verticalLineToRelative(12.14f)
                lineToRelative(2.0f, 1.99f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(18.13f)
                lineToRelative(2.71f, 2.71f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.52f, 1.57f)
                lineTo(1.11f, 2.98f)
                close()
                moveTo(9.08f, 10.95f)
                lineToRelative(1.59f, 1.59f)
                curveTo(9.13f, 12.92f, 7.96f, 13.71f, 7.0f, 15.0f)
                curveToRelative(0.31f, -1.48f, 0.94f, -2.93f, 2.08f, -4.05f)
                close()
            }
        }
        .build()
        return _stopScreenShare!!
    }

private var _stopScreenShare: ImageVector? = null
