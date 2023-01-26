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

public val RoundGroup.RemoveDone: ImageVector
    get() {
        if (_removeDone != null) {
            return _removeDone!!
        }
        _removeDone = Builder(name = "RemoveDone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.14f, 2.69f)
                lineTo(4.14f, 2.69f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(9.67f, 9.67f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.54f, -3.53f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(4.24f, 4.24f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(5.89f, 5.89f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(5.55f, 2.69f)
                curveTo(5.16f, 2.3f, 4.53f, 2.3f, 4.14f, 2.69f)
                close()
                moveTo(18.05f, 12.36f)
                lineToRelative(4.24f, -4.24f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, -0.01f, -1.42f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, -0.38f, -1.02f, -0.38f, -1.41f, 0.01f)
                lineToRelative(-4.24f, 4.24f)
                lineTo(18.05f, 12.36f)
                close()
                moveTo(16.64f, 6.7f)
                lineTo(16.64f, 6.7f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.42f, -1.42f)
                curveTo(17.03f, 7.72f, 17.03f, 7.09f, 16.64f, 6.7f)
                close()
                moveTo(1.79f, 13.06f)
                lineToRelative(4.95f, 4.95f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.2f, 11.65f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(1.4f, 12.04f, 1.4f, 12.67f, 1.79f, 13.06f)
                close()
            }
        }
        .build()
        return _removeDone!!
    }

private var _removeDone: ImageVector? = null
