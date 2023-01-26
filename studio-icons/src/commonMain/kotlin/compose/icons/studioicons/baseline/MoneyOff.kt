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

public val BaselineGroup.MoneyOff: ImageVector
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
                curveToRelative(1.78f, 0.0f, 2.44f, 0.85f, 2.5f, 2.1f)
                horizontalLineToRelative(2.21f)
                curveToRelative(-0.07f, -1.72f, -1.12f, -3.3f, -3.21f, -3.81f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.16f)
                curveToRelative(-0.53f, 0.12f, -1.03f, 0.3f, -1.48f, 0.54f)
                lineToRelative(1.47f, 1.47f)
                curveToRelative(0.41f, -0.17f, 0.91f, -0.27f, 1.51f, -0.27f)
                close()
                moveTo(5.33f, 4.06f)
                lineTo(4.06f, 5.33f)
                lineTo(7.5f, 8.77f)
                curveToRelative(0.0f, 2.08f, 1.56f, 3.21f, 3.91f, 3.91f)
                lineToRelative(3.51f, 3.51f)
                curveToRelative(-0.34f, 0.48f, -1.05f, 0.91f, -2.42f, 0.91f)
                curveToRelative(-2.06f, 0.0f, -2.87f, -0.92f, -2.98f, -2.1f)
                horizontalLineToRelative(-2.2f)
                curveToRelative(0.12f, 2.19f, 1.76f, 3.42f, 3.68f, 3.83f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.15f)
                curveToRelative(0.96f, -0.18f, 1.82f, -0.55f, 2.45f, -1.12f)
                lineToRelative(2.22f, 2.22f)
                lineToRelative(1.27f, -1.27f)
                lineTo(5.33f, 4.06f)
                close()
            }
        }
        .build()
        return _moneyOff!!
    }

private var _moneyOff: ImageVector? = null
