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

public val IonIcons.ArrowRedoCircleSharp: ImageVector
    get() {
        if (_arrowRedoCircleSharp != null) {
            return _arrowRedoCircleSharp!!
        }
        _arrowRedoCircleSharp = Builder(name = "ArrowRedoCircleSharp", defaultWidth = 512.0.dp,
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
                moveTo(146.0f, 344.0f)
                curveToRelative(0.0f, -68.13f, 22.67f, -137.14f, 119.17f, -137.14f)
                lineTo(265.17f, 152.0f)
                lineTo(366.0f, 248.0f)
                lineTo(265.17f, 344.0f)
                lineTo(265.17f, 289.14f)
                curveTo(198.48f, 289.14f, 173.85f, 308.43f, 146.0f, 344.0f)
                close()
            }
        }
        .build()
        return _arrowRedoCircleSharp!!
    }

private var _arrowRedoCircleSharp: ImageVector? = null
