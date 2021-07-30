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

public val SimpleIcons.Miro: ImageVector
    get() {
        if (_miro != null) {
            return _miro!!
        }
        _miro = Builder(name = "Miro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.392f, 0.0f)
                horizontalLineTo(13.9f)
                lineTo(17.0f, 4.808f)
                lineTo(10.444f, 0.0f)
                horizontalLineTo(6.949f)
                lineToRelative(3.102f, 6.3f)
                lineTo(3.494f, 0.0f)
                horizontalLineTo(0.0f)
                lineToRelative(3.05f, 8.131f)
                lineTo(0.0f, 24.0f)
                horizontalLineToRelative(3.494f)
                lineTo(10.05f, 6.985f)
                lineTo(6.949f, 24.0f)
                horizontalLineToRelative(3.494f)
                lineTo(17.0f, 5.494f)
                lineTo(13.899f, 24.0f)
                horizontalLineToRelative(3.493f)
                lineTo(24.0f, 3.672f)
                lineTo(17.392f, 0.0f)
                close()
            }
        }
        .build()
        return _miro!!
    }

private var _miro: ImageVector? = null
