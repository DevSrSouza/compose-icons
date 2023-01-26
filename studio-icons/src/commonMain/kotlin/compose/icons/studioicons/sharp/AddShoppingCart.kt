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

public val SharpGroup.AddShoppingCart: ImageVector
    get() {
        if (_addShoppingCart != null) {
            return _addShoppingCart!!
        }
        _addShoppingCart = Builder(name = "AddShoppingCart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(7.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(17.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(8.1f, 13.0f)
                horizontalLineToRelative(7.45f)
                curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f)
                lineToRelative(3.86f, -7.01f)
                lineTo(19.42f, 4.0f)
                lineToRelative(-3.87f, 7.0f)
                lineTo(8.53f, 11.0f)
                lineTo(4.27f, 2.0f)
                lineTo(1.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(3.6f, 7.59f)
                lineTo(3.62f, 17.0f)
                lineTo(19.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 15.0f)
                lineToRelative(1.1f, -2.0f)
                close()
            }
        }
        .build()
        return _addShoppingCart!!
    }

private var _addShoppingCart: ImageVector? = null
