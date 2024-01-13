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

public val SimpleIcons.Siyuan: ImageVector
    get() {
        if (_siyuan != null) {
            return _siyuan!!
        }
        _siyuan = Builder(name = "Siyuan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 8.455f)
                lineToRelative(6.818f, -6.819f)
                lineTo(12.0f, 6.818f)
                lineToRelative(5.182f, -5.182f)
                lineTo(24.0f, 8.455f)
                verticalLineToRelative(13.909f)
                lineToRelative(-6.818f, -6.819f)
                verticalLineToRelative(-2.314f)
                lineToRelative(5.182f, 5.182f)
                verticalLineToRelative(-9.28f)
                lineTo(17.182f, 3.95f)
                verticalLineToRelative(11.594f)
                lineTo(12.0f, 20.727f)
                lineToRelative(-5.182f, -5.182f)
                verticalLineToRelative(-2.314f)
                lineTo(12.0f, 18.413f)
                verticalLineToRelative(-9.28f)
                lineTo(6.818f, 3.95f)
                verticalLineToRelative(11.594f)
                lineTo(0.0f, 22.364f)
                close()
            }
        }
        .build()
        return _siyuan!!
    }

private var _siyuan: ImageVector? = null
