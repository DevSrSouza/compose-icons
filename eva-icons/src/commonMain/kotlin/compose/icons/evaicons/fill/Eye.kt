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

public val FillGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 12.0f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.87f, 11.5f)
                curveToRelative(-0.64f, -1.11f, -4.16f, -6.68f, -10.14f, -6.5f)
                curveTo(6.2f, 5.14f, 3.0f, 10.0f, 2.13f, 11.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.0f)
                curveToRelative(0.63f, 1.09f, 4.0f, 6.5f, 9.89f, 6.5f)
                horizontalLineToRelative(0.25f)
                curveToRelative(5.53f, -0.14f, 8.74f, -5.0f, 9.6f, -6.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.87f, 11.5f)
                close()
                moveTo(12.0f, 15.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 15.5f, 12.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 15.5f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
