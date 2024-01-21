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

public val SimpleIcons.Viaplay: ImageVector
    get() {
        if (_viaplay != null) {
            return _viaplay!!
        }
        _viaplay = Builder(name = "Viaplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.2766f, 6.6383f)
                curveTo(0.4742f, 8.2432f, 0.0f, 10.0669f, 0.0f, 12.0f)
                reflectiveCurveToRelative(0.4742f, 3.7568f, 1.2766f, 5.3617f)
                lineTo(12.0f, 12.0f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(9.0456f, 0.0f, 6.3465f, 1.0578f, 4.231f, 2.845f)
                lineToRelative(12.5471f, 6.7477f)
                verticalLineToRelative(4.8146f)
                lineTo(4.231f, 21.155f)
                curveTo(6.31f, 22.9422f, 9.0456f, 24.0f, 12.0f, 24.0f)
                curveToRelative(6.6383f, 0.0f, 12.0f, -5.3617f, 12.0f, -12.0f)
                reflectiveCurveTo(18.6383f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _viaplay!!
    }

private var _viaplay: ImageVector? = null
