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

public val SimpleIcons.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = Builder(name = "Rss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.199f, 24.0f)
                curveTo(19.199f, 13.467f, 10.533f, 4.8f, 0.0f, 4.8f)
                verticalLineTo(0.0f)
                curveToRelative(13.165f, 0.0f, 24.0f, 10.835f, 24.0f, 24.0f)
                horizontalLineToRelative(-4.801f)
                close()
                moveTo(3.291f, 17.415f)
                curveToRelative(1.814f, 0.0f, 3.293f, 1.479f, 3.293f, 3.295f)
                curveToRelative(0.0f, 1.813f, -1.485f, 3.29f, -3.301f, 3.29f)
                curveTo(1.47f, 24.0f, 0.0f, 22.526f, 0.0f, 20.71f)
                reflectiveCurveToRelative(1.475f, -3.294f, 3.291f, -3.295f)
                close()
                moveTo(15.909f, 24.0f)
                horizontalLineToRelative(-4.665f)
                curveToRelative(0.0f, -6.169f, -5.075f, -11.245f, -11.244f, -11.245f)
                verticalLineTo(8.09f)
                curveToRelative(8.727f, 0.0f, 15.909f, 7.184f, 15.909f, 15.91f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
