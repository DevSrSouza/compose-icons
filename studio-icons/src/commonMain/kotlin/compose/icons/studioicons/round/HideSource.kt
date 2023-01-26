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

public val RoundGroup.HideSource: ImageVector
    get() {
        if (_hideSource != null) {
            return _hideSource!!
        }
        _hideSource = Builder(name = "HideSource", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.1f, 3.51f)
                lineTo(2.1f, 3.51f)
                curveTo(1.71f, 3.9f, 1.71f, 4.54f, 2.1f, 4.93f)
                lineToRelative(1.56f, 1.56f)
                curveToRelative(-1.25f, 1.88f, -1.88f, 4.2f, -1.59f, 6.69f)
                curveToRelative(0.52f, 4.54f, 4.21f, 8.23f, 8.75f, 8.75f)
                curveToRelative(2.49f, 0.29f, 4.81f, -0.34f, 6.69f, -1.59f)
                lineToRelative(1.56f, 1.56f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(3.51f, 3.51f)
                curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -1.48f, 0.41f, -2.86f, 1.12f, -4.06f)
                lineToRelative(10.94f, 10.94f)
                curveTo(14.86f, 19.59f, 13.48f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(7.94f, 5.12f)
                lineTo(6.49f, 3.66f)
                curveTo(8.07f, 2.61f, 9.96f, 2.0f, 12.0f, 2.0f)
                curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f)
                curveToRelative(0.0f, 2.04f, -0.61f, 3.93f, -1.66f, 5.51f)
                lineToRelative(-1.46f, -1.46f)
                curveTo(19.59f, 14.86f, 20.0f, 13.48f, 20.0f, 12.0f)
                curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f)
                curveTo(10.52f, 4.0f, 9.14f, 4.41f, 7.94f, 5.12f)
                close()
            }
        }
        .build()
        return _hideSource!!
    }

private var _hideSource: ImageVector? = null
