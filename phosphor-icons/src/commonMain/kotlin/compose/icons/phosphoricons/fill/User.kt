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

public val FillGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.9f, 220.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -6.9f, 4.0f)
                horizontalLineTo(31.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -6.9f, -4.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, 0.0f, -8.0f)
                arcToRelative(120.7f, 120.7f, 0.0f, false, true, 67.1f, -54.2f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 73.6f, 0.0f)
                arcTo(120.7f, 120.7f, 0.0f, false, true, 231.9f, 212.0f)
                arcTo(7.7f, 7.7f, 0.0f, false, true, 231.9f, 220.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
