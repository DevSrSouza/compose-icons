package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.NoBackpack: ImageVector
    get() {
        if (_noBackpack != null) {
            return _noBackpack!!
        }
        _noBackpack = Builder(name = "NoBackpack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 15.17f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(8.83f)
                lineToRelative(6.0f, 6.0f)
                horizontalLineToRelative(1.67f)
                verticalLineToRelative(1.67f)
                lineTo(18.0f, 15.17f)
                close()
                moveTo(17.17f, 20.0f)
                lineToRelative(-6.0f, -6.0f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.67f)
                lineTo(6.0f, 8.83f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.98f, 4.15f)
                curveToRelative(0.01f, 0.0f, 0.01f, -0.01f, 0.02f, -0.01f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.14f)
                curveToRelative(1.72f, 0.45f, 3.0f, 2.0f, 3.0f, 3.86f)
                verticalLineToRelative(9.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(8.83f)
                lineTo(6.98f, 4.15f)
                close()
                moveTo(14.83f, 12.0f)
                lineToRelative(1.67f, 1.67f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.83f)
                close()
                moveTo(19.78f, 22.61f)
                lineToRelative(-0.85f, -0.85f)
                curveTo(18.65f, 21.91f, 18.34f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -0.36f, 0.06f, -0.69f, 0.15f, -1.02f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(17.17f, 20.0f)
                lineToRelative(-6.0f, -6.0f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.67f)
                lineTo(6.0f, 8.83f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.17f)
                close()
            }
        }
        .build()
        return _noBackpack!!
    }

private var _noBackpack: ImageVector? = null
