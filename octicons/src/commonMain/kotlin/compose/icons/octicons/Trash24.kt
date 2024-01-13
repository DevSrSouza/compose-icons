package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Trash24: ImageVector
    get() {
        if (_trash24 != null) {
            return _trash24!!
        }
        _trash24 = Builder(name = "Trash24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 1.75f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(2.75f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(8.0f, 3.0f)
                lineTo(8.0f, 1.75f)
                curveTo(8.0f, 0.784f, 8.784f, 0.0f, 9.75f, 0.0f)
                horizontalLineToRelative(4.5f)
                curveTo(15.216f, 0.0f, 16.0f, 0.784f, 16.0f, 1.75f)
                close()
                moveTo(9.5f, 1.75f)
                lineTo(9.5f, 3.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.5f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
                moveTo(4.997f, 6.178f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.493f, 0.144f)
                lineTo(4.916f, 20.92f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.742f, 1.58f)
                horizontalLineToRelative(10.684f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.742f, -1.581f)
                lineToRelative(1.413f, -14.597f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.494f, -0.144f)
                lineToRelative(-1.412f, 14.596f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.249f, 0.226f)
                lineTo(6.658f, 21.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.249f, -0.226f)
                lineTo(4.997f, 6.178f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.206f, 7.501f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.793f, 0.705f)
                lineToRelative(0.5f, 8.5f)
                arcTo(0.75f, 0.75f, 0.0f, true, true, 9.0f, 16.794f)
                lineToRelative(-0.5f, -8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.705f, -0.793f)
                close()
                moveTo(15.499f, 8.294f)
                arcTo(0.75f, 0.75f, 0.0f, true, false, 14.0f, 8.206f)
                lineToRelative(-0.5f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.498f, 0.088f)
                lineToRelative(0.5f, -8.5f)
                close()
            }
        }
        .build()
        return _trash24!!
    }

private var _trash24: ImageVector? = null
