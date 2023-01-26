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

public val SharpGroup.FilterAlt: ImageVector
    get() {
        if (_filterAlt != null) {
            return _filterAlt!!
        }
        _filterAlt = Builder(name = "FilterAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                curveToRelative(2.01f, 2.59f, 7.0f, 9.0f, 7.0f, 9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, 0.0f, 4.98f, -6.41f, 7.0f, -9.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _filterAlt!!
    }

private var _filterAlt: ImageVector? = null
