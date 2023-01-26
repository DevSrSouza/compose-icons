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

public val SharpGroup.Mp: ImageVector
    get() {
        if (_mp != null) {
            return _mp!!
        }
        _mp = Builder(name = "Mp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _mp!!
    }

private var _mp: ImageVector? = null