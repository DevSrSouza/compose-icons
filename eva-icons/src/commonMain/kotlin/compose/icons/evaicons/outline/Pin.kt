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

public val OutlineGroup.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
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
                moveTo(12.0f, 2.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 9.92f)
                curveToRelative(0.0f, 5.48f, 7.05f, 11.58f, 7.35f, 11.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.3f, 0.0f)
                curveTo(13.0f, 21.5f, 20.0f, 15.4f, 20.0f, 9.92f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 19.65f)
                curveToRelative(-1.67f, -1.59f, -6.0f, -6.0f, -6.0f, -9.73f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                curveTo(18.0f, 13.62f, 13.67f, 18.06f, 12.0f, 19.65f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 3.5f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
