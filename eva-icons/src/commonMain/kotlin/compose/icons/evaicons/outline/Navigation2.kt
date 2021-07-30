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

public val OutlineGroup.Navigation2: ImageVector
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
                lineTo(11.0f, 13.0f)
                lineTo(2.8f, 11.31f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -1.93f)
                lineToRelative(16.0f, -5.33f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 5.32f)
                lineToRelative(-5.33f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.67f, 22.0f)
                close()
                moveTo(6.87f, 10.1f)
                lineToRelative(5.19f, 1.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.79f, 0.78f)
                lineToRelative(1.05f, 5.19f)
                lineTo(17.42f, 6.58f)
                close()
            }
        }
        .build()
        return _navigation2!!
    }

private var _navigation2: ImageVector? = null
