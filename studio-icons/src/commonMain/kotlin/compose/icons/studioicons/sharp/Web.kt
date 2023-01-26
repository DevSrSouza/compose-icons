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

public val SharpGroup.Web: ImageVector
    get() {
        if (_web != null) {
            return _web!!
        }
        _web = Builder(name = "Web", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(4.0f, 9.0f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(3.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(4.0f, 14.5f)
                horizontalLineToRelative(10.5f)
                verticalLineTo(18.0f)
                lineTo(4.0f, 18.0f)
                verticalLineTo(14.5f)
                close()
                moveTo(20.0f, 18.0f)
                lineToRelative(-3.5f, 0.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _web!!
    }

private var _web: ImageVector? = null
