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

public val OutlineGroup.ScreenRotation: ImageVector
    get() {
        if (_screenRotation != null) {
            return _screenRotation!!
        }
        _screenRotation = Builder(name = "ScreenRotation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.48f, 2.52f)
                curveToRelative(3.27f, 1.55f, 5.61f, 4.72f, 5.97f, 8.48f)
                horizontalLineToRelative(1.5f)
                curveTo(23.44f, 4.84f, 18.29f, 0.0f, 12.0f, 0.0f)
                lineToRelative(-0.66f, 0.03f)
                lineToRelative(3.81f, 3.81f)
                lineToRelative(1.33f, -1.32f)
                close()
                moveTo(10.23f, 1.75f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f)
                lineTo(1.75f, 8.11f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f)
                lineToRelative(12.02f, 12.02f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f)
                lineToRelative(6.36f, -6.36f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f)
                lineTo(10.23f, 1.75f)
                close()
                moveTo(14.83f, 21.19f)
                lineTo(2.81f, 9.17f)
                lineToRelative(6.36f, -6.36f)
                lineToRelative(12.02f, 12.02f)
                lineToRelative(-6.36f, 6.36f)
                close()
                moveTo(7.52f, 21.48f)
                curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f)
                lineTo(0.05f, 13.0f)
                curveTo(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f)
                lineToRelative(0.66f, -0.03f)
                lineToRelative(-3.81f, -3.81f)
                lineToRelative(-1.33f, 1.32f)
                close()
            }
        }
        .build()
        return _screenRotation!!
    }

private var _screenRotation: ImageVector? = null
