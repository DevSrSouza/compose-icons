package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Fastfood: ImageVector
    get() {
        if (_fastfood != null) {
            return _fastfood!!
        }
        _fastfood = Builder(name = "Fastfood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 5.0f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(0.23f, 2.31f)
                curveTo(14.9f, 8.16f, 18.0f, 10.77f, 18.0f, 15.0f)
                lineToRelative(0.02f, 8.0f)
                horizontalLineToRelative(3.18f)
                lineTo(23.0f, 5.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(1.0f, 21.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(1.0f)
                close()
                moveTo(8.5f, 8.99f)
                curveTo(4.75f, 8.99f, 1.0f, 11.0f, 1.0f, 15.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.0f, -4.0f, -3.75f, -6.01f, -7.5f, -6.01f)
                close()
                moveTo(1.0f, 17.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _fastfood!!
    }

private var _fastfood: ImageVector? = null
