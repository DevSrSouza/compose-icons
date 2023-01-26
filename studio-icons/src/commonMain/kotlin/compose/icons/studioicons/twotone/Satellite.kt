package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(name = "Satellite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(6.0f, 6.0f)
                horizontalLineToRelative(2.57f)
                curveToRelative(0.0f, 1.42f, -1.15f, 2.58f, -2.57f, 2.58f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(6.0f, 10.29f)
                curveToRelative(2.37f, 0.0f, 4.28f, -1.93f, 4.28f, -4.29f)
                lineTo(12.0f, 6.0f)
                curveToRelative(0.0f, 3.31f, -2.68f, 6.0f, -6.0f, 6.0f)
                verticalLineToRelative(-1.71f)
                close()
                moveTo(9.0f, 13.15f)
                lineToRelative(2.14f, 2.58f)
                lineToRelative(3.0f, -3.86f)
                lineTo(18.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                lineToRelative(3.0f, -3.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(8.57f, 6.0f)
                lineTo(6.0f, 6.0f)
                verticalLineToRelative(2.58f)
                curveToRelative(1.42f, 0.0f, 2.57f, -1.16f, 2.57f, -2.58f)
                close()
                moveTo(12.0f, 6.0f)
                horizontalLineToRelative(-1.72f)
                curveToRelative(0.0f, 2.36f, -1.91f, 4.29f, -4.28f, 4.29f)
                lineTo(6.0f, 12.0f)
                curveToRelative(3.32f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f)
                close()
                moveTo(14.14f, 11.86f)
                lineToRelative(-3.0f, 3.87f)
                lineTo(9.0f, 13.15f)
                lineTo(6.0f, 17.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
