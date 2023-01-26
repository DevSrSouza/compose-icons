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

public val RoundGroup.RestorePage: ImageVector
    get() {
        if (_restorePage != null) {
            return _restorePage!!
        }
        _restorePage = Builder(name = "RestorePage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.41f, 7.41f)
                lineToRelative(-4.83f, -4.83f)
                curveToRelative(-0.37f, -0.37f, -0.88f, -0.58f, -1.41f, -0.58f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                lineTo(4.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f)
                horizontalLineTo(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(8.83f)
                curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.42f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-1.65f, 0.0f, -3.19f, -0.81f, -4.12f, -2.17f)
                curveToRelative(-0.23f, -0.34f, -0.15f, -0.81f, 0.19f, -1.04f)
                curveToRelative(0.34f, -0.24f, 0.81f, -0.15f, 1.04f, 0.19f)
                curveToRelative(0.65f, 0.95f, 1.73f, 1.52f, 2.88f, 1.52f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(13.93f, 9.5f, 12.0f, 9.5f)
                curveToRelative(-1.33f, 0.0f, -2.52f, 0.74f, -3.11f, 1.89f)
                lineTo(10.5f, 13.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(9.0f)
                lineToRelative(1.3f, 1.3f)
                curveTo(8.71f, 8.89f, 10.26f, 8.0f, 12.0f, 8.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _restorePage!!
    }

private var _restorePage: ImageVector? = null
