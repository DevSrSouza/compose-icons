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

public val SimpleIcons.Badoo: ImageVector
    get() {
        if (_badoo != null) {
            return _badoo!!
        }
        _badoo = Builder(name = "Badoo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.68f, 2.809f)
                curveToRelative(3.392f, 0.0f, 6.32f, 2.788f, 6.32f, 6.228f)
                curveToRelative(0.0f, 6.71f, -6.6f, 12.158f, -12.0f, 12.158f)
                reflectiveCurveTo(0.0f, 15.748f, 0.0f, 9.037f)
                curveToRelative(0.0f, -3.44f, 2.928f, -6.228f, 6.32f, -6.228f)
                curveToRelative(4.128f, 0.0f, 5.578f, 3.179f, 5.68f, 3.411f)
                arcToRelative(6.079f, 6.079f, 0.0f, false, true, 5.67f, -3.411f)
                close()
                moveTo(18.758f, 9.297f)
                lineTo(18.758f, 9.11f)
                horizontalLineToRelative(-2.38f)
                verticalLineToRelative(0.186f)
                curveToRelative(0.0f, 2.352f, -1.97f, 4.276f, -4.378f, 4.276f)
                curveToRelative(-2.417f, 0.0f, -4.369f, -1.924f, -4.369f, -4.276f)
                lineTo(7.631f, 9.11f)
                lineTo(5.233f, 9.11f)
                verticalLineToRelative(0.186f)
                curveToRelative(0.0f, 1.766f, 0.697f, 3.42f, 1.98f, 4.666f)
                arcToRelative(6.795f, 6.795f, 0.0f, false, false, 4.778f, 1.933f)
                arcToRelative(6.797f, 6.797f, 0.0f, false, false, 4.777f, -1.933f)
                arcToRelative(6.488f, 6.488f, 0.0f, false, false, 1.98f, -4.666f)
                close()
            }
        }
        .build()
        return _badoo!!
    }

private var _badoo: ImageVector? = null
