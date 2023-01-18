package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.LogoRss: ImageVector
    get() {
        if (_logoRss != null) {
            return _logoRss!!
        }
        _logoRss = Builder(name = "LogoRss", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.56f, 342.78f)
                arcToRelative(60.34f, 60.34f, 0.0f, true, false, 60.56f, 60.44f)
                arcTo(60.63f, 60.63f, 0.0f, false, false, 108.56f, 342.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 186.67f)
                verticalLineToRelative(86.55f)
                curveToRelative(52.0f, 0.0f, 101.94f, 15.39f, 138.67f, 52.11f)
                reflectiveCurveToRelative(52.0f, 86.56f, 52.0f, 138.67f)
                horizontalLineToRelative(86.66f)
                curveTo(325.33f, 312.44f, 199.67f, 186.67f, 48.0f, 186.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 48.0f)
                verticalLineToRelative(86.56f)
                curveToRelative(185.25f, 0.0f, 329.22f, 144.08f, 329.22f, 329.44f)
                horizontalLineTo(464.0f)
                curveTo(464.0f, 234.66f, 277.67f, 48.0f, 48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _logoRss!!
    }

private var _logoRss: ImageVector? = null
