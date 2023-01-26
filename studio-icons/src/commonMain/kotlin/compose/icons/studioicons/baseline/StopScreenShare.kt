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

public val BaselineGroup.StopScreenShare: ImageVector
    get() {
        if (_stopScreenShare != null) {
            return _stopScreenShare!!
        }
        _stopScreenShare = Builder(name = "StopScreenShare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.22f, 18.02f)
                lineToRelative(2.0f, 2.0f)
                lineTo(24.0f, 20.02f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.78f)
                close()
                moveTo(21.99f, 16.02f)
                lineToRelative(0.01f, -10.0f)
                curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(7.22f, 4.02f)
                lineToRelative(5.23f, 5.23f)
                curveToRelative(0.18f, -0.04f, 0.36f, -0.07f, 0.55f, -0.1f)
                lineTo(13.0f, 7.02f)
                lineToRelative(4.0f, 3.73f)
                lineToRelative(-1.58f, 1.47f)
                lineToRelative(5.54f, 5.54f)
                curveToRelative(0.61f, -0.33f, 1.03f, -0.99f, 1.03f, -1.74f)
                close()
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineToRelative(1.54f, 1.54f)
                curveToRelative(-0.4f, 0.36f, -0.65f, 0.89f, -0.65f, 1.48f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                lineTo(0.0f, 18.02f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(18.13f)
                lineToRelative(2.71f, 2.71f)
                lineToRelative(1.27f, -1.27f)
                lineTo(2.39f, 1.73f)
                close()
                moveTo(7.0f, 15.02f)
                curveToRelative(0.31f, -1.48f, 0.92f, -2.95f, 2.07f, -4.06f)
                lineToRelative(1.59f, 1.59f)
                curveToRelative(-1.54f, 0.38f, -2.7f, 1.18f, -3.66f, 2.47f)
                close()
            }
        }
        .build()
        return _stopScreenShare!!
    }

private var _stopScreenShare: ImageVector? = null
