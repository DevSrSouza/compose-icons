package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Metrodelaciudaddemexico: ImageVector
    get() {
        if (_metrodelaciudaddemexico != null) {
            return _metrodelaciudaddemexico!!
        }
        _metrodelaciudaddemexico = Builder(name = "Metrodelaciudaddemexico", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.965f, 8.704f)
                verticalLineTo(24.0f)
                horizontalLineTo(0.008f)
                verticalLineTo(6.864f)
                horizontalLineToRelative(2.097f)
                curveToRelative(1.066f, 0.0f, 1.86f, 0.774f, 1.86f, 1.84f)
                moveToRelative(2.366f, -1.84f)
                curveToRelative(0.268f, 0.521f, 0.521f, 1.315f, 0.521f, 1.84f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(3.685f)
                verticalLineTo(8.704f)
                arcToRelative(1.784f, 1.784f, 0.0f, false, false, -1.84f, -1.84f)
                moveTo(17.4f, 24.0f)
                verticalLineTo(8.704f)
                arcToRelative(1.795f, 1.795f, 0.0f, false, false, -1.844f, -1.84f)
                horizontalLineToRelative(-2.382f)
                curveToRelative(0.269f, 0.521f, 0.269f, 1.315f, 0.269f, 1.84f)
                verticalLineTo(24.0f)
                moveTo(0.008f, 3.953f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(15.549f)
                curveToRelative(4.75f, 0.0f, 8.435f, 3.953f, 8.435f, 8.704f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-3.685f)
                verticalLineTo(8.704f)
                arcToRelative(4.735f, 4.735f, 0.0f, false, false, -4.75f, -4.75f)
                close()
            }
        }
        .build()
        return _metrodelaciudaddemexico!!
    }

private var _metrodelaciudaddemexico: ImageVector? = null
