package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Percent: ImageVector
    get() {
        if (_percent != null) {
            return _percent!!
        }
        _percent = Builder(name = "Percent", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.7f, 61.7f)
                lineToRelative(-144.0f, 144.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineToRelative(144.0f, -144.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                close()
                moveTo(50.5f, 101.5f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, true, 0.0f, -51.0f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, true, 51.0f, 0.0f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, true, -51.0f, 51.0f)
                close()
                moveTo(56.0f, 76.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 5.9f, 14.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 28.2f, 0.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, -28.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -28.2f, 0.0f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 56.0f, 76.0f)
                close()
                moveTo(216.0f, 180.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -61.5f, -25.5f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, true, 51.0f, 0.0f)
                arcTo(35.9f, 35.9f, 0.0f, false, true, 216.0f, 180.0f)
                close()
                moveTo(200.0f, 180.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -5.9f, -14.1f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -28.2f, 0.0f)
                arcTo(19.9f, 19.9f, 0.0f, true, false, 200.0f, 180.0f)
                close()
            }
        }
        .build()
        return _percent!!
    }

private var _percent: ImageVector? = null
