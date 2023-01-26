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

public val SharpGroup.TvOff: ImageVector
    get() {
        if (_tvOff != null) {
            return _tvOff!!
        }
        _tvOff = Builder(name = "TvOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                verticalLineToRelative(10.88f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-9.58f)
                lineToRelative(3.29f, -3.3f)
                lineTo(16.0f, 1.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-0.7f, 0.7f)
                lineTo(10.58f, 5.0f)
                horizontalLineTo(8.12f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(2.41f, 2.13f)
                lineToRelative(-0.14f, 0.14f)
                lineTo(1.0f, 3.54f)
                lineToRelative(1.53f, 1.53f)
                horizontalLineTo(1.0f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(17.46f)
                lineToRelative(1.99f, 1.99f)
                lineToRelative(1.26f, -1.26f)
                lineToRelative(0.15f, -0.15f)
                lineTo(2.41f, 2.13f)
                close()
                moveTo(3.0f, 19.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.46f)
                lineToRelative(12.0f, 12.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _tvOff!!
    }

private var _tvOff: ImageVector? = null
