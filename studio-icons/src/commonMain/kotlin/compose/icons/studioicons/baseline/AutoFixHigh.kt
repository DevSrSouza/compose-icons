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

public val BaselineGroup.AutoFixHigh: ImageVector
    get() {
        if (_autoFixHigh != null) {
            return _autoFixHigh!!
        }
        _autoFixHigh = Builder(name = "AutoFixHigh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 5.6f)
                lineTo(10.0f, 7.0f)
                lineTo(8.6f, 4.5f)
                lineTo(10.0f, 2.0f)
                lineTo(7.5f, 3.4f)
                lineTo(5.0f, 2.0f)
                lineToRelative(1.4f, 2.5f)
                lineTo(5.0f, 7.0f)
                close()
                moveTo(19.5f, 15.4f)
                lineTo(17.0f, 14.0f)
                lineToRelative(1.4f, 2.5f)
                lineTo(17.0f, 19.0f)
                lineToRelative(2.5f, -1.4f)
                lineTo(22.0f, 19.0f)
                lineToRelative(-1.4f, -2.5f)
                lineTo(22.0f, 14.0f)
                close()
                moveTo(22.0f, 2.0f)
                lineToRelative(-2.5f, 1.4f)
                lineTo(17.0f, 2.0f)
                lineToRelative(1.4f, 2.5f)
                lineTo(17.0f, 7.0f)
                lineToRelative(2.5f, -1.4f)
                lineTo(22.0f, 7.0f)
                lineToRelative(-1.4f, -2.5f)
                close()
                moveTo(14.37f, 7.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineTo(1.29f, 18.96f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(2.34f, 2.34f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineTo(16.7f, 11.05f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-2.33f, -2.35f)
                close()
                moveTo(13.34f, 12.78f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.44f, 2.44f)
                close()
            }
        }
        .build()
        return _autoFixHigh!!
    }

private var _autoFixHigh: ImageVector? = null
