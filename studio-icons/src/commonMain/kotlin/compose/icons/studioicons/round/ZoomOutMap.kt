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

public val RoundGroup.ZoomOutMap: ImageVector
    get() {
        if (_zoomOutMap != null) {
            return _zoomOutMap!!
        }
        _zoomOutMap = Builder(name = "ZoomOutMap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.85f, 3.85f)
                lineTo(17.3f, 5.3f)
                lineToRelative(-2.18f, 2.16f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f)
                lineTo(18.7f, 6.7f)
                lineToRelative(1.45f, 1.45f)
                curveTo(20.46f, 8.46f, 21.0f, 8.24f, 21.0f, 7.79f)
                verticalLineTo(3.5f)
                curveTo(21.0f, 3.22f, 20.78f, 3.0f, 20.5f, 3.0f)
                horizontalLineToRelative(-4.29f)
                curveTo(15.76f, 3.0f, 15.54f, 3.54f, 15.85f, 3.85f)
                close()
                moveTo(3.85f, 8.15f)
                lineTo(5.3f, 6.7f)
                lineToRelative(2.16f, 2.18f)
                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f)
                lineTo(6.7f, 5.3f)
                lineToRelative(1.45f, -1.45f)
                curveTo(8.46f, 3.54f, 8.24f, 3.0f, 7.79f, 3.0f)
                horizontalLineTo(3.5f)
                curveTo(3.22f, 3.0f, 3.0f, 3.22f, 3.0f, 3.5f)
                verticalLineToRelative(4.29f)
                curveTo(3.0f, 8.24f, 3.54f, 8.46f, 3.85f, 8.15f)
                close()
                moveTo(8.15f, 20.15f)
                lineTo(6.7f, 18.7f)
                lineToRelative(2.18f, -2.16f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f)
                lineTo(5.3f, 17.3f)
                lineToRelative(-1.45f, -1.45f)
                curveTo(3.54f, 15.54f, 3.0f, 15.76f, 3.0f, 16.21f)
                verticalLineToRelative(4.29f)
                curveTo(3.0f, 20.78f, 3.22f, 21.0f, 3.5f, 21.0f)
                horizontalLineToRelative(4.29f)
                curveTo(8.24f, 21.0f, 8.46f, 20.46f, 8.15f, 20.15f)
                close()
                moveTo(20.15f, 15.85f)
                lineTo(18.7f, 17.3f)
                lineToRelative(-2.16f, -2.18f)
                curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f)
                lineToRelative(2.18f, 2.16f)
                lineToRelative(-1.45f, 1.45f)
                curveTo(15.54f, 20.46f, 15.76f, 21.0f, 16.21f, 21.0f)
                horizontalLineToRelative(4.29f)
                curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-4.29f)
                curveTo(21.0f, 15.76f, 20.46f, 15.54f, 20.15f, 15.85f)
                close()
            }
        }
        .build()
        return _zoomOutMap!!
    }

private var _zoomOutMap: ImageVector? = null
