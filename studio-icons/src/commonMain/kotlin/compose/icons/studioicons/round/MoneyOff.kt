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

public val RoundGroup.MoneyOff: ImageVector
    get() {
        if (_moneyOff != null) {
            return _moneyOff!!
        }
        _moneyOff = Builder(name = "MoneyOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 6.9f)
                curveToRelative(1.42f, 0.0f, 2.13f, 0.54f, 2.39f, 1.4f)
                curveToRelative(0.13f, 0.43f, 0.56f, 0.7f, 1.01f, 0.7f)
                horizontalLineToRelative(0.06f)
                curveToRelative(0.7f, 0.0f, 1.22f, -0.71f, 0.97f, -1.36f)
                curveToRelative(-0.44f, -1.15f, -1.41f, -2.08f, -2.93f, -2.45f)
                verticalLineTo(4.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(11.0f, 3.67f, 11.0f, 4.5f)
                verticalLineToRelative(0.66f)
                curveToRelative(-0.39f, 0.08f, -0.75f, 0.21f, -1.1f, 0.36f)
                lineToRelative(1.51f, 1.51f)
                curveToRelative(0.32f, -0.08f, 0.69f, -0.13f, 1.09f, -0.13f)
                close()
                moveTo(4.77f, 4.62f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(7.5f, 8.77f)
                curveToRelative(0.0f, 2.08f, 1.56f, 3.22f, 3.91f, 3.91f)
                lineToRelative(3.51f, 3.51f)
                curveToRelative(-0.34f, 0.49f, -1.05f, 0.91f, -2.42f, 0.91f)
                curveToRelative(-1.65f, 0.0f, -2.5f, -0.59f, -2.83f, -1.43f)
                curveToRelative(-0.15f, -0.39f, -0.49f, -0.67f, -0.9f, -0.67f)
                horizontalLineTo(8.6f)
                curveToRelative(-0.72f, 0.0f, -1.24f, 0.74f, -0.95f, 1.39f)
                curveToRelative(0.59f, 1.33f, 1.89f, 2.12f, 3.36f, 2.44f)
                verticalLineToRelative(0.67f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.65f)
                curveToRelative(0.96f, -0.18f, 1.83f, -0.55f, 2.46f, -1.12f)
                lineToRelative(1.51f, 1.51f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(6.18f, 4.62f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                close()
            }
        }
        .build()
        return _moneyOff!!
    }

private var _moneyOff: ImageVector? = null
