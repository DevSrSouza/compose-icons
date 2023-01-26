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

public val SharpGroup.Pinch: ImageVector
    get() {
        if (_pinch != null) {
            return _pinch!!
        }
        _pinch = Builder(name = "Pinch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.18f, 15.4f)
                lineTo(22.1f, 23.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(8.0f, 17.62f)
                lineToRelative(1.22f, -1.23f)
                lineTo(13.0f, 17.24f)
                verticalLineTo(6.5f)
                curveTo(13.0f, 5.67f, 13.67f, 5.0f, 14.5f, 5.0f)
                reflectiveCurveTo(16.0f, 5.67f, 16.0f, 6.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.38f)
                lineTo(23.18f, 15.4f)
                close()
                moveTo(6.0f, 2.5f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(3.56f)
                lineTo(3.56f, 9.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.44f)
                lineTo(8.44f, 2.5f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _pinch!!
    }

private var _pinch: ImageVector? = null
