package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Nut: ImageVector
    get() {
        if (_nut != null) {
            return _nut!!
        }
        _nut = Builder(name = "Nut", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(215.9f, 73.7f)
                lineToRelative(-84.0f, -47.5f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -7.8f, 0.0f)
                lineToRelative(-84.0f, 47.5f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -4.1f, 7.0f)
                verticalLineToRelative(94.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 4.1f, 7.0f)
                lineToRelative(84.0f, 47.5f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 7.8f, 0.0f)
                lineToRelative(84.0f, -47.5f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 4.1f, -7.0f)
                verticalLineTo(80.7f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 215.9f, 73.7f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 164.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.9f, 66.7f)
                lineToRelative(-84.0f, -47.4f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -15.8f, 0.0f)
                lineToRelative(-84.0f, 47.4f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -8.1f, 14.0f)
                verticalLineToRelative(94.6f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 8.1f, 14.0f)
                lineToRelative(84.0f, 47.4f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 15.8f, 0.0f)
                lineToRelative(84.0f, -47.4f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 8.1f, -14.0f)
                verticalLineTo(80.7f)
                arcTo(16.2f, 16.2f, 0.0f, false, false, 219.9f, 66.7f)
                close()
                moveTo(212.0f, 175.3f)
                lineToRelative(-84.0f, 47.5f)
                lineTo(44.0f, 175.3f)
                verticalLineTo(80.7f)
                lineToRelative(84.0f, -47.5f)
                lineToRelative(84.0f, 47.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 128.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, -44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 84.0f, 128.0f)
                close()
                moveTo(156.0f, 128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 156.0f, 128.0f)
                close()
            }
        }
        .build()
        return _nut!!
    }

private var _nut: ImageVector? = null
