package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Cocktail: ImageVector
    get() {
        if (_cocktail != null) {
            return _cocktail!!
        }
        _cocktail = Builder(name = "Cocktail", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.0f, 464.0f)
                horizontalLineToRelative(-56.0f)
                verticalLineTo(338.78f)
                lineToRelative(168.74f, -168.73f)
                curveToRelative(15.52f, -15.52f, 4.53f, -42.05f, -17.42f, -42.05f)
                horizontalLineTo(24.68f)
                curveToRelative(-21.95f, 0.0f, -32.94f, 26.53f, -17.42f, 42.05f)
                lineTo(176.0f, 338.78f)
                verticalLineTo(464.0f)
                horizontalLineToRelative(-56.0f)
                curveToRelative(-22.09f, 0.0f, -40.0f, 17.91f, -40.0f, 40.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(240.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                curveToRelative(0.0f, -22.09f, -17.91f, -40.0f, -40.0f, -40.0f)
                close()
                moveTo(432.0f, 0.0f)
                curveToRelative(-62.61f, 0.0f, -115.35f, 40.2f, -135.18f, 96.0f)
                horizontalLineToRelative(52.54f)
                curveToRelative(16.65f, -28.55f, 47.27f, -48.0f, 82.64f, -48.0f)
                curveToRelative(52.93f, 0.0f, 96.0f, 43.06f, 96.0f, 96.0f)
                reflectiveCurveToRelative(-43.07f, 96.0f, -96.0f, 96.0f)
                curveToRelative(-14.04f, 0.0f, -27.29f, -3.2f, -39.32f, -8.64f)
                lineToRelative(-35.26f, 35.26f)
                curveTo(379.23f, 279.92f, 404.59f, 288.0f, 432.0f, 288.0f)
                curveToRelative(79.53f, 0.0f, 144.0f, -64.47f, 144.0f, -144.0f)
                reflectiveCurveTo(511.53f, 0.0f, 432.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cocktail!!
    }

private var _cocktail: ImageVector? = null
