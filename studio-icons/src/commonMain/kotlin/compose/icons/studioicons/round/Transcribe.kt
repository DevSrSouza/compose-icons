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

public val RoundGroup.Transcribe: ImageVector
    get() {
        if (_transcribe != null) {
            return _transcribe!!
        }
        _transcribe = Builder(name = "Transcribe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.54f, 10.28f)
                curveToRelative(-0.34f, -0.82f, -0.34f, -1.72f, 0.0f, -2.54f)
                curveToRelative(0.19f, -0.45f, 0.1f, -0.96f, -0.24f, -1.3f)
                lineToRelative(-0.1f, -0.1f)
                curveToRelative(-0.56f, -0.56f, -1.51f, -0.44f, -1.88f, 0.26f)
                curveToRelative(-0.8f, 1.48f, -0.79f, 3.24f, 0.03f, 4.79f)
                curveToRelative(0.37f, 0.69f, 1.31f, 0.83f, 1.86f, 0.27f)
                lineToRelative(0.1f, -0.1f)
                curveTo(22.65f, 11.23f, 22.73f, 10.72f, 22.54f, 10.28f)
                close()
                moveTo(18.82f, 15.11f)
                lineTo(18.82f, 15.11f)
                curveToRelative(0.4f, -0.4f, 0.46f, -1.02f, 0.13f, -1.48f)
                curveToRelative(-1.97f, -2.73f, -1.96f, -6.39f, 0.01f, -9.23f)
                curveToRelative(0.32f, -0.47f, 0.26f, -1.1f, -0.14f, -1.5f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.5f, -0.5f, -1.34f, -0.46f, -1.78f, 0.1f)
                curveToRelative(-2.73f, 3.54f, -2.73f, 8.36f, 0.02f, 12.0f)
                curveTo(17.49f, 15.56f, 18.33f, 15.61f, 18.82f, 15.11f)
                close()
                moveTo(9.0f, 13.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(5.0f, 6.79f, 5.0f, 9.0f)
                curveTo(5.0f, 11.21f, 6.79f, 13.0f, 9.0f, 13.0f)
                close()
                moveTo(15.39f, 15.56f)
                curveTo(13.71f, 14.7f, 11.53f, 14.0f, 9.0f, 14.0f)
                curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f)
                curveTo(1.61f, 16.07f, 1.0f, 17.1f, 1.0f, 18.22f)
                lineTo(1.0f, 20.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineToRelative(0.0f, -1.78f)
                curveTo(17.0f, 17.1f, 16.39f, 16.07f, 15.39f, 15.56f)
                close()
            }
        }
        .build()
        return _transcribe!!
    }

private var _transcribe: ImageVector? = null
