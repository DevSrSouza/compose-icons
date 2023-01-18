package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.ProjectorScreen: ImageVector
    get() {
        if (_projectorScreen != null) {
            return _projectorScreen!!
        }
        _projectorScreen = Builder(name = "ProjectorScreen", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 78.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineTo(40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 48.0f)
                verticalLineTo(64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 40.0f, 78.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(178.0f)
                horizontalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(90.0f)
                verticalLineToRelative(20.8f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, 12.0f, 0.0f)
                verticalLineTo(190.0f)
                horizontalLineToRelative(90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(214.0f)
                verticalLineTo(78.0f)
                close()
                moveTo(138.0f, 232.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 232.0f)
                close()
                moveTo(38.0f, 64.0f)
                verticalLineTo(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineTo(216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineTo(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(40.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 64.0f)
                close()
                moveTo(202.0f, 178.0f)
                horizontalLineTo(54.0f)
                verticalLineTo(78.0f)
                horizontalLineTo(202.0f)
                close()
            }
        }
        .build()
        return _projectorScreen!!
    }

private var _projectorScreen: ImageVector? = null
