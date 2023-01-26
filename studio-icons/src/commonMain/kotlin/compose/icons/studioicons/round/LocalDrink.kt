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

public val RoundGroup.LocalDrink: ImageVector
    get() {
        if (_localDrink != null) {
            return _localDrink!!
        }
        _localDrink = Builder(name = "LocalDrink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.23f, 2.0f)
                curveTo(4.04f, 2.0f, 3.11f, 3.04f, 3.24f, 4.22f)
                lineToRelative(1.77f, 16.01f)
                curveTo(5.13f, 21.23f, 5.97f, 22.0f, 7.0f, 22.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.03f, 0.0f, 1.87f, -0.77f, 1.99f, -1.77f)
                lineToRelative(1.77f, -16.01f)
                curveToRelative(0.13f, -1.18f, -0.8f, -2.22f, -1.99f, -2.22f)
                lineTo(5.23f, 2.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.55f, 1.81f, -3.95f, 2.62f, -4.94f)
                curveToRelative(0.2f, -0.25f, 0.57f, -0.25f, 0.77f, 0.0f)
                curveToRelative(0.81f, 1.0f, 2.62f, 3.39f, 2.62f, 4.94f)
                curveToRelative(-0.01f, 1.66f, -1.35f, 3.0f, -3.01f, 3.0f)
                close()
                moveTo(18.33f, 8.0f)
                lineTo(5.67f, 8.0f)
                lineToRelative(-0.32f, -2.89f)
                curveToRelative(-0.06f, -0.59f, 0.4f, -1.11f, 1.0f, -1.11f)
                horizontalLineToRelative(11.3f)
                curveToRelative(0.59f, 0.0f, 1.06f, 0.52f, 0.99f, 1.11f)
                lineTo(18.33f, 8.0f)
                close()
            }
        }
        .build()
        return _localDrink!!
    }

private var _localDrink: ImageVector? = null
