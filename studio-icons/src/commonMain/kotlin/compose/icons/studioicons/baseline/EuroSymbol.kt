package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.EuroSymbol: ImageVector
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
                horizontalLineTo(15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(8.58f)
                curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1.0f)
                reflectiveCurveToRelative(0.03f, -0.67f, 0.08f, -1.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.24f)
                curveTo(10.32f, 6.92f, 12.5f, 5.5f, 15.0f, 5.5f)
                curveToRelative(1.61f, 0.0f, 3.09f, 0.59f, 4.23f, 1.57f)
                lineTo(21.0f, 5.3f)
                curveTo(19.41f, 3.87f, 17.3f, 3.0f, 15.0f, 3.0f)
                curveToRelative(-3.92f, 0.0f, -7.24f, 2.51f, -8.48f, 6.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.06f)
                curveToRelative(-0.04f, 0.33f, -0.06f, 0.66f, -0.06f, 1.0f)
                curveToRelative(0.0f, 0.34f, 0.02f, 0.67f, 0.06f, 1.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.52f)
                curveToRelative(1.24f, 3.49f, 4.56f, 6.0f, 8.48f, 6.0f)
                curveToRelative(2.31f, 0.0f, 4.41f, -0.87f, 6.0f, -2.3f)
                lineToRelative(-1.78f, -1.77f)
                curveToRelative(-1.13f, 0.98f, -2.6f, 1.57f, -4.22f, 1.57f)
                close()
            }
        }
        .build()
        return _euroSymbol!!
    }

private var _euroSymbol: ImageVector? = null
