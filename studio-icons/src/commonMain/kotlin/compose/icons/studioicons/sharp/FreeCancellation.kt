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

public val SharpGroup.FreeCancellation: ImageVector
    get() {
        if (_freeCancellation != null) {
            return _freeCancellation!!
        }
        _freeCancellation = Builder(name = "FreeCancellation", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.21f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(4.38f)
                lineToRelative(2.0f, -2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(10.21f)
                lineTo(11.21f, 20.0f)
                close()
                moveTo(16.54f, 22.5f)
                lineTo(13.0f, 18.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(1.41f, 1.41f)
                lineTo(16.54f, 22.5f)
                close()
                moveTo(10.41f, 14.0f)
                lineTo(12.0f, 15.59f)
                lineTo(10.59f, 17.0f)
                lineTo(9.0f, 15.41f)
                lineTo(7.41f, 17.0f)
                lineTo(6.0f, 15.59f)
                lineTo(7.59f, 14.0f)
                lineTo(6.0f, 12.41f)
                lineTo(7.41f, 11.0f)
                lineTo(9.0f, 12.59f)
                lineTo(10.59f, 11.0f)
                lineTo(12.0f, 12.41f)
                lineTo(10.41f, 14.0f)
                close()
            }
        }
        .build()
        return _freeCancellation!!
    }

private var _freeCancellation: ImageVector? = null
