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

public val IonIcons.ArrowForwardCircleSharp: ImageVector
    get() {
        if (_arrowForwardCircleSharp != null) {
            return _arrowForwardCircleSharp!!
        }
        _arrowForwardCircleSharp = Builder(name = "ArrowForwardCircleSharp", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                curveToRelative(0.0f, -114.87f, -93.13f, -208.0f, -208.0f, -208.0f)
                reflectiveCurveTo(48.0f, 141.13f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveTo(464.0f, 370.87f, 464.0f, 256.0f)
                close()
                moveTo(240.0f, 336.09f)
                lineTo(303.58f, 272.0f)
                horizontalLineTo(154.0f)
                verticalLineTo(240.0f)
                horizontalLineTo(303.58f)
                lineTo(240.0f, 175.91f)
                lineToRelative(22.71f, -22.54f)
                lineTo(364.54f, 256.0f)
                lineTo(262.7f, 358.63f)
                close()
            }
        }
        .build()
        return _arrowForwardCircleSharp!!
    }

private var _arrowForwardCircleSharp: ImageVector? = null
