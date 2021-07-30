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

public val FillGroup.ArrowheadDown: ImageVector
    get() {
        if (_arrowheadDown != null) {
            return _arrowheadDown!!
        }
        _arrowheadDown = Builder(name = "ArrowheadDown", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(17.37f, 12.39f)
                lineTo(12.0f, 16.71f)
                lineTo(6.64f, 12.23f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.28f, 1.54f)
                lineToRelative(6.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.27f, 0.0f)
                lineToRelative(6.0f, -4.83f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.15f, -1.41f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.37f, 12.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.36f, 11.77f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.27f, 0.0f)
                lineToRelative(6.0f, -4.83f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.15f, -1.41f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, -0.15f)
                lineTo(12.0f, 9.71f)
                lineTo(6.64f, 5.23f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.36f, 6.77f)
                close()
            }
        }
        .build()
        return _arrowheadDown!!
    }

private var _arrowheadDown: ImageVector? = null
