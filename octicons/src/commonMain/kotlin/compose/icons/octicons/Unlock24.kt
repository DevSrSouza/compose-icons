package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Unlock24: ImageVector
    get() {
        if (_unlock24 != null) {
            return _unlock24!!
        }
        _unlock24 = Builder(name = "Unlock24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 7.25f)
                lineTo(7.5f, 9.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 19.5f)
                verticalLineToRelative(-8.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 9.0f)
                lineTo(6.0f, 9.0f)
                lineTo(6.0f, 7.25f)
                curveTo(6.0f, 3.845f, 8.503f, 1.0f, 12.0f, 1.0f)
                curveToRelative(2.792f, 0.0f, 4.971f, 1.825f, 5.718f, 4.31f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.436f, 0.432f)
                curveTo(15.71f, 3.84f, 14.079f, 2.5f, 12.0f, 2.5f)
                curveToRelative(-2.578f, 0.0f, -4.5f, 2.08f, -4.5f, 4.75f)
                close()
                moveTo(4.5f, 11.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _unlock24!!
    }

private var _unlock24: ImageVector? = null
