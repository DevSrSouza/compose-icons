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

public val SimpleIcons.Gmail: ImageVector
    get() {
        if (_gmail != null) {
            return _gmail!!
        }
        _gmail = Builder(name = "Gmail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.85f, -0.65f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.387f)
                lineToRelative(-9.0f, 6.463f)
                lineToRelative(-9.0f, -6.463f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.5f)
                curveTo(0.649f, 21.0f, 0.0f, 20.35f, 0.0f, 19.5f)
                verticalLineToRelative(-15.0f)
                curveToRelative(0.0f, -0.425f, 0.162f, -0.8f, 0.431f, -1.068f)
                curveTo(0.7f, 3.16f, 1.076f, 3.0f, 1.5f, 3.0f)
                horizontalLineTo(2.0f)
                lineToRelative(10.0f, 7.25f)
                lineTo(22.0f, 3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.425f, 0.0f, 0.8f, 0.162f, 1.069f, 0.432f)
                curveToRelative(0.27f, 0.268f, 0.431f, 0.643f, 0.431f, 1.068f)
                close()
            }
        }
        .build()
        return _gmail!!
    }

private var _gmail: ImageVector? = null
