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

public val TwotoneGroup.Cake: ImageVector
    get() {
        if (_cake != null) {
            return _cake!!
        }
        _cake = Builder(name = "Cake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.53f, 14.92f)
                lineToRelative(-1.08f, 1.07f)
                curveToRelative(-1.3f, 1.3f, -3.58f, 1.31f, -4.89f, 0.0f)
                lineToRelative(-1.07f, -1.07f)
                lineToRelative(-1.09f, 1.07f)
                curveToRelative(-0.64f, 0.64f, -1.5f, 1.0f, -2.4f, 1.01f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-0.9f, -0.01f, -1.76f, -0.37f, -2.4f, -1.01f)
                lineToRelative(-1.07f, -1.07f)
                close()
                moveTo(18.0f, 11.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.51f, -0.01f, 0.99f, -0.21f, 1.34f, -0.57f)
                lineToRelative(2.14f, -2.13f)
                lineToRelative(2.13f, 2.13f)
                curveToRelative(0.74f, 0.74f, 2.03f, 0.74f, 2.77f, 0.0f)
                lineToRelative(2.14f, -2.13f)
                lineToRelative(2.13f, 2.13f)
                curveToRelative(0.36f, 0.36f, 0.84f, 0.56f, 1.35f, 0.57f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.38f, -0.1f, -0.73f, -0.29f, -1.03f)
                lineTo(12.0f, 0.0f)
                lineToRelative(-1.71f, 2.97f)
                curveToRelative(-0.19f, 0.3f, -0.29f, 0.65f, -0.29f, 1.03f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(18.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 9.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.9f, -0.01f, 1.76f, -0.37f, 2.4f, -1.01f)
                lineToRelative(1.09f, -1.07f)
                lineToRelative(1.07f, 1.07f)
                curveToRelative(1.31f, 1.31f, 3.59f, 1.3f, 4.89f, 0.0f)
                lineToRelative(1.08f, -1.07f)
                lineToRelative(1.07f, 1.07f)
                curveToRelative(0.64f, 0.64f, 1.5f, 1.0f, 2.4f, 1.01f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 15.5f)
                curveToRelative(-0.51f, -0.01f, -0.99f, -0.2f, -1.35f, -0.57f)
                lineToRelative(-2.13f, -2.13f)
                lineToRelative(-2.14f, 2.13f)
                curveToRelative(-0.74f, 0.74f, -2.03f, 0.74f, -2.77f, 0.0f)
                lineTo(8.48f, 12.8f)
                lineToRelative(-2.14f, 2.13f)
                curveToRelative(-0.35f, 0.36f, -0.83f, 0.56f, -1.34f, 0.57f)
                lineTo(5.0f, 12.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                close()
            }
        }
        .build()
        return _cake!!
    }

private var _cake: ImageVector? = null
