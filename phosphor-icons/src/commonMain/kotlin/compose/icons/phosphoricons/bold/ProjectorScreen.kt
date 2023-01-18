package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.ProjectorScreen: ImageVector
    get() {
        if (_projectorScreen != null) {
            return _projectorScreen!!
        }
        _projectorScreen = Builder(name = "ProjectorScreen", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 72.0f)
                verticalLineTo(48.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(40.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 48.0f)
                verticalLineTo(72.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 36.0f, 91.6f)
                verticalLineTo(164.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(23.2f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 0.0f)
                verticalLineTo(188.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(91.6f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 236.0f, 72.0f)
                close()
                moveTo(44.0f, 52.0f)
                horizontalLineTo(212.0f)
                verticalLineTo(68.0f)
                horizontalLineTo(44.0f)
                close()
                moveTo(60.0f, 164.0f)
                verticalLineTo(92.0f)
                horizontalLineTo(196.0f)
                verticalLineToRelative(72.0f)
                close()
            }
        }
        .build()
        return _projectorScreen!!
    }

private var _projectorScreen: ImageVector? = null
