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

public val FillGroup.ArrowFatUp: ImageVector
    get() {
        if (_arrowFatUp != null) {
            return _arrowFatUp!!
        }
        _arrowFatUp = Builder(name = "ArrowFatUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.4f, 123.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 128.0f)
                horizontalLineTo(184.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.4f, -4.9f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 1.7f, -8.8f)
                lineToRelative(96.0f, -96.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 0.0f)
                lineToRelative(96.0f, 96.0f)
                arcTo(8.4f, 8.4f, 0.0f, false, true, 231.4f, 123.1f)
                close()
            }
        }
        .build()
        return _arrowFatUp!!
    }

private var _arrowFatUp: ImageVector? = null
