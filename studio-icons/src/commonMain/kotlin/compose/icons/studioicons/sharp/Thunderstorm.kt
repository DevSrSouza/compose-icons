package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Thunderstorm: ImageVector
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
                moveTo(14.8f, 17.0f)
                lineToRelative(-2.9f, 3.32f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(-2.35f, 2.68f)
                lineToRelative(2.65f, 0.0f)
                lineToRelative(2.9f, -3.32f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(2.35f, -2.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.8f, 17.0f)
                lineToRelative(-2.9f, 3.32f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(-2.35f, 2.68f)
                lineToRelative(2.65f, 0.0f)
                lineToRelative(2.9f, -3.32f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(2.35f, -2.68f)
                close()
            }
        }
        .build()
        return _thunderstorm!!
    }

private var _thunderstorm: ImageVector? = null
