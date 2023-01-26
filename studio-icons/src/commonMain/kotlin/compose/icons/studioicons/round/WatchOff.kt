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

public val RoundGroup.WatchOff: ImageVector
    get() {
        if (_watchOff != null) {
            return _watchOff!!
        }
        _watchOff = Builder(name = "WatchOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                curveToRelative(0.0f, 0.64f, -0.13f, 1.25f, -0.35f, 1.82f)
                lineToRelative(1.5f, 1.5f)
                curveTo(18.69f, 14.33f, 19.0f, 13.2f, 19.0f, 12.0f)
                curveToRelative(0.0f, -2.22f, -1.03f, -4.19f, -2.64f, -5.47f)
                lineToRelative(-0.93f, -3.1f)
                curveTo(15.17f, 2.58f, 14.4f, 2.0f, 13.51f, 2.0f)
                horizontalLineToRelative(-3.02f)
                curveTo(9.6f, 2.0f, 8.83f, 2.58f, 8.57f, 3.42f)
                lineTo(8.04f, 5.21f)
                lineToRelative(2.14f, 2.14f)
                curveTo(10.75f, 7.13f, 11.36f, 7.0f, 12.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.1f, 3.51f)
                lineTo(2.1f, 3.51f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(3.75f, 3.75f)
                curveTo(5.31f, 9.67f, 5.0f, 10.8f, 5.0f, 12.0f)
                curveToRelative(0.0f, 2.22f, 1.03f, 4.19f, 2.64f, 5.47f)
                lineToRelative(0.93f, 3.1f)
                curveTo(8.83f, 21.42f, 9.6f, 22.0f, 10.49f, 22.0f)
                horizontalLineToRelative(3.02f)
                curveToRelative(0.88f, 0.0f, 1.66f, -0.58f, 1.92f, -1.43f)
                lineToRelative(0.53f, -1.78f)
                lineToRelative(3.11f, 3.11f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(3.51f, 3.51f)
                curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.64f, 0.13f, -1.25f, 0.35f, -1.82f)
                lineToRelative(6.47f, 6.47f)
                curveTo(13.25f, 16.87f, 12.64f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _watchOff!!
    }

private var _watchOff: ImageVector? = null
