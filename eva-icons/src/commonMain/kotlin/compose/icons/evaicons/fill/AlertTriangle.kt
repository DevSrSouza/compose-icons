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

public val FillGroup.AlertTriangle: ImageVector
    get() {
        if (_alertTriangle != null) {
            return _alertTriangle!!
        }
        _alertTriangle = Builder(name = "AlertTriangle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                lineToRelative(-0.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(-0.0f, -24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.56f, 16.3f)
                lineTo(14.89f, 3.58f)
                arcToRelative(3.43f, 3.43f, 0.0f, false, false, -5.78f, 0.0f)
                lineTo(1.44f, 16.3f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.05f, 3.0f)
                arcTo(3.37f, 3.37f, 0.0f, false, false, 4.33f, 21.0f)
                lineTo(19.67f, 21.0f)
                arcToRelative(3.37f, 3.37f, 0.0f, false, false, 2.94f, -1.66f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 22.56f, 16.3f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 17.0f)
                close()
                moveTo(13.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _alertTriangle!!
    }

private var _alertTriangle: ImageVector? = null
