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

public val FillGroup.Navigation2: ImageVector
    get() {
        if (_navigation2 != null) {
            return _navigation2!!
        }
        _navigation2 = Builder(name = "Navigation2", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(13.67f, 22.0f)
                horizontalLineToRelative(-0.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.92f, -0.8f)
                lineToRelative(-1.54f, -7.57f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.78f, -0.78f)
                lineTo(2.8f, 11.31f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -1.93f)
                lineToRelative(16.0f, -5.33f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 5.32f)
                lineToRelative(-5.33f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.67f, 22.0f)
                close()
            }
        }
        .build()
        return _navigation2!!
    }

private var _navigation2: ImageVector? = null
