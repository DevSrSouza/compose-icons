package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.TransitEnterexit: ImageVector
    get() {
        if (_transitEnterexit != null) {
            return _transitEnterexit!!
        }
        _transitEnterexit = Builder(name = "TransitEnterexit", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.77f)
                lineTo(15.98f, 6.0f)
                lineTo(18.0f, 8.03f)
                lineTo(11.15f, 15.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _transitEnterexit!!
    }

private var _transitEnterexit: ImageVector? = null
