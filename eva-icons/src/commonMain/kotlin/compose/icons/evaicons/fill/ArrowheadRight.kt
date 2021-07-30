package compose.icons.evaicons.fill

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
import compose.icons.evaicons.FillGroup

public val FillGroup.ArrowheadRight: ImageVector
    get() {
        if (_arrowheadRight != null) {
            return _arrowheadRight!!
        }
        _arrowheadRight = Builder(name = "ArrowheadRight", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(18.78f, 11.37f)
                lineTo(14.0f, 5.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, -0.15f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.15f, 1.41f)
                lineTo(16.71f, 12.0f)
                lineToRelative(-4.48f, 5.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.13f, 1.41f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.77f, -0.36f)
                lineToRelative(5.0f, -6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.78f, 11.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.37f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.39f, 6.63f)
                lineTo(9.71f, 12.0f)
                lineTo(5.23f, 17.36f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.13f, 1.41f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.77f, -0.36f)
                lineToRelative(5.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.27f)
                close()
            }
        }
        .build()
        return _arrowheadRight!!
    }

private var _arrowheadRight: ImageVector? = null
