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

public val SharpGroup.Dock: ImageVector
    get() {
        if (_dock != null) {
            return _dock!!
        }
        _dock = Builder(name = "Dock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 23.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 1.01f)
                lineTo(6.0f, 1.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(1.01f)
                close()
                moveTo(16.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _dock!!
    }

private var _dock: ImageVector? = null
