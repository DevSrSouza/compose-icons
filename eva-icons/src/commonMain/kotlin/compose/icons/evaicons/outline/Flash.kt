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

public val OutlineGroup.Flash: ImageVector
    get() {
        if (_flash != null) {
            return _flash!!
        }
        _flash = Builder(name = "Flash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(11.11f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.34f, -0.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.65f, -1.05f)
                lineToRelative(0.77f, -7.09f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.83f, -1.56f)
                lineToRelative(7.89f, -11.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.17f, -0.38f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.65f, 1.0f)
                lineTo(13.11f, 9.2f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.83f, 1.56f)
                lineToRelative(-7.89f, 11.8f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.11f, 23.0f)
                close()
                moveTo(6.87f, 12.8f)
                horizontalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.74f, 0.33f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.25f, 0.78f)
                lineToRelative(-0.45f, 4.15f)
                lineToRelative(4.59f, -6.86f)
                horizontalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.11f)
                lineToRelative(0.45f, -4.15f)
                close()
            }
        }
        .build()
        return _flash!!
    }

private var _flash: ImageVector? = null
