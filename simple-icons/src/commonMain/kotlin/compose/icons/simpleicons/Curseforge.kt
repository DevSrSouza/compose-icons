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

public val SimpleIcons.Curseforge: ImageVector
    get() {
        if (_curseforge != null) {
            return _curseforge!!
        }
        _curseforge = Builder(name = "Curseforge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.326f, 9.2145f)
                reflectiveCurveTo(23.2261f, 8.4418f, 24.0f, 6.1882f)
                horizontalLineToRelative(-7.5066f)
                verticalLineTo(4.4f)
                horizontalLineTo(0.0f)
                lineToRelative(2.0318f, 2.3576f)
                verticalLineTo(9.173f)
                reflectiveCurveToRelative(5.1267f, -0.2665f, 7.1098f, 1.2372f)
                curveToRelative(2.7146f, 2.516f, -3.053f, 5.917f, -3.053f, 5.917f)
                lineTo(5.0995f, 19.6f)
                curveToRelative(1.5465f, -1.4726f, 4.494f, -3.3775f, 9.8983f, -3.2857f)
                curveToRelative(-2.0565f, 0.65f, -4.1245f, 1.6651f, -5.7344f, 3.2857f)
                horizontalLineToRelative(10.9248f)
                lineToRelative(-1.0288f, -3.2726f)
                reflectiveCurveToRelative(-7.918f, -4.6688f, -0.8336f, -7.1127f)
                close()
            }
        }
        .build()
        return _curseforge!!
    }

private var _curseforge: ImageVector? = null
