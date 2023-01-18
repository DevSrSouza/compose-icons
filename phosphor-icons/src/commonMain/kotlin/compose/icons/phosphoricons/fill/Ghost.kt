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

public val FillGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcToRelative(96.2f, 96.2f, 0.0f, false, false, -96.0f, 96.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 13.1f, 6.2f)
                lineToRelative(24.2f, -19.9f)
                lineToRelative(24.3f, 19.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.1f, 0.0f)
                lineTo(128.0f, 202.3f)
                lineToRelative(24.3f, 19.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.1f, 0.0f)
                lineToRelative(24.3f, -19.9f)
                lineToRelative(24.2f, 19.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 8.5f, 1.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 224.0f, 216.0f)
                lineTo(224.0f, 120.0f)
                arcTo(96.2f, 96.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(100.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 128.0f)
                close()
                moveTo(156.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 156.0f, 128.0f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
