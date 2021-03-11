package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                moveTo(1.6f, 0.0f)
                reflectiveCurveTo(0.0f, 0.0f, 0.0f, 1.6f)
                verticalLineToRelative(20.8f)
                reflectiveCurveTo(0.0f, 24.0f, 1.6f, 24.0f)
                horizontalLineToRelative(20.8f)
                reflectiveCurveToRelative(1.6f, 0.0f, 1.6f, -1.6f)
                lineTo(24.0f, 1.6f)
                reflectiveCurveTo(24.0f, 0.0f, 22.4f, 0.0f)
                close()
                moveTo(5.015f, 5.6f)
                horizontalLineToRelative(4.78f)
                lineToRelative(4.425f, 6.458f)
                lineTo(14.22f, 5.6f)
                horizontalLineToRelative(4.765f)
                verticalLineToRelative(12.8f)
                horizontalLineToRelative(-4.78f)
                lineTo(9.78f, 11.943f)
                lineTo(9.78f, 18.4f)
                lineTo(5.015f, 18.4f)
                close()
            }
        }
        .build()
        return _naver!!
    }

private var _naver: ImageVector? = null
