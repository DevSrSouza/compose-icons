package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Fastfood: ImageVector
    get() {
        if (_fastfood != null) {
            return _fastfood!!
        }
        _fastfood = Builder(name = "Fastfood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 21.98f)
                curveToRelative(0.0f, 0.56f, 0.45f, 1.01f, 1.01f, 1.01f)
                horizontalLineTo(15.0f)
                curveToRelative(0.56f, 0.0f, 1.01f, -0.45f, 1.01f, -1.01f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(0.98f)
                close()
                moveTo(8.5f, 8.99f)
                curveTo(4.75f, 8.99f, 1.0f, 11.0f, 1.0f, 15.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.0f, -4.0f, -3.75f, -6.01f, -7.5f, -6.01f)
                close()
                moveTo(3.62f, 13.0f)
                curveToRelative(1.11f, -1.55f, 3.47f, -2.01f, 4.88f, -2.01f)
                reflectiveCurveToRelative(3.77f, 0.46f, 4.88f, 2.01f)
                horizontalLineTo(3.62f)
                close()
                moveTo(1.0f, 17.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(1.0f)
                close()
                moveTo(18.0f, 5.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(0.23f, 2.0f)
                horizontalLineToRelative(9.56f)
                lineToRelative(-1.4f, 14.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.72f)
                curveToRelative(0.84f, 0.0f, 1.53f, -0.65f, 1.63f, -1.47f)
                lineTo(23.0f, 5.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _fastfood!!
    }

private var _fastfood: ImageVector? = null
