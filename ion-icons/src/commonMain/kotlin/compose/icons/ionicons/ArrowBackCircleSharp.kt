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

public val IonIcons.ArrowBackCircleSharp: ImageVector
    get() {
        if (_arrowBackCircleSharp != null) {
            return _arrowBackCircleSharp!!
        }
        _arrowBackCircleSharp = Builder(name = "ArrowBackCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 256.0f)
                curveToRelative(0.0f, 114.87f, 93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveTo(48.0f, 141.13f, 48.0f, 256.0f)
                close()
                moveTo(272.0f, 175.91f)
                lineTo(208.42f, 240.0f)
                lineTo(358.0f, 240.0f)
                verticalLineToRelative(32.0f)
                lineTo(208.42f, 272.0f)
                lineTo(272.0f, 336.09f)
                lineTo(249.3f, 358.63f)
                lineTo(147.46f, 256.0f)
                lineTo(249.3f, 153.37f)
                close()
            }
        }
        .build()
        return _arrowBackCircleSharp!!
    }

private var _arrowBackCircleSharp: ImageVector? = null
