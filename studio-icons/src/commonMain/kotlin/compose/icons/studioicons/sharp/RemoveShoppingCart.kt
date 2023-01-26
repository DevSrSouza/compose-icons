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

public val SharpGroup.RemoveShoppingCart: ImageVector
    get() {
        if (_removeShoppingCart != null) {
            return _removeShoppingCart!!
        }
        _removeShoppingCart = Builder(name = "RemoveShoppingCart", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.41f, 1.13f)
                lineTo(0.0f, 2.54f)
                lineToRelative(4.39f, 4.39f)
                lineToRelative(2.21f, 4.66f)
                lineTo(3.62f, 17.0f)
                horizontalLineToRelative(10.84f)
                lineToRelative(1.38f, 1.38f)
                curveToRelative(-0.5f, 0.36f, -0.83f, 0.95f, -0.83f, 1.62f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f)
                curveToRelative(0.67f, 0.0f, 1.26f, -0.33f, 1.62f, -0.84f)
                lineTo(21.46f, 24.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.41f, 1.13f)
                close()
                moveTo(7.0f, 15.0f)
                lineToRelative(1.1f, -2.0f)
                horizontalLineToRelative(2.36f)
                lineToRelative(2.0f, 2.0f)
                lineTo(7.0f, 15.0f)
                close()
                moveTo(16.05f, 12.94f)
                horizontalLineToRelative(0.73f)
                lineTo(21.7f, 4.0f)
                lineTo(7.12f, 4.0f)
                lineToRelative(8.93f, 8.94f)
                close()
                moveTo(7.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _removeShoppingCart!!
    }

private var _removeShoppingCart: ImageVector? = null
