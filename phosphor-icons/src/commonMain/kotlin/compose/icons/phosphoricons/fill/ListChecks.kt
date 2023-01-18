package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.ListChecks: ImageVector
    get() {
        if (_listChecks != null) {
            return _listChecks!!
        }
        _listChecks = Builder(name = "ListChecks", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(97.9f, 170.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -0.5f, 11.3f)
                lineToRelative(-34.6f, 32.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -5.5f, 2.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.4f, -2.1f)
                lineToRelative(-17.3f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 10.8f, -11.8f)
                lineToRelative(11.9f, 11.0f)
                lineToRelative(29.3f, -27.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 97.9f, 170.6f)
                close()
                moveTo(128.0f, 72.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(128.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(86.6f, 106.1f)
                lineToRelative(-29.3f, 27.0f)
                lineToRelative(-11.9f, -11.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.8f, 11.8f)
                lineToRelative(17.3f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.4f, 2.1f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.5f, -2.1f)
                lineToRelative(34.6f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.8f, -11.8f)
                close()
                moveTo(216.0f, 120.0f)
                lineTo(128.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(216.0f, 184.0f)
                lineTo(128.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(86.6f, 42.1f)
                lineToRelative(-29.3f, 27.0f)
                lineToRelative(-11.9f, -11.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 34.6f, 69.9f)
                lineToRelative(17.3f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 57.3f, 88.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.5f, -2.1f)
                lineToRelative(34.6f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 86.6f, 42.1f)
                close()
            }
        }
        .build()
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null
