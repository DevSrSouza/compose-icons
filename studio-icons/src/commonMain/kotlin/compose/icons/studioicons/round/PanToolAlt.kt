package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.PanToolAlt: ImageVector
    get() {
        if (_panToolAlt != null) {
            return _panToolAlt!!
        }
        _panToolAlt = Builder(name = "PanToolAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2f, 15.43f)
                curveToRelative(0.0f, -0.65f, 0.6f, -1.13f, 1.24f, -0.99f)
                lineTo(10.0f, 15.24f)
                verticalLineTo(4.5f)
                curveTo(10.0f, 3.67f, 10.67f, 3.0f, 11.5f, 3.0f)
                reflectiveCurveTo(13.0f, 3.67f, 13.0f, 4.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(0.91f)
                curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f)
                lineToRelative(4.09f, 2.04f)
                curveToRelative(0.77f, 0.38f, 1.21f, 1.22f, 1.09f, 2.07f)
                lineToRelative(-0.63f, 4.46f)
                curveTo(19.21f, 20.27f, 18.36f, 21.0f, 17.37f, 21.0f)
                horizontalLineToRelative(-6.16f)
                curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f)
                lineToRelative(-4.07f, -4.29f)
                curveTo(5.3f, 15.94f, 5.2f, 15.69f, 5.2f, 15.43f)
                close()
            }
        }
        .build()
        return _panToolAlt!!
    }

private var _panToolAlt: ImageVector? = null
