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

public val IonIcons.ArrowUpCircleSharp: ImageVector
    get() {
        if (_arrowUpCircleSharp != null) {
            return _arrowUpCircleSharp!!
        }
        _arrowUpCircleSharp = Builder(name = "ArrowUpCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.13f, 48.0f, 48.0f, 141.13f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(336.09f, 272.0f)
                lineTo(272.0f, 208.42f)
                lineTo(272.0f, 358.0f)
                lineTo(240.0f, 358.0f)
                lineTo(240.0f, 208.42f)
                lineTo(175.91f, 272.0f)
                lineTo(153.37f, 249.3f)
                lineTo(256.0f, 147.46f)
                lineTo(358.63f, 249.3f)
                close()
            }
        }
        .build()
        return _arrowUpCircleSharp!!
    }

private var _arrowUpCircleSharp: ImageVector? = null
