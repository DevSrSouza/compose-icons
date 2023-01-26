package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Scoreboard: ImageVector
    get() {
        if (_scoreboard != null) {
            return _scoreboard!!
        }
        _scoreboard = Builder(name = "Scoreboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 13.5f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(13.5f)
                close()
                moveTo(22.0f, 4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(9.5f, 12.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(4.5f)
                verticalLineTo(12.5f)
                close()
                moveTo(12.75f, 18.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(18.0f)
                close()
                moveTo(12.75f, 14.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(14.5f)
                close()
                moveTo(12.75f, 11.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(11.0f)
                close()
                moveTo(12.75f, 7.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(19.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _scoreboard!!
    }

private var _scoreboard: ImageVector? = null
