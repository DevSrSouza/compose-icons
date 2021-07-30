package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Codefactor: ImageVector
    get() {
        if (_codefactor != null) {
            return _codefactor!!
        }
        _codefactor = Builder(name = "Codefactor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.375f, 2.65f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, -2.62f, 2.65f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, -2.63f, -2.65f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 2.755f, 0.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 2.62f, 2.65f)
                close()
                moveTo(5.375f, 12.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, -2.62f, 2.65f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 0.125f, 12.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 2.63f, -2.65f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 5.375f, 12.0f)
                close()
                moveTo(5.375f, 21.35f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 2.755f, 24.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, -2.63f, -2.65f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 2.63f, -2.65f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 2.62f, 2.65f)
                close()
                moveTo(11.315f, 0.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, false, -2.61f, 2.65f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, false, 2.6f, 2.65f)
                horizontalLineToRelative(9.94f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, false, 2.63f, -2.65f)
                arcTo(2.64f, 2.64f, 0.0f, false, false, 21.255f, 0.0f)
                close()
                moveTo(8.705f, 12.0f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 2.62f, -2.65f)
                horizontalLineToRelative(5.68f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, 2.6f, 2.65f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, -2.6f, 2.65f)
                horizontalLineToRelative(-5.7f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, -2.6f, -2.65f)
                close()
            }
        }
        .build()
        return _codefactor!!
    }

private var _codefactor: ImageVector? = null
