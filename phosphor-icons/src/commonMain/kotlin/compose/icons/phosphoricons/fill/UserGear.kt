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

public val FillGroup.UserGear: ImageVector
    get() {
        if (_userGear != null) {
            return _userGear!!
        }
        _userGear = Builder(name = "UserGear", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.9f, 194.9f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 1.1f, 8.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -7.2f, 4.6f)
                horizontalLineTo(22.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -7.2f, -4.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 1.1f, -8.5f)
                arcToRelative(118.4f, 118.4f, 0.0f, false, true, 55.8f, -37.3f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 72.2f, 0.0f)
                arcTo(118.4f, 118.4f, 0.0f, false, true, 199.9f, 194.9f)
                close()
                moveTo(251.2f, 154.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.0f, 4.0f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -4.0f, -1.1f)
                lineToRelative(-4.6f, -2.7f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -7.6f, 4.4f)
                verticalLineTo(164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineToRelative(-5.4f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -7.6f, -4.4f)
                lineToRelative(-4.6f, 2.7f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -4.0f, 1.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.0f, -14.9f)
                lineToRelative(4.6f, -2.7f)
                arcToRelative(24.4f, 24.4f, 0.0f, false, true, 0.0f, -8.8f)
                lineToRelative(-4.6f, -2.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.0f, -10.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.0f, -2.9f)
                lineToRelative(4.6f, 2.7f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 7.6f, -4.4f)
                verticalLineTo(108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(5.4f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 7.6f, 4.4f)
                lineToRelative(4.6f, -2.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.0f, 2.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.0f, 10.9f)
                lineToRelative(-4.6f, 2.7f)
                arcToRelative(24.4f, 24.4f, 0.0f, false, true, 0.0f, 8.8f)
                lineToRelative(4.6f, 2.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 251.2f, 154.0f)
                close()
                moveTo(220.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 220.0f, 144.0f)
                close()
            }
        }
        .build()
        return _userGear!!
    }

private var _userGear: ImageVector? = null
