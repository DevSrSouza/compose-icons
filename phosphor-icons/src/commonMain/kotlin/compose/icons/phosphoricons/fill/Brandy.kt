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

public val FillGroup.Brandy: ImageVector
    get() {
        if (_brandy != null) {
            return _brandy!!
        }
        _brandy = Builder(name = "Brandy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 88.0f)
                arcToRelative(96.2f, 96.2f, 0.0f, false, false, -15.5f, -52.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -6.7f, -3.6f)
                horizontalLineTo(54.2f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -6.7f, 3.6f)
                arcTo(96.1f, 96.1f, 0.0f, false, false, 120.0f, 183.7f)
                verticalLineTo(216.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(183.7f)
                arcTo(96.2f, 96.2f, 0.0f, false, false, 224.0f, 88.0f)
                close()
                moveTo(48.4f, 80.0f)
                arcTo(78.8f, 78.8f, 0.0f, false, true, 58.7f, 48.0f)
                horizontalLineTo(197.3f)
                arcToRelative(78.8f, 78.8f, 0.0f, false, true, 10.3f, 32.0f)
                close()
            }
        }
        .build()
        return _brandy!!
    }

private var _brandy: ImageVector? = null
