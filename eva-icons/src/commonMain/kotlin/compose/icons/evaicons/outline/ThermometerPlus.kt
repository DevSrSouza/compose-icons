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

public val OutlineGroup.ThermometerPlus: ImageVector
    get() {
        if (_thermometerPlus != null) {
            return _thermometerPlus!!
        }
        _thermometerPlus = Builder(name = "ThermometerPlus", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(3.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                lineTo(4.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 4.0f)
                lineTo(6.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 22.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -3.0f, -9.0f)
                verticalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -3.0f, 9.0f)
                close()
                moveTo(14.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(8.54f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.5f, 0.87f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.5f, -2.59f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.5f, -0.87f)
                verticalLineTo(5.0f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, -0.29f, -0.69f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 4.0f)
                close()
            }
        }
        .build()
        return _thermometerPlus!!
    }

private var _thermometerPlus: ImageVector? = null
