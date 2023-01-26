package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Thunderstorm: ImageVector
    get() {
        if (_thunderstorm != null) {
            return _thunderstorm!!
        }
        _thunderstorm = Builder(name = "Thunderstorm", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.92f, 7.02f)
                curveTo(17.45f, 4.18f, 14.97f, 2.0f, 12.0f, 2.0f)
                curveTo(9.82f, 2.0f, 7.83f, 3.18f, 6.78f, 5.06f)
                curveTo(4.09f, 5.41f, 2.0f, 7.74f, 2.0f, 10.5f)
                curveTo(2.0f, 13.53f, 4.47f, 16.0f, 7.5f, 16.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f)
                curveTo(22.0f, 9.16f, 20.21f, 7.23f, 17.92f, 7.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.95f, 20.11f)
                lineToRelative(-0.84f, -0.42f)
                lineToRelative(0.9f, -1.03f)
                curveToRelative(0.36f, -0.42f, 0.32f, -1.05f, -0.09f, -1.41f)
                curveToRelative(-0.42f, -0.36f, -1.05f, -0.32f, -1.41f, 0.09f)
                lineToRelative(-1.75f, 2.0f)
                curveToRelative(-0.2f, 0.23f, -0.29f, 0.55f, -0.23f, 0.85f)
                curveToRelative(0.06f, 0.3f, 0.26f, 0.56f, 0.53f, 0.7f)
                lineToRelative(0.84f, 0.42f)
                lineTo(13.0f, 22.34f)
                curveToRelative(-0.36f, 0.42f, -0.32f, 1.05f, 0.09f, 1.41f)
                curveToRelative(0.19f, 0.17f, 0.42f, 0.25f, 0.66f, 0.25f)
                curveToRelative(0.28f, 0.0f, 0.55f, -0.12f, 0.75f, -0.34f)
                lineToRelative(1.75f, -2.0f)
                curveToRelative(0.2f, -0.23f, 0.29f, -0.55f, 0.23f, -0.85f)
                curveTo(16.42f, 20.5f, 16.22f, 20.24f, 15.95f, 20.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.95f, 20.11f)
                lineTo(9.1f, 19.68f)
                lineToRelative(0.9f, -1.03f)
                curveToRelative(0.36f, -0.42f, 0.32f, -1.05f, -0.09f, -1.41f)
                curveToRelative(-0.42f, -0.36f, -1.05f, -0.32f, -1.41f, 0.09f)
                lineToRelative(-1.75f, 2.0f)
                curveToRelative(-0.2f, 0.23f, -0.29f, 0.55f, -0.23f, 0.85f)
                curveToRelative(0.06f, 0.3f, 0.26f, 0.56f, 0.53f, 0.7f)
                lineToRelative(0.84f, 0.42f)
                lineTo(7.0f, 22.34f)
                curveToRelative(-0.36f, 0.42f, -0.32f, 1.05f, 0.09f, 1.41f)
                curveTo(7.28f, 23.92f, 7.52f, 24.0f, 7.75f, 24.0f)
                curveToRelative(0.28f, 0.0f, 0.55f, -0.12f, 0.75f, -0.34f)
                lineToRelative(1.75f, -2.0f)
                curveToRelative(0.2f, -0.23f, 0.29f, -0.55f, 0.23f, -0.85f)
                curveTo(10.42f, 20.5f, 10.22f, 20.24f, 9.95f, 20.11f)
                close()
            }
        }
        .build()
        return _thunderstorm!!
    }

private var _thunderstorm: ImageVector? = null
