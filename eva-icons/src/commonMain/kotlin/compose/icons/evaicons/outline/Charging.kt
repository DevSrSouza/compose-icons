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

public val OutlineGroup.Charging: ImageVector
    get() {
        if (_charging != null) {
            return _charging!!
        }
        _charging = Builder(name = "Charging", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(21.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.83f, 6.0f)
                horizontalLineToRelative(-3.1f)
                lineTo(11.59f, 8.0f)
                horizontalLineToRelative(4.23f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.18f, 0.43f)
                verticalLineToRelative(7.14f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, -0.17f, 0.43f)
                horizontalLineTo(13.0f)
                lineToRelative(-1.15f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcTo(2.31f, 2.31f, 0.0f, false, false, 18.0f, 15.57f)
                verticalLineTo(8.43f)
                arcTo(2.31f, 2.31f, 0.0f, false, false, 15.83f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 15.57f)
                verticalLineTo(8.43f)
                arcTo(0.53f, 0.53f, 0.0f, false, true, 4.17f, 8.0f)
                horizontalLineTo(7.0f)
                lineTo(8.13f, 6.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(2.31f, 2.31f, 0.0f, false, false, 2.0f, 8.43f)
                verticalLineToRelative(7.14f)
                arcTo(2.31f, 2.31f, 0.0f, false, false, 4.17f, 18.0f)
                horizontalLineToRelative(3.1f)
                lineToRelative(1.14f, -2.0f)
                horizontalLineTo(4.18f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 15.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.87f, -1.5f)
                lineTo(11.28f, 13.0f)
                horizontalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.86f, -0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.0f)
                lineToRelative(4.0f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.74f, 1.0f)
                lineTo(8.72f, 11.0f)
                horizontalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.86f, 0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.0f)
                lineToRelative(-4.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 20.0f)
                close()
            }
        }
        .build()
        return _charging!!
    }

private var _charging: ImageVector? = null
