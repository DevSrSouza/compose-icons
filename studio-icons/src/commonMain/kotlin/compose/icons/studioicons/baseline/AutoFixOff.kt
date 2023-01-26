package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.AutoFixOff: ImageVector
    get() {
        if (_autoFixOff != null) {
            return _autoFixOff!!
        }
        _autoFixOff = Builder(name = "AutoFixOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 1.0f)
                lineToRelative(-2.5f, 1.4f)
                lineTo(18.0f, 1.0f)
                lineToRelative(1.4f, 2.5f)
                lineTo(18.0f, 6.0f)
                lineToRelative(2.5f, -1.4f)
                lineTo(23.0f, 6.0f)
                lineToRelative(-1.4f, -2.5f)
                lineTo(23.0f, 1.0f)
                close()
                moveTo(14.66f, 7.22f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(0.81f, 0.81f)
                lineToRelative(2.55f, -2.55f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-2.34f, -2.34f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineTo(11.4f, 8.84f)
                lineToRelative(0.81f, 0.81f)
                lineToRelative(2.45f, -2.43f)
                close()
                moveTo(13.88f, 13.87f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(-6.86f, -6.86f)
                lineTo(2.0f, 4.53f)
                lineToRelative(6.86f, 6.86f)
                lineToRelative(-6.57f, 6.57f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(2.34f, 2.34f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(6.57f, -6.57f)
                lineTo(19.47f, 22.0f)
                lineToRelative(1.27f, -1.27f)
                lineToRelative(-6.86f, -6.86f)
                close()
            }
        }
        .build()
        return _autoFixOff!!
    }

private var _autoFixOff: ImageVector? = null
