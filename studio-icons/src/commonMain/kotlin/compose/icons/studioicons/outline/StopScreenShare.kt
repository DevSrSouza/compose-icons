package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.StopScreenShare: ImageVector
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
                horizontalLineToRelative(-2.21f)
                close()
                moveTo(1.11f, 2.98f)
                lineToRelative(1.55f, 1.56f)
                curveToRelative(-0.41f, 0.37f, -0.66f, 0.89f, -0.66f, 1.48f)
                lineTo(2.0f, 16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.01f, 2.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(18.13f)
                lineToRelative(2.71f, 2.71f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.52f, 1.57f)
                lineTo(1.11f, 2.98f)
                close()
                moveTo(4.0f, 6.02f)
                horizontalLineToRelative(0.13f)
                lineToRelative(4.95f, 4.93f)
                curveTo(7.94f, 12.07f, 7.31f, 13.52f, 7.0f, 15.0f)
                curveToRelative(0.96f, -1.29f, 2.13f, -2.08f, 3.67f, -2.46f)
                lineToRelative(3.46f, 3.48f)
                lineTo(4.0f, 16.02f)
                verticalLineToRelative(-10.0f)
                close()
                moveTo(20.0f, 6.02f)
                verticalLineToRelative(10.19f)
                lineToRelative(1.3f, 1.3f)
                curveToRelative(0.42f, -0.37f, 0.7f, -0.89f, 0.7f, -1.49f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(7.8f, 4.02f)
                lineToRelative(2.0f, 2.0f)
                lineTo(20.0f, 6.02f)
                close()
                moveTo(12.93f, 9.15f)
                lineToRelative(2.79f, 2.78f)
                lineToRelative(1.28f, -1.2f)
                lineTo(13.0f, 7.0f)
                verticalLineToRelative(2.13f)
                lineToRelative(-0.07f, 0.02f)
                close()
            }
        }
        .build()
        return _stopScreenShare!!
    }

private var _stopScreenShare: ImageVector? = null
