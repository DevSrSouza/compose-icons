package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Rundeck: ImageVector
    get() {
        if (_rundeck != null) {
            return _rundeck!!
        }
        _rundeck = Builder(name = "Rundeck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.35f, 4.8f)
                lineTo(16.325f, 0.0f)
                horizontalLineTo(0.115f)
                lineTo(3.14f, 4.8f)
                horizontalLineToRelative(16.21f)
                close()
                moveTo(0.115f, 24.0f)
                horizontalLineToRelative(16.21f)
                lineToRelative(3.025f, -4.8f)
                horizontalLineTo(3.14f)
                lineTo(0.115f, 24.0f)
                close()
                moveTo(6.163f, 9.6f)
                horizontalLineToRelative(16.21f)
                lineToRelative(1.512f, 2.4f)
                lineToRelative(-1.512f, 2.4f)
                horizontalLineTo(6.163f)
                lineTo(7.675f, 12.0f)
                lineTo(6.163f, 9.6f)
                close()
            }
        }
        .build()
        return _rundeck!!
    }

private var _rundeck: ImageVector? = null
