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

public val SharpGroup.Cabin: ImageVector
    get() {
        if (_cabin != null) {
            return _cabin!!
        }
        _cabin = Builder(name = "Cabin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 1.0f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                curveTo(6.45f, 4.0f, 6.0f, 4.45f, 6.0f, 5.0f)
                horizontalLineTo(4.0f)
                curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(12.0f, 3.0f)
                lineTo(6.0f, 7.58f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(3.11f)
                lineTo(1.0f, 11.4f)
                lineToRelative(1.21f, 1.59f)
                lineTo(4.0f, 11.62f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-9.38f)
                lineToRelative(1.79f, 1.36f)
                lineTo(23.0f, 11.4f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(13.94f, 7.0f)
                horizontalLineToRelative(-3.89f)
                lineTo(12.0f, 5.52f)
                lineTo(13.94f, 7.0f)
                close()
                moveTo(7.44f, 9.0f)
                horizontalLineToRelative(9.12f)
                lineTo(18.0f, 10.1f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-0.9f)
                lineTo(7.44f, 9.0f)
                close()
                moveTo(18.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(6.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _cabin!!
    }

private var _cabin: ImageVector? = null
