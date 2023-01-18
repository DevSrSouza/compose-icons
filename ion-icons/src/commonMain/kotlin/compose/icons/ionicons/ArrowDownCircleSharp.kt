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

public val IonIcons.ArrowDownCircleSharp: ImageVector
    get() {
        if (_arrowDownCircleSharp != null) {
            return _arrowDownCircleSharp!!
        }
        _arrowDownCircleSharp = Builder(name = "ArrowDownCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 464.0f)
                curveToRelative(114.87f, 0.0f, 208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveTo(48.0f, 141.13f, 48.0f, 256.0f)
                reflectiveCurveTo(141.13f, 464.0f, 256.0f, 464.0f)
                close()
                moveTo(175.91f, 240.0f)
                lineTo(240.0f, 303.58f)
                verticalLineTo(154.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(303.58f)
                lineTo(336.09f, 240.0f)
                lineToRelative(22.54f, 22.71f)
                lineTo(256.0f, 364.54f)
                lineTo(153.37f, 262.7f)
                close()
            }
        }
        .build()
        return _arrowDownCircleSharp!!
    }

private var _arrowDownCircleSharp: ImageVector? = null
