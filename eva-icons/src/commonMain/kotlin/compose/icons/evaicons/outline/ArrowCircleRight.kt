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

public val OutlineGroup.ArrowCircleRight: ImageVector
    get() {
        if (_arrowCircleRight != null) {
            return _arrowCircleRight!!
        }
        _arrowCircleRight = Builder(name = "ArrowCircleRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                lineToRelative(0.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, -0.06f, 0.0f, -0.09f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, -0.06f, -0.28f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, -0.11f, -0.19f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.09f, -0.13f)
                lineToRelative(-2.86f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.45f, 1.38f)
                lineTo(13.66f, 11.0f)
                horizontalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(5.59f)
                lineToRelative(-1.3f, 1.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.21f, -0.32f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null
