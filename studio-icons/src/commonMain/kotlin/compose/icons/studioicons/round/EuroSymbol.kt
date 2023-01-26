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

public val RoundGroup.EuroSymbol: ImageVector
    get() {
        if (_euroSymbol != null) {
            return _euroSymbol!!
        }
        _euroSymbol = Builder(name = "EuroSymbol", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.5f)
                curveToRelative(-2.51f, 0.0f, -4.68f, -1.42f, -5.76f, -3.5f)
                horizontalLineTo(14.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(8.58f)
                curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1.0f)
                reflectiveCurveToRelative(0.03f, -0.67f, 0.08f, -1.0f)
                horizontalLineTo(14.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(9.24f)
                curveTo(10.32f, 6.92f, 12.5f, 5.5f, 15.0f, 5.5f)
                curveToRelative(1.25f, 0.0f, 2.42f, 0.36f, 3.42f, 0.97f)
                curveToRelative(0.5f, 0.31f, 1.15f, 0.26f, 1.57f, -0.16f)
                curveToRelative(0.58f, -0.58f, 0.45f, -1.53f, -0.25f, -1.96f)
                curveTo(18.36f, 3.5f, 16.73f, 3.0f, 15.0f, 3.0f)
                curveToRelative(-3.92f, 0.0f, -7.24f, 2.51f, -8.48f, 6.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.06f)
                curveToRelative(-0.04f, 0.33f, -0.06f, 0.66f, -0.06f, 1.0f)
                reflectiveCurveToRelative(0.02f, 0.67f, 0.06f, 1.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.52f)
                curveToRelative(1.24f, 3.49f, 4.56f, 6.0f, 8.48f, 6.0f)
                curveToRelative(1.74f, 0.0f, 3.36f, -0.49f, 4.74f, -1.35f)
                curveToRelative(0.69f, -0.43f, 0.82f, -1.39f, 0.24f, -1.97f)
                curveToRelative(-0.42f, -0.42f, -1.07f, -0.47f, -1.57f, -0.15f)
                curveToRelative(-0.99f, 0.62f, -2.15f, 0.97f, -3.41f, 0.97f)
                close()
            }
        }
        .build()
        return _euroSymbol!!
    }

private var _euroSymbol: ImageVector? = null
