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

public val FillGroup.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.2f, 104.5f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 240.0f, 88.8f)
                verticalLineTo(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 64.0f)
                verticalLineTo(88.8f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 12.8f, 15.7f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 47.0f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 16.0f, 167.2f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(167.2f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -12.8f, -15.7f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, -47.0f)
                close()
                moveTo(32.0f, 167.2f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -78.4f)
                verticalLineTo(64.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(192.0f)
                horizontalLineTo(32.0f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
