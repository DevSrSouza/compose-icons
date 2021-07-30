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

public val SimpleIcons.Openaccess: ImageVector
    get() {
        if (_openaccess != null) {
            return _openaccess!!
        }
        _openaccess = Builder(name = "Openaccess", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.971f, 13.486f)
                arcToRelative(7.56f, 7.56f, 0.0f, false, false, -0.54f, -1.043f)
                lineTo(18.431f, 6.415f)
                arcToRelative(6.375f, 6.375f, 0.0f, false, false, -1.88f, -4.535f)
                arcTo(6.374f, 6.374f, 0.0f, false, false, 12.017f, 0.0f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(6.374f, 6.374f, 0.0f, false, false, -4.536f, 1.878f)
                arcToRelative(6.375f, 6.375f, 0.0f, false, false, -1.88f, 4.537f)
                verticalLineToRelative(0.877f)
                horizontalLineToRelative(2.57f)
                verticalLineToRelative(-0.877f)
                curveToRelative(0.0f, -1.026f, 0.4f, -1.992f, 1.127f, -2.72f)
                arcToRelative(3.822f, 3.822f, 0.0f, false, true, 2.72f, -1.125f)
                arcToRelative(3.852f, 3.852f, 0.0f, false, true, 3.847f, 3.845f)
                verticalLineToRelative(3.508f)
                arcTo(7.52f, 7.52f, 0.0f, false, false, 12.0f, 8.865f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, -5.35f, 2.216f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, -2.216f, 5.35f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, 2.215f, 5.35f)
                arcTo(7.54f, 7.54f, 0.0f, false, false, 12.0f, 24.0f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, 5.35f, -2.216f)
                arcToRelative(7.54f, 7.54f, 0.0f, false, false, 2.216f, -5.35f)
                curveToRelative(0.0f, -1.021f, -0.2f, -2.012f, -0.595f, -2.946f)
                close()
                moveTo(12.0f, 21.428f)
                arcToRelative(5.003f, 5.003f, 0.0f, false, true, -4.997f, -4.996f)
                arcTo(5.003f, 5.003f, 0.0f, false, true, 12.0f, 11.435f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, true, 4.997f, 4.997f)
                arcTo(5.002f, 5.002f, 0.0f, false, true, 12.0f, 21.428f)
                close()
                moveTo(14.145f, 16.455f)
                arcToRelative(2.12f, 2.12f, 0.0f, true, true, -4.24f, 0.0f)
                arcToRelative(2.12f, 2.12f, 0.0f, false, true, 4.24f, 0.0f)
                close()
            }
        }
        .build()
        return _openaccess!!
    }

private var _openaccess: ImageVector? = null
