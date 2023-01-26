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

public val RoundGroup.StopScreenShare: ImageVector
    get() {
        if (_stopScreenShare != null) {
            return _stopScreenShare!!
        }
        _stopScreenShare = Builder(name = "StopScreenShare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 18.0f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(1.79f, 1.79f)
                curveToRelative(0.24f, -0.18f, 0.41f, -0.46f, 0.41f, -0.79f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(3.23f, 2.28f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.84f, 0.86f)
                reflectiveCurveToRelative(-0.66f, 0.57f, -0.66f, 1.47f)
                curveTo(2.0f, 6.92f, 2.0f, 16.0f, 2.0f, 16.0f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.0f, 1.09f, 0.88f, 1.98f, 1.97f, 1.99f)
                lineTo(1.0f, 18.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(17.13f)
                lineToRelative(2.0f, 2.0f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(3.23f, 2.28f)
                close()
                moveTo(7.0f, 15.0f)
                curveToRelative(0.31f, -1.48f, 0.94f, -2.93f, 2.08f, -4.05f)
                lineToRelative(1.59f, 1.59f)
                curveTo(9.13f, 12.92f, 7.96f, 13.71f, 7.0f, 15.0f)
                close()
                moveTo(13.0f, 9.13f)
                verticalLineToRelative(-0.98f)
                curveToRelative(0.0f, -0.44f, 0.52f, -0.66f, 0.84f, -0.37f)
                lineTo(15.0f, 8.87f)
                lineToRelative(1.61f, 1.5f)
                curveToRelative(0.21f, 0.2f, 0.21f, 0.53f, 0.0f, 0.73f)
                lineToRelative(-0.89f, 0.83f)
                lineToRelative(5.58f, 5.58f)
                curveToRelative(0.43f, -0.37f, 0.7f, -0.9f, 0.7f, -1.51f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -1.09f, -0.89f, -1.98f, -1.98f, -1.98f)
                lineTo(7.8f, 4.02f)
                lineToRelative(5.14f, 5.13f)
                curveToRelative(0.02f, -0.01f, 0.04f, -0.02f, 0.06f, -0.02f)
                close()
            }
        }
        .build()
        return _stopScreenShare!!
    }

private var _stopScreenShare: ImageVector? = null
