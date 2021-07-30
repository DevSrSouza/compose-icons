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

public val OutlineGroup.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation = Builder(name = "Navigation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.0f, 20.0f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, true, -0.55f, -0.17f)
                lineTo(12.0f, 14.9f)
                lineTo(4.55f, 19.83f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.44f, -1.28f)
                lineToRelative(8.0f, -16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.78f, 0.0f)
                lineToRelative(8.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.23f, 1.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 20.0f)
                close()
                moveTo(12.0f, 12.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.55f, 0.17f)
                lineToRelative(4.88f, 3.23f)
                lineTo(12.0f, 5.24f)
                lineTo(6.57f, 16.1f)
                lineToRelative(4.88f, -3.23f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 12.7f)
                close()
            }
        }
        .build()
        return _navigation!!
    }

private var _navigation: ImageVector? = null
