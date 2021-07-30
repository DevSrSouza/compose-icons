package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.ColorPalette: ImageVector
    get() {
        if (_colorPalette != null) {
            return _colorPalette!!
        }
        _colorPalette = Builder(name = "ColorPalette", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.54f, 5.08f)
                arcTo(10.61f, 10.61f, 0.0f, false, false, 11.91f, 2.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.05f, 20.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, false, 2.53f, -1.89f)
                arcToRelative(2.52f, 2.52f, 0.0f, false, false, -0.57f, -2.28f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.37f, -0.83f)
                horizontalLineToRelative(1.65f)
                arcTo(6.15f, 6.15f, 0.0f, false, false, 22.0f, 11.33f)
                arcTo(8.48f, 8.48f, 0.0f, false, false, 19.54f, 5.08f)
                close()
                moveTo(15.88f, 15.0f)
                horizontalLineTo(14.23f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, false, -1.87f, 4.15f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, 0.12f, 0.49f)
                curveToRelative(-0.05f, 0.21f, -0.28f, 0.34f, -0.59f, 0.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.82f, -9.11f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 11.92f, 4.0f)
                horizontalLineTo(12.0f)
                arcToRelative(8.47f, 8.47f, 0.0f, false, true, 6.1f, 2.48f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 20.0f, 11.25f)
                arcTo(4.17f, 4.17f, 0.0f, false, true, 15.88f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.25f, 7.2f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.05f, 0.55f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.25f, 7.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 7.2f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 9.3f, 9.25f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.75f, 7.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.16f, 11.26f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.08f, 0.4f)
                arcTo(1.49f, 1.49f, 0.0f, false, false, 6.16f, 11.26f)
                close()
            }
        }
        .build()
        return _colorPalette!!
    }

private var _colorPalette: ImageVector? = null
