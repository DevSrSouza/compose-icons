package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.UndoAlt: ImageVector
    get() {
        if (_undoAlt != null) {
            return _undoAlt!!
        }
        _undoAlt = Builder(name = "UndoAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.54f, 8.0f)
                curveToRelative(-66.27f, 0.12f, -126.44f, 26.23f, -170.86f, 68.68f)
                lineTo(48.97f, 40.97f)
                curveTo(33.85f, 25.85f, 8.0f, 36.56f, 8.0f, 57.94f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(134.06f)
                curveToRelative(21.38f, 0.0f, 32.09f, -25.85f, 16.97f, -40.97f)
                lineToRelative(-41.75f, -41.75f)
                curveToRelative(30.86f, -28.9f, 70.8f, -44.91f, 113.23f, -45.27f)
                curveToRelative(92.4f, -0.8f, 170.28f, 73.98f, 169.48f, 169.44f)
                curveTo(423.24f, 348.01f, 349.82f, 424.0f, 256.0f, 424.0f)
                curveToRelative(-41.13f, 0.0f, -80.0f, -14.68f, -110.63f, -41.56f)
                curveToRelative(-4.74f, -4.16f, -11.91f, -3.91f, -16.37f, 0.55f)
                lineTo(89.34f, 422.66f)
                curveToRelative(-4.87f, 4.87f, -4.63f, 12.81f, 0.48f, 17.43f)
                curveTo(133.8f, 479.81f, 192.07f, 504.0f, 256.0f, 504.0f)
                curveToRelative(136.97f, 0.0f, 248.0f, -111.03f, 248.0f, -248.0f)
                curveTo(504.0f, 119.19f, 392.35f, 7.76f, 255.54f, 8.0f)
                close()
            }
        }
        .build()
        return _undoAlt!!
    }

private var _undoAlt: ImageVector? = null
