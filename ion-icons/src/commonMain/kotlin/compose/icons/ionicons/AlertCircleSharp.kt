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

public val IonIcons.AlertCircleSharp: ImageVector
    get() {
        if (_alertCircleSharp != null) {
            return _alertCircleSharp!!
        }
        _alertCircleSharp = Builder(name = "AlertCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(276.0f, 367.91f)
                lineTo(236.0f, 367.91f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(272.0f, 304.0f)
                lineTo(240.0f, 304.0f)
                lineToRelative(-6.0f, -160.0f)
                horizontalLineToRelative(44.0f)
                close()
            }
        }
        .build()
        return _alertCircleSharp!!
    }

private var _alertCircleSharp: ImageVector? = null
