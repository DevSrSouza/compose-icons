package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.ListChecks: ImageVector
    get() {
        if (_listChecks != null) {
            return _listChecks!!
        }
        _listChecks = Builder(name = "ListChecks", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(128.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 128.0f)
                close()
                moveTo(128.0f, 70.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(128.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(216.0f, 186.0f)
                lineTo(128.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(87.9f, 43.6f)
                lineTo(57.3f, 71.8f)
                lineTo(44.1f, 59.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.2f, 8.8f)
                lineToRelative(17.4f, 16.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.0f, 1.6f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.1f, -1.6f)
                lineToRelative(34.7f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.2f, -8.8f)
                close()
                moveTo(87.9f, 107.6f)
                lineTo(57.3f, 135.8f)
                lineTo(44.1f, 123.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.2f, 8.8f)
                lineToRelative(17.4f, 16.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.0f, 1.6f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.1f, -1.6f)
                lineToRelative(34.7f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.2f, -8.8f)
                close()
                moveTo(87.9f, 171.6f)
                lineTo(57.3f, 199.8f)
                lineTo(44.1f, 187.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.2f, 8.8f)
                lineToRelative(17.4f, 16.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.0f, 1.6f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.1f, -1.6f)
                lineToRelative(34.7f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.2f, -8.8f)
                close()
            }
        }
        .build()
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null
