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

public val IonIcons.LogoBehance: ImageVector
    get() {
        if (_logoBehance != null) {
            return _logoBehance!!
        }
        _logoBehance = Builder(name = "LogoBehance", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(344.1f, 233.6f)
                curveToRelative(-28.9f, 0.0f, -32.9f, 28.8f, -32.9f, 28.8f)
                horizontalLineToRelative(61.4f)
                reflectiveCurveTo(373.0f, 233.6f, 344.1f, 233.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.8f, 262.4f)
                horizontalLineTo(150.4f)
                verticalLineToRelative(50.0f)
                horizontalLineToRelative(51.7f)
                curveToRelative(7.8f, -0.2f, 22.4f, -2.4f, 22.4f, -24.3f)
                curveTo(224.5f, 262.1f, 204.8f, 262.4f, 204.8f, 262.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveTo(132.3f, 32.0f, 32.0f, 132.3f, 32.0f, 256.0f)
                reflectiveCurveTo(132.3f, 480.0f, 256.0f, 480.0f)
                reflectiveCurveTo(480.0f, 379.7f, 480.0f, 256.0f)
                reflectiveCurveTo(379.7f, 32.0f, 256.0f, 32.0f)
                close()
                moveTo(303.2f, 169.6f)
                horizontalLineToRelative(77.1f)
                verticalLineToRelative(23.0f)
                lineTo(303.2f, 192.6f)
                verticalLineToRelative(-23.0f)
                close()
                moveTo(264.2f, 290.4f)
                curveToRelative(0.0f, 57.0f, -59.4f, 55.2f, -59.4f, 55.2f)
                lineTo(107.6f, 345.6f)
                verticalLineToRelative(-187.0f)
                horizontalLineToRelative(97.2f)
                curveToRelative(29.6f, 0.0f, 52.9f, 16.3f, 52.9f, 49.8f)
                reflectiveCurveTo(229.2f, 244.0f, 229.2f, 244.0f)
                curveTo(266.8f, 244.0f, 264.2f, 290.4f, 264.2f, 290.4f)
                close()
                moveTo(408.4f, 287.3f)
                lineTo(311.5f, 287.3f)
                curveToRelative(0.0f, 34.7f, 32.9f, 32.5f, 32.9f, 32.5f)
                curveToRelative(31.1f, 0.0f, 30.0f, -20.1f, 30.0f, -20.1f)
                horizontalLineToRelative(32.9f)
                curveToRelative(0.0f, 53.4f, -64.0f, 49.7f, -64.0f, 49.7f)
                curveToRelative(-76.7f, 0.0f, -71.8f, -71.5f, -71.8f, -71.5f)
                reflectiveCurveToRelative(-0.1f, -71.8f, 71.8f, -71.8f)
                curveTo(419.0f, 206.2f, 408.4f, 287.3f, 408.4f, 287.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.0f, 211.3f)
                curveToRelative(0.0f, -19.4f, -13.2f, -19.4f, -13.2f, -19.4f)
                horizontalLineTo(150.4f)
                verticalLineToRelative(41.7f)
                horizontalLineToRelative(51.0f)
                curveTo(210.2f, 233.6f, 218.0f, 230.7f, 218.0f, 211.3f)
                close()
            }
        }
        .build()
        return _logoBehance!!
    }

private var _logoBehance: ImageVector? = null
