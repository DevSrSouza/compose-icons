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

public val OutlineGroup.RoundaboutRight: ImageVector
    get() {
        if (_roundaboutRight != null) {
            return _roundaboutRight!!
        }
        _roundaboutRight = Builder(name = "RoundaboutRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.92f, 8.0f)
                curveTo(13.44f, 5.16f, 10.97f, 3.0f, 8.0f, 3.0f)
                curveTo(4.69f, 3.0f, 2.0f, 5.69f, 2.0f, 9.0f)
                curveToRelative(0.0f, 2.97f, 2.16f, 5.44f, 5.0f, 5.92f)
                lineTo(7.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.0f, -6.09f)
                curveToRelative(0.0f, -0.98f, -0.71f, -1.8f, -1.67f, -1.97f)
                curveTo(5.44f, 12.63f, 4.0f, 10.98f, 4.0f, 9.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                curveToRelative(1.98f, 0.0f, 3.63f, 1.44f, 3.94f, 3.33f)
                curveTo(12.11f, 9.29f, 12.93f, 10.0f, 13.91f, 10.0f)
                lineToRelative(4.26f, 0.0f)
                lineToRelative(-1.59f, 1.59f)
                lineTo(18.0f, 13.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(18.17f, 8.0f)
                lineTo(13.92f, 8.0f)
                close()
            }
        }
        .build()
        return _roundaboutRight!!
    }

private var _roundaboutRight: ImageVector? = null
