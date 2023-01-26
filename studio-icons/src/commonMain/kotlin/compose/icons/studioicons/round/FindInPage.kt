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

public val RoundGroup.FindInPage: ImageVector
    get() {
        if (_findInPage != null) {
            return _findInPage!!
        }
        _findInPage = Builder(name = "FindInPage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.59f)
                verticalLineTo(8.83f)
                curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                lineToRelative(-4.83f, -4.83f)
                curveToRelative(-0.37f, -0.38f, -0.88f, -0.59f, -1.41f, -0.59f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                lineTo(4.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f)
                horizontalLineTo(18.0f)
                curveToRelative(0.45f, 0.0f, 0.85f, -0.15f, 1.19f, -0.4f)
                lineToRelative(-4.43f, -4.43f)
                curveToRelative(-0.86f, 0.56f, -1.89f, 0.88f, -3.0f, 0.82f)
                curveToRelative(-2.37f, -0.11f, -4.4f, -1.96f, -4.72f, -4.31f)
                curveToRelative(-0.44f, -3.35f, 2.45f, -6.18f, 5.83f, -5.61f)
                curveToRelative(1.95f, 0.33f, 3.57f, 1.85f, 4.0f, 3.78f)
                curveToRelative(0.33f, 1.46f, 0.01f, 2.82f, -0.7f, 3.9f)
                lineTo(20.0f, 19.59f)
                close()
                moveTo(9.0f, 13.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _findInPage!!
    }

private var _findInPage: ImageVector? = null
