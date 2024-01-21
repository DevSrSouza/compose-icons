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

public val SimpleIcons.Naver: ImageVector
    get() {
        if (_naver != null) {
            return _naver!!
        }
        _naver = Builder(name = "Naver", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.273f, 12.845f)
                lineTo(7.376f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(7.726f)
                verticalLineTo(11.156f)
                lineTo(16.624f, 24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-7.727f)
                verticalLineToRelative(12.845f)
                close()
            }
        }
        .build()
        return _naver!!
    }

private var _naver: ImageVector? = null
