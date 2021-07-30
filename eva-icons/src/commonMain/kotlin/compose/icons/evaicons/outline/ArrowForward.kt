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

public val OutlineGroup.ArrowForward: ImageVector
    get() {
        if (_arrowForward != null) {
            return _arrowForward!!
        }
        _arrowForward = Builder(name = "ArrowForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(5.0f, 13.0f)
                horizontalLineTo(16.86f)
                lineToRelative(-3.63f, 4.36f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.54f, 1.28f)
                lineToRelative(5.0f, -6.0f)
                arcToRelative(1.19f, 1.19f, 0.0f, false, false, 0.09f, -0.15f)
                curveToRelative(0.0f, -0.05f, 0.05f, -0.08f, 0.07f, -0.13f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 12.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.07f, -0.36f)
                curveToRelative(0.0f, -0.05f, -0.05f, -0.08f, -0.07f, -0.13f)
                arcToRelative(1.19f, 1.19f, 0.0f, false, false, -0.09f, -0.15f)
                lineToRelative(-5.0f, -6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.64f, 0.23f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.13f, 1.41f)
                lineTo(16.86f, 11.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _arrowForward!!
    }

private var _arrowForward: ImageVector? = null
