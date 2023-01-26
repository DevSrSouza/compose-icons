package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.CurrencyLira: ImageVector
    get() {
        if (_currencyLira != null) {
            return _currencyLira!!
        }
        _currencyLira = Builder(name = "CurrencyLira", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 15.84f)
                lineToRelative(-1.47f, 0.92f)
                curveTo(6.86f, 17.18f, 6.0f, 16.7f, 6.0f, 15.91f)
                curveToRelative(0.0f, -0.34f, 0.18f, -0.66f, 0.47f, -0.85f)
                lineTo(9.0f, 13.48f)
                verticalLineToRelative(-2.36f)
                lineToRelative(-1.47f, 0.92f)
                curveTo(6.86f, 12.46f, 6.0f, 11.98f, 6.0f, 11.19f)
                curveToRelative(0.0f, -0.34f, 0.18f, -0.66f, 0.47f, -0.85f)
                lineTo(9.0f, 8.76f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.51f)
                lineToRelative(2.47f, -1.55f)
                curveTo(14.14f, 5.54f, 15.0f, 6.02f, 15.0f, 6.81f)
                curveToRelative(0.0f, 0.34f, -0.18f, 0.66f, -0.47f, 0.85f)
                lineTo(11.0f, 9.87f)
                lineToRelative(0.01f, 2.35f)
                lineToRelative(2.46f, -1.54f)
                curveToRelative(0.67f, -0.42f, 1.53f, 0.06f, 1.53f, 0.85f)
                curveToRelative(0.0f, 0.34f, -0.18f, 0.66f, -0.47f, 0.85f)
                lineTo(11.0f, 14.59f)
                verticalLineTo(19.0f)
                curveToRelative(2.47f, 0.0f, 4.52f, -1.79f, 4.93f, -4.15f)
                curveToRelative(0.08f, -0.49f, 0.49f, -0.85f, 0.98f, -0.85f)
                curveToRelative(0.61f, 0.0f, 1.09f, 0.54f, 1.0f, 1.14f)
                curveTo(17.37f, 18.46f, 14.48f, 21.0f, 11.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(15.84f)
                close()
            }
        }
        .build()
        return _currencyLira!!
    }

private var _currencyLira: ImageVector? = null
