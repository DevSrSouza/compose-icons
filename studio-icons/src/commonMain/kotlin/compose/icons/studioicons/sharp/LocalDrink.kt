package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.LocalDrink: ImageVector
    get() {
        if (_localDrink != null) {
            return _localDrink!!
        }
        _localDrink = Builder(name = "LocalDrink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                lineToRelative(2.21f, 20.0f)
                lineTo(18.8f, 22.0f)
                lineTo(21.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                curveToRelative(0.0f, -2.0f, 3.0f, -5.4f, 3.0f, -5.4f)
                reflectiveCurveToRelative(3.0f, 3.4f, 3.0f, 5.4f)
                curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(18.33f, 8.0f)
                lineTo(5.67f, 8.0f)
                lineToRelative(-0.44f, -4.0f)
                horizontalLineToRelative(13.53f)
                lineToRelative(-0.43f, 4.0f)
                close()
            }
        }
        .build()
        return _localDrink!!
    }

private var _localDrink: ImageVector? = null
