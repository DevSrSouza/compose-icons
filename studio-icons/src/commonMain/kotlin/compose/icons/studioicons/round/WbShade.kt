package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.WbShade: ImageVector
    get() {
        if (_wbShade != null) {
            return _wbShade!!
        }
        _wbShade = Builder(name = "WbShade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.13f)
                lineTo(14.0f, 14.13f)
                curveToRelative(0.0f, 0.23f, 0.09f, 0.46f, 0.26f, 0.63f)
                lineToRelative(4.98f, 4.98f)
                curveToRelative(0.17f, 0.17f, 0.39f, 0.26f, 0.62f, 0.26f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.79f, 0.0f, 1.18f, -0.95f, 0.62f, -1.51f)
                lineToRelative(-4.98f, -4.98f)
                curveTo(14.95f, 12.95f, 14.0f, 13.35f, 14.0f, 14.13f)
                close()
                moveTo(15.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-3.0f, -3.0f)
                verticalLineToRelative(2.0f)
                curveTo(14.0f, 19.55f, 14.45f, 20.0f, 15.0f, 20.0f)
                close()
                moveTo(7.65f, 4.35f)
                lineTo(2.85f, 9.15f)
                curveTo(2.54f, 9.46f, 2.76f, 10.0f, 3.21f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(0.79f)
                curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineTo(8.35f, 4.35f)
                curveTo(8.16f, 4.16f, 7.84f, 4.16f, 7.65f, 4.35f)
                close()
                moveTo(9.0f, 14.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _wbShade!!
    }

private var _wbShade: ImageVector? = null
