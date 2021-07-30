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

public val OutlineGroup.Swap: ImageVector
    get() {
        if (_swap != null) {
            return _swap!!
        }
        _swap = Builder(name = "Swap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(4.0f, 9.0f)
                horizontalLineTo(17.0f)
                lineToRelative(-1.6f, 1.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.2f, 1.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.8f, 0.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.6f, -0.2f)
                lineToRelative(4.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.59f)
                lineToRelative(-3.86f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.23f, 1.58f)
                lineTo(17.08f, 7.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 16.0f)
                horizontalLineTo(7.0f)
                lineToRelative(1.6f, -1.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.2f, -1.6f)
                lineToRelative(-4.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.59f)
                lineToRelative(3.86f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.61f, 0.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.79f, -0.39f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.17f, -1.4f)
                lineTo(6.92f, 18.0f)
                horizontalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _swap!!
    }

private var _swap: ImageVector? = null
