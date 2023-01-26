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

public val RoundGroup.LiveHelp: ImageVector
    get() {
        if (_liveHelp != null) {
            return _liveHelp!!
        }
        _liveHelp = Builder(name = "LiveHelp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(2.29f, 2.29f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineTo(15.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.07f, 10.25f)
                lineToRelative(-0.9f, 0.92f)
                curveToRelative(-0.58f, 0.59f, -0.99f, 1.1f, -1.12f, 2.06f)
                curveToRelative(-0.06f, 0.43f, -0.41f, 0.76f, -0.85f, 0.76f)
                horizontalLineToRelative(-0.31f)
                curveToRelative(-0.52f, 0.0f, -0.92f, -0.46f, -0.85f, -0.98f)
                curveToRelative(0.11f, -0.91f, 0.53f, -1.72f, 1.14f, -2.34f)
                lineToRelative(1.24f, -1.26f)
                curveToRelative(0.36f, -0.36f, 0.58f, -0.86f, 0.58f, -1.41f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.87f, 0.0f, -1.62f, 0.57f, -1.89f, 1.35f)
                curveToRelative(-0.13f, 0.37f, -0.44f, 0.64f, -0.83f, 0.64f)
                horizontalLineToRelative(-0.3f)
                curveToRelative(-0.58f, 0.0f, -0.98f, -0.56f, -0.82f, -1.12f)
                curveTo(8.65f, 5.21f, 10.18f, 4.0f, 12.0f, 4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.88f, -0.36f, 1.68f, -0.93f, 2.25f)
                close()
            }
        }
        .build()
        return _liveHelp!!
    }

private var _liveHelp: ImageVector? = null
