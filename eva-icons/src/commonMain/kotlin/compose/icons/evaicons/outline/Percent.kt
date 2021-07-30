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

public val OutlineGroup.Percent: ImageVector
    get() {
        if (_percent != null) {
            return _percent!!
        }
        _percent = Builder(name = "Percent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(8.0f, 11.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 4.5f, 7.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.0f, 11.0f)
                close()
                moveTo(8.0f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 6.5f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 3.5f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 16.0f, 14.0f)
                close()
                moveTo(16.0f, 19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.74f, 4.26f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, -1.26f, 0.0f)
                lineTo(4.26f, 18.48f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, -0.26f, 0.63f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, 1.52f, 0.63f)
                lineTo(19.74f, 5.52f)
                arcTo(0.89f, 0.89f, 0.0f, false, false, 19.74f, 4.26f)
                close()
            }
        }
        .build()
        return _percent!!
    }

private var _percent: ImageVector? = null
