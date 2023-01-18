package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoEdge: ImageVector
    get() {
        if (_logoEdge != null) {
            return _logoEdge!!
        }
        _logoEdge = Builder(name = "LogoEdge", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.5f, 15.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-132.0f, 0.0f, -240.0f, 108.0f, -240.0f, 240.0f)
                reflectiveCurveToRelative(108.0f, 240.0f, 240.0f, 240.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(85.4f, 0.0f, 160.8f, -45.2f, 203.3f, -112.9f)
                arcToRelative(6.87f, 6.87f, 0.0f, false, false, -9.1f, -9.7f)
                arcToRelative(108.64f, 108.64f, 0.0f, false, true, -18.4f, 8.6f)
                curveToRelative(-36.8f, 12.6f, -57.1f, 13.1f, -82.1f, 12.0f)
                curveToRelative(-27.9f, -1.2f, -61.9f, -10.8f, -85.8f, -25.0f)
                reflectiveCurveToRelative(-43.5f, -34.6f, -54.1f, -52.3f)
                reflectiveCurveToRelative(-17.0f, -39.9f, -14.1f, -68.3f)
                curveToRelative(2.9f, -29.0f, 29.4f, -52.6f, 60.4f, -52.6f)
                horizontalLineToRelative(0.0f)
                curveToRelative(33.5f, 0.0f, 60.8f, 26.6f, 60.8f, 60.1f)
                curveToRelative(0.0f, 17.0f, -8.1f, 31.7f, -18.5f, 43.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-2.3f, 2.1f, -7.6f, 9.7f, 5.8f, 20.0f)
                curveToRelative(15.9f, 12.2f, 51.6f, 18.0f, 79.9f, 16.6f)
                reflectiveCurveToRelative(59.1f, -12.6f, 80.2f, -34.8f)
                curveToRelative(16.8f, -17.7f, 31.8f, -46.1f, 31.8f, -77.4f)
                curveTo(495.5f, 97.7f, 379.5f, 15.0f, 255.5f, 15.0f)
                close()
            }
        }
        .build()
        return _logoEdge!!
    }

private var _logoEdge: ImageVector? = null
