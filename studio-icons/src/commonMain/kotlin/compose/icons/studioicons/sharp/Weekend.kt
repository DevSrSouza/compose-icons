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

public val SharpGroup.Weekend: ImageVector
    get() {
        if (_weekend != null) {
            return _weekend!!
        }
        _weekend = Builder(name = "Weekend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.03f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(9.03f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(4.03f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-4.97f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-8.97f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _weekend!!
    }

private var _weekend: ImageVector? = null
