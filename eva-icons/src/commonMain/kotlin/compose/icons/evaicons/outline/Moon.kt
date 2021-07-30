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

public val OutlineGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.3f, 22.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(10.31f, 10.31f, 0.0f, false, true, -7.34f, -3.15f)
                arcToRelative(10.46f, 10.46f, 0.0f, false, true, -0.26f, -14.0f)
                arcToRelative(10.13f, 10.13f, 0.0f, false, true, 4.0f, -2.74f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.06f, 0.22f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.24f, 1.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.94f, 8.81f)
                arcToRelative(8.47f, 8.47f, 0.0f, false, false, 8.83f, 1.94f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.27f, 1.29f)
                arcTo(10.16f, 10.16f, 0.0f, false, true, 19.6f, 19.0f)
                arcTo(10.28f, 10.28f, 0.0f, false, true, 12.3f, 22.0f)
                close()
                moveTo(7.46f, 4.92f)
                arcTo(7.93f, 7.93f, 0.0f, false, false, 6.09f, 6.14f)
                arcToRelative(8.44f, 8.44f, 0.0f, false, false, 0.2f, 11.32f)
                arcTo(8.29f, 8.29f, 0.0f, false, false, 12.22f, 20.0f)
                horizontalLineToRelative(0.08f)
                arcToRelative(8.34f, 8.34f, 0.0f, false, false, 6.78f, -3.49f)
                arcTo(10.37f, 10.37f, 0.0f, false, true, 7.46f, 4.92f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
